package iceepeecee;


import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ICEEPEECEEETest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ICEEPEECEEETestEstudentsCiclo1
{
    /**
     * Default constructor for test class ICEEPEECEEETest
     */
    public ICEEPEECEEETestEstudentsCiclo1()
    {
    }

//Bernal-Hernandez


@Test

    public void shouldAddIsland() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);
        int[][] polygon = {{100, 50}, {150, 80}, {200, 100}};

        iceepeecee.addIsland("blue", polygon);

        String[] islands = iceepeecee.islands();

        assertEquals(1, islands.length);

        assertEquals("blue", islands[0]);

    }

@Test


    public void shouldNotDeleteNonExistentIsland() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon = {{100, 50}, {150, 80}, {200, 100}};

        iceepeecee.addIsland("blue", polygon);

        iceepeecee.delIsland("green"); // Intentar eliminar una isla que no existe

        String[] islands = iceepeecee.islands();

        assertEquals(1, islands.length); // La isla original no debe haberse eliminado

        assertEquals("blue", islands[0]);

    }



    @Test

    public void shouldNotPhotographAllFlightsWhenNoneExist() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        // Intentar fotografiar todos los vuelos cuando no hay ninguno

        iceepeecee.photograph(45);

        String[] observedIslands = iceepeecee.observedIslands();

        assertTrue(observedIslands.length == 0);

    }
    
    //Lesmes

//AddFLight


    @Test

    public void accordingLPShouldNotAddFlight() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {100, 100, 0};

        int[] to = {200, 200, 0};

        iceepeecee.addFlight("#EA3333", from, to);

        int[] from1 = {100, 100, 0};

        int[] to1 = {200, 200, 0};

        iceepeecee.addFlight("#EA3333", from1, to1);

        assertFalse(iceepeecee.ok());

    }


    @Test

    public void accordingLPShouldNotAddIsland() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon = {{50, 50, 0}, {100, 50, 0}, {100, 100, 0}, {50, 100, 0}}; 

        iceepeecee.addIsland("#5AEA33", polygon);

        int[][] polygon1 = {{400, 200, 0}, {300, 400, 0}, {100, 100, 0}, {50, 100, 0}}; 

        iceepeecee.addIsland("#5AEA33", polygon1);

        assertFalse(iceepeecee.ok());

    }

//Photograph(color, teta)


    @Test

    public void accordingLPShouldNotPhotograph() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {100, 100, 0};

        int[] to = {200, 200, 0};  

        iceepeecee.addFlight("#EA4F33", from, to);

        iceepeecee.photograph("#EA4F33", 91);

        assertFalse(iceepeecee.ok());

    }

//Photograph(teta)


    @Test

    public void accordingLPShouldNotPhotograph5() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {100, 100, 0};

        int[] to = {200, 200, 0};  

        iceepeecee.addFlight("#EA4F33", from, to);

        int[] from1 = {200, 200, 0};

        int[] to1 = {300, 300, 0};  

        iceepeecee.addFlight("#5AEA33", from1, to1);

        iceepeecee.photograph(91);

        assertFalse(iceepeecee.ok());

    }

//DelFLight


    @Test

    public void accordingLPShouldNotDelFlight() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {100, 100, 0};

        int[] to = {200, 200, 0};

        iceepeecee.addFlight("#EA4F33", from, to);

        iceepeecee.delFlight("#5AEA23");

        assertFalse(iceepeecee.ok());

    }

//DelIsland

    @Test

    public void accordingLPShoulddelIsland() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon = {{50, 50}, {100, 50}, {100, 100}, {50, 100}}; // Example island polygon

        iceepeecee.addIsland("#5AEA33", polygon);

        iceepeecee.delIsland("#5AEA33");

        assertTrue(iceepeecee.ok());

    }

    @Test

    public void accordingLPShouldNotdelIsland() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon = {{50, 50}, {100, 50}, {100, 100}, {50, 100}}; // Example island polygon

        iceepeecee.addIsland("#5AEA33", polygon);

        iceepeecee.delIsland("#5AEA32");

        assertFalse(iceepeecee.ok());

    }

//IslandLocation

    @Test

    public void accordingLPShouldIslandLocation() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon = {{50, 50}, {100, 50}, {100, 100}, {50, 100}};

        iceepeecee.addIsland("#5AEA33", polygon);

        int[][] location = iceepeecee.islandLocation("#5AEA33");

        assertTrue(iceepeecee.ok());

    }

    @Test

    public void accordingLPShouldNotIslandLocation() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon = {{50, 50}, {100, 50}, {100, 100}, {50, 100}};

        iceepeecee.addIsland("#5AEA33", polygon);

        int[][] location = iceepeecee.islandLocation("#5AEA23");

        assertFalse(iceepeecee.ok());

    }

//FlightLocation

    @Test

    public void accordingLPShouldFlightLocation() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {100, 100, 0};

        int[] to = {200, 200, 0};

        iceepeecee.addFlight("#EA5733", from, to);

        int[][] location = iceepeecee.flightLocation("#EA5733");

        assertNotNull(iceepeecee.ok());

    }

    @Test

    public void accordingLPShouldNotFlightLocation() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {100, 100, 0};

        int[] to = {200, 200, 0};

        iceepeecee.addFlight("#EA5733", from, to);

        int[][] location = iceepeecee.flightLocation("#5AEA33");

        assertNotNull(iceepeecee.ok());

    }

//FlightCamera


    @Test

    public void accordingLPShouldNotFlightCamera() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);
        int[] from = {100, 100, 0}; 

        int[] to = {200, 200, 0};   

        iceepeecee.addFlight("#EA5733", from, to);

        int angle = iceepeecee.flightCamera("#5AEA33");

        assertFalse(iceepeecee.ok());

    }
    
    //Forero-Murcia

