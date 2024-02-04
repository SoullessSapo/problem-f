package iceepeecee;
/**
 * In this class we solved the problem F.
 *
 * @author Andrea Camila Torres
 * @author Esteban Valencia
 * @version 2.0
 */
public class Lazy extends Flight
{

    /**
     * Constructor for objects of class Lazy
     */
    public Lazy(String newidentifier,int[] from, int[] to)
    {
        super(newidentifier,from,to);
    }
    /**
     * obtiene si el vuelo es fotografiado.
     */
    public void setIsPhotograph() throws IceepeeceeExcepcion{
        if(isPhotograph){
            ICEEPEECEEE.lastAction = false;
            throw new IceepeeceeExcepcion(IceepeeceeExcepcion.ERROR_FLIGHT);
        }
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
