package iceepeecee;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * The test class ICEEPEECEEETest.
 *
 * @author  Andrea Camila Torres y Esteban Valencia
 * @version 1.2
 */

public class ICCEPEECETEST {
    private ICEEPEECEEE iceepeecee;

    @Before
    public void setUp() {
        iceepeecee = new ICEEPEECEEE(10000,10000);
    }

    @Test
    public void testAddIsland() {
            iceepeecee.addIsland("62B2AB", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});
            assertEquals(true,iceepeecee.ok());
            iceepeecee.addIsland("62B2AB", new int[][]{{20, 30}, {50, 50}, {10, 50}});
            assertEquals(false,iceepeecee.ok()); //Debería no añadirla
            iceepeecee.addIsland("6283B2", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});
            assertEquals(false,iceepeecee.ok()); //Debería no añadirla
        
        
    }

    @Test
    public void testDelIsland() {
            iceepeecee.addIsland("7E62B2", new int[][]{{20, 30}, {50, 50}, {10, 50}});
            iceepeecee.delIsland("7E62B2");
            assertEquals(true,iceepeecee.ok());
            iceepeecee.delIsland("B262A2");
            assertEquals(false,iceepeecee.ok());
        
    }

    @Test
    public void testAgregarVuelo() {
            iceepeecee.addFlight("00997F", new int[]{55, 0, 20}, new int[]{70, 60, 10});
            assertEquals(true,iceepeecee.ok());
            iceepeecee.addFlight("00997F", new int[]{55, 5, 60}, new int[]{80, 60, 100});
            assertEquals(false,iceepeecee.ok()); //No deberia agregar vuelo
            iceepeecee.addFlight("008D99", new int[]{55, 0, 20}, new int[]{70, 60, 10});
            assertEquals(false,iceepeecee.ok()); //No debería agregar vuelo       
    }

    @Test
    public void testDelFlight() {
            iceepeecee.addFlight("F08080", new int[]{0,30,20}, new int[]{78, 70, 5});
            iceepeecee.delFlight("F08080");
            assertEquals(true,iceepeecee.ok());
            iceepeecee.delFlight("560099"); //Se elimina un vuelo que no existe
            assertEquals(false,iceepeecee.ok());
        
    }

    @Test
    public void testIslandLocation() {
            iceepeecee.addIsland("FFA07A", new int[][]{{45,60},{55,55},{60,60},{55,65}});
            int[][] location = iceepeecee.islandLocation("FFA07A");
            assertEquals(45, location[0][0]);
            assertEquals(60, location[0][1]);
            assertEquals(55, location[1][0]);
            assertEquals(55, location[1][1]);
            assertEquals(60, location[2][0]);
            assertEquals(60, location[2][1]);
            assertEquals(55, location[3][0]);
            assertEquals(65, location[3][1]);
            iceepeecee.islandLocation("990025");
            assertEquals(false,iceepeecee.ok());
        
    }
    @Test
    public void testFlightLocation() {
            iceepeecee.addFlight("Green", new int[]{5, 5, 10}, new int[]{15, 5, 10});
            int[][] location = iceepeecee.flightLocation("Green");
            assertEquals(5, location[0][0]);
            assertEquals(5, location[0][1]);
            assertEquals(10, location[0][2]);
            assertEquals(15, location[1][0]);
            assertEquals(5, location[1][1]);
            assertEquals(10, location[1][2]);
            //test con un vuelo que no existe
            int[][] location2 = iceepeecee.flightLocation("000000");
            assertEquals(false,iceepeecee.ok());
        
    }

    @Test
    public void testPhotograph() {
            iceepeecee.addFlight("009499", new int[]{55, 0, 20}, new int[]{70, 60, 10});
            iceepeecee.photograph("009499", 45);
            assertEquals(true,iceepeecee.ok());
            iceepeecee.photograph("009499", 80);
            assertEquals(true,iceepeecee.ok());
            iceepeecee.addFlight("279900", new int[]{8, 3, 10}, new int[]{15, -1, 5});
            iceepeecee.photograph("279900", 75);
            assertEquals(true,iceepeecee.ok());
            //test fotografiando un vuelo que no existe
            iceepeecee.photograph("orange", 75);
            assertEquals(false,iceepeecee.ok());
            
            //test photograph(int teta)
            iceepeecee.photograph(30);
            assertEquals(true,iceepeecee.ok());
            iceepeecee.photograph(20);
            assertEquals(true,iceepeecee.ok());
            
            //test photograph(float teta)
            iceepeecee.photograph(48.031693036f);
            assertEquals(true,iceepeecee.ok());
            iceepeecee.photograph(55.45987f);
            assertEquals(true,iceepeecee.ok());
            iceepeecee.photograph(65.5f);
            assertEquals(true,iceepeecee.ok());
        
    }
    @Test
    public void testIslands(){
            iceepeecee.addIsland("991700", new int[][]{{20, 30}, {50, 50}, {10, 50}});
            iceepeecee.addIsland("979900", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});
            iceepeecee.addIsland("519900", new int[][]{{45, 60}, {55, 55}, {60, 60},{55, 65}});
            iceepeecee.addIsland("009909", new int[][]{{0,0}, {10,0}, {10, 10},{0,10}});
            iceepeecee.addIsland("009953", new int[][]{{12,1}, {12,3}, {15,2}});
            iceepeecee.addIsland("009986", new int[][]{{20, 10}, {30, 10}, {30, 20},{20, 20}});
            iceepeecee.makeVisible();
            assertEquals(6,iceepeecee.islands().length);
        
    }
    @Test
    public void testFlights(){
            iceepeecee.addFlight("991700", new int[]{0,30,20},new int[]{78,70,5});
            iceepeecee.addFlight("979900", new int[]{1,40,20},new int[]{80,80,5});
            iceepeecee.addFlight("519900", new int[]{2,50,20},new int[]{82,90,5});
            iceepeecee.addFlight("009909", new int[]{3,60,20},new int[]{84,100,5});
            iceepeecee.addFlight("009953", new int[]{4,70,20},new int[]{86,110,5});
            iceepeecee.addFlight("009964", new int[]{5,80,20},new int[]{88,120,5});
            iceepeecee.addFlight("009986", new int[]{6,90,20},new int[]{90,130,5});
            iceepeecee.addFlight("008D99", new int[]{7,100,20},new int[]{92,140,5});
            iceepeecee.addFlight("007699", new int[]{8,110,20},new int[]{94,150,5});
            iceepeecee.addFlight("005A99", new int[]{9,120,20},new int[]{96,200,5});
            assertEquals(10,iceepeecee.flights().length);
    }

    @Test
    public void testFlightCamera(){
            iceepeecee.addFlight("7DF032", new int[]{0,10,20},new int[]{78,10,5});
            iceepeecee.addFlight("32F066", new int[]{0,40,20},new int[]{0,80,5});
            iceepeecee.addFlight("32F0B6", new int[]{2,60,20},new int[]{82,30,5});
            iceepeecee.addFlight("32F0E4", new int[]{6,50,20},new int[]{10,100,5});
            iceepeecee.addFlight("32B4F0", new int[]{4,70,20},new int[]{15,30,5});
            iceepeecee.photograph(55.5f);
            iceepeecee.photograph("32F0E4",50);
            iceepeecee.flightCamera("32F0E4");
            assertEquals(true,iceepeecee.ok());
            iceepeecee.flightCamera("blue");
            assertEquals(false,iceepeecee.ok());
    }

    @Test
    public void testObservedIslands(){
            iceepeecee.addIsland("991700", new int[][]{{20, 30}, {50, 50}, {10, 50}});
            iceepeecee.addIsland("979900", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});
            iceepeecee.addIsland("519900", new int[][]{{45, 60}, {55, 55}, {60, 60},{55, 65}});
            iceepeecee.addIsland("009909", new int[][]{{0,0}, {10,0}, {10, 10},{0,10}});
            iceepeecee.addFlight("7DF032", new int[]{0,30,20},new int[]{78,70,5});
            iceepeecee.addFlight("32F066", new int[]{55,0,20},new int[]{70,60,10});
            iceepeecee.addFlight("32F0B6", new int[]{5,5,10},new int[]{15,5,10});
            iceepeecee.photograph(50);
            assertEquals(3,iceepeecee.observedIslands().length);
            iceepeecee.delIsland("991700");
            iceepeecee.delIsland("979900");
            iceepeecee.delIsland("519900");
            iceepeecee.delIsland("009909");
            assertEquals(0,iceepeecee.observedIslands().length);
        
    }
    @Test
    public void testUselessFlights(){
            iceepeecee.addIsland("009909", new int[][]{{0,0}, {10,0}, {10, 10},{0,10}});
            iceepeecee.addFlight("7DF032", new int[]{0,30,20},new int[]{78,70,5});
            iceepeecee.addFlight("32F066", new int[]{55,0,20},new int[]{70,60,10});
            iceepeecee.addFlight("32F0B6", new int[]{5,5,10},new int[]{15,5,10});
            iceepeecee.photograph(50);
            assertEquals(3,iceepeecee.uselessFlights().length);

            iceepeecee.addIsland("991700", new int[][]{{20, 30}, {50, 50}, {10, 50}});
            iceepeecee.addIsland("979900", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});
            iceepeecee.addIsland("519900", new int[][]{{45, 60}, {55, 55}, {60, 60},{55, 65}});
            iceepeecee.makeVisible();
            assertEquals(1,iceepeecee.uselessFlights().length);
            iceepeecee.delFlight("7DF032");
            iceepeecee.delFlight("32F066");
            iceepeecee.delFlight("32F0B6");
            assertEquals(0,iceepeecee.uselessFlights().length);
    }
    @Test
    public void testAddIslandwithType() {
           iceepeecee.addIsland("iceepeecee.Surprising","62B2AB", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});
           assertEquals(true,iceepeecee.ok());
           iceepeecee.addIsland("iceepeecee.Fixed","Blue", new int[][]{{20, 30}, {50, 50}, {10, 50}});
           assertEquals(true,iceepeecee.ok());
           iceepeecee.addIsland("iceepeecee.NormalIsland","991700", new int[][]{{100, 30}, {200, 50}, {80, 50}});
           assertEquals(true,iceepeecee.ok());
        
        
    }
    @Test
    public void testAddIslandwithTypeUnkown() {
           iceepeecee.addIsland("iceepeecee.Surprising","62B2AB", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});
           assertEquals(true,iceepeecee.ok());
           iceepeecee.addIsland("iceepeecee.Fixed","Blue", new int[][]{{20, 30}, {50, 50}, {10, 50}});
           assertEquals(true,iceepeecee.ok());
           iceepeecee.addIsland("iceepeecee.Surprising","991700", new int[][]{{100, 30}, {200, 50}, {80, 50}});
           assertEquals(true,iceepeecee.ok());
           iceepeecee.addIsland("iceepeecee.Isla","Magenta", new int[][]{{45, 60}, {55, 55}, {60, 60},{55, 65}});
           assertEquals(false,iceepeecee.ok());
    }
    @Test
    public void testAddFlightwithType() {
           iceepeecee.addFlight("iceepeecee.Lazy","7DF032", new int[]{0,30,20},new int[]{78,70,5});
           assertEquals(true,iceepeecee.ok());
           iceepeecee.addFlight("iceepeecee.Flat","991700", new int[]{5,5,10},new int[]{15,5,10});
           assertEquals(true,iceepeecee.ok());
           iceepeecee.addFlight("iceepeecee.NormalFlight","Magenta", new int[]{55,0,20},new int[]{70,60,10}); 
           assertEquals(true,iceepeecee.ok());
        
        
    }
    @Test
    public void testAddFlightwithTypeUnkown() {
        
           iceepeecee.addFlight("iceepeecee.Lazy","7DF032", new int[]{0,30,20},new int[]{78,70,5});
           assertEquals(true,iceepeecee.ok());
           iceepeecee.addFlight("iceepeecee.Flat","991700", new int[]{5,5,10},new int[]{15,5,10});
           assertEquals(true,iceepeecee.ok());
           iceepeecee.addFlight("iceepeecee.NormalFlight","Magenta", new int[]{55,0,20},new int[]{70,60,10}); 
           assertEquals(true,iceepeecee.ok());
           iceepeecee.addFlight("iceepeecee.Avion","Blue", new int[]{4,70,20},new int[]{15,30,5});
           assertEquals(false,iceepeecee.ok());
        
    }
    @Test
    public void testAddFlatwithDiferentAltitude() {
           iceepeecee.addFlight("iceepeecee.Flat","991700", new int[]{5,5,6},new int[]{15,5,10}); 
           assertEquals(false,iceepeecee.ok());
    }
}