@Test

    public void accordingFMShouldCreateACorrectIceepeecee(){

        ICEEPEECEEE manage;

        manage = new ICEEPEECEEE((int)Math.pow(10,6),(int)Math.pow(10,6));

    }

    

    @Test

    public void accordingFMShouldCreateAddAndDeleteACorrectIsland(){

        ICEEPEECEEE manage;

        manage = new ICEEPEECEEE((int)Math.pow(10,6),(int)Math.pow(10,6));

        int[][] maxCoords = {{(int) Math.pow(10, 6), (int) Math.pow(10, 6)}, {0, 0}, {10, 10}};

        manage.addIsland("Red",maxCoords);

        assertTrue(manage.ok());

        String [] islas = manage.islands();

        assertTrue(manage.ok());

        assertEquals("Red",islas[0]);

        manage.delIsland("Red");

        assertTrue(manage.ok());

        islas = manage.islands();

        assertTrue(manage.ok());

        assertArrayEquals(islas,new String[]{});

        manage.addIsland("Red",maxCoords);

        assertTrue(manage.ok());

    }

    

    @Test

    public void accordingFMshouldNotAddIslandsBecauseIsItersectingWithOtherIsland(){

        ICEEPEECEEE manage = new ICEEPEECEEE((int)Math.pow(10,6),(int)Math.pow(10,6));

        manage.addIsland("Pale Turquoise",new int[][]{{20,0},{60,0},{60,60},{20,60}});

        assertEquals(true, manage.ok());

        //Try to add an island where another island is located.

        manage.addIsland("Black",new int[][]{{-20,20},{80,20},{80,40},{-20,40}});

        assertEquals(false, manage.ok());

    }

    @Test

    public void accordingFMShouldCreateAddAndDeleteACorrectFlight(){

        ICEEPEECEEE manage;

        manage = new ICEEPEECEEE((int)Math.pow(10,6),(int)Math.pow(10,6));

        int[] maxCoords = {(int) Math.pow(10, 6), (int) Math.pow(10, 6),100};

        manage.addFlight("Red",new int[]{0,0,20},maxCoords);

        assertTrue(manage.ok());

        String [] vuelos = manage.flights();

        assertTrue(manage.ok());

        assertEquals("Red",vuelos[0]);

        manage.delFlight("Red");

        assertTrue(manage.ok());

        vuelos = manage.flights();

        assertTrue(manage.ok());

        assertArrayEquals(vuelos,new String[]{});

        manage.addFlight("Red",new int[]{0,0,20},maxCoords);

        assertTrue(manage.ok());

    }

    

    @Test

    public void accordingFMshouldNotAddTwoFlightsAtTheSamePoint(){

        ICEEPEECEEE manage = new ICEEPEECEEE((int)Math.pow(10,6),(int)Math.pow(10,6));

        manage.addFlight("Pale Turquoise",new int[]{0,0,20},new int[]{20,20,20});

        assertEquals(true, manage.ok());

        //Try to add an island where another island is located.

        manage.addFlight("Red",new int[]{0,0,20},new int[]{20,20,20});

        assertEquals(false, manage.ok());

    }

    @Test

    public void accordingFMshouldMakeAPhotograph(){

        ICEEPEECEEE manage = new ICEEPEECEEE((int)Math.pow(10,6),(int)Math.pow(10,6));

        manage.addFlight("Pale Turquoise",new int[]{0,0,20},new int[]{20,20,20});

        assertEquals(true, manage.ok());

        int[][] maxCoords = {{(int) Math.pow(10, 6), (int) Math.pow(10, 6)}, {0, 0}, {10, 10}};

        manage.addIsland("Red",maxCoords);

        assertEquals(true, manage.ok());

        manage.photograph(45);

        assertEquals(true, manage.ok());

        manage.photograph("Pale Turquoise",20.0f);

        assertEquals(true, manage.ok());

        assertEquals(20, manage.flightCamera("Pale Turquoise"));

    }

    @Test

    public void accordingFMshouldNotMakeAPhotograph(){

        ICEEPEECEEE manage = new ICEEPEECEEE((int)Math.pow(10,6),(int)Math.pow(10,6));

        int[][] maxCoords = {{(int) Math.pow(10, 6), (int) Math.pow(10, 6)}, {0, 0}, {10, 10}};

        manage.addIsland("Red",maxCoords);

        assertEquals(true, manage.ok());

        manage.photograph(45);

        assertEquals(true, manage.ok());

    }

    @Test

    public void accordingFMshouldConsultFlightAndIslandLocation(){

        ICEEPEECEEE manage = new ICEEPEECEEE((int)Math.pow(10,6),(int)Math.pow(10,6));

        int [][] location = {{0,0},{50,50},{100,50}};

        manage.addIsland("Red",location);

        assertTrue(manage.ok());

        int [][] newLocation = manage.islandLocation("Red");

        for (int i = 0 ; i < location.length ;i++){

            assertEquals(location[i][0],newLocation[i][0]);

            assertEquals(location[i][1],newLocation[i][1]);

        }

        assertTrue(manage.ok());

        int [] from = new int[]{0,0,20};

        int [] to = new int[]{20,20,20};

        manage.addFlight("Red",from,to);

        assertTrue(manage.ok());

        newLocation = manage.flightLocation("Red");

        assertEquals(from[0],newLocation[0][0]);

        assertEquals(from[1],newLocation[0][1]);

        assertEquals(from[2],newLocation[0][2]);

        assertEquals(to[0],newLocation[1][0]);

        assertEquals(to[1],newLocation[1][1]);

        assertEquals(to[2],newLocation[1][2]);

        assertTrue(manage.ok());

    }

    @Test

    public void accordingFMshouldNotConsultFlightAndIslandLocation(){

        ICEEPEECEEE manage = new ICEEPEECEEE((int)Math.pow(10,6),(int)Math.pow(10,6));

        manage.islandLocation("Red");

        assertFalse(manage.ok());

    }

    @Test

    public void accordingFMShouldMakeVisibleTheIceepeecee(){

        ICEEPEECEEE manage = new ICEEPEECEEE(new int[][][]{{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},

                                {{45,60},{55,55},{60,60},{55,65}}},new int[][][]{{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}});

        assertEquals(true, manage.ok());

        manage.photograph(48.032f);

        assertEquals(true, manage.ok());

        manage.makeVisible();

        assertEquals(true, manage.ok());

        manage.makeInvisible();

        assertEquals(true, manage.ok());

        manage.photograph(40);

        assertEquals(true, manage.ok());

        manage.makeVisible();

        assertEquals(true, manage.ok());

    }

    @Test

    public void accordingFMShouldNotMakeVisibleAErrasedIslandTheIceepeecee(){

        ICEEPEECEEE manage = new ICEEPEECEEE(100000,100000);

        manage.addIsland("Red",new int[][]{{40,20},{60,10},{75,20},{60,30}});

        assertEquals(true, manage.ok());

        manage.delIsland("Red");

        assertEquals(true, manage.ok());

        manage.makeVisible();

    }
    //CASALLAS MURCIA

@Test

    public void accordingCMShouldAddIslandSuccess() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);
        String color="#FF0000";
        int[][] polygon = {{10, 10}, {20, 10}, {20, 20}, {10, 20}};
        iceepeecee.addIsland(color, polygon);
        assertTrue(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldNotAddIslandLessThanThree(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);
        int[][] polygon1 = {{10, 10},{20, 20}};
        iceepeecee.addIsland("#FF0000",polygon1);
        assertFalse(iceepeecee.ok());

    }

