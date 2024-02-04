package shapes;
import java.awt.*;
import java.util.Random;

/**
 * A triangle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Triangle{
    
    public static int VERTICES=3;
    
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    /**
     * Create a new triangle at default position with default color.
     */
    public Triangle(int xPosition, int yPosition){
        height = 30;
        width = 40;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        color = "000000";
        isVisible = false;
    }

    /**
     * Make this triangle visible. If it was already visible, do nothing.
     */
    public void makeVisible(){
        isVisible = true;
        draw();
    }
    
    /**
     * Make this triangle invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible(){
        erase();
        isVisible = false;
    }
    
    /**
     * Move the triangle a few pixels to the right.
     */
    public void moveRight(){
        moveHorizontal(20);
    }

    /**
     * Move the triangle a few pixels to the left.
     */
    public void moveLeft(){
        moveHorizontal(-20);
    }

    /**
     * Move the triangle a few pixels up.
     */
    public void moveUp(){
        moveVertical(-20);
    }

    /**
     * Move the triangle a few pixels down.
     */
    public void moveDown(){
        moveVertical(20);
    }

    /**
     * Move the triangle horizontally.
     * @param distance the desired distance in pixels
     */
    public void moveHorizontal(int distance){
        erase();
        xPosition += distance;
        draw();
    }

    /**
     * Move the triangle vertically.
     * @param distance the desired distance in pixels
     */
    public void moveVertical(int distance){
        erase();
        yPosition += distance;
        draw();
    }

    /**
     * Slowly move the triangle horizontally.
     * @param distance the desired distance in pixels
     */
    public void slowMoveHorizontal(int distance){
        int delta;

        if(distance < 0) {
            delta = -1;
            distance = -distance;
        } else {
            delta = 1;
        }

        for(int i = 0; i < distance; i++){
            xPosition += delta;
            draw();
        }
    }

    /**
     * Slowly move the triangle vertically.
     * @param distance the desired distance in pixels
     */
    public void slowMoveVertical(int distance){
        int delta;

        if(distance < 0) {
            delta = -1;
            distance = -distance;
        } else {
            delta = 1;
        }

        for(int i = 0; i < distance; i++){
            yPosition += delta;
            draw();
        }
    }

    /**
     * Change the size to the new size
     * @param newHeight the new height in pixels. newHeight must be >=0.
     * @param newWidht the new width in pixels. newWidht must be >=0.
     */
    public void changeSize(int newHeight, int newWidth) {
        erase();
        height = newHeight;
        width = newWidth;
        draw();
    }
    
    /**
     * Change the color. 
     * @param color the new color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void changeColor(String newColor){
        color = darkerColor(newColor);
        draw();
    }

    /*
     * Draw the triangle with current specifications on screen.
     */
    private void draw(){
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            int[] xpoints = { xPosition, xPosition + (width/2), xPosition - (width/2) };
            int[] ypoints = { yPosition, yPosition + height, yPosition + height };
            canvas.draw(this, color, new Polygon(xpoints, ypoints, 3),100);
            canvas.wait(10);
        }
    }

    /*
     * Erase the triangle on screen.
     */
    private void erase(){
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
    public int area(){
        return (width*height)/2;
    }
    public void equilateral() {
        int currentArea = area();
        int currentSideLength = (int) (2 * currentArea) / height;
        int equilateralSideLength = (int) Math.sqrt(3 * currentArea);
        changeSize(equilateralSideLength,currentSideLength);
    }
    public void blink(int times){
        String originalColor = color;
        String[] newColor={"red", "yellow", "blue", "green","magenta","black"}; 
        for (int i=0;i<times;i++){
            if(i%2 == 0){
                Random random = new Random();
                int indiceAleatorio = random.nextInt(newColor.length);
                String cadenaAleatoria = newColor[indiceAleatorio];
                changeColor(cadenaAleatoria);
            }
            else{
                changeColor(originalColor);
            }
        }
        
    }
    public void creador(){
        int currentArea = area();
        Random random = new Random();
        int newAncho = random.nextInt(1,currentArea+1);
        int newAltura = (currentArea*2)/newAncho;
        changeSize(newAltura,newAncho);
    }
    
    public void setHalfColor(String leftColor, String rightColor) {
        int[] xpoints = { xPosition, xPosition + (width / 2), xPosition - (width / 2) };
        int[] ypoints = { yPosition, yPosition + height, yPosition + height };
        
        int midX = xPosition;
    
        int[] xpointsLeft = { xPosition, midX, xPosition - (width / 2) };
        int[] xpointsRight = { midX, xPosition + (width / 2), xPosition };
        int[] ypointsBoth = { yPosition, yPosition + height, yPosition + height };
 
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, leftColor, new Polygon(xpointsLeft, ypointsBoth, 3),1);

        canvas.draw(this, rightColor, new Polygon(xpointsRight, ypointsBoth, 3),1);
    }
    private String darkerColor(String colorHex){
        int red = Integer.parseInt(colorHex.substring(0, 2), 16);
        int green = Integer.parseInt(colorHex.substring(2, 4), 16);
        int blue = Integer.parseInt(colorHex.substring(4, 6), 16);

        // Oscurecer el color reduciendo los componentes RGB en un porcentaje (por ejemplo, 20%)
        int porcentajeOscurecimiento = 70;
        red = (int) (red * (1 - porcentajeOscurecimiento / 100.0));
        green = (int) (green * (1 - porcentajeOscurecimiento / 100.0));
        blue = (int) (blue * (1 - porcentajeOscurecimiento / 100.0));

        // Asegurar que los valores RGB oscurecidos estén en el rango válido (0-255)
        red = Math.max(0, red);
        green = Math.max(0, green);
        blue = Math.max(0, blue);
        red = Math.min(255, red);
        green = Math.min(255, green);
        blue = Math.min(255, blue);

        // Convertir los componentes oscurecidos de RGB a formato hexadecimal y combinarlos
        String colorOscurecidoHex = String.format("#%02X%02X%02X", red, green, blue);
        return colorOscurecidoHex;
    }

}
