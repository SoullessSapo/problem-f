package iceepeecee; 
/**
 * Class Fixed Island
 * 
 * @author Andrea Camila Torres - Esteban Valencia 
 * @version 2.0
 */
public class Fixed extends Island
{
    
    /**
     * Constructor for objects of class Fixed
     */
    public Fixed(int[][] polygon, String newColor)
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
        ICEEPEECEEE.lastAction = false;
        return false;
    }
}
