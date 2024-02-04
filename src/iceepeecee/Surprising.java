package iceepeecee;
import java.util.Random;
/**
 * Write a description of class Surprising here.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Surprising extends Island
{
    private ICEEPEECEEE iceepeecee;
    /**
     * Constructor for objects of class Surprising
     */
    public Surprising(int[][] polygon, String newColor)
    {
        super(polygon,newColor);
    }
    /**
     * Método para obtener la localización de la isla pierde un vertice cada vez que se llama.
     * @return localización de la isla.
     */
    public int[][] getLocation(){
        int[][] newLocation = null;
        eraseVertex();
        newLocation = location;
        ICEEPEECEEE.lastAction = true;
        return newLocation;
    }
    /**
     * Método para eliminar un vertice de la isla.
     */
    private void eraseVertex()
    {
        if(location.length > 3){
            Random r = new Random();
            int vertex = r.nextInt(location.length);
            int[][] newLocation = new int[location.length-1][2];
            int newIndex = 0;
            for(int i = 0; i < location.length; i++){
                if(i != vertex){
                    newLocation[newIndex] = location[i];
                    newIndex++;
                }
            }
            super.setPolygon(newLocation);
            if(isVisible){
                makeInvisible();
                makeVisible();
            }
        }
    }
    /**
     * Método para verificar si la isla puede ser eliminada.
     */
    public boolean canErase(){
        ICEEPEECEEE.lastAction = true;
        return true;
    }
}