@Test

    public void accordingCMShouldAddFlightSuccess() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);
        String color="#FF0000";

        int[] from = {10,10,10};

        int[] to = {70,78,5};

        iceepeecee.addFlight(color, from, to);

        assertTrue(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldAddFlightSuccess2() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        String color="#FF0000";

        int[] from = {10,10,10};

        int[] to = {70,78,5};

        iceepeecee.addFlight(color, from, to);

        assertTrue(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldDelIslandSuccess() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon = {{10, 10}, {20, 10}, {20, 20}, {10, 20}};

        iceepeecee.addIsland("#FF0000", polygon);

        iceepeecee.makeVisible();

        iceepeecee.delIsland("#FF0000");

        assertTrue(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldNotDelNotExistentIsland() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon = {{10, 10}, {20, 10}, {20, 20}, {10, 20}};

        iceepeecee.addIsland("#FF0000", polygon);

        iceepeecee.makeVisible();

        iceepeecee.delIsland("#0000FF");

        assertFalse(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldDelFlightSuccess() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {10,10,10};

        int[] to = {70,78,20};

        iceepeecee.addFlight("#FF0000", from, to);

        iceepeecee.delFlight("#FF0000");

        assertTrue(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldNotDelNotExistentFlight() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {10,10,10};

        int[] to = {70,78,50};

        iceepeecee.addFlight("#FF0000", from, to);

        iceepeecee.delFlight("#0000FF");

        assertFalse(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldLocateIslandSuccess(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon = {{10, 10}, {20, 10}, {20, 20}, {10, 20}};

        iceepeecee.addIsland("#FF0000", polygon);

        iceepeecee.makeVisible();

        iceepeecee.islandLocation("#FF0000");

        assertTrue(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldNotLocateIslandNotExistent(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon = {{10, 10}, {20, 10}, {20, 20}, {10, 20}};

        iceepeecee.addIsland("#FF0000", polygon);

        iceepeecee.makeVisible();

        iceepeecee.islandLocation("#0000FF");

        assertFalse(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldLocateFlightSuccess(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {10,10,10};

        int[] to = {70,78,50};

        iceepeecee.addFlight("#FF0000", from, to);

        iceepeecee.flightLocation("#FF0000");

        assertTrue(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldNotLocateFlightNotExistent(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {10,10,10};

        int[] to = {70,78,50};

        iceepeecee.addFlight("#FF0000", from, to);

        iceepeecee.flightLocation("#0000FF");

        assertFalse(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldTakeAPhotoWithDifferentTetha(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[]from={0,30,20}; 

        int[]to={78,70,5};

        String color="#FF0000";

        iceepeecee.addFlight(color,from,to);

        iceepeecee.photograph(color,48);

        iceepeecee.photograph(color,60);

        assertTrue(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldNotTakeAPhotoWithNegativeAngles(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[]from={0,30,20}; 

        int[]to={78,70,5};

        String color="#FF0000";

        iceepeecee.addFlight(color,from,to);

        iceepeecee.photograph(color,-1);

        assertFalse(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldTakePhotosSuccess(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[]from={0,30,20}; 

        int[]to={78,70,5};

        int[]from1={55,0,20};

        int[]to1={70,60,10};

        String color="#FF0000";

        String color1="#FFFFFF";

        iceepeecee.addFlight(color,from,to);

        iceepeecee.addFlight(color1,from1,to1);

        iceepeecee.photograph(48);

        assertTrue(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldNotNotTakePhotosWithAnglesMoreThan90(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[]from={0,30,20}; 

        int[]to={78,70,5};

        int[]from1={55,0,20};

        int[]to1={70,60,10};

        String color="#FF0000";

        String color1="#FFFFFF";

        iceepeecee.addFlight(color,from,to);

        iceepeecee.addFlight(color1,from1,to1);

        iceepeecee.photograph(100);

        assertFalse(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldFlightCameraSuccess(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[]from={0,30,20}; 

        int[]to={78,70,5};

        String color="#FF0000";

        iceepeecee.addFlight(color,from,to);

        iceepeecee.photograph(48);

        iceepeecee.flightCamera(color);

        assertTrue(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldNotFlightCameraPhotoNotExistent(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[]from={0,30,20}; 

        int[]to={78,70,5};

        String color="#FF0000";

        iceepeecee.photograph(48);

        iceepeecee.flightCamera(color);

        assertFalse(iceepeecee.ok());

    }
    // DÍAZ - MONROY

    @Test

    public void accordingDMShouldNotAddIslands1() {
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        //No deberia agregar una isla ya creada
        String color2 = "BB";
        int[][] polygon2 = new int[][]{{1000,980,950},{20,60,40}};
        icpc.addIsland(color2, polygon2);
        int[][] polygon3 = new int[][]{{400,450,500,450},{400,390,400,450}};    
        icpc.addIsland(color2, polygon3);

        assertEquals(false,icpc.ok());

    }



    @Test

    public void accordingDMShouldNotDeleteIslands() {
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        //No puede eliminar una isla que no existe
        String   color1 = "AA";
        icpc.delIsland(color1);

        assertEquals(false,icpc.ok());        

    }

@Test

    public void accordingDMShouldAddFlight() {
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        String color1 = "AA";
        String color2 = "BB";
        int[] from1 = new int[]{300,500,100};
        int[] to1 = new int[]{720,200,60};
        int[] from3 = new int[]{20,50,20};
        int[] to3 = new int[]{300,400,60};
        icpc.addFlight(color1, from1, to1);
        icpc.addFlight(color2, from3, to3);

        icpc.makeVisible();

        assertEquals(true,icpc.ok());

    }

    @Test

    public void accordingDMShouldNotAddFlight1() {
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        //No deberia agregar un vuelo ya creado
        String color1 = "AA";
        int[] from1 = new int[]{300,500,100};
        int[] to1 = new int[]{720,200,60};
        int[] from3 = new int[]{20,50,20};
        int[] to3 = new int[]{300,400,60};
        icpc.addFlight(color1, from1, to1);
        icpc.addFlight(color1, from3, to3);
        assertEquals(false,icpc.ok());

    }

@Test

    public void accordingDMShouldDeleteFlight() {
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        String color1 = "AA";
        int[] from1 = new int[]{300,500,100};
        int[] to1 = new int[]{720,200,60};
        icpc.addFlight(color1, from1, to1);
        icpc.delFlight(color1);
        assertEquals(true,icpc.ok()); 

    }

    @Test

    public void accordingDMShouldNotDeleteFlight() {
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        String color1 = "AA";
        //No puede eliminar un vuelo que no existe

        icpc.delFlight(color1);

        assertEquals(false,icpc.ok());

    }

@Test

    public void accordingDMShouldNotPhotographInt2() {
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        String color4 = "DD";
        String color5 = "EE";
        int[][] polygon5 = new int[][]{{250,400,500},{75,100,60}};
        int[] from4 = new int[]{200,150,250};
        int[] to4 = new int[]{700,50,100};
        int  tetaI2 = 60;
        //No toma foto con un ángulo negativo

        icpc.addIsland(color4, polygon5);

        icpc.addFlight(color5, from4, to4);

        icpc.photograph(color5, -tetaI2);

        assertEquals(false,icpc.ok());

    }


    @Test

    public void accordingDMShouldNotPhotographAllFlightsInt() {
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        String color1 = "AA";
        String color2 = "BB";
        String color3 = "CC";

        String color4 = "DD";

        String color5 = "EE";

        String color6 = "FF";

        String color7 = "GG";

        String color8 = "HH";
        int[][] polygon2 = new int[][]{{1000,980,950},{20,60,40}};

        int[][] polygon3 = new int[][]{{400,450,500,450},{400,390,400,450}};

        int[][] polygon4 = new int[][]{{1100,1200,1150},{30,50,60}};

        int[][] polygon5 = new int[][]{{250,400,500},{75,100,60}};
        int[] from1 = new int[]{300,500,100};
        int[]to1 = new int[]{720,200,60};
        int[] from3 = new int[]{20,50,20};

        int[] to3 = new int[]{300,400,60};

        int[] from4 = new int[]{200,150,250};

        int[] to4 = new int[]{700,50,100};

        int[] from5 = new int[]{800,100,200};

        int[] to5 = new int[]{950,500,90};
        int  tetaI1 = 120;
        icpc.addIsland(color1, polygon2);

        icpc.addIsland(color2, polygon3);

        icpc.addIsland(color3, polygon4);

        icpc.addIsland(color4, polygon5);

        icpc.addFlight(color5, from1, to1);

        icpc.addFlight(color6, from3, to3);

        icpc.addFlight(color7, from4, to4);

        icpc.addFlight(color8, from5, to5);

        icpc.photograph(-tetaI1);

        icpc.makeVisible();

        assertEquals(false,icpc.ok());

    }

    @Test

    public void accordingDMShouldNotConsultIslandLocation(){
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        String color1 = "AA";
        //No puede consultar la localización de una isla que no existe

        icpc.islandLocation(color1);

        assertEquals(false,icpc.ok());

    }

    @Test

    public void accordingDMShouldConsultFlightLocation(){
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        String color1 = "AA";
        String color2 = "BB";
        int[] from1 = new int[]{300,500,100};
        int[]to1 = new int[]{720,200,60};
        int[] from3 = new int[]{20,50,20};
        int[] to3 = new int[]{300,400,60};
        icpc.addFlight(color1, from1, to1);

        icpc.addFlight(color2, from3, to3);

        assertTrue(icpc.flightLocation(color1)[0].equals(from1));

        assertTrue(icpc.flightLocation(color2)[0].equals(from3));     

    }

    @Test

    public void accordingDMShouldNotConsultFlightLocation(){
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        String color1 = "AA";
        //No puede consultar la localización de un vuelo que no existe

        icpc.flightLocation(color1);

        assertEquals(false,icpc.ok());

    }


    @Test

    public void accordingDMShouldNotConsultFlightCamera(){
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        String color1 = "AA";
        //No puede consultar la camara de un vuelo que no existe

        icpc.flightCamera(color1);

        assertEquals(false,icpc.ok());

    }
    //Silva-Suarez: 

    public void testAddIsland() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(100, 100);

        int[][] vertices = {{50, 50}, {60, 60}, {90, 90}};

        iceepeecee.addIsland("blue", vertices);

        assertTrue(iceepeecee.ok());

    }

    

    @Test

    

    public void testAddIslandOutsideBounds() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(100, 100);

        int[][] vertices = {{120, 120}, {150, 150}, {180, 180}};

        iceepeecee.addIsland("Blue", vertices);

        assertFalse(iceepeecee.ok());

    }

    

    @Test

    

    

    public void testAddIslandSameColor() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(100, 100);

        int[][] vertices1 = {{5, 5}, {15, 5}, {10, 15}};

        iceepeecee.addIsland("yellow", vertices1);

        assertTrue(iceepeecee.ok());



        int[][] vertices2 = {{20, 20}, {30, 20}, {25, 30}};

        iceepeecee.addIsland("yellow", vertices2);

        assertFalse(iceepeecee.ok());

    }



    @Test



    public void testDelIsland() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(100, 100);

        int[][] vertices = {{5, 5}, {15, 5}, {10, 15}};

        iceepeecee.addIsland("blue", vertices);

        iceepeecee.delIsland("blue");

        assertTrue(iceepeecee.ok());

    }



    @Test

    

    public void testAddFlightSameColor() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(100, 100);

        int[] from1 = {10, 10, 10};

        int[] to1 = {20, 20, 20};

        int[] from2 = {30, 30, 30};

        int[] to2 = {40, 40, 30};

        iceepeecee.addFlight("blue", from1, to1);

        assertTrue(iceepeecee.ok());

        iceepeecee.addFlight("blue", from2, to2);

        assertFalse(iceepeecee.ok());  

    }


    @Test

    public void testPhotographSingleFlight() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(100, 100);

        int[] from = {10, 10,5};

        int[] to = {20, 20,30};

        iceepeecee.addFlight("red", from, to);

    

        assertTrue(iceepeecee.ok()); 



        iceepeecee.photograph("red", 45);

        assertTrue(iceepeecee.ok()); 

    }
    
    //Chicuazuque-Sierra

    @Test

    public void testInput1Islands() throws Exception {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(100, 100);

        iceepeecee.addIsland("red", new int[][]{{20, 30}, {50, 50}, {10, 50}});



        String[] expectedIslands = {"red"};

        String[] result = iceepeecee.islands();



        assertArrayEquals(expectedIslands, result);

    }

    @Test

    public void testInput1Flights() throws Exception {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(100, 100);

        iceepeecee.addFlight("fligth1", new int[]{0, 30, 20}, new int[]{78, 70, 5});

        String[] expectedFlights = {"fligth1"};

        String[] result = iceepeecee.flights();



        assertArrayEquals(expectedFlights, result);

    }
    /*MILTON GUTIERREZ - JHON SOSA*/

    //Creacion de Iceepeecee

    @Test

    public void shouldCreateMapofIceepeeceeCorrectly(){
        int width = 1000;
        int length = 1000;
        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(width, length);
        assertTrue(juegoPrueba.ok());

    }

    @Test

    public void shouldnotAddTablero(){

        int width = 99;
        int length = 120;
        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(width, length); //No cumple con las restricciones para el tablero
        assertFalse(juegoPrueba.ok()); 

    }

    

    @Test

    //Creacion de Island

    public void shouldAddIsland2(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width); //Creamos el Iceepeecee

        

        //Definimos variables para la isla 

        int[][] polygon = {{5,50},{50,100},{100,200}};

        String color = "red";

        juegoPrueba.addIsland(color, polygon);

        assertTrue(juegoPrueba.ok()); //Debe verificar que se haya creado correctamente

        Island islaPrueba = (Island) new NormalIsland(polygon,color);
        try{
            assertTrue(juegoPrueba.getIsland(color).getColor().equals(islaPrueba.getColor())); //La isla creada debe estar almacenada y debe ser igual a una creada con las mismas caracteristicas.
        } catch(IceepeeceeExcepcion e){
        }
         
    }

    

    @Test



    public void shouldNotAddIslandsWithLessThanThreeVertices(){

        //Creamos un Iceepeecee

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width);

        //Creamos los parametros para la isla

        int[][] polygon = {{5,50},{50,100}}; //tiene menos de tres vertices.

        String color = "red";

        juegoPrueba.addIsland(color, polygon);

        assertFalse(juegoPrueba.ok());

    }

    public void shouldNotAddIslandsWithUsedColor(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width);
        //Creamos los parametros para la isla

        int[][] polygon1 = {{5,50},{50,100}, {100,20}};

        String color = "red";

        juegoPrueba.addIsland(color, polygon1); // debe aÃ±adir la isla ( para pruebas)

        assertTrue(juegoPrueba.ok());

    

        int[][] polygon2 = {{200,0}, {250,200}, {300,300}};

        juegoPrueba.addIsland(color, polygon2); // no se pues aÃ±adir una isla con un color ya usado.

        assertFalse(juegoPrueba.ok());

    }

    

    public void shouldNotAddIslandsWithLargerThanTheMap(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width);

        //Creamos los parametros para la isla

        int[][] polygon3 = {{301,100},{0,100}, {0,100}, {100,400}};

        String color = "blue";

        juegoPrueba.addIsland(color, polygon3); //no puede aÃ±adir una isla que se salga de los limites del tablero

        assertFalse(juegoPrueba.ok());

    }

    

    public void shouldNotAddIslandThatIntersectsWithCreatedOnes(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width);

        int[][] polygon4 = {{250,30},{250,50},{275,60}};

        String color1 = "blue";

        juegoPrueba.addIsland(color1, polygon4);

        assertTrue(juegoPrueba.ok()); //Debe poder aÃ±adir la isla (para pruebas)

        

        int[][] polygon5 = {{50, 50}, {200,200}, {150,100}};

        String color2 = "black";

        juegoPrueba.addIsland(color1, polygon5); // No aÃ±ade la isla ya que interseca con la definida anteriormente

        assertFalse(juegoPrueba.ok());

        

    }

    

    @Test

    //Creacion de flight

    public void shouldaddFlight(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width); //Creamos el Iceepeecee

        //Definimos variables para el vuelo

        int[] from = {5, 50, 10};

        int[] to = {50, 100, 10};

        String color = "red";

        juegoPrueba.addFlight(color, from, to);

        assertTrue(juegoPrueba.ok()); //Debe verificar que se haya creado correctamente

        Flight vueloPrueba = (Flight) new NormalFlight(color, from, to);
        try{
            assertTrue(juegoPrueba.getFlight(color).getID().equals(vueloPrueba.getID())); //El vuelo creado debe estar almacenado y debe ser igual a uno creado con las mismas caracteristicas.
        } catch(IceepeeceeExcepcion e){
            
        }

    }

    

    @Test 

    public void shouldNotaddFlightLargerThanTablero(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width); //Creamos el Iceepeecee

        

        //Definimos variables para el caso 1

        int[] from = {5, 50, 20};

        int[] to = {301, 100, 10};

        String color = "red";

        juegoPrueba.addFlight(color, from, to); //No aÃ±ade el vuelo ya que se pasa de los limites del tablero.

        assertFalse(juegoPrueba.ok());

    }

    public void shouldNotaddFlightWithUsedColors(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width); //Creamos el Iceepeecee

        //Definimos variables para caso 2

        int[] from1 = {5, 50, 100};

        int[] to1 = {30, 100, 100};

        String color = "red";

        juegoPrueba.addFlight(color, from1, to1); //debe aÃ±adir el vuelo correctamente

        assertTrue(juegoPrueba.ok());
        int[] from2 = {0, 0, 20};

        int[] to2 = {34, 100, 20};

        juegoPrueba.addFlight(color, from2, to2); //No aÃ±ade el vuelo ya que el color ya se uso.

        assertFalse(juegoPrueba.ok());

    }

    public void shouldNotaddFlightWithIncorrectNumberOfCoordinates(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width); //Creamos el Iceepeecee

        //Definimos variables para caso 3

        int[] from3 = {5, 50};

        int[] to3 = {301};

        String color3 = "blue";

        juegoPrueba.addFlight(color3, from3, to3); //No aÃ±ade el vuelo ya que este debe tener tres coordenas exactamente.

        assertFalse(juegoPrueba.ok());

    }

    

    //flightLocation

    @Test

    public void shouldReturnflightLocation(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width);  //Creamos el Iceepeecee

        //Definimos variables para el vuelo 1

        int[] from = {5,50, 10};

        int[] to = {30,100, 10};

        String color = "red";

        juegoPrueba.addFlight(color, from, to);

        juegoPrueba.flightLocation(color);

        assertTrue(juegoPrueba.ok());



    }

    

    @Test

    public void shouldReturnEmptyGflightLocation(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width);  //Creamos el Iceepeecee

        String color = "red"; //Definimos el color que servirÃ¡ para buscar el vuelo inexistete

        juegoPrueba.flightLocation(color);

        assertFalse(juegoPrueba.ok()); //Nos retorna un arreglo vacio. Debidp no se cumplio correctamente el objetivo de la funcion.

        

    }

    //islandLocation

    @Test

    public void shouldReturnIslandLocation(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width);  //Creamos el Iceepeecee

        //Definimos variables para el vuelo 1

        int[][] polygon = {{0,1},{20,20},{10,10}};

        String color = "red";

        juegoPrueba.addIsland(color, polygon);

        juegoPrueba.islandLocation(color);

        assertTrue(juegoPrueba.ok());

    }

    

    public void shouldReturnEmptyIslandLocation(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width);  //Creamos el Iceepeecee

        //Definimos variables para el vuelo 1

        String color = "red";

        juegoPrueba.islandLocation(color);

        assertFalse(juegoPrueba.ok()); //Nos retorna un arreglo vacio. Pero no se cumplio correctamente el objetivo de la funcion.

    }

    //delIsland

    @Test

    public void shouldDeleteIsland(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width);  //Creamos el Iceepeecee

        

        //Definimos variables para la isla 

        int[][] polygon = {{5,50},{50,100},{100,200}};

        String color = "red";

        juegoPrueba.addIsland(color, polygon);   

        juegoPrueba.delIsland(color);

        assertTrue(juegoPrueba.ok());

    }

    

    @Test

    public void shouldnotDeleteIslandThatDoesntExist(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width);  //Creamos el Iceepeecee

        //Definimos variables

        String color = "red";

        juegoPrueba.delIsland(color);

        assertFalse(juegoPrueba.ok());

    }

    

    @Test

    //delflight

    public void shouldDelFlight(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width);  //Creamos el Iceepeecee

        //Definimos variables para el vuelo

        int[] from = {5, 50, 10};

        int[] to = {50, 100, 10};

        String color = "red";

        juegoPrueba.addFlight(color, from, to);

        juegoPrueba.delFlight(color);

        assertTrue(juegoPrueba.ok()); //Debe verificar que se haya creado correctamente

        }

        

    public void shouldnotDelFlight(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width);  //Creamos el Iceepeecee

        

        //Definimos variables para el vuelo

        int[] from = {5, 50, 10};

        int[] to = {50, 100, 10};

        String color = "red";

        juegoPrueba.delFlight(color);

        assertFalse(juegoPrueba.ok()); //Debe verificar que se haya creado correctamente

        }

    //Photograp(flight,teta) - photograph(teta)

    @Test

    public void shouldtakePhoto(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width);  //Creamos el Iceepeecee

        

        int[] from = {5, 50, 10};

        int[] to = {50, 100, 10};

        String color = "red";

        juegoPrueba.addFlight(color, from, to);

        assertTrue(juegoPrueba.ok());

        juegoPrueba.photograph(color, 50);

        assertTrue(juegoPrueba.ok());

        

        int[] from1 = {100, 100, 40};

        int[] to1 = {200, 200, 30};

        String color1 = "blue";

        juegoPrueba.addFlight(color1, from1, to1);

        assertTrue(juegoPrueba.ok());

        juegoPrueba.photograph(50);

        assertTrue(juegoPrueba.ok());

        juegoPrueba.makeInvisible();

 

    }

    @Test

    public void shouldNottakePhoto(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width);  //Creamos el Iceepeecee

        

        int[] from = {5, 50, 10};

        int[] to = {50, 100, 10};

        String color = "red";

        juegoPrueba.addFlight(color, from, to); // Debe aÃ±adir el vuelo

        assertTrue(juegoPrueba.ok());

        juegoPrueba.photograph(color, -1); // No debe tomar la fotografÃ­a.

        assertFalse(juegoPrueba.ok());

        

        int[] from1 = {100, 100, 40};

        int[] to1 = {200, 200, 30};

        String color1 = "blue";

        juegoPrueba.addFlight(color1, from1, to1);// Debe aÃ±adir el vuelo

        assertTrue(juegoPrueba.ok());

        juegoPrueba.photograph(100); // No debe tomar la fotografÃ­a.

        assertFalse(juegoPrueba.ok());

    }

    @Test

    public void shouldReturnflightCamera(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width);  //Creamos el Iceepeecee

        //Definimos variables para el vuelo 1

        int[] from = {5,50, 10};

        int[] to = {30,100, 10};

        String color = "red";

        juegoPrueba.addFlight(color, from, to);

        juegoPrueba.flightCamera(color);

        assertTrue(juegoPrueba.ok());

    }

    

    @Test

    public void shouldReturnEmptyGflightCamera(){

        int width = 300;

        int length = 300;

        ICEEPEECEEE juegoPrueba = new ICEEPEECEEE(length, width); //Creamos el Iceepeecee

        String color = "red"; //Definimos el color que servirÃ¡ para buscar el vuelo inexistete

        juegoPrueba.flightCamera(color);

        assertFalse(juegoPrueba.ok()); //Nos retorna un arreglo vacio. Debido a que no se cumplio correctamente el objetivo de la funcion

    }
    //Mendivelso_Rodriguez

    /**

     * Prueba de unidad para verificar la funcionalidad de agregar una isla en el iceepeecee.

     */

    @Test

    public void shouldAddIsland3() {
        ICEEPEECEEE Icep = new ICEEPEECEEE(1000,1000);

        int[][] vertices = {{100, 100}, {200, 100}, {150, 200}};

        Icep.addIsland("blue", vertices);

        assertEquals(true, Icep.ok()); // Verifica que Icep.ok() devuelva true

    }

    /**

     * Prueba de unidad para verificar la funcionalidad de agregar un vuelo en el iceepeecee.

     */

    @Test
    public void shouldAddFlight3(){
        ICEEPEECEEE Icep = new ICEEPEECEEE(1000,1000);
        int[]from={0,20,40}; 
        int[]to={70,80,50};
        int cameraAngle = 90;
        String color="purple";

        Icep.addFlight(color,from,to);

        assertEquals(true,Icep.ok()); // Verifica que Icep.ok() devuelva true

    }

    /**

     * Prueba de unidad para verificar que no se crea un vuelo en el sistema Icep cuando se proporcionan datos incorrectos.

     */



    @Test

    public void shouldNotAddFlight() {
        ICEEPEECEEE Icep = new ICEEPEECEEE(1000,1000);
        int[] from = {30,30};

        int[] to = {45};

        int cameraAngle = 30;

        // Intentamos agregar un vuelo con datos insuficientes o incorrectos

        // Esto debería resultar en un fallo y que Icep.ok() devuelva false
        Icep.addFlight("red",from, to);
        assertEquals(false,Icep.ok());// Verifica que Icep.ok() devuelva false

    }

    

    /**

     * Prueba de unidad para verificar que no se crea una isla en el sistema Icep cuando se proporcionan vértices insuficientes.

     */

    @Test 

    public void shouldNotAddIsland() {
        ICEEPEECEEE Icep = new ICEEPEECEEE(1000,1000);
        int[][] vertices = {{100,100},{100,200}};

        // Intentamos agregar una isla con vértices insuficientes

        // Esto debería resultar en un fallo y que Icep.ok() devuelva false

        Icep.addIsland("blue",vertices);

        assertEquals(false,Icep.ok());

    }

    

    /**

     * Prueba de unidad para verificar que no se crea una isla en el iceepeecee si se intenta agregar una isla

     * con vértices idénticos(isla sobrepuesta en otra)

     */

    @Test

    public void shouldnotAddIsland_2(){
        ICEEPEECEEE Icep = new ICEEPEECEEE(1000,1000);
        int[][] vertices = {{40,40},{120,120},{50,30}};

        Icep.addIsland("green",vertices);

        int[][] vertices2 = {{40,40},{120,120},{10,20}};

        Icep.addIsland("yellow",vertices);

        assertEquals(false,Icep.ok());

    }

    

    /**

     * Prueba de unidad para verificar que no se crea una isla en el iceepeecee si se intenta agregar una isla

     * con un mismo color que ya existe.

     */

    @Test

    public void shouldnotAddIsland_3(){
        ICEEPEECEEE Icep = new ICEEPEECEEE(1000,1000);
        int[][] vertices = {{20,20},{100,50},{80,30}};

        Icep.addIsland("blue",vertices);

        int[][] vertices3 = {{20,20},{100,50},{20,20}};

        Icep.addIsland("blue",vertices3);

        assertEquals(false,Icep.ok());

    }

    

    /**

     * Prueba de unidad para verificar que el iceepeecee puede consultar las islas existentes 

     */

    @Test

    public void shouldGetAllIslands() {

        ICEEPEECEEE Icep = new ICEEPEECEEE(1000,1000);

        int[][] isla1={{100, 100}, {200, 100}, {150, 200}};

        Icep.addIsland("blue", isla1);

        int[][] isla2 = {{300, 300}, {400, 300}, {350, 400}};

        Icep.addIsland("red", isla2);

        Icep.islands();

        assertEquals(true,Icep.ok());

    }

    

    @Test

    public void shouldPhotograph(){
        ICEEPEECEEE Icep = new ICEEPEECEEE(1000,1000);
        int[]from={0,20,40}; 

        int[]to={70,80,50};

        int cameraAngle = 90;

        String color="purple";

        Icep.addFlight(color,from,to);

        Icep.photograph(color,30);

        assertTrue(Icep.ok());

    }

    @Test

    public void shouldnotPhotograph(){
        ICEEPEECEEE Icep = new ICEEPEECEEE(1000,1000);
        int[]from={10,15,13}; 

        int[]to={56,70,95};

        int[]from2={55,50,36};

        int[]to2={80,60,70};

        Icep.addFlight("red",from,to);

        Icep.addFlight("yellow",from2,to2);

        Icep.photograph(-63.1f);

        assertFalse(Icep.ok());

    }
    // Montero-Villamizar

