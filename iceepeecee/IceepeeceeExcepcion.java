package iceepeecee;
/**
 * Write a description of class IceepeeceeExcepcion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IceepeeceeExcepcion extends Exception
{
    public static final String ERROR_CLASS = "Class no found";
    public static final String ERROR_FLIGHT = "flight can't photograph again";
    public static final String ERROR_ISLAND = "island can't change";
    public static final String ERROR_FLAT = "can't create flat";
    public static final String NO_ISLAND = "Island doesn't exist";
    public static final String NO_FLIGHT = "Flight doesn't exist";
    public static final String NO_COLOR = "the color exist already";
    /**
     * Constructor for objects of class IceepeeceeExcepcion
     */
    public IceepeeceeExcepcion(String m)
    {
        super(m);
    }

}
