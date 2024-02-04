package iceepeecee;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;


/**
 * Write a description of class ICEEPEECEETestEstudentsCiclo3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ICEEPEECEETestEstudentsCiclo3
{
    //***Cortes - Vasquez

    //@Test

    /*public void simulateShouldNot() {

        int[][][] islands = {{{300, 100},{100, 100},{100, 300},{300, 300}},

                             {{400, 500},{800, 500},{800, 700},{500, 700}}};

                                     

        int[][][] flights = {{{100, 100, 100}, {800, 800, 200}},

                            {{500, 100, 100}, {500, 500, 200}}};

        IceepeeceeContest solver = new IceepeeceeContest();

        solver.simulate(islands, flights);

        String[] observedIslands1 = solver.simulator.observedIslands();

        

        int[][][] islands2 = {{{300, 100},{100, 100},{100, 300},{300, 300}},

                             {{400, 500},{800, 500},{800, 700},{500, 700}}};

                             

        int[][][] flights2 = {{{100, 100, 100}, {400, 400, 200}},

                             {{450, 100, 100}, {450, 450, 200}}};

        IceepeeceeContest solver2 = new IceepeeceeContest();

        solver2.simulate(islands2, flights2);

        String[] observedIslands2 = solver2.simulator.observedIslands();

        assertFalse(Arrays.equals(observedIslands1, observedIslands2));

    }

@Test

    public void simulateShould() {

        int[][][] islands = {{{20, 30},{50, 50},{10, 50}}, 

                             {{40, 20},{60, 10},{75, 20},{60, 30}},  

                             {{45,60},{55,55},{60,60},{55,65}}};

                             

        int[][][] flights = {{{0, 30, 20},{78, 70, 5}}, 

                            {{55, 0, 20}, {10, 60, 10}}};

        IceepeeceeContest solver = new IceepeeceeContest();

        solver.simulate(islands, flights);

        String[] observedIslands1 = solver.simulator.observedIslands();

        

        int[][][] islands2 = {{{20, 30},{50, 50},{10, 50}}, 

                             {{40, 20},{60, 10},{75, 20},{60, 30}},  

                             {{45,60},{55,55},{60,60},{55,65}}};

                             

        int[][][] flights2 = {{{0, 30, 20},{78, 70, 5}}, 

                            {{55, 0, 20}, {10, 60, 10}}};

        IceepeeceeContest solver2 = new IceepeeceeContest();

        solver2.simulate(islands2, flights2);

        String[] observedIslands2 = solver2.simulator.observedIslands();

        assertArrayEquals(observedIslands1, observedIslands2);

    }*/