@Test

    public void shouldAddIsland4() {
        ICEEPEECEEE ip = new ICEEPEECEEE(1000,1000);

        int[][] vertices = {{20, 20}, {100, 50}, {80, 30}};

        ip.addIsland("green", vertices);

        assertTrue(ip.ok());

    }



    @Test

    public void shouldNotAddIsland4() {
        ICEEPEECEEE ip = new ICEEPEECEEE(1000,1000);
        ip.delIsland("red");

        assertFalse(ip.ok());

    }



    @Test

    public void shouldDelIsland() {
        ICEEPEECEEE ip = new ICEEPEECEEE(1000,1000);

        int[][] vertices = {{20, 20}, {100, 50}, {80, 30}};

        ip.addIsland("green", vertices);

        ip.makeVisible();

        ip.delIsland("green");

        assertTrue(ip.ok());

    }

 

    

    @Test

    public void shouldNotDelIsland() {
        ICEEPEECEEE ip = new ICEEPEECEEE(1000,1000);
        int[][] vertices = {{20, 20}, {100, 50}, {80, 30}};

        ip.addIsland("green", vertices);

        ip.makeVisible();

        ip.delIsland("red");

        assertFalse(ip.ok());

    }

    

    @Test

    public void shouldAddFlight() {
        ICEEPEECEEE ip = new ICEEPEECEEE(1000,1000);

        int[] from = {20, 20, 10};

        int[] to = {50, 10, 15};

        ip.addFlight("green", from, to);

        assertTrue(ip.ok());

    }



    @Test

    public void shouldNotAddFlight4() {
        ICEEPEECEEE ip = new ICEEPEECEEE(1000,1000);

        int[] from = {20, 20};

        int[] to = {10};

        ip.addFlight("magenta", from, to);

        assertFalse(ip.ok());

    }



    @Test

    public void shouldNotDelFlight() {
        ICEEPEECEEE ip = new ICEEPEECEEE(1000,1000);

        int[] from = {20, 20, 10};

        int[] to = {50, 10, 15};

        ip.addFlight("green", from, to);

        ip.delFlight("red");

        assertFalse(ip.ok());

    }



    @Test

    public void shouldDelFlight4() {
        ICEEPEECEEE ip = new ICEEPEECEEE(1000,1000);

        int[] from = {20, 20, 10};

        int[] to = {50, 10, 15};

        ip.addFlight("green", from, to);

        ip.delFlight("green");

        assertTrue(ip.ok());

    }

    

    @Test

    public void shouldMakeVisible(){
        ICEEPEECEEE ip = new ICEEPEECEEE(1000,1000);
        ip.makeVisible();
        assertTrue(ip.ok());        

    }

    

    @Test

    public void shouldMakeInvisible(){
        ICEEPEECEEE ip = new ICEEPEECEEE(1000,1000);
        ip.makeInvisible();
        assertTrue(ip.ok());        

    }

    

    @Test

    public void shouldAddIslandAndFlight() {
        ICEEPEECEEE ip = new ICEEPEECEEE(1000,1000);

        int[][] vertices = {{20, 20}, {100, 50}, {80, 30}};

        int[] from = {20, 20, 10};

        int[] to = {50, 10, 15};

        ip.addIsland("green", vertices);

        ip.addFlight("green", from, to);

        assertTrue(ip.ok());

    }



    @Test

    public void shouldNotAddIslandAndFlight() {
        ICEEPEECEEE ip = new ICEEPEECEEE(1000,1000);

        int[][] vertices = {{20, 20}, {100, 50}};

        int[] from = {20, 20};

        int[] to = {10};

        ip.addIsland("green", vertices);

        ip.addFlight("magenta", from, to);

        assertFalse(ip.ok());

    }



    @Test

    public void shouldGetIslandLocation() {
        ICEEPEECEEE ip = new ICEEPEECEEE(1000,1000);

        int[][] vertices = {{20, 20}, {100, 50}, {80, 30}};

        ip.addIsland("green", vertices);

        ip.makeVisible();

        ip.islandLocation("green");

        assertTrue(ip.ok());

    }







    @Test

    public void shouldGetPhotographedZone() {
        ICEEPEECEEE ip = new ICEEPEECEEE(1000,1000);

        int[] from = {20, 20, 20};

        int[] to = {50, 10, 10};

        ip.addFlight("magenta", from, to);

        float teta = 1.5708f; // 90 degrees

        ip.photograph("magenta", teta);

        // Verify the photographed zone
        try{
            Flight f = ip.getFlight("magenta");
            Photograph photo = f.getCamera();
    
            assertNotNull(photo);
    
            assertArrayEquals(from, f.getFrom());
            assertArrayEquals(to, f.getto());
        }catch(IceepeeceeExcepcion e){
        }
    }



    @Test

    public void shouldUselessFlights() {
        ICEEPEECEEE ip = new ICEEPEECEEE(1000,1000);

        int[][] vertices = {{20, 20}, {100, 50}, {80, 30}};

        int[] from = {20, 20, 10};

        int[] to = {50, 10, 15};

        ip.addIsland("green", vertices);

        ip.addFlight("green", from, to);



        int[][] vertices2 = {{30, 30}, {110, 50}, {90, 30}};

        int[] from2 = {30, 30, 10};

        int[] to2 = {60, 20, 15};

        ip.addIsland("blue", vertices2);

        ip.addFlight("blue", from2, to2);



        ip.uselessFlights();



        assertTrue(ip.ok());

    }
    //Robinson - Yaya

