package iceepeecee;
/**
 * Class Normal island
 * 
 * @author Andrea Camila Torres - Esteban Valencia 
 * @version 2.0
 */
public class NormalIsland extends Island
{

    /**
     * Constructor for objects of class Normal
     */
    public NormalIsland(int[][] polygon, String newColor)
    {
        super(polygon,newColor);
    }
    /**
     * Método para obtener la localización de la isla.
     */
    public int[][] getLocation(){
        ICEEPEECEEE.lastAction = true;
        return location;
    }
    /**
     * Método para verificar si la isla se puede borrar.
     */
    public boolean canErase(){
        ICEEPEECEEE.lastAction = true;
        return true;
    }
}
