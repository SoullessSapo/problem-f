package iceepeecee;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * The test class IceepeeceeContestTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class IceepeeceeContestTest
{
    private IceepeeceeContest iceepeeceeC;
    
    public IceepeeceeContestTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        
    }

    @Test
    public void solveTest(){
        iceepeeceeC = new IceepeeceeContest();
        int[][][] islands = {{{20, 30}, {50, 50}, {10, 50}},{{40, 20}, {60, 10}, {75, 20}, {60, 30}},{{45, 60}, {55, 55}, {60, 60}, {55, 65}}};  
        int[][][] flights = {{{0,30,20}, {78,70,5}},{{55,0,20}, {70,60,10}}};
        assertEquals(48.031693036, iceepeeceeC.solve(islands,flights), 1e-8);
        int[][][] islands2 = {{{0,0},{10,0},{10,10},{0,10}}};  
        int[][][] flights2 = {{{5,5,10},{15,5,10}}};
        assertEquals(-1.0, iceepeeceeC.solve(islands2,flights2), 1e-8);
    }
    @Test
    public void simulateTest(){
        iceepeeceeC = new IceepeeceeContest();
        int[][][] islands = {{{20, 30}, {50, 50}, {10, 50}},{{40, 20}, {60, 10}, {75, 20}, {60, 30}},{{45, 60}, {55, 55}, {60, 60}, {55, 65}}};  
        int[][][] flights = {{{0,30,20}, {78,70,5}},{{55,0,20}, {70,60,10}}};
        iceepeeceeC.simulate(islands,flights);
    }
    @Test
    public void simulateTestNull(){
        iceepeeceeC = new IceepeeceeContest();
        int[][][] islands2 = {{{0,0},{10,0},{10,10},{0,10}}};  
        int[][][] flights2 = {{{5,5,10},{15,5,10}}};
        iceepeeceeC.simulate(islands2,flights2);
    }
}