@Test

    public void shouldAddIsland5(){
        ICEEPEECEEE icp = new ICEEPEECEEE(1000,1000);

        int[][] vertix = {{10,10},{50,30},{20,20}};

        String color  = "250,0,0,250";

        icp.addIsland(color,vertix);

        assertTrue(icp.ok());

    }

    

    @Test

    public void shouldnotAddIsland5(){///////////////////////////////////
        ICEEPEECEEE icp = new ICEEPEECEEE(1000,1000);

        int[][] vertix = {{20,20},{100,50}};

        icp.addIsland("green",vertix);

        assertFalse(icp.ok());

    }

    

    @Test

    public void shouldnotAddIsland2(){/////////////////////////////////////
        ICEEPEECEEE icp = new ICEEPEECEEE(1000,1000);

        int[][] vertixor = {{20,20},{100,50},{80,30}};

        icp.addIsland("green",vertixor);

        int[][] vertix = {{20,20},{100,50},{20,20}};

        icp.addIsland("yellow",vertix);

        assertFalse(icp.ok());

    }


    @Test 

    public void shouldgetLocationIsland(){
        ICEEPEECEEE icp = new ICEEPEECEEE(1000,1000);

        int[][] vertix = {{20,20},{100,50},{80,30}};

        icp.addIsland("green",vertix);

        int[][] expectedResult = {{20,20},{100,50},{80,30}};

        int[][] result = icp.islandLocation("green");

        

        //for (int i = 0 ; i < vertix.length ; i ++){

            //if (expectedResult[i][0] != result[i][0] && expectedResult[i][1] != result[i][1] ){

                //throw new IllegalArgumentException("No es valido");

            //}

        //}

    }

    

    @Test

    public void shouldgetLocationflight(){
        ICEEPEECEEE icp = new ICEEPEECEEE(1000,1000);

        int[] from = {20,20};

        int[] to = {50,10};

        icp.addFlight("magenta",from,to);

        int[][] expectedResult ={{20,20},{50,10}};

        int[][] result = icp.flightLocation("magenta");

        

        //for (int i = 0 ; i < expectedResult.length ; i ++){

            //if (expectedResult[i][0] != result[i][0] && expectedResult[i][1] != result[i][1] ){

                //throw new IllegalArgumentException("No es valido");

            //}

        //}

    }

    

    @Test 

    public void shouldnotgetLocationIsland(){
        ICEEPEECEEE icp = new ICEEPEECEEE(1000,1000);

        int[][] vertix = {{20,20},{100,50},{80,30}};

        icp.addIsland("green",vertix);

        icp.islandLocation("magenta");

        //int[][] expectedResult = {{20,20},{100,50},{80,30}}; 

        //int[][] result = icp.IslandLocation("magenta");

        //for (int i = 0 ; i < vertix.length ; i ++){

            //if (expectedResult[i][0] != result[i][0] && expectedResult[i][1] != result[i][1] ){

              //  throw new IllegalArgumentException("No es valido");

            //}

        // }

    }

    

    @Test 

    public void shouldnotgetLocationFlight(){
        ICEEPEECEEE icp = new ICEEPEECEEE(1000,1000);

        int[] from = {20,20};

        int[] to = {50,10};

        icp.addFlight("magenta",from,to);

        //int[][] expectedResult ={{20,20},{50,10}};

        icp.flightLocation("green");

        //int[][] result = icp.flightLocation("magenta");

        // for (int i = 0 ; i < expectedResult.length ; i ++){

           // if (expectedResult[i][0] != result[i][0] && expectedResult[i][1] != result[i][1] ){

            //    throw new IllegalArgumentException("No es valido");

            //}

        //}

        assertFalse(icp.ok());

    }

    

    @Test

    public void shouldDelIsland5(){
        ICEEPEECEEE icp = new ICEEPEECEEE(1000,1000);

        int[][] vertix = {{20,20},{100,50},{80,30}};

        icp.addIsland("green",vertix);

        icp.delIsland("green");

    }

    

    @Test

    public void shouldnotdelIsland(){///////////////////////////////////////////////
        ICEEPEECEEE icp = new ICEEPEECEEE(1000,1000);

        int[][] vertix = {{20,20},{100,50},{80,30}};

        icp.addIsland("green",vertix);

        icp.delIsland("white");

        assertFalse(icp.ok());

    }

    

    @Test

    public void testFlightCamera() {

        ICEEPEECEEE simulator = new ICEEPEECEEE(100, 100);

        String color1 = "255,0,0";

        int[] from1 = {10, 10};

        int[] to1 = {20, 20};

        



        String color2 = "0,0,255";

        int[] from2 = {30, 30};

        int[] to2 = {40, 40};

        



        simulator.addFlight(color1, from1, to1);

        simulator.addFlight(color2, from2, to2);



        int cameraAngleForColor1 = simulator.flightCamera(color1);

        int cameraAngleForColor2 = simulator.flightCamera(color2);

    }

    

   @Test

    public void shouldPhotograph5(){
        ICEEPEECEEE icp = new ICEEPEECEEE(1000,1000);

        int[]from={0,20,40}; 

        int[]to={70,80,50};

        String color="blue";

        icp.addFlight(color,from,to);

        icp.photograph(color,30);

        assertTrue(icp.ok());

    }

    

    @Test

        public void ShouldNotDelFlight(){
        ICEEPEECEEE icp = new ICEEPEECEEE(1000,1000);
    

        // Agregar un vuelo con un color

        icp.addFlight("blue", new int[]{50, 50, 0}, new int[]{100, 100, 0});

        // Intentar agregar otro vuelo con el mismo color

        icp.delFlight("red");

    

        // Debe asegurarse de que el segundo vuelo no se agregó y devuelve false

        assertFalse(icp.ok());

    }

    



    @Test

    public void ShouldVisible() {
        ICEEPEECEEE icp = new ICEEPEECEEE(1000,1000);

        // Verificar que el simulador inicialmente no es visible

        icp.makeVisible();

        assertTrue(icp.ok());

    } 


    @Test

    public void ShouldInVisible() {
        ICEEPEECEEE icp = new ICEEPEECEEE(1000,1000);

        icp.makeInvisible();

        assertTrue(icp.ok());

    }
    
    //Torres.Fernandez
    
    @Test
    public void shouldFTAddIsland(){
        int width = 500;
        int height = 500;
        ICEEPEECEEE i = new ICEEPEECEEE(width, height);
        int[][] island1 = {{45,60},{50,45},{80,67}};
        int[][] island2 = {{100,70},{34,89},{45,89},{90,34}};
        int[][] island3 = {{45,60},{55,60},{60,65},{80,45}};
        int[] FligthFrom1 = {0, 30,20};
        int[] FligthTo1 = {78,70,5};
        int[] FligthFrom2 = {55, 0,20};
        int[] FligthTo2 = {70,60,10};
        String color1 = "green";
        String color2 = "red";
        String color3 = "blue";
        String color4 = "magenta";
        i.addIsland(color1, island1);
        i.addIsland(color2, island2);
        i.addIsland(color3, island3);
        i.addFlight(color1, FligthFrom1, FligthTo1);
        i.addFlight(color2, FligthFrom2, FligthTo2);
        int[][] island4 = {{20,30},{10,50},{30,50}};
        i.addIsland("magenta",island4);
        assertTrue(i.ok());
    }
    
    @Test
    public void ShouldFTNotAddOsland(){
        int width = 500;
        int height = 500;
        ICEEPEECEEE i = new ICEEPEECEEE(width, height);
        int[][] island1 = {{45,60},{50,45},{80,67}};
        int[][] island2 = {{100,70},{34,89},{45,89},{90,34}};
        int[][] island3 = {{45,60},{55,60},{60,65},{80,45}};
        int[] FligthFrom1 = {0, 30,20};
        int[] FligthTo1 = {78,70,5};
        int[] FligthFrom2 = {55, 0,20};
        int[] FligthTo2 = {70,60,10};
        String color1 = "green";
        String color2 = "red";
        String color3 = "blue";
        String color4 = "magenta";
        i.addIsland(color1, island1);
        i.addIsland(color2, island2);
        i.addIsland(color3, island3);
        i.addFlight(color1, FligthFrom1, FligthTo1);
        i.addFlight(color2, FligthFrom2, FligthTo2);
        int[][] island4 = {{50,30},{10,60},{40,70}};
        i.addIsland("magenta",island4);
        assertFalse(i.ok());
    }
     
    @Test
    public void shouldFTAddFligth(){
        int width = 500;
        int height = 500;
        ICEEPEECEEE i = new ICEEPEECEEE(width, height);
        int[][] island1 = {{45,60},{50,45},{80,67}};
        int[][] island2 = {{100,70},{34,89},{45,89},{90,34}};
        int[][] island3 = {{45,60},{55,60},{60,65},{80,45}};
        int[] FligthFrom1 = {0, 30,20};
        int[] FligthTo1 = {78,70,5};
        int[] FligthFrom2 = {55, 0,20};
        int[] FligthTo2 = {70,60,10};
        String color1 = "green";
        String color2 = "red";
        String color3 = "blue";
        String color4 = "magenta";
        i.addIsland(color1, island1);
        i.addIsland(color2, island2);
        i.addIsland(color3, island3);
        i.addFlight(color2, FligthFrom2, FligthTo2);
        int[] FligthFrom3 = {0, 30,20};
        int[] FligthTo3 = {78,70,5};
        i.addFlight("black", FligthFrom3, FligthTo3);
        assertTrue(i.ok());
    }
    
     @Test
    public void shouldFTNotAddFligth(){
        int width = 500;
        int height = 500;
        ICEEPEECEEE i = new ICEEPEECEEE(width, height);
        int[][] island1 = {{45,60},{50,45},{80,67}};
        int[][] island2 = {{100,70},{34,89},{45,89},{90,34}};
        int[][] island3 = {{45,60},{55,60},{60,65},{80,45}};
        int[] FligthFrom1 = {0, 30,20};
        int[] FligthTo1 = {78,70,5};
        int[] FligthFrom2 = {55, 0,20};
        int[] FligthTo2 = {70,60,10};
        String color1 = "green";
        String color2 = "red";
        String color3 = "blue";
        String color4 = "magenta";
        i.addIsland(color1, island1);
        i.addIsland(color2, island2);
        i.addIsland(color3, island3);
        i.addFlight(color1, FligthFrom1, FligthTo1);
        i.addFlight(color2, FligthFrom2, FligthTo2);
        int[] FligthFrom3 = {-10, 30,20};
        int[] FligthTo3 = {78,70,-5};
        i.addFlight("black", FligthFrom3, FligthTo3);
        assertFalse(i.ok());
    }
 @Test
    public void shouldFTNotDelIsland(){
        int width = 500;
        int height = 500;
        ICEEPEECEEE i = new ICEEPEECEEE(width, height);
        int[][] island1 = {{45,60},{50,45},{80,67}};
        int[][] island2 = {{100,70},{34,89},{45,89},{90,34}};
        int[][] island3 = {{45,60},{55,60},{60,65},{80,45}};
        int[] FligthFrom1 = {0, 30,20};
        int[] FligthTo1 = {78,70,5};
        int[] FligthFrom2 = {55, 0,20};
        int[] FligthTo2 = {70,60,10};
        String color1 = "green";
        String color2 = "red";
        String color3 = "blue";
        String color4 = "magenta";
        i.addIsland(color1, island1);
        i.addIsland(color2, island2);
        i.addIsland(color3, island3);
        i.addFlight(color1, FligthFrom1, FligthTo1);
        i.addFlight(color2, FligthFrom2, FligthTo2);
        i.delIsland("gray");
        assertFalse(i.ok());
    }
    
    @Test
    public void islandFTLocation(){    
        int width = 500;
        int height = 500;
        ICEEPEECEEE i = new ICEEPEECEEE(width, height);
        int[][] island1 = {{45,60},{50,45},{80,67}};
        int[][] island2 = {{100,70},{34,89},{45,89},{90,34}};
        int[][] island3 = {{45,60},{55,60},{60,65},{80,45}};
        int[] FligthFrom1 = {0, 30,20};
        int[] FligthTo1 = {78,70,5};
        int[] FligthFrom2 = {55, 0,20};
        int[] FligthTo2 = {70,60,10};
        String color1 = "green";
        String color2 = "red";
        String color3 = "blue";
        String color4 = "magenta";
        i.addIsland(color1, island1);
        i.addIsland(color2, island2);
        i.addIsland(color3, island3);
        i.addFlight(color1, FligthFrom1, FligthTo1);
        i.addFlight(color2, FligthFrom2, FligthTo2);
        int [][] test = {{45,60},{50,45},{80,67}};
        Assert.assertArrayEquals(test, i.islandLocation("green"));
        assertTrue(i.ok());
    }
 @Test
    public void shouldFTDelFligth(){
        int width = 500;
        int height = 500;
        ICEEPEECEEE i = new ICEEPEECEEE(width, height);
        int[][] island1 = {{45,60},{50,45},{80,67}};
        int[][] island2 = {{100,70},{34,89},{45,89},{90,34}};
        int[][] island3 = {{45,60},{55,60},{60,65},{80,45}};
        int[] FligthFrom1 = {0, 30,20};
        int[] FligthTo1 = {78,70,5};
        int[] FligthFrom2 = {55, 0,20};
        int[] FligthTo2 = {70,60,10};
        String color1 = "green";
        String color2 = "red";
        String color3 = "blue";
        String color4 = "magenta";
        i.addIsland(color1, island1);
        i.addIsland(color2, island2);
        i.addIsland(color3, island3);
        i.addFlight(color1, FligthFrom1, FligthTo1);
        i.addFlight(color2, FligthFrom2, FligthTo2);
        i.delFlight("green");
        assertTrue(i.ok());
    }
    
    @Test
    public void shouldFTNotDelFligth(){ 
        int width = 500;
        int height = 500;
        ICEEPEECEEE i = new ICEEPEECEEE(width, height);
        int[][] island1 = {{45,60},{50,45},{80,67}};
        int[][] island2 = {{100,70},{34,89},{45,89},{90,34}};
        int[][] island3 = {{45,60},{55,60},{60,65},{80,45}};
        int[] FligthFrom1 = {0, 30,20};
        int[] FligthTo1 = {78,70,5};
        int[] FligthFrom2 = {55, 0,20};
        int[] FligthTo2 = {70,60,10};
        String color1 = "green";
        String color2 = "red";
        String color3 = "blue";
        String color4 = "magenta";
        i.addIsland(color1, island1);
        i.addIsland(color2, island2);
        i.addIsland(color3, island3);
        i.addFlight(color1, FligthFrom1, FligthTo1);
        i.addFlight(color2, FligthFrom2, FligthTo2);
        i.delFlight("purple");
        assertFalse(i.ok());
    }
    

