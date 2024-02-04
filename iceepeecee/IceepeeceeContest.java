package iceepeecee;
import java.util.ArrayList;
/**
 * clase que resuelve el problema de la maraton.
 * 
 * @author Andrea Camila Torres
 * @author Esteban Valencia
 * @version 1.2
 */
public class IceepeeceeContest
{
    
    private ICEEPEECEEE iceepeecee;
    
    /**
     * metodo que resuelve el problem F.
     * @param int[][][] islands cubo con los vertices de las islas.
     * @param int[][][] flights cubo con los vuelos.
     * @return float result el angulo minimo para fotografiar las islas.
     */
    public float solve(int[][][] islands, int[][][] flights) {
        iceepeecee = new ICEEPEECEEE(islands, flights);
        double low = 0;
        double high = 180.0;
        double epsilon = 1e-6;
        double result = -1.0;

        while (high-low >epsilon) {
            double mid = (low + high) / 2;
            iceepeecee.photograph((float) mid);
            String[] observedIslands = iceepeecee.observedIslands();

            if (observedIslands.length == iceepeecee.islands().length && iceepeecee.islands().length != 0) {
                result = mid;
                high = mid;
            } else {
                low = mid;
            }
        }
        return (float)result;
    }
    /**
     * metodo que muestra la solución al problem f.
     * @param int[][][] islands cubo con los vertices de las islas.
     * @param int[][][] flights cubo con los vuelos.
     */
    public void simulate(int[][][] islands, int[][][] flights){
        iceepeecee = new ICEEPEECEEE(islands, flights);
        double low = 0;
        double high = 180.0;
        double epsilon = 1e-6;
        double result = -1.0;

        while (high-low >epsilon) {
            double mid = (low + high) / 2;
            iceepeecee.photograph((float) mid);
            String[] observedIslands = iceepeecee.observedIslands();
            if (observedIslands.length == iceepeecee.islands().length && iceepeecee.islands().length != 0) {
                result = mid;
                high = mid;
            } else {
                low = mid;
            }
            iceepeecee.makeVisible();
            try
            {
                Thread.sleep(1500);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
}
