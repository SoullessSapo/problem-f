package iceepeecee;
import shapes.Triangle;
import java.awt.*;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 * In this class we solved the problem F.
 *
 * @author Andrea Camila Torres
 * @author Esteban Valencia
 * @version 1.2
 */
public abstract class Island{

    private String color;
    protected boolean isVisible;
    private boolean isPhotograph;
    protected int[][] location;
    Triangle triangle;
    /**
     * Constructor para objetos de la clase Island.
     */
    public Island(int[][] polygon, String newColor){
        color = newColor;
        isVisible = false;
        location = polygon;
        isPhotograph = false;
        triangle = new Triangle(location[0][0],location[0][1]);
        makeTriangle();
    }
    /**
     * Método para obtener la localización de la isla.
     */
    public abstract int[][] getLocation();
    
    /**
     * Método para obtener el color de la isla.
     */
    public String getColor(){
        return color;
    }
    /**
     * Método para cambiar las posiciones de la isla
     */
    public void setPolygon(int[][] newLocation){
        location = newLocation;
    }
    /**
     * Método para crear una isla con las coordenadas de los vertices especificadas.
     */
    private void createIsland() {
        if(isVisible) {
            shapes.Canvas canvas = shapes.Canvas.getCanvas();
            int numRows = location.length;
            int[] xpoints = new int[numRows];
            int[] ypoints = new int[numRows];
            for (int i =0;i<numRows;i++){
                xpoints[i] = (int) location[i][0];
                ypoints[i] = (int) location[i][1];
            }
            
            canvas.draw(this, color, new Polygon(xpoints,ypoints,numRows),255);
            canvas.wait(10);
        }
            
    }

    /**
     * Método para hacer visible la isla.
     */
    public void makeVisible() {
        isVisible = true;
        createIsland();
    }