@Test
    public void shouldFTPhotographColor(){
        ICEEPEECEEE prueba = new ICEEPEECEEE(300, 300);
        int[] from = {55,70,110};
        int[] to = {130,130,70};
        prueba.addFlight("green", from, to);
        prueba.photograph("green", 48);
        Assert.assertTrue(prueba.ok());
    }
    
    @Test
    public void shouldFTNotPhotographColor(){
        int width = 500;
        int height = 500;
        ICEEPEECEEE i = new ICEEPEECEEE(width, height);
        int[][] island1 = {{45,60},{50,45},{80,67}};
        int[][] island2 = {{100,70},{34,89},{45,89},{90,34}};
        int[][] island3 = {{45,60},{55,60},{60,65},{80,45}};
        int[] FligthFrom1 = {0, 30,20};
        int[] FligthTo1 = {78,70,5};
        int[] FligthFrom2 = {55, 0,20};
        int[] FligthTo2 = {70,60,10};
        String color1 = "green";
        String color2 = "red";
        String color3 = "blue";
        String color4 = "magenta";
        i.addIsland(color1, island1);
        i.addIsland(color2, island2);
        i.addIsland(color3, island3);
        i.addFlight(color1, FligthFrom1, FligthTo1);
        i.addFlight(color2, FligthFrom2, FligthTo2);
         int[] from = {55,70,110};
        int[] to = {130,130,70};
        i.addFlight("red", from, to);
        i.photograph("green", 48); 
        i.photograph("magenta", -100); 
        Assert.assertFalse(i.ok());
    }
    
    @Test
    public void shouldFTPhotographtatinI(){
        int width = 500;
        int height = 500;
        ICEEPEECEEE i = new ICEEPEECEEE(width, height);
        int[][] island1 = {{45,60},{50,45},{80,67}};
        int[][] island2 = {{100,70},{34,89},{45,89},{90,34}};
        int[][] island3 = {{45,60},{55,60},{60,65},{80,45}};
        int[] FligthFrom1 = {0, 30,20};
        int[] FligthTo1 = {78,70,5};
        int[] FligthFrom2 = {55, 0,20};
        int[] FligthTo2 = {70,60,10};
        String color1 = "green";
        String color2 = "red";
        String color3 = "blue";
        String color4 = "magenta";
        i.addIsland(color1, island1);
        i.addIsland(color2, island2);
        i.addIsland(color3, island3);
        i.addFlight(color1, FligthFrom1, FligthTo1);
        i.addFlight(color2, FligthFrom2, FligthTo2);
         int[] from = {55,70,110};
        int[] to = {130,130,70};
        i.addFlight("red", from, to);
        i.photograph("red", 48);
        Assert.assertTrue(i.ok());
    }
    
    @Test
    public void shouldFTNotPhotographII(){
        int width = 500;
        int height = 500;
        ICEEPEECEEE i = new ICEEPEECEEE(width, height);
        int[][] island1 = {{45,60},{50,45},{80,67}};
        int[][] island2 = {{100,70},{34,89},{45,89},{90,34}};
        int[][] island3 = {{45,60},{55,60},{60,65},{80,45}};
        int[] FligthFrom1 = {0, 30,20};
        int[] FligthTo1 = {78,70,5};
        int[] FligthFrom2 = {55, 0,20};
        int[] FligthTo2 = {70,60,10};
        String color1 = "green";
        String color2 = "red";
        String color3 = "blue";
        String color4 = "magenta";
        i.addIsland(color1, island1);
        i.addIsland(color2, island2);
        i.addIsland(color3, island3);
        i.addFlight(color1, FligthFrom1, FligthTo1);
        i.addFlight(color2, FligthFrom2, FligthTo2);
        int[] from = {55,70,110};
        int[] to = {130,130,70};
        i.addFlight("blue", from, to);
        i.photograph("green", 48); 
        i.photograph("green", -105.48f); 
        Assert.assertFalse(i.ok());
    }
 
    @Test
    public void shouldFTPhotographIII(){
        int width = 500;
        int height = 500;
        ICEEPEECEEE i = new ICEEPEECEEE(width, height);
        int[][] island1 = {{45,60},{50,45},{80,67}};
        int[][] island2 = {{100,70},{34,89},{45,89},{90,34}};
        int[][] island3 = {{45,60},{55,60},{60,65},{80,45}};
        int[] FligthFrom1 = {0, 30,20};
        int[] FligthTo1 = {78,70,5};
        int[] FligthFrom2 = {55, 0,20};
        int[] FligthTo2 = {70,60,10};
        String color1 = "green";
        String color2 = "red";
        String color3 = "blue";
        String color4 = "magenta";
        i.addIsland(color1, island1);
        i.addIsland(color2, island2);
        i.addIsland(color3, island3);
        i.addFlight(color1, FligthFrom1, FligthTo1);
        i.addFlight(color2, FligthFrom2, FligthTo2);
        int[] from = {55,70,110};
        int[] to = {130,130,70};
        i.addFlight("orange", from, to);
        i.photograph("orange", 48);
        Assert.assertTrue(i.ok());
    }
    
    @Test
    public void shouldFTNotPhotograph(){
        int width = 500;
        int height = 500;
        ICEEPEECEEE i = new ICEEPEECEEE(width, height);
        int[][] island1 = {{45,60},{50,45},{80,67}};
        int[][] island2 = {{100,70},{34,89},{45,89},{90,34}};
        int[][] island3 = {{45,60},{55,60},{60,65},{80,45}};
        int[] FligthFrom1 = {0, 30,20};
        int[] FligthTo1 = {78,70,5};
        int[] FligthFrom2 = {55, 0,20};
        int[] FligthTo2 = {70,60,10};
        String color1 = "green";
        String color2 = "red";
        String color3 = "blue";
        String color4 = "magenta";
        i.addIsland(color1, island1);
        i.addIsland(color2, island2);
        i.addIsland(color3, island3);
        i.addFlight(color1, FligthFrom1, FligthTo1);
        i.addFlight(color2, FligthFrom2, FligthTo2);
        int[] from = {55,70,110};
        int[] to = {130,130,70};
        i.photograph("purple",48); 
        Assert.assertFalse(i.ok());
    }
    //Rodríguez Ortegón

