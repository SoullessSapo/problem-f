package iceepeecee;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Clase que usa casos de pruebas para probar iceepeeceContest
 *@author Andrea Camila Torres
 *@author Esteban Valencia
 *@version 1.2
 */
public class IceepeeceeContestCTest
{

    @Test
    public void testEmptyInput() {
        IceepeeceeContest contest = new IceepeeceeContest();
        int[][][] emptyIslands = {};
        int[][][] emptyFlights = {};
        double result = contest.solve(emptyIslands, emptyFlights);
        assertEquals(-1.0, result, 0.000001);
    }

    @Test
    public void testNoIslands() {
        IceepeeceeContest contest = new IceepeeceeContest();
        int[][][] noIslands = {};
        int[][][] flights = {{{1, 1, 1}, {2, 2, 2}}};  
        float result = contest.solve(noIslands, flights);
        assertEquals(-1.0, result, 0.000001);
    }

    @Test
    public void testNoFlights() {
        IceepeeceeContest contest = new IceepeeceeContest();
        int[][][] islands = {{{1, 1}, {2, 2}, {3, 3}}}; 
        int[][][] noFlights = {};
        double result = contest.solve(islands, noFlights);
        assertEquals(-1.0, result, 0.000001);
    }

    @Test
    public void testSingleIslandSingleFlight() {
        IceepeeceeContest contest = new IceepeeceeContest();
        int[][][] islands = {{{20, 30}, {50, 50}, {10, 50}}};  
        int[][][] flights = {{{0, 30,20}, {78,70,5}}};   
        double result = contest.solve(islands, flights);
        assertEquals(38.036190032958984, result, 0.000001);
    }
    @Test
    public void testProblemMarathon() {
        IceepeeceeContest contest = new IceepeeceeContest();
        int[][][] islands = {{{20, 30}, {50, 50}, {10, 50}},{{40, 20}, {60, 10}, {75, 20}, {60, 30}},{{45, 60}, {55, 55}, {60, 60}, {55, 65}}};  
        int[][][] flights = {{{0, 30,20}, {78,70,5}},{{55,0,20}, {70,60,10}}};   
        double result = contest.solve(islands, flights);
        assertEquals(48.031693036, result, 1e-8);
        
        int[][][] islands2 = {{{0,0}, {10,0}, {10, 10},{0,10}}};  
        int[][][] flights2 = {{{5,5,10},{15,5,10}}};
        assertEquals(-1.0, result, 1e-8);
    }
}