    /**
     * Método para hacer invisible la isla.
     */
    public void makeInvisible(){
        erase();
        if(triangle!= null){
            triangle.makeInvisible();
        }
        isVisible = false;
    }
    /**
     * Método para borrar la isla.
     */
    protected void erase(){
        if(isVisible) {
            shapes.Canvas canvas = shapes.Canvas.getCanvas();
            canvas.erase(this);
        }
    }
    //CICLO DOS.
    /**
     * Método para obtener la  visibilidad de la isla..
     */
    public boolean getisVisible(){
        return isVisible;
    }
    /**
     * Método para hacer el triangulo que caracteriza a la isla.
     */
    public void makeTriangle(){
        triangle.changeSize(10,10);
        triangle.moveVertical(-5);
    }
    /**
     * Método para obtener el objeto triangulo.
     */
    public Triangle getTriangle(){
        return triangle;
    }
    public abstract boolean canErase();
    /**
     * Método para verificar si la isla está fotografiada.
     * @param p objeto de la clase fotografía.
     * @return boolean retorna un booleano indicando si está en la zona de la fotografía o no.
     */
    public boolean isObserved(Photograph p) {
        double[] xPoints = p.getxPositions();
        double[] yPoints = p.getyPositions();
    
        for (int i = 0; i < location.length; i++) {
            if (!pointInPolygon(xPoints, yPoints, location[i][0], location[i][1])) {
                return false; 
            }
        }
        isPhotograph = true;
        return true; 
    }
    /**
     * Método auxiliar para verificar si un punto está dentro del poligono usando el algoritmo de Ray Casting.
     * @param float [] x Lista con los vertices en x del poligono.
     * @param float [] y Lista con los vertices en y del poligono.
     * @param int xPoint coordenada en x del punto a verificar.
     * @param int yPoint coordenada en y del punto a verificar.
     * @return c retorna un booleano indicando si el punto está dentro del poligono.
     */
    private boolean pointInPolygon(double[] x, double[] y, int xPoint, int yPoint) {
        int nvert = x.length;
        int i, j;
        boolean c = false;
        for (i = 0, j = nvert - 1; i < nvert; j = i++) {
            if (((y[i] > yPoint) != (y[j] > yPoint)) &&
                (xPoint < (x[j] - x[i]) * (yPoint - y[i]) / (y[j] - y[i]) + x[i])) {
                c = !c;
            }
            if (x[i] == xPoint && y[i] == yPoint) {
                return true;
            }
        }
        return c;
    }
    /**
     * Método para verificar si la isla está intersectada con otra isla.
     * @param isla objeto de la clase Isla.
     * @return boolean retorna un booleano indicando si la isla es intersectada o no.
     */
    public boolean isIntersected(int[][] polygon) {
        double[][] locationIsland = separatePositions(polygon);
        double[] xPoints = locationIsland[0];
        double[] yPoints = locationIsland[1];
        if(arePolygonsIntersected(polygon)){
            return true;
        }
        if(pointInIsland(polygon)){
            return true;
        }
        return false;
    } 
    /**
     * Método auxiliar para verificar si una isla está dentro de otra. usando el algoritmo de Ray Casting.
     * @param int[][] poligono de la isla a verificar.
     * @return boolean retorna un booleano indicando si el punto está dentro del poligono.
     */
    private boolean pointInIsland(int[][] polygon){
        double[][] locationIsland = separatePositions(polygon);
        double[] xPoints = locationIsland[0];
        double[] yPoints = locationIsland[1];
        for (int i = 0; i < location.length; i++) {
            if (pointInPolygon(xPoints, yPoints, location[i][0], location[i][1])) {
                return true;
            }
        }
        double[][] locationIslandActual = separatePositions(location);
        double[] xPoints2 = locationIslandActual[0];
        double[] yPoints2 = locationIslandActual[1];
        for (int i = 0; i < polygon.length; i++) {
            if (pointInPolygon(xPoints2, yPoints2, polygon[i][0], polygon[i][1])) {
                return true;
            }
        }
        return false;
    }
    /**
     * Método auxiliar para separar las posiciones en x y Y de la isla.
     */
    private double[][] separatePositions(int[][] locationIsland){
        double[] pointsx = new double[locationIsland.length];
        double[] pointsy = new double[locationIsland.length];
        double[][] locationSeparate = new double[2][locationIsland.length];
        for(int i = 0;i<locationIsland.length;i++){
            pointsx[i] = (double) locationIsland[i][0];
            pointsy[i] = (double) locationIsland[i][1];
        }
        locationSeparate[0] = pointsx;
        locationSeparate[1] = pointsy;
        return locationSeparate;
    }
    /**
     * Método auxiliar para verificar si los poligonos estan intersectados usando el algoritmo de separación de ejes (SAT).
     * @param int[][] poligono de la isla a verificar con esta clase.
     * return boolean inidica si está intersectada o no.
     */
    public boolean arePolygonsIntersected(int[][] poly2) {
        for (int i = 0; i < location.length; i++) {
            int[] edge = { location[i][0] - location[(i + 1) % location.length][0], location[i][1] - location[(i + 1) % location.length][1] };
            int[] axis = { -edge[1], edge[0] };
    
            if (!areProjectionsOverlapping(location, poly2, axis)) {
                return false;
            }
        }
    
        for (int i = 0; i < poly2.length; i++) {
            int[] edge = { poly2[i][0] - poly2[(i + 1) % poly2.length][0], poly2[i][1] - poly2[(i + 1) % poly2.length][1] };
            int[] axis = { -edge[1], edge[0] };
    
            if (!areProjectionsOverlapping(location, poly2, axis)) {
                return false;
            }
        }
    
        return true;
    }
    /**
     * Método auxiliar para verificar las proyecciones de solapan.
     */
    private boolean areProjectionsOverlapping(int[][] poly1, int[][] poly2, int[] axis) {
        double min1 = Double.MAX_VALUE;
        double max1 = Double.MIN_VALUE;
        double min2 = Double.MAX_VALUE;
        double max2 = Double.MIN_VALUE;
    
        for (int[] point : poly1) {
            double projection = point[0] * axis[0] + point[1] * axis[1];
            min1 = Math.min(min1, projection);
            max1 = Math.max(max1, projection);
        }
    
        for (int[] point : poly2) {
            double projection = point[0] * axis[0] + point[1] * axis[1];
            min2 = Math.min(min2, projection);
            max2 = Math.max(max2, projection);
        }
    
        return !(max1 < min2 || max2 < min1);
    }

}