// Tests related to adding islands


    @Test

    public void testLRShouldNotAddIsland_InvalidCoordinates() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500, 500);

        int[][] islandCoordinates1 = { { 100, 100, 200, 200 }, { 100, 200, 200, 100 } };

        int[][] islandCoordinates2 = { { 150, 150, 250, 250 }, { 150, 250, 250, 150 } };

        iceepeecee.addIsland("blue", islandCoordinates1);

        iceepeecee.addIsland("red", islandCoordinates2);

        assertFalse(iceepeecee.ok());

    }

    

    // Tests related to adding flights

    @Test

    public void testLRShouldNotAddFlight_ColorExists() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500, 500);

        iceepeecee.addFlight("blue", new int[]{50, 50}, new int[]{150, 150});

        assertFalse(iceepeecee.ok());

    }



    // Tests related to taking photographs

    

    @Test

    public void testLRShouldNotPhotograph() {

        ICEEPEECEEE map = new ICEEPEECEEE(500, 500);

        int[] from = { 100, 100, 0 };

        int[] to = { 200, 200, 0 };

        String color = "blue";

        map.addFlight(color, from, to);

        int teta = 45;

        map.photograph(color, teta);

        assertFalse(map.ok());

    }

    

    // Tests related to taking photographs with angles

    @Test

    public void testLRShouldNotPhotographWithAngle() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500, 500);

        iceepeecee.addFlight("red", new int[]{-50, 50}, new int[]{-150, 150});

        int invalidAngle = -500000;

        iceepeecee.photograph(invalidAngle);

        assertFalse(iceepeecee.ok());

    }

    

    // Tests related to deleting flights

    @Test

    public void testLRShouldNotDelFlight() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500, 500);

        int[] from = { 50, 50 };

        int[] to = { 250, 250 };

        iceepeecee.addFlight("red", from, to);

        iceepeecee.delFlight("red");

        int[][] flightLocation = iceepeecee.flightLocation("red");

        assertNull(flightLocation); 

        assertFalse(iceepeecee.ok()); 

    }

    


    

    @Test

    public void testLRShouldNotIslandLocation() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500, 500);

        assertNull(iceepeecee.islandLocation("blue"));

        assertFalse(iceepeecee.ok());

    }

   

    // Tests related to flight location




    @Test

    public void testLRShouldNotFlightLocation() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500, 500);

        int[] from = { 50, 50 };

        int[] to = { 250, 250 };

        iceepeecee.addFlight("red", from, to);

        int[][] location = iceepeecee.flightLocation("blue");

        assertNull(location);

        assertFalse(iceepeecee.ok());

    }

    // Tests related to flight camera    

    @Test

    public void testLRShouldNotFlightCamera_NonExistentFlight() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500, 500);

        int cameraAngle = iceepeecee.flightCamera("nonexistent_color");

        assertFalse(iceepeecee.ok());

        assertEquals(0, cameraAngle);

    }
}