//***Vasquez 



     @Test

    public void testSolveShould() {

        int[][][] islands = 

            {{{20,30}, {50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

            

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}};

        

        IceepeeceeContest solver = new IceepeeceeContest();

        float result = solver.solve(islands, flights);

        

        assertEquals(48.0f, result, 0.00001);

    }

    

    @Test

    public void testSolveNotShould() {

        int[][][] islands =   {{{100, 100}, {200, 150}, {100, 200}},{{400, 500}, {700, 500}, {650, 600}}};

        

        int[][][] fligths = {{{50, 50, 20}, {450, 450, 80}}};



        IceepeeceeContest solver = new IceepeeceeContest();

        float result = solver.solve(islands, fligths);



        assertEquals(-999.0f, result, 0.00001); //Reemplazar por su respuesta esperada

    }

    

    @Test

    public void testSimulateShould() {

        int[][][] islands = 

            {{{20,30}, {50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}};

        

        IceepeeceeContest solver = new IceepeeceeContest();

        solver.simulate(islands, flights);

        

        assertTrue(true);

    }

    

        @Test

    public void testSolveShouldReturnAngle() {

        int[][][] islands = 

            {{{20, 30}, {50, 50}, {10, 50}}, {{40, 20}, {60, 10}, {75, 20}, {60, 30}}, {{45, 60}, {55, 55}, {60, 60}, {55, 65}}};



        int[][][] flights = {{{0, 30, 20}, {78, 70, 5}}, {{55, 0, 20}, {70, 60, 10}}};



        IceepeeceeContest solver = new IceepeeceeContest();

        float result = solver.solve(islands, flights);



        assertTrue(result >= 0 && result < 90);

    }

//****Achuri-Gil

@Test

    public void shouldSimulate(){

        int[][][] islandss = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flightss = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}};

        IceepeeceeContest ipC = new IceepeeceeContest();

        ipC.simulate(islandss,flightss);

    }

    

    @Test

    public void shouldnotSimulate(){

        int[][][] islandss = {{{20,30},{50,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flightss = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}};

        IceepeeceeContest ipC = new IceepeeceeContest();

        ipC.simulate(islandss,flightss);

    }

    

    @Test

    public void shouldGetACorrectMinAngle() {
        IceepeeceeContest ipC = new IceepeeceeContest();

        int[][][]islands = new int[][][] { { { 20, 30 }, { 50, 50 }, { 10, 50 } }, { { 40, 20 }, { 60, 10 }, { 75, 20 }, { 60, 30 } }, { { 45, 60 }, { 55, 55 }, { 60, 60 }, { 55, 65 } } };

        int[][][]flights = new int[][][] { { { 0, 30, 20 }, { 78, 70, 5 } }, { { 55, 0, 20 }, { 70, 60, 10 } } };

        float ans = ipC.solve(islands, flights);

        

        // Comprobar que el resultado no es "impossible" (es decir, se encontró un ángulo)

        assertNotEquals(-1, ans);

        

        // Comprobar que el ángulo está en el rango deseado

        assertTrue(ans >= 0 && ans <= 360);

    }

//*Lesmes*//




//SOLVE

    @Test

    public void accordingLPShouldTakeTheSmallestAngle() {
        IceepeeceeContest iceepeeceeC = new IceepeeceeContest();

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        float menorAngulo_ = iceepeeceeC.solve(islands, flights);

        assertTrue(menorAngulo_ < 48.1f && menorAngulo_ > 48.0f);

    }

    @Test

    public void accordingLPShouldNotTakeTheSmallestAngle() {
        IceepeeceeContest iceepeeceeC = new IceepeeceeContest();

        int[][][] islands = {{{0, 0},{10, 0},{10, 10},{0, 10}}};

        int[][][] flights = {{{5, 5, 10}, {15, 5, 10}}};

        float menorAngulo_ = iceepeeceeC.solve(islands, flights);

        assertTrue(menorAngulo_ == -1f);

    }

//Forero-Murcia



    @Test

    public void accordingFMShouldGetACorrectMinAngle3() {
        IceepeeceeContest iceepeeceeC = new IceepeeceeContest();
        int[][][] islands;

        int[][][] flights;

        double ans;

        islands = new int[][][] {{{-5,0},{5,0},{0,5}}};

        flights = new int[][][] {{{0,10,10},{10,0,10}}};

        ans = iceepeeceeC.solve(islands,flights);

        assertEquals(46.686143342,ans);

    }

    @Test

    public void accordingFMShouldGetACorrectMinAngle4() {
        IceepeeceeContest iceepeeceeC = new IceepeeceeContest();

        int[][][] islands;

        int[][][] flights;

        double ans;

        islands = new int[][][] {{{-5,0},{5,0},{0,5}}};

        flights = new int[][][] {{{0,10,5},{10,0,10}}};

        ans = iceepeeceeC.solve(islands,flights);

        assertEquals(59.491041134,ans);

    }

    @Test

    public void accordingFMShouldGetACorrectMinAngle6() {
        IceepeeceeContest iceepeeceeC = new IceepeeceeContest();

        int[][][] islands;

        int[][][] flights;

        double ans;

        islands = new int[][][]{{{-10,-10}, {10,-10}, {10,10},{-10,10}}};

        flights = new int[][][]{{{-100,0,10}, {100,0,10}},

                               {{0,100,10}, {0,-100,10}},

                               {{50,50,15}, {-50,-50,15}},

                               {{-50,50,15}, {50,-50,15}}};

        ans = iceepeeceeC.solve(islands,flights);

        assertEquals(43.313856658,ans);

    }


//CASALLAS-MURCIA

//CICLO 3



@Test

    public void accordingCMShouldSolveWithExampleInput3() {
        IceepeeceeContest contest = new IceepeeceeContest();

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights ={{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};



        float result = contest.solve(islands, flights);

        assertEquals(48.03169, result, 0.00001);

    }

@Test

    public void accordingCMShouldNotSolveTheProblem(){
        IceepeeceeContest contest = new IceepeeceeContest();

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights ={{{100,130,20},{178,170,5}}};

        float result = contest.solve(islands, flights);

        assertTrue(result==-1.0f);

    }

//Chicuazuque-Sierra

@Test

    public void solveInput1MaratonChicuazuqueSierra(){

       // Crear una instancia de IceepeeceeContest con un escenario de 100x100

        IceepeeceeContest input1 = new IceepeeceeContest();

        // Inicializar las variables de instancia

        int[][][] islands1 = new int[][][] {

            {{20, 30}, {50, 50}, {10, 50}},

            {{40, 20}, {60, 10}, {75, 20}, {60, 30}},

            {{45, 60}, {55, 55}, {60, 60}, {55, 65}}

        };

    

        int[][][] flights1 = new int[][][] {

            {{0, 30, 20}, {78, 70, 5}},

            {{55, 0, 20}, {70, 60, 10}}

        };

        

        float valorEsperado = 48.587036f;

        float valorObtenido = input1.solve(islands1, flights1);

        float delta = 1.0f; 

        assertEquals(valorEsperado, valorObtenido, delta);

    }

    

    @Test

    public void solveInput2MaratonChicuazuqueSierra(){

        IceepeeceeContest input2 = new IceepeeceeContest();

        int[][][] islands2 = new int[][][]{{{0, 0}, {10, 0}, {10, 10}, {0, 10}}};

        int[][][] flights2 =  new int[][][]{{{5, 5, 10},{15, 5, 10}}};


        float result = input2.solve(islands2, flights2);

        assertEquals(-1.0f, result, 0.01); // Se espera que el resultado sea -1.0f (sin solución)

    }


//MILTON ANDRES GUTIERREZ - JHON SEBASTIAN SOSA


 

    @Test

    public void accordingGSshouldSolveTheMaratonProblem(){
        IceepeeceeContest JuegoPrueba= new IceepeeceeContest();

        int [][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int [][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        assertTrue(JuegoPrueba.solve(islands,flights) == 48.031696f);

    }

    

    @Test

    public void accordingGSshouldReturnValidAngleValue(){
        IceepeeceeContest JuegoPrueba= new IceepeeceeContest();

        int [][][] islands = {{{0,0},{10,0},{10,10},{0,10}}};

        int [][][] flights = {{{5,5,10}, {15,5,10}}};

        assertTrue(JuegoPrueba.solve(islands,flights) == -1);

    }

    

    @Test

    public void accordingGSshouldnotSolveEmptyIslandsArrayItCountsItAsImpossibleReturningMinusOne(){
        IceepeeceeContest JuegoPrueba= new IceepeeceeContest();

        int [][][] islands = {{}};

        int [][][] flights = {{{5,5,10}, {15,5,10}}};

        assertTrue(JuegoPrueba.solve(islands,flights) == -1f);

    }







// DIAZ - MONROY

@Test

    public void accordingDMShouldSolve(){

        int[][][] islands = {{{20,30},{50,50},{10,50}},

                             {{40,20},{60,10},{75,20},{60,30}},

                             {{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20}, {78,70,5}},

                            {{55,0,20}, {70,60,10}}};

        IceepeeceeContest icpcContest = new IceepeeceeContest();

        float resp = icpcContest.solve(islands,flights);

        float expectedOutput = 48.031693036f;

        assertEquals(expectedOutput, resp,1e-9f);

    }

    @Test

    public void accordingDMShouldNotSolve(){

        int[][][] islands = {{{0,0},{10,0},{10,10},{0,10}}};

        int[][][] flights = {{{5,5,10}, {15,5,10}}};

        IceepeeceeContest icpcContest = new IceepeeceeContest();

        float resp = icpcContest.solve(islands,flights);

        assertEquals(-1.0, resp, 0.0f);

    }



//Mendivelso-Rodriguez


    @Test

    public void shouldSimulate2(){

        int[][][] islandss = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flightss = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}};

        IceepeeceeContest ipC = new IceepeeceeContest();

        ipC.simulate(islandss,flightss);

    }

    

    

    @Test

    public void shouldGetACorrectMinAngl2e() {
        IceepeeceeContest icp = new IceepeeceeContest();

        int[][][] islands = new int[][][] { { { 20, 30 }, { 50, 50 }, { 10, 50 } }, { { 40, 20 }, { 60, 10 }, { 75, 20 }, { 60, 30 } }, { { 45, 60 }, { 55, 55 }, { 60, 60 }, { 55, 65 } } };

        int[][][] flights = new int[][][] { { { 0, 30, 20 }, { 78, 70, 5 } }, { { 55, 0, 20 }, { 70, 60, 10 } } };

        float angle = icp.solve(islands, flights);

        

        // Comprobar que el resultado no es "impossible" (es decir, se encontró un ángulo)

        assertNotEquals(-1, angle);

        assertTrue(angle >= 0 && angle <= 360);

    }


//Silva-Suarez. 

/*@Test

    public void simulateShouldNot() {

        int[][][] islands = {{{300, 100},{100, 100},{100, 300},{300, 300}},

                             {{400, 500},{800, 500},{800, 700},{500, 700}}};

        int[][][] flights = {{{100, 100, 100}, {800, 800, 200}},

                            {{500, 100, 100}, {500, 500, 200}}};

        IceepeeceeContest solver = new IceepeeceeContest();

        solver.simulate(islands, flights);

        String[] observedIslands1 = solver.simulator.observedIslands();

        int[][][] islands2 = {{{300, 100},{100, 100},{100, 300},{300, 300}},

                             {{400, 500},{800, 500},{800, 700},{500, 700}}};

        int[][][] flights2 = {{{100, 100, 100}, {400, 400, 200}},

                             {{450, 100, 100}, {450, 450, 200}}};

        IceepeeceeContest solver2 = new IceepeeceeContest();

        solver2.simulate(islands2, flights2);

        String[] observedIslands2 = solver2.simulator.observedIslands();

        assertFalse(Arrays.equals(observedIslands1, observedIslands2));

    

    }*/

    

    /*@Test

    

    public void simulateShould() {

        int[][][] islands = {{{20, 30},{50, 50},{10, 50}}, 

                             {{40, 20},{60, 10},{75, 20},{60, 30}},  

                             {{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0, 30, 20},{78, 70, 5}}, 

                            {{55, 0, 20}, {10, 60, 10}}};

        IceepeeceeContest solver = new IceepeeceeContest();

        solver.simulate(islands, flights);

        String[] observedIslands1 = solver.simulator.observedIslands();

        int[][][] islands2 = {{{20, 30},{50, 50},{10, 50}}, 

                             {{40, 20},{60, 10},{75, 20},{60, 30}},  

                             {{45,60},{55,55},{60,60},{55,65}}};  

        int[][][] flights2 = {{{0, 30, 20},{78, 70, 5}}, 

                            {{55, 0, 20}, {10, 60, 10}}};

        IceepeeceeContest solver2 = new IceepeeceeContest();

        solver2.simulate(islands2, flights2);

        String[] observedIslands2 = solver2.simulator.observedIslands();

        assertEquals(observedIslands1.length, observedIslands2.length);

    

    }*/



     @Test



    public void testSolveShould2() {

        int[][][] islands = {{{20,30}, {50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}};

        IceepeeceeContest solver = new IceepeeceeContest();

        float result = solver.solve(islands, flights);

        assertEquals(48.031693036f, result, 0.00001);

    }

    

    @Test



    public void testSolveNotShould3() {

        int[][][] islands =   {{{100, 100}, {200, 150}, {100, 200}},{{400, 500}, {700, 500}, {650, 600}}};

        int[][][] fligths = {{{50, 50, 20}, {450, 450, 80}}};

        IceepeeceeContest solver = new IceepeeceeContest();

        float result = solver.solve(islands, fligths);

        assertEquals(-1.0f, result, 0.00001);

    }

    

    @Test



    public void testSimulateShould4() {

        int[][][] islands = {{{20,30}, {50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}};

        IceepeeceeContest solver = new IceepeeceeContest();

        solver.simulate(islands, flights);

        assertTrue(true);

    }

    

    @Test



    public void testSolveShouldReturnAngle2() {

        int[][][] islands = {{{20, 30}, {50, 50}, {10, 50}}, {{40, 20}, {60, 10}, {75, 20}, {60, 30}}, {{45, 60}, {55, 55}, {60, 60}, {55, 65}}};

        int[][][] flights = {{{0, 30, 20}, {78, 70, 5}}, {{55, 0, 20}, {70, 60, 10}}};

        IceepeeceeContest solver = new IceepeeceeContest();

        float result = solver.solve(islands, flights);

        assertTrue(result >= 0 && result < 90);

    }



// Montero-Villamizar

@Test

    public void shouldSimulate3() {
        IceepeeceeContest ipC = new IceepeeceeContest();

        int[][][] islands = {

            {{20, 30}, {50, 50}, {10, 50}},

            {{40, 20}, {60, 10}, {75, 20}, {60, 30}},

            {{45, 60}, {55, 55}, {60, 60}, {55, 65}}

        };

        int[][][] flights = {

            {{0, 30, 20}, {78, 70, 5}},

            {{55, 0, 20}, {70, 60, 10}}

        };



        assertDoesNotThrow(() -> ipC.simulate(islands, flights));

    }



    @Test

    public void shouldNotSimulate() {
        IceepeeceeContest ipC = new IceepeeceeContest();

        int[][][] islands = {

            {{20, 30}, {50, 50}},

            {{40, 20}, {60, 10}, {75, 20}, {60, 30}},

            {{45, 60}, {55, 55}, {60, 60}, {55, 65}}

        };

        int[][][] flights = {

            {{0, 30, 20}, {78, 70, 5}},

            {{55, 0, 20}, {70, 60, 10}}

        };



        assertDoesNotThrow(() -> ipC.simulate(islands, flights));

    }



    @Test

    public void shouldGetACorrectMinAngle2() {
        IceepeeceeContest ipC = new IceepeeceeContest();

        int[][][] islands = {

            {{20, 30}, {50, 50}, {10, 50}},

            {{40, 20}, {60, 10}, {75, 20}, {60, 30}},

            {{45, 60}, {55, 55}, {60, 60}, {55, 65}}

        };

        int[][][] flights = {

            {{0, 30, 20}, {78, 70, 5}},

            {{55, 0, 20}, {70, 60, 10}}

        };

        float angle = ipC.solve(islands, flights);



        assertNotEquals(-1.0, angle);


        assertTrue(angle >= 0 && angle <= 360);

    }



    @Test

    public void shouldNotSolve() {
        IceepeeceeContest ipC = new IceepeeceeContest();

        int[][][] islands = {

            {{100, 100}, {200, 150}, {100, 200}},

            {{400, 500}, {700, 500}, {650, 600}}

        };

        int[][][] flights = {

            {{150, 60, 20}, {400, 300, 90}}

        };



        float result = ipC.solve(islands, flights);



        assertEquals(-1.0, result);

    }

//Robinson - Yaya

    @Test

    public void shouldSimulate4(){
        IceepeeceeContest ipC;

        int[][][] islandss = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flightss = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}};

        ipC = new IceepeeceeContest();

        ipC.simulate(islandss,flightss);

    }

   @Test

    public void shouldnotSimulate2(){
        IceepeeceeContest ipC;

        int[][][] islandss = {{{20,30},{50,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flightss = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}};

        ipC = new IceepeeceeContest();

        ipC.simulate(islandss,flightss);

    }

    

    @Test

    public void shouldGetACorrectMinAngle4() {
        IceepeeceeContest ipC=new IceepeeceeContest();

        int[][][]islands = new int[][][] { { { 20, 30 }, { 50, 50 }, { 10, 50 } }, { { 40, 20 }, { 60, 10 }, { 75, 20 }, { 60, 30 } }, { { 45, 60 }, { 55, 55 }, { 60, 60 }, { 55, 65 } } };

        int[][][]flights = new int[][][] { { { 0, 30, 20 }, { 78, 70, 5 } }, { { 55, 0, 20 }, { 70, 60, 10 } } };

        float ans = ipC.solve(islands, flights);

        assertNotEquals(-1.0f, ans);

        float angle = ans;

        assertTrue(angle >= 0 && angle <= 360);

    }

    

    @Test



    public void testSolveNotShould2() {

        int[][][] islands = {{{100, 100}, {200, 150}, {100, 200}},{{400, 500}, {700, 500}, {650, 600}}};

        int[][][] fligths = {{{50, 50, 20}, {450, 450, 80}}};

        IceepeeceeContest solver = new IceepeeceeContest();

        float result = solver.solve(islands, fligths);

        assertEquals(result,-1.0f); //Reemplazar por su respuesta esperada

    }

//A.MARTINEZ - RAMIREZ



    @Test

    public void testSolvePass() {

        IceepeeceeContest iceepeeceeContest = new IceepeeceeContest();

        int[][][] newIslands = {{{20,30}, {50,50}, {10,50}},

                             {{40,20}, {60,10}, {75,20}, {60,30}},

                             {{45,60}, {55,55}, {60,60}, {55,65}}};

        int[][][] newFlights = {{{0,30,20}, {78,70,5}},

                             {{55,0,20}, {70,60,10}}};

        float expectedTheta = 48.1f;

        assertEquals(expectedTheta, iceepeeceeContest.solve(newIslands, newFlights));

    }

    @Test

    public void testSolveFail() {

        IceepeeceeContest iceepeeceeContest = new IceepeeceeContest();

        int[][][] newIslands = {{{20,30}, {50,50}, {10,50}},

                             {{40,20}, {60,10}, {75,20}, {60,30}},

                             {{45,60}, {55,55}, {60,60}, {55,65}}};

        int[][][] newFlights = {{{0,5,20},{18,50,5}}};

        float expectedTheta = 0f;

        assertEquals(expectedTheta, iceepeeceeContest.solve(newIslands, newFlights));

    }


//ACHURI-GIL[EDITAR]


    @Test

    public void ShouldFunctionSimulateAchuri_Gil(){
        IceepeeceeContest ipC;

        int[][][] islandss = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flightss = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}};

        ipC = new IceepeeceeContest();

        ipC.simulate(islandss,flightss);

    }

    

    @Test

    public void notShouldFunctionSimulateAchuri_Gil(){
        IceepeeceeContest ipC;

        int[][][] islandss = {{{20,30},{50,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flightss = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}};

        ipC = new IceepeeceeContest();

        ipC.simulate(islandss,flightss);

    }

    

    @Test

    public void ShouldFunctionGetACorrectMinAngleAchuri_Gil() {
        IceepeeceeContest ipC = new IceepeeceeContest();

        int[][][]islands = new int[][][] { { { 20, 30 }, { 50, 50 }, { 10, 50 } }, { { 40, 20 }, { 60, 10 }, { 75, 20 }, { 60, 30 } }, { { 45, 60 }, { 55, 55 }, { 60, 60 }, { 55, 65 } } };

        int[][][]flights = new int[][][] { { { 0, 30, 20 }, { 78, 70, 5 } }, { { 55, 0, 20 }, { 70, 60, 10 } } };

        float ans = ipC.solve(islands, flights);

        

        // Comprobar que el resultado no es "impossible" (es decir, se encontró un ángulo)

        assertNotEquals(-1, ans);

        

        // Convertir el resultado a un valor flotante

               

        // Comprobar que el ángulo está en el rango deseado

        assertTrue(ans >= 0 && ans <= 360);

    }

    

    

    @Test

    public void ShouldFunctionGetACorrectMinAngle2Achuri_Gil() {
        IceepeeceeContest ipC = new IceepeeceeContest();

        int[][][] islands = new int[][][] {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60, 30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = new int[][][] { { { 0, 30, 20 }, { 78, 70, 5 } }, { { 55, 0, 20 }, { 70, 60, 10 } } };

        float ans = ipC.solve(islands, flights);

        

        // Comprobar que el resultado no es "impossible" (es decir, se encontró un ángulo)

        assertNotEquals("impossible", ans);

        

       

        

        // Comprobar que el ángulo está en el rango deseado

        assertTrue(ans >= 0 && ans <= 90);

        

        

        assertEquals(67.2,ans,0.001);

    }

    

    @Test



    public void notShouldFunctionSolveAchuri_Gil() {



        int[][][] islands =   {{{100, 100}, {200, 150}, {100, 200}},{{400, 500}, {700, 500}, {650, 600}}};



        



        int[][][] fligths = {{{50, 50, 20}, {450, 450, 80}}};







        IceepeeceeContest solver = new IceepeeceeContest();



        float result = solver.solve(islands, fligths);



        

        assertEquals(result,-1); 



    }

    

    @Test

    public void ShouldFunctionSolveCorrectlyAchuri_Gil() {

        int[][][] islands = {{{20, 30},{50, 50},{10, 50}}, 

                             {{40, 20},{60, 10},{75, 20},{60, 30}},  

                             {{45,60},{55,55},{60,60},{55,65}}};

                             

        int[][][] flights = {{{0, 30, 20},{78, 70, 5}}, 

                            {{55, 0, 20}, {10, 60, 10}}};

        

        IceepeeceeContest solver = new IceepeeceeContest();

        float result = solver.solve(islands, flights);

        assertEquals(84.9, result, 0.001); 

    }

    

    @Test

    public void notShouldFunctionSolveAtAllAchuri_Gil(){

        int[][][] islands = {{{300, 100},{100, 100},{100, 300},{300, 300}},

                             {{400, 500},{800, 500},{800, 700},{500, 700}}};

                                     

        int[][][] flights = {{{100, 100, 100}, {400, 400, 200}},

                             {{450, 100, 100}, {450, 450, 200}}};

        IceepeeceeContest solver = new IceepeeceeContest();

        float result = solver.solve(islands, flights);

        assertEquals(-1, result, 0.001);

    }
}
