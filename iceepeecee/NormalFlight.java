package iceepeecee;
/**
 * In this class we solved the problem F.
 *
 * @author Andrea Camila Torres
 * @author Esteban Valencia
 * @version 2.0
 */
public class NormalFlight extends Flight
{
    /**
     * Constructor for objects of class NormalFlight
     */
    public NormalFlight(String newIdentifier,int[] from, int[] to)
    {
        super(newIdentifier,from,to);
    }
    /**
     * obtiene si el vuelo es fotografiado.
     */
    public void setIsPhotograph(){
        ICEEPEECEEE.lastAction = true;
        isPhotograph = false;
    }
    /**
     * verifica la altura del vuelo.
     */
    public boolean verifyAltitude(int[] from, int[] to){
        ICEEPEECEEE.lastAction = true;
        return true;
    }
        
} 

