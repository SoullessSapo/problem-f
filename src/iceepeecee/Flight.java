package iceepeecee;
import shapes.Circle;
import java.awt.*;
import java.util.*;

/**
 * In this class we solved the problem F.
 *
 * @author Andrea Camila Torres
 * @author Esteban Valencia
 * @version 2.0
 */

 

public abstract class Flight
{
    protected int[] first;
    protected int[] last;
    protected String identifier;
    private boolean isVisible;
    private Circle c1;
    private Circle c2;
    protected Photograph photo;
    protected boolean isPhotograph;
    /**
     * Constructor for objects of class Flight
     */
    public Flight(String Newidentifier,int[] from, int[] to)
    {
        first = from;
        last = to;
        identifier = Newidentifier;
        isVisible = false;
        photo = null;
        isPhotograph = false;
        c1 = new Circle();
        c2 = new Circle();
        createRepresentation();
    }
    /**
     * Método para obtener la posicion inicial del vuelo.
     */
    public int[] getFrom(){
        return first;
    }
    /**
     * Método para obtener la posicion final del vuelo.
     */
    public int[] getto(){
        return last;
    }
    /**
     * Método para obtener la camara del vuelo.
     */
    public Photograph getCamera(){
        return photo;
    }
    /**
     * Método dibujar los puntos donde se encuentra ubicado el vuelo usando la clase Circle.
     */
    private void createRepresentation(){
        c1.changeSize(3);
        c2.changeSize(3);
        c1.setxPosition(first[0]);
        c1.setyPosition(first[1]);
        c2.setxPosition(last[0]);
        c2.setyPosition(last[1]);
        c1.changeColor(identifier);
        c2.changeColor(identifier);
    }
    /**
     * Método dibujar el vuelo.
     */
    private void drawFlight(){
        if(isVisible) {
            c1.makeVisible();
            c2.makeVisible();
            if (photo != null){
                photo.makeVisible();
            }
            shapes.Canvas canvas = shapes.Canvas.getCanvas();
            int[] xPoints = new int[2];
            int[] yPoints = new int[2];
            xPoints[0] = first[0];
            xPoints[1] = last[0];
            yPoints[0] = first[1];
            yPoints[1] = last[1];
            canvas.draw(this, identifier, new Polygon(xPoints,yPoints,2),255);
            canvas.wait(10);
        }
    }
    /**
     * Método para hacer visible el vuelo.
     */
    public void makeVisible(){
        isVisible = true;
        drawFlight();
    }
    /**
     * Método para hacer invisible el vuelo.
     */
    public void makeInvisible(){
        erase();
        isVisible = false;
        if (c1 != null && c2 != null) {
            c1.makeInvisible();
            c2.makeInvisible();
            if(photo!=null){
                photo.makeInvisible();
            }
        }
    }
    
    /**
     * obtiene el color del vuelo.
     * @return el color con el que se identifica el vuelo.
     */
    public String getID()
    {
        return identifier;
    }
    /**
     * Toma la fotografía del vuelo.
     * @param teta angulo entero de la fotografía
     * @return Photo objeto de la clase Photograph.
     */
    public void photograph(float teta) throws IceepeeceeExcepcion{
        setIsPhotograph();
        if(!isPhotograph){
            photo = new Photograph();
            photo.makePhotograph(first, last, identifier,teta);
        }
        isPhotograph = true;
    }
    /**
     * obtiene la visibilidad del vuelo.
     */
    public boolean getIsVisible()
    {
        return isVisible;
    }
    /**
     * obtiene si el vuelo es fotografiado.
     */
    public abstract void setIsPhotograph() throws IceepeeceeExcepcion; 
    /**
     * verifica la altura del vuelo.
     */
    public abstract boolean verifyAltitude(int[] from, int[] to) throws IceepeeceeExcepcion;
    /**
     * borra la figura hecha en el canvas.
     */
    private void erase(){
        if(isVisible) {
            shapes.Canvas canvas = shapes.Canvas.getCanvas();
            canvas.erase(this);
        }
    }
    /**
     * consulta si el vuelo está fotografiado.
     */
    public boolean getIsPhotograph(){
        return isPhotograph;
    }
}

