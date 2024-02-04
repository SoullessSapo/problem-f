package iceepeecee;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Write a description of class BadTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadTest
{
    //Bernal-Hernandez
    @Test

    public void shouldNotDeleteNonExistentFlight() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);
        int[] from = {100, 200};

        int[] to = {300, 400};

        iceepeecee.addFlight("yellow",from,to);

        iceepeecee.delFlight("red"); // Intenta eliminar un vuelo que no existe

        String[] vuelos = iceepeecee.flights();

        assertEquals(1, vuelos.length); // El vuelo original no debe haberse eliminado

        assertEquals("yellow", vuelos[0]);

    }
    @Test    

    public void testAddFlightOutsideBounds() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(100, 100);

        int[] from = {105, 106};

        int[] to = {200, 260};

        iceepeecee.addFlight("blue", from , to);

        assertFalse(iceepeecee.ok());

    }
    @Test
    public void shouldAddFlight() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);
        String[] vuelos = {"Red","Blue"};

        int[] from = {45,55};

        int[] to = {67,90};

        int[] from2 = {75,20};

        int[] to2 = {120,75};

        iceepeecee.addFlight("Red",from,to);

        iceepeecee.addFlight("Blue",from2,to2);

        assertArrayEquals(vuelos, iceepeecee.flights());

    }
    @Test
    //POSIBLE ERROR, NO HAY ISLAS CREADAS POR TANTO, EL OBSERVEDISLANDS ESTÁ MAL.
    public void shouldPhotographAllFlights() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[] from1 = {50, 50, 100};

        int[] to1 = {100, 100, 100};

        int[] from2 = {200, 200, 100};

        int[] to2 = {250, 250, 100};

        String color1 = "Blue";

        String color2 = "Red";

        iceepeecee.addFlight(color1, from1, to1);

        iceepeecee.addFlight(color2, from2, to2);

        // Fotografiar todos los vuelos

        iceepeecee.photograph(45);

        String[] observedIslands = iceepeecee.observedIslands();

        assertTrue(observedIslands.length > 0);

    }
    // DÍAZ - MONROY
    @Test

    public void accordingDMShouldDeleteIslands() {
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        String   color1 = "AA";
        int[][] polygon2 = new int[][]{{1000,980,950},{20,60,40}};
        icpc.addIsland(color1, polygon2);

        icpc.delIsland(color1);

        assertEquals(true,icpc.ok());

    }
    @Test

    public void accordingDMShouldConsultIslandLocation(){
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        String color1 = "AA";
        String color2 = "BB";
        int[][] polygon2 = new int[][]{{1000,980,950},{20,60,40}};
        int[][] polygon3 = new int[][]{{400,450,500,450},{400,390,400,450}};
        icpc.addIsland(color1, polygon2);

        icpc.addIsland(color2, polygon3);

        assertTrue(icpc.islandLocation(color1).equals(polygon2));

        assertTrue(icpc.islandLocation(color2).equals(polygon3));        

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

    public void accordingDMShouldConsultFlightCamera(){
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        String color1 = "AA";
        String color2 = "BB";
        int[] from1 = new int[]{300,500,100};
        int[]to1 = new int[]{720,200,60};
        int[] from3 = new int[]{20,50,20};
        int[] to3 = new int[]{300,400,60};
        icpc.addFlight(color1, from1, to1);

        icpc.addFlight(color2, from3, to3);

        icpc.photograph(color1, 120);

        icpc.photograph(color2, 50);

        assertTrue(icpc.flightCamera(color1) == 120);

        assertTrue(icpc.flightCamera(color2) == 50);

    }
    @Test

    public void accordingDMShouldNotMakeVisible3() {
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        String color1 = "AA";
        String color2 = "BB";
        String color3 = "CC";

        String color4 = "DD";
        int[][] polygon2 = new int[][]{{1000,980,950},{20,60,40}};

        int[][] polygon3 = new int[][]{{400,450,500,450},{400,390,400,450}};
        int[] from1 = new int[]{300,500,100};
        int[]to1 = new int[]{720,200,60};
        int[] from2 = new int[]{-300,500,30};
        int[] to2 = new int[]{720,2500,60};
        //El vuelo se sale del canvas

        icpc.addIsland(color1, polygon2);

        icpc.addIsland(color2, polygon3);

        icpc.addFlight(color3, from1, to1);

        icpc.addFlight(color4, from2, to2);

        assertEquals(false,icpc.ok());

    }
    @Test
    public void accordingDMShouldPhotographInt() {
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        String color4 = "DD";
        String color5 = "EE";
        int[][] polygon3 = new int[][]{{400,450,500,450},{400,390,400,450}};
        int[] from1 = new int[]{300,500,100};
        int[] to1 = new int[]{720,200,60};
        icpc.addIsland(color4, polygon3);
        int tetaI1 = 120;

        icpc.addFlight(color5, from1, to1);

        icpc.photograph(color5, tetaI1);

        icpc.makeVisible();

        assertEquals(true,icpc.ok());

    }
    @Test

    public void accordingDMShouldAddIslands() {
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        String color1 = "AA";
        String color2 = "BB";
        int[][] polygon2 = new int[][]{{1000,980,950},{20,60,40}}; //Está mal ya qg
        int[][] polygon3 = new int[][]{{400,450,500,450},{400,390,400,450}};
        icpc.addIsland(color1, polygon2);
        icpc.addIsland(color2, polygon3);
        icpc.makeVisible();
        assertEquals(true,icpc.ok());

    }
    @Test

    public void accordingDMShouldMakeVisible() {
        ICEEPEECEEE icpc =  new ICEEPEECEEE(2000, 2000);
        String color1 = "AA";
        String color2 = "BB";
        String color3 = "CC";

        String color4 = "DD";

        String color5 = "EE";

        String color6 = "FF";

        String color7 = "GG";

        String color8 = "HH";
        int[][] polygon1 = new int[][]{{10,-60,1500},{-10,-50,70}}; //REVISAR, NO SE PUEDE TENER 3 VERTICES.
        int[][] polygon2 = new int[][]{{1000,980,950},{20,60,40}}; //REVISAR LAS ISLAS NO PUEDEN FLOTAR 

        int[][] polygon3 = new int[][]{{400,450,500,450},{400,390,400,450}};

        int[][] polygon4 = new int[][]{{1100,1200,1150},{30,50,60}};

        int[][] polygon5 = new int[][]{{250,400,500},{75,100,60}};
        int[] from1 = new int[]{300,500,100};
        int[]to1 = new int[]{720,200,60};
        int[] from2 = new int[]{-300,500,30};

        int[] to2 = new int[]{720,2500,60};
        int[] from3 = new int[]{20,50,20};

        int[] to3 = new int[]{300,400,60};

        int[] from4 = new int[]{200,150,250};

        int[] to4 = new int[]{700,50,100};

        int[] from5 = new int[]{800,100,200};

        int[] to5 = new int[]{950,500,90};
        int  tetaI1 = 120;
        icpc.addIsland(color1, polygon1);

        icpc.addIsland(color2, polygon2);

        icpc.addIsland(color3, polygon3);

        icpc.addIsland(color4, polygon4);

        icpc.addIsland(color5, polygon5);

        icpc.addFlight(color4, from1, to1);

        icpc.addFlight(color5, from2, to2);

        icpc.addFlight(color6, from3, to3);

        icpc.addFlight(color7, from4, to4);

        icpc.addFlight(color8, from5, to5);

        icpc.photograph(tetaI1);

        icpc.makeVisible();

        assertEquals(true,icpc.ok()); //El angulo no puede ser mayor a 90.

    }
    //Silva-Suarez
    @Test

    public void testAddFlight() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(100, 100);

        int[] from = {10, 10};

        int[] to = {20, 20};

        iceepeecee.addFlight("red", from, to);

        assertTrue(iceepeecee.ok());

    }
    @Test
    public void testDelFlight() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(100, 100);

        int[] from = {10, 10};

        int[] to = {20, 20};

        iceepeecee.addFlight("red", from, to);

        iceepeecee.delFlight("red");

        assertTrue(iceepeecee.ok());

    }
    //Robinson - Yaya
     @Test

        public void ShouldDelFlight(){
        ICEEPEECEEE icp = new ICEEPEECEEE(1000,1000);

        // Agregar un vuelo con un color

        icp.addFlight("blue", new int[]{50, 50, 0}, new int[]{100, 100, 0});

        // Intentar agregar otro vuelo con el mismo color

        icp.delFlight("blue");

    

        // Debe asegurarse de que el segundo vuelo no se agregó y devuelve false

        assertTrue(icp.ok());

    }
    @Test

    public void shouldAddFlight5(){
        ICEEPEECEEE icp = new ICEEPEECEEE(1000,1000);

        int[] from = {10, 10};

        int[] to = {20, 20};

        icp.addFlight("blue", from, to);

        assertTrue(icp.ok());

        //assertTrue("El método addFlight no agrega un vuelo correctamente.", flightColors.length > 0);

    }
    
    
    //Torres.Fernandez
    @Test
    public void shouldFTMakeInvisible(){
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
        assertTrue(i.ok());
        i.makeInvisible();
        assertFalse(i.ok());
    }
    @Test
    public void shouldFTMakeVisible(){
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
        assertTrue(i.ok());
        i.makeVisible();
        assertFalse(i.ok());
    }
    
    //Rodríguez Ortegón
    @Test

    public void testLRShouldPhotograph() {
        ICEEPEECEEE map = new ICEEPEECEEE(500, 500);

        int[] from = { 100, 100, 0 };

        int[] to = { 200, 200, 0 };

        String color = "blue";

        map.addFlight(color, from, to);

        int teta = 45;

        map.photograph(color, teta);

        assertTrue(map.ok());

    }
    @Test

    public void testLRShouldFlightLocation_Exists() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500, 500);

        int[] from = { 50, 50 };

        int[] to = { 250, 250 };

        iceepeecee.addFlight("red", from, to);

        int[][] location = iceepeecee.flightLocation("red");

        assertTrue(iceepeecee.ok());

        assertTrue(location != null);

    }
    // Tests related to island and flight locations

    @Test

    public void testLRShouldIslandLocation_Exists() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500, 500);

        int[][] islandCoordinates = { { 100, 100, 200, 200 }, { 100, 200, 200, 100 } };

        iceepeecee.addIsland("blue", islandCoordinates);

        int[][] location = iceepeecee.islandLocation("blue");

        assertNotNull(location);

        assertTrue(iceepeecee.ok());

    }
    @Test

    public void testLRShouldAddIsland() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500, 500);
        int[][] islandCoordinates = { { 100, 100, 200, 200 }, { 100, 200, 200, 100 } };

        iceepeecee.addIsland("blue", islandCoordinates);

        int[][] islandLocation = iceepeecee.islandLocation("blue");

        assertTrue(iceepeecee.ok());

    }
    
    //Lesmes
    //AddIsland

    @Test

    public void accordingLPShouldAddIsland() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon = {{50, 50, 0}, {100, 50, 0}, {100, 100, 0}, {50, 100, 0}}; 

        iceepeecee.addIsland("#EA3333", polygon);

        assertTrue(iceepeecee.ok()); 

    }
    @Test

    public void accordingLPShouldDelFlight() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {100, 100, 0};

        int[] to = {200, 200, 0};

        iceepeecee.addFlight("#EA4F33", from, to);

        iceepeecee.delFlight("#EA4F33");

        assertTrue(iceepeecee.ok());

    }
    @Test

    public void accordingLPShouldPhotograph3() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {100, 100, 0};

        int[] to = {200, 200, 0};  

        iceepeecee.addFlight("#EA4F33", from, to);

        int[] from1 = {200, 200, 0};

        int[] to1 = {300, 300, 0};  

        iceepeecee.addFlight("#5AEA33", from1, to1);

        iceepeecee.photograph(30);

        assertTrue(iceepeecee.ok());

    }
    @Test

    public void accordingLPShouldPhotograph() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {100, 100, 0};

        int[] to = {200, 200, 0};  

        iceepeecee.addFlight("#EA4F33", from, to);

        iceepeecee.photograph("#EA4F33", 30);

        assertTrue(iceepeecee.ok());

    }
    @Test

    public void accordingLPShouldAddFlight() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {100, 100, 0};

        int[] to = {200, 200, 0};

        iceepeecee.addFlight("#EA3333", from, to);

        assertTrue(iceepeecee.ok());

    }
    @Test

    public void accordingLPShouldFlightCamera() {
        ICEEPEECEEE iceepeecee;
        iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {100, 100, 0}; 

        int[] to = {200, 200, 0};   

        iceepeecee.addFlight("#EA5733", from, to);

        int angle = iceepeecee.flightCamera("#EA5733");

        assertTrue(iceepeecee.ok());

    }
}
