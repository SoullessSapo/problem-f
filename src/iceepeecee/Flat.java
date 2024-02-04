package iceepeecee;
/**
 * In this class we solved the problem F.
 *
 * @author Andrea Camila Torres
 * @author Esteban Valencia
 * @version 2.0
 */
public class Flat extends Flight
{
    /**
     * Constructor for objects of class Flat
     */
    public Flat(String Newidentifier,int[] newFrom, int[] newTo)
    {
            super(Newidentifier,newFrom,newTo);
    }

    /**
     * verifica la altura del vuelo.
     */
    public boolean verifyAltitude(int[] newFrom, int[] newTo) throws IceepeeceeExcepcion{
        if(newFrom[2] == newTo[2]){
            ICEEPEECEEE.lastAction = true;
            return true;
        }
        else{
            ICEEPEECEEE.lastAction = false;
            throw new IceepeeceeExcepcion(IceepeeceeExcepcion.ERROR_FLAT);
        }
    }
    /**
     * obtiene si el vuelo es fotografiado.
     */
    public void setIsPhotograph(){
        ICEEPEECEEE.lastAction = true;
        isPhotograph = false;
    }
}
