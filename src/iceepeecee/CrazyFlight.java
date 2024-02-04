package iceepeecee;


/**
 * In this class we solved the problem F.
 *
 * @author Andrea Camila Torres
 * @author Esteban Valencia
 * @version 2.0
 */
public class CrazyFlight extends Flight
{
    /**
     * Constructor for objects of class crazyFlight
     */
    public CrazyFlight(String Newidentifier,int[] from, int[] to)
    {
        super(Newidentifier,from,to);
    }
    /**
     * obtiene si el vuelo es fotografiado.
     */
    public void setIsPhotograph() throws IceepeeceeExcepcion{
        if(isPhotograph){
            if(getCamera().getAngle() < 60)
                ICEEPEECEEE.lastAction = false;
                throw new IceepeeceeExcepcion(IceepeeceeExcepcion.ERROR_FLIGHT);
        }
        isPhotograph = true;
    }
    /**
     * verifica la altura del vuelo.
     */
    public boolean verifyAltitude(int[] from, int[] to) throws IceepeeceeExcepcion{
        ICEEPEECEEE.lastAction = true;
        return true;
    }
}
