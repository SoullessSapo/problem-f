package iceepeecee;
import java.awt.*;
import java.util.Random;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

/**
 * In this class we solved the problem F.
 *
 * @author Andrea Camila Torres
 * @author Esteban Valencia
 * @version 1.2
 */

public class Photograph {
    private double angle;
    private boolean isVisible;
    private String color;
    private double[][] positions;
    /**
     * Constructor para objetos de la clase Photograph.
     * Inicializa la variable angle en 60 y isVisible como false.
     */
    public Photograph() {
        angle = -1.0;
        isVisible = false;
        color = "green";
        positions = new double[4][2];
    }
    
    /**
     * Método para realizar la fotografia del vuelo.
     * @param from Posicion incial del vuelo.
     * @param to Posicion final del vuelo.
     * @param teta Angulo de la camara.
     */
    public void makePhotograph(int[] from, int[] to,String colorFlight,float teta) {
        double[] xpoints = new double[4];
        double[] ypoints = new double[4];
        double angle2 = Math.tan(Math.toRadians(teta));
        double distanceFrom = from[2]*angle2; //distancia que debe haber entre los vertices y los puntos iniciales del vuelo.
        double distanceTo = to[2]*angle2;//distancia que debe haber entre los vertices y los puntos finales del vuelo.
        double yresta = (to[1]-from[1]);
        double xresta = (to[0]-from[0]);
        double pendient = yresta/xresta;
        double m = -1*(1/pendient); //pendiente de la recta perpendicular a la que se forma con las coordenadas de los vuelos
        
        double[][] beginCoords = makeCoordinates(from,distanceFrom,m); //vertices de inicio
        double[][] finalCoords = makeCoordinates(to,distanceTo,m); //vertices final
        
        xpoints[0] = beginCoords[0][0];
        xpoints[1] = beginCoords[1][0];
        xpoints[2] = finalCoords[1][0];
        xpoints[3] = finalCoords[0][0];
        ypoints[0] = beginCoords[0][1];
        ypoints[1] = beginCoords[1][1];
        ypoints[2] = finalCoords[1][1];
        ypoints[3] = finalCoords[0][1];
        
        setPosition(xpoints,ypoints);
        color = colorFlight;
        angle = teta;
    }
    /**
     * Método para dibujar la fotografia del vuelo.
     */
    public void showPhotograph(){
        int[] xPoints = new int[positions.length];
        int[] yPoints = new int[positions.length];
        for(int i = 0; i < positions.length;i++){
            xPoints[i] = (int)Math.round(positions[i][0]);
            yPoints[i] = (int)Math.round(positions[i][1]);
        }
        
        if(isVisible) {
            shapes.Canvas canvas = shapes.Canvas.getCanvas();
            canvas.draw(this,color, new Polygon(xPoints,yPoints,4),50);
            canvas.wait(10);
        }
    }
    /**
     * Método para crear las posiciones de la fotografía tomada.
     * @param xPoints Posiciones en x de la fotografía.
     * @param yPoints Posiciones en y de la fotografía.
     */
    private void setPosition(double[] xpoints, double[] ypoints) {
        for (int i = 0; i < positions.length; i++) {
            positions[i][0]=xpoints[i];
            positions[i][1]=ypoints[i];
        }
    }
    /**
     * Método para obtener el angulo de la fotografía.
     */
    public double getAngle(){
        return angle;
    }
    /**
     * Método para devolver el color de la fotografia
     */  
    public String getColor(){
        return color;
    }
    /**
     * Método para mostrar la fotografía.
     */
    public void makeVisible() {
        isVisible = true;
        showPhotograph();
    }
    /**
     * Método para ocultar la fotografía.
     */
    public void makeInvisible(){
        erase();
        isVisible = false;
    }
    /**
     * Método para borrar la fotografía.
     */
    private void erase(){
        if(isVisible) {
            shapes.Canvas canvas = shapes.Canvas.getCanvas();
            canvas.erase(this);
        }
    }
    /**
     * Método para obtener las posiciones de la fotografía.
     */
    public double[][] getPosition(){
        return positions;
    }
    /**
     * Método para obtener las posiciones de la fotografía.
     */
    public boolean getIsVisible(){
        return isVisible;
    }
    /**
     * Método para obtener las posiciones en x de la fotografía.
     */
    public double[] getxPositions(){
        double[] x = new double[4];
        for(int i=0;i<positions.length;i++){
            x[i] = positions[i][0];
        }
        return x;
    }
    /**
     * Método para obtener las posiciones en y de la fotografía.
     */
    public double[] getyPositions(){
        double[] y = new double[4];
        for(int i=0;i<positions.length;i++){
            y[i] = positions[i][1];
        }
        return y;
    }
    /**
     * Método para calcular la recta perpendicular y los puntos de los vertices de la fotografía.
     */
    private double[][] makeCoordinates(int[] coordinates,double distance, double m){
        int x1 = coordinates[0];
        int y1 = coordinates[1];
        double[][] newCoords = new double[2][2];
    
        if (Double.isInfinite(m)&&m<0) {
            // Manejar el caso de una línea vertical (pendiente infinita 1/0)
            newCoords[0][0] = x1;
            newCoords[0][1] = y1+distance;
            newCoords[1][0] = x1;
            newCoords[1][1] = y1-distance;
        } else {
            // Manejar el caso de una línea con pendiente finita
            double b = y1 - (m * x1);
            double delta = distance / Math.sqrt(1 + Math.pow(m, 2));
            newCoords[0][0] = x1 + delta;
            newCoords[0][1] = m * newCoords[0][0] + b;
            newCoords[1][0] = x1 - delta;
            newCoords[1][1] = m * newCoords[1][0] + b;
        }
        return newCoords;
    }
}