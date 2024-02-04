package iceepeecee;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

/**
 * Write a description of class ICEEPEECEETestEstudentsCiclo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ICEEPEECEETestEstudentsCiclo2
{
        private String color1;

        private String color2 ;

        private String color3;

        private String color4;

        private int[][][] islands1;     

        private int[][][] flights1;

        private int[][] polygon1;

        private int[][] polygon2;

        private int[][] polygon3;

        private int[][] polygon4;

        private int[] to1;

        private int[] from1;

        private int[] to2;

        private int[] from2;

        private int[] to3;

        private int[] from3;

        private int[] to4;

        private int[] from4;

        int tetaI1 = 20;

        int tetaI2 = 60;

        float tetaF1 = 47.264f;
    
    //***FERNANDEZ - TORRES

@Test

    public void shouldFTObservedIsland(){
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

        String color1 = "Green";

        String color2 = "Red";

        String color3 = "Blue";

        String color4 = "Magenta";

        i.addIsland(color2, island2);

        i.addIsland(color3, island3);

        i.addFlight(color1, FligthFrom1, FligthTo1);

        i.addFlight(color2, FligthFrom2, FligthTo2);

        String[] resultado = {"Red"} ;

        i.photograph(48);
        i.makeVisible();

        boolean s = Arrays.equals(resultado, i.observedIslands());

        assertTrue(s);

        

    }

    @Test

    public void shouldFTNotObservedIsland(){
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

        String[] resultado = {"red","green"} ;

        i.photograph(48);

        boolean s = Arrays.equals(resultado, i.observedIslands());

        assertFalse(s);

    }



 @Test

    public void ShouldPhotograph(){
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

        float f = 48;

         i.photograph(f);

         assertTrue(i.ok());

    }

    

    @Test

    public void ShouldNotPhotograph(){
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

        float f = 181;

        i.photograph(f);

        assertFalse(i.ok());

    }

    

    @Test

    public void ShouldReturnObserverdIslands(){
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

        i.photograph(48);

        assertTrue(i.observedIslands().length == 0);

        assertTrue(i.ok());

    }

    

     @Test

    public void ShouldReturnUselessFligths(){
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

        i.photograph(48);

        assertTrue(i.uselessFlights().length == 2);

        assertTrue(i.ok());

    }
    //***Achuri-Gil

public void ShouldObservedIslands(){  
        ICEEPEECEEE ip = new ICEEPEECEEE(500, 500);

        int[][]vertix={{20,30},{50,50},{10,50}};

        int[][]vertix2={{15,45},{45,45},{25,35}};

        int[]from={0,30,20}; 

        int[]to={78,70,5};

        ip.addIsland("red",vertix);

        ip.addIsland("yellow",vertix2);

        ip.addFlight("black",from,to);

        ip.photograph(60);

        ip.observedIslands();

        assertTrue(ip.ok());  

    }

    

    public void ShouldObservedIslands2(){
        ICEEPEECEEE ip = new ICEEPEECEEE(500, 500);

        int[][]vertix={{20,30},{50,50},{10,50}};

        int[][]vertix2={{15,45},{45,45},{25,35}};

        int[][]vertix3={{15,55},{75,45},{15,35}};

        ip.addIsland("red",vertix);

        ip.addIsland("green",vertix2);

        ip.addIsland("orange",vertix3);

        int[]from={0,30,89}; 

        int[]to={45,0,5};

        int[]from2={55,50,20};

        int[]to2={40,68,10};

        int[]from3={100,50,9};

        int[]to3={16,180,45};

        ip.addFlight("yellow",from,to);

        ip.addFlight("gray",from2,to2);

        ip.addFlight("purple",from3,to3);

        ip.observedIslands();

        assertTrue(ip.ok());

    }

    

    public void ShouldUselessFlights(){
        ICEEPEECEEE ip = new ICEEPEECEEE(500, 500);

        ip.uselessFlights();

        assertTrue(ip.ok());

    }

    

    public void ShouldUselessFlights2(){
        ICEEPEECEEE ip = new ICEEPEECEEE(500, 500);

        int[][]vertix={{46,50},{70,50},{71,20},{67,12}};

        ip.addIsland("blue",vertix);

        int[]from={18,100,26};

        int[]to={12,100,50};

        ip.addFlight("yellow",from,to);

        ip.uselessFlights();

        assertTrue(ip.ok());

    }

    

    public void ShouldUselessFlights3(){
        ICEEPEECEEE ip = new ICEEPEECEEE(500, 500);

        int[][]vertix ={{98,78},{50,50},{40,60}};

        int[][]vertix2={{15,45},{45,45},{25,35}};

        int[][]vertix3={{40,20},{60,10},{75,20},{60,30}};

        ip.addIsland("blue",vertix);

        ip.addIsland("yellow",vertix2);

        ip.addIsland("orange",vertix3);

        int[]from={40,38,70}; 

        int[]to={98,70,50};

        int[]from2={55,0,20};

        int[]to2={80,40,1};

        int[]from3={56,140,80};

        int[]to3={18,100,50};

        ip.addFlight("gray",from,to);

        ip.addFlight("pink",from2,to2);

        ip.addFlight("magenta",from3,to3);

        ip.uselessFlights();

        assertTrue(ip.ok());

    }

    

    @Test

    public void shouldgetUseless(){
        ICEEPEECEEE ip = new ICEEPEECEEE(500, 500);

        int[][] vertix = {{100,20},{80,40},{30,20}};

        ip.addIsland("red",vertix);

        int[] from = {80,40,50};

        int[] to = {30,30,20};

        

        ip.addFlight("blue",from,to);

        ip.photograph("blue",30);

        ip.makeVisible();

        assertTrue(ip.uselessFlights().length > 0);

        

    }

    

    @Test

    public void shouldNotPhotographWithInvalidAngle() {

        // Crear una instancia de Iceepeeceulator

        ICEEPEECEEE ip = new ICEEPEECEEE (100, 100);



        // Definir valores de prueba

        String color = "blue";

        int[] from = {10, 10, 10};

        int[] to = {20, 20, 20};



        // Agregar un vuelo ficticio

        ip.addFlight(color, from, to);



        // Definir un ángulo no válido (negativo) para la fotografía

        float invalidTeta = -1.0f;



        // Intentar fotografiar el vuelo con el ángulo no válido

        ip.photograph(color, invalidTeta);



        // Verificar que la zona fotografiada sea nula
        try{
            Flight f = ip.getFlight(color);

            Photograph photo = f.getCamera();

            assertNull(photo);
        }catch(IceepeeceeExcepcion e){
            
        }
        

    }
    //** Castillo - Suarez


@Test

    public void testShouldAddIsland() {
        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);

        String color = "#FF0000";

        int[][] polygon = {{10, 10}, {20, 10}, {15, 20}};

        simulator.addIsland(color, polygon);

        assertTrue(simulator.ok());

    }

    

    @Test

    public void testShouldAddMultsimulatorle() {      

        // Ejecutar el método Multsimulatorle con matrices ficticias

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}};

        ICEEPEECEEE simulatorm = new ICEEPEECEEE(islands,flights);

        

        // Verificar que se hayan agregado islas y vuelos aleatorios

        assertTrue(simulatorm.islands().length > 0);

        assertTrue(simulatorm.flights().length > 0);

    }

    

    @Test

    public void testShouldNotAddIslandWithSameColor() {
        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);

        int[][] validPolygon1 = {{50, 50}, {70, 50}, {55, 55}}; // Polígono válido

        int[][] validPolygon2 = {{20, 20}, {30, 20}, {25, 25}}; // Polígono válido



        simulator.addIsland("blue", validPolygon1);

        

        // Verifica que la isla se haya agregado correctamente

        assertTrue(simulator.ok());



        // Intenta agregar otra isla con el mismo color, lo cual no debería permitirse

        simulator.addIsland("blue", validPolygon2);



        // Verifica que la segunda isla no se haya agregado debido al mismo color

        assertTrue(simulator.ok());

        

        // Verifica que solo haya una isla en el simulador

        assertEquals(1, simulator.islands().length);

    }



    @Test

    public void testShouldNotAddIslandWithInvalidCoordinates() {
        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);

        int[][] invalidPolygon = {{0, 0}, {10, 0}}; // Polígono con solo dos puntos (inválido)

        simulator.addIsland("red", invalidPolygon);

        

        // Verifica que la isla no se haya agregado debido a las coordenadas inválidas

        assertFalse(simulator.ok());

        

        // Verifica que no haya islas en el simulador

        assertEquals(0, simulator.islands().length);

    }

    

    @Test

    public void testShouldNotAddIslandOverlapping() {
        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);

        int[][] island1 = { { 0, 0 }, { 0, 10 }, { 10, 10 }, { 10, 0 } };

        simulator.addIsland("red", island1);

        int[][] island2 = { { 5, 5 }, { 5, 15 }, { 15, 15 }, { 15, 5 } };

        simulator.addIsland("green", island2);

        assertTrue(simulator.ok());

    }



    @Test

    public void testShouldDelIsland() {

        ICEEPEECEEE simulator = new ICEEPEECEEE(100, 100);

        String color1 = "255,0,0";

        int[][] polygon1 = {{10, 10}, {20, 10}, {15, 20}};

        String color2 = "0,0,255";

        int[][] polygon2 = {{30, 30}, {40, 30}, {35, 40}};



        simulator.addIsland(color1, polygon1);

        simulator.addIsland(color2, polygon2);

        

        assertTrue(simulator.ok());

        

        simulator.delIsland(color1);

        simulator.delIsland(color2);

        

        assertTrue(simulator.ok());

        

    }

    

    @Test

    public void testShouldNotDelIsland() {

        
        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);
        // Agregar una isla al simulador

        int[][] vertix = {{200, 200}, {200, 300}, {180, 180}};

        simulator.addIsland("green", vertix);



        // Verificar que 'ok' sea true antes de intentar eliminar la isla

        assertTrue(simulator.ok());



        // Intentar eliminar una isla que no existe

        simulator.delIsland("white");



        // Verificar que 'ok' ahora sea false después de intentar eliminar la isla

        assertTrue(simulator.ok());

    }

    

     @Test

    public void testShouldReturnIslandLocation() {
        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);

        String color1 = "255,0,0";

        int[][] expectedLocation1 = {{10, 10}, {20, 10}, {15, 20}};

        simulator.addIsland(color1, expectedLocation1);

        int[][] actualLocation1 = simulator.islandLocation(color1);

        assertArrayEquals(expectedLocation1, actualLocation1);

    }

    

    

    @Test

    public void testShouldNotReturnIslandLocation() {

        // Crea una instancia de Iceepeece

        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);



        // Intenta obtener la ubicación de un vuelo que no existe

        int[][] location = simulator.islandLocation("NonExistentColor");



        // Asegura que la ubicación sea nula (no se encontró el vuelo)

        assertNull(location);



    }



     @Test

    public void testShouldAddFlight(){
        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);

        int[] from = {20,20};

        int[] to = {50,10};

        simulator.addFlight("magenta",from,to);

        assertTrue(simulator.ok());

    }

    

    @Test

    public void ShouldNotAddFlightWithSameColor() {

        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);

        int[] from1 = {10,10,90};

        int[] to1 = {20, 20,90};

        

        simulator.addFlight("255,0,0",from1,to1); 

        

        int[] from2 = {40,40,90};

        int[] to2 = {30, 30,90};

        

        simulator.addFlight("255,0,0", from1, to1);



        // Get the list of flights

        String[] flightColors = simulator.flights();



        // Assert that there is only one flight with the "255,0,0" color

        assertEquals(1, flightColors.length);

        assertEquals("255,0,0", flightColors[0]);

        assertTrue(simulator.ok());

        

    



    }

       

    @Test 

    public void ShouldnotAddFlightWithInvalidCoordinates(){
        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);

        int[] from = {20,20,90};

        int[] to = {10,10,90};

        simulator.addFlight("magenta",from,to);

        assertTrue(simulator.ok());

    }

    

    @Test

    public void ShouldDelFlight() {

        ICEEPEECEEE simulator = new ICEEPEECEEE(100, 100);

        String color1 = "255,0,0";

        int[] from1 = {10, 10,90};

        int[] to1 = {20, 20,90};

        

        simulator.addFlight(color1, from1, to1);

       

        assertTrue(simulator.ok());





        simulator.delFlight("255,0,0");

        

        assertTrue(simulator.ok());

        

    }

    

    @Test

    public void ShouldNotDelFlight() {

        ICEEPEECEEE simulator = new ICEEPEECEEE(100, 100);

        simulator.delFlight("255,0,0");

        assertTrue(simulator.ok());

    }

    

    @Test

    public void testShouldReturnFlightLocation() {

        ICEEPEECEEE simulator = new ICEEPEECEEE(100, 100);

        String color1 = "255,0,0";

        int[] from1 = {10, 10,90};

        int[] to1 = {20, 20,90};



        simulator.addFlight(color1, from1, to1);

 

        int[][] expectedLocation1 = {from1, to1};

        int[][] actualLocation1 = simulator.flightLocation(color1);



        assertArrayEquals(expectedLocation1, actualLocation1);

    

       

       

    }

    

    @Test

    public void testShouldNotReturnFlightLocation() {
        ICEEPEECEEE simulator = new ICEEPEECEEE(100, 100);


        // Intenta obtener la ubicación de un vuelo que no existe

        int[][] location = simulator.flightLocation("NonExistentColor");



        // Asegura que la ubicación sea nula (no se encontró el vuelo)

        assertNull(location);



    }

    

    @Test

    public void testShouldReturnFlightCamera() {

        ICEEPEECEEE simulator = new ICEEPEECEEE(100, 100);

        int[] from = {20,20,90};

        int[] to = {50,10,20};

        

        simulator.addFlight("magenta",from,to);



        simulator.photograph("magenta",90);

        

        float angle = simulator.flightCamera("magenta");

       

        assertEquals(angle,90);



    }

    

    @Test

    public void testShouldNotReturnFlightCamera() {
        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);

        // Intentar obtener el ángulo de la cámara de un vuelo que no existe

        float angle = simulator.flightCamera("VueloInexistente");



        // Verificar que el ángulo obtenido sea igual a -1 (ya que el vuelo no existe)

        assertEquals(0, angle);



    }

    

    

    @Test

    public void testShouldReturnIslands() {

        ICEEPEECEEE simulator = new ICEEPEECEEE(100, 100);



        // Agregar islas

        simulator.addIsland("red", new int[][]{{20, 30}, {50, 50}, {10, 50}});

        simulator.addIsland("green", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});



        String[] expectedColors = {"red", "green"};

        String[] actualColors = simulator.islands();



        assertArrayEquals(expectedColors, actualColors);

    }



    @Test

    public void testShouldNotReturnIslands() {

        ICEEPEECEEE simulator = new ICEEPEECEEE(100, 100);



        // No agregar islas



        String[] expectedColors = {};

        String[] actualColors = simulator.islands();



        assertArrayEquals(expectedColors, actualColors);

    }

    

    @Test

    public void testShouldReturnFlights() {

        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);



        // Agregar vuelos

        simulator.addFlight("blue", new int[]{0, 30, 20}, new int[]{78, 70, 5});

        simulator.addFlight("red", new int[]{55, 0, 20}, new int[]{70, 60, 10});



        String[] expectedColors = {"blue", "red"};

        String[] actualColors = simulator.flights();



        assertArrayEquals(expectedColors, actualColors);

    }



    @Test

    public void testShouldNotReturnFlights() {

        ICEEPEECEEE simulator = new ICEEPEECEEE(100, 100);



        // No agregar vuelos



        String[] expectedColors = {};

        String[] actualColors = simulator.flights();



        assertArrayEquals(expectedColors, actualColors);

    }

    

     @Test

    public void testShouldReturnObservedIslands() {

        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);



        // Agregar islas y zonas fotografiadas

        simulator.addIsland("green", new int[][] {{20,30},{50,50},{10,50}});

        simulator.addIsland("red", new int[][]{{45,60},{55,55},{60,60},{55,65}});

        

        simulator.addFlight("blue",new int[] {0,30,20},new int[]{78,70,5});

        simulator.addFlight("magenta",new int[] {55,0,20},new int[]{70,60,10});

        

        simulator.photograph("blue",120);

        simulator.photograph("magenta",120);



        String[] expectedColors = {"green", "red"};

        String[] actualColors = simulator.observedIslands();



        assertArrayEquals(expectedColors, actualColors);

    }



    @Test

    public void testShouldNotReturnObservedIslands() {

        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);



        // Agregar islas, pero no zonas fotografiadas

        simulator.addIsland("green", new int[][]{{20, 30}, {50, 50}, {10, 50}});

        simulator.addIsland("red", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});



        String[] expectedColors = {};

        String[] actualColors = simulator.observedIslands();



        assertArrayEquals(expectedColors, actualColors);

    }



    @Test

    public void testPhotograph() {

        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);



        // Agregar un vuelo ficticio

        String color = "255,0,0";

        int[] from = {10, 10,10};

        int[] to = {20, 20,20};



        simulator.addFlight(color, from, to);



        // Fotografiar el vuelo

        int teta = 60;

        simulator.photograph(color, teta);



        // Verificar la zona fotografiada

        

        assertTrue(simulator.ok());

        

        }  

        

    

     @Test

    public void shouldTestPhotograph() {

        // Crear una instancia de Iceepeece

        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);



        // Definir valores de prueba

        String color = "red";

        int[] from = {10, 10, 10};

        int[] to = {20, 20, 20};

        int cameraAngle = 90;



        // Agregar un vuelo ficticio

        simulator.addFlight(color, from, to);



        // Definir el ángulo de la fotografía

        float teta = 3.14159f;



        // Fotografiar el vuelo

        simulator.photograph(color, teta);

        

        assertTrue(simulator.ok());

    }

    

    @Test

    public void shouldNotPhotographWithInvalidAngle2() {

        // Crear una instancia de Iceepeece

        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);



        // Definir valores de prueba

        String color = "blue";

        int[] from = {10, 10, 10};

        int[] to = {20, 20, 20};



        // Agregar un vuelo ficticio

        simulator.addFlight(color, from, to);



        // Definir un ángulo no válido (negativo) para la fotografía

        float invalidTeta = -1.0f;



        // Intentar fotografiar el vuelo con el ángulo no válido

        simulator.photograph(color, invalidTeta);



        assertTrue(simulator.ok());

    }

    

    @Test

    public void shouldnotPhotograph(){
        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);

        int[]from={0,20,40}; 

        int[]to={70,80,50};

        String color="blue";

        simulator.photograph(color,50);

        assertTrue(simulator.ok());

    }

    

    @Test

    public void shouldgetUseless2(){
        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);

        int[][] vertix = {{100,20},{80,40},{30,20}};

        simulator.addIsland("red",vertix);

        int[] from = {80,40,50};

        int[] to = {30,30,20};

        

        simulator.addFlight("blue",from,to);

        simulator.photograph("blue",30);

        assertTrue(simulator.uselessFlights().length > 0);

        

    }

    

    @Test

    public void testShouldNotReturnUselessFlights() {
        ICEEPEECEEE simulator = new ICEEPEECEEE(500, 500);
        // Agregar islas y vuelos

        simulator.addIsland("red", new int[][]{{300, 300}, {450, 450}, {190, 350}});

        simulator.addIsland("green", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});

        simulator.addFlight("blue", new int[]{0, 30, 20}, new int[]{78, 70, 5});

        simulator.addFlight("magenta", new int[]{55, 0, 20}, new int[]{70, 60, 10});



        // Fotografiar todas las islas con los vuelos

        simulator.photograph("blue", 60);

        simulator.photograph("magenta", 60);



        // Obtener vuelos con fotografías inútiles

        String[] uselessFlights = simulator.uselessFlights();



        // Verificar que no se devuelvan vuelos inútiles

        assertEquals(0, uselessFlights.length);

        //se verifica que el método uselessFlight no devuelva vuelos inútiles, ya que todos los vuelos cubren las islas en este caso

    }

//**Bernal-Hernandez**//

@Test

    public void accordingBHshouldCreateCaseWithNewConstructor() {

        ICEEPEECEEE map = new ICEEPEECEEE(new int[][][]{{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},

        {{45,60},{55,55},{60,60},{55,65}}},new int[][][]{{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}});

        assertEquals(true, map.ok());

    }

    

    @Test

    public void accordingBHShouldPhotographFloat() {

        ICEEPEECEEE map = new ICEEPEECEEE(600,600);

        int[] from = {45,55,10};

        int[] to = {67,90,10};

        map.addFlight("red",from,to);

        map.photograph(60.4f);

        assertTrue(map.ok());

    }



    @Test

    public void accordingBHshouldGiveFlights() {

        ICEEPEECEEE map = new ICEEPEECEEE(600,600);

        String[] vuelos = {"red","blue"};

        int[] from = {45,55,10};

        int[] to = {67,90,10};

        int[] from2 = {75,20,10};

        int[] to2 = {120,75,10};

        map.addFlight("red",from,to);

        map.addFlight("blue",from2,to2);

        assertArrayEquals(map.flights(),vuelos);

    }

    

    @Test

    public void accordingBHshouldGiveIslands() {

        ICEEPEECEEE map = new ICEEPEECEEE(600,600);

        int[][] polygon1 = {{100, 50}, {150, 80}, {200, 100}};

        int[][] polygon2 = {{300, 350}, {350, 380}, {400, 400}};

        map.addIsland("blue", polygon1);

        map.addIsland("red", polygon2);

        String[] expectedIslands = {"blue", "red"};

        assertArrayEquals(expectedIslands, map.islands());

    }



    @Test

    public void accordingBHshouldNotReturnNonexistentIslands() {

        ICEEPEECEEE map = new ICEEPEECEEE(600,600);

        int[][] polygon = {{100, 50}, {150, 80}, {200, 100}};

        int[][] polygon2 = {{700, 50}, {150, 700}, {200, 900}};

        map.addIsland("blue", polygon);

        map.addIsland("red", polygon2);

        String[] expectedIslands = {"blue"};

        assertArrayEquals(expectedIslands, map.islands());

    }

    

    @Test

    public void accordingBHshouldNotReturnNonexistentFlights() {

        ICEEPEECEEE map = new ICEEPEECEEE(600,600);

        String[] vuelos = {"red"};

        int[] from = {45,55,10};

        int[] to = {67,90,10};

        int[] from2 = {750,20,10};

        int[] to2 = {120,750,10};

        map.addFlight("red",from,to);

        map.addFlight("blue",from2,to2);

        assertArrayEquals(map.flights(),vuelos);

    }

    

    @Test

    public void accordingBHshouldReturnObservedIsland() {       

        ICEEPEECEEE map = new ICEEPEECEEE(600, 600);

        int[][]isla={{20,30},{50,50},{10,50}};

        int[]from={0,30,20}; 

        int[]to={78,70,5};

        map.addIsland("red",isla);

        map.addFlight("green",from,to);

        map.photograph(60);

        String[] observedIslands = map.observedIslands();

        assertTrue(Arrays.asList(observedIslands).contains("red"));

    }

    

    @Test

    public void accordingBHshouldNotReturnObservedIsland(){

        ICEEPEECEEE map = new ICEEPEECEEE(600, 600);

        int[][] isla = {{100,20},{80,40},{30,20}};

        map.addIsland("red",isla);

        int[] from = {180,140,20};

        int[] to = {130,130,20};

        map.addFlight("blue",from,to);

        map.photograph("blue",30);

        String[] observedIslands = map.observedIslands();

        assertFalse(Arrays.asList(observedIslands).contains("red"));

    }

    

    @Test

    public void accordingBHshouldGetUselessFlight(){

        ICEEPEECEEE map = new ICEEPEECEEE(600, 600);

        int[][] isla = {{100,20},{80,40},{30,20}};

        map.addIsland("red",isla);

        int[] from = {180,140,20};

        int[] to = {130,130,20};

        map.addFlight("blue",from,to);

        map.photograph("blue",30);

        assertTrue(map.uselessFlights().length > 0);

    }

    

    @Test

    public void accordingBHshouldNotGetUselessFlight() {       

        ICEEPEECEEE map = new ICEEPEECEEE(600, 600);

        int[][]isla={{20,30},{50,50},{10,50}};

        int[]from={0,30,20}; 

        int[]to={78,70,5};

        map.addIsland("red",isla);

        map.addFlight("green",from,to);

        map.photograph(60);

        String[] observedIslands = map.observedIslands();

        assertTrue(map.uselessFlights().length == 0);

    }

//*Lesmes*//


//Photograph(float teta)

    @Test

    public void accordingLPShouldPhotographFloat() {
        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(islands,flights);

        iceepeecee.photograph(60.4f);

        assertTrue(iceepeecee.ok());

    }

@Test

    public void accordingLPShouldPhotographFloat2() {
        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(islands,flights);

        iceepeecee.photograph(90.1f);

        assertFalse(iceepeecee.ok());

    }



//islands()

    @Test

    public void accordingLPShouldIslands() {
         int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(islands,flights);

        iceepeecee.islands();

        assertTrue(iceepeecee.ok());

    }



//flights()

    @Test

    public void accordingLPShouldFlights() {
         int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(islands,flights);

        iceepeecee.flights();

        assertTrue(iceepeecee.ok());

    }



//observedIslands()

    @Test

    public void accordingLPShouldObservedIslands(){
        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(islands,flights);

        iceepeecee.photograph(60);

        iceepeecee.makeVisible();

        String[] a = iceepeecee.observedIslands();

        assertEquals(3, a.length);

    }

    @Test

    public void accordingLPShouldNotObservedIslands(){
        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(islands,flights);

        iceepeecee.photograph(1);

        iceepeecee.makeVisible();

        String[] a = iceepeecee.observedIslands();

        assertEquals(0, a.length);

    }

//uselessFlights()

    @Test

    public void accordingLPShouldUselessFlights(){
        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(islands,flights);

        iceepeecee.photograph(60);

        iceepeecee.makeVisible();

        String[] a = iceepeecee.uselessFlights();

        assertEquals(1, a.length);

    }

    @Test

    public void accordingLPShouldNotObservedFlights(){
        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(islands,flights);

        iceepeecee.photograph(80);

        iceepeecee.makeVisible();

        String[] a = iceepeecee.observedIslands();

        assertEquals(5, a.length);

    }

//CASALLAS - MURCIA

//CICLO 2

@Test

    public void accordingCMShouldTakePhotosSuccessFloat(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[]from={0,30,20}; 

        int[]to={78,70,5};

        int[]from1={55,0,20};

        int[]to1={70,60,10};

        String color="#FF0000";

        String color1="#FFFFFF";

        iceepeecee.addFlight(color,from,to);

        iceepeecee.addFlight(color1,from1,to1);

        iceepeecee.photograph(40.2f);

        assertTrue(iceepeecee.ok());

    }





@Test

    public void accordingCMShouldNotTakePhotosFlightsNotExistentFloat(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[]from={0,30,20}; 

        int[]to={78,70,5};

        String color="#FF0000";

        iceepeecee.photograph(48.6f);

        assertFalse(iceepeecee.ok()); 

    }



@Test

    public void accordingCMShouldConsultIslands(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[][]polygon={{20,30},{50,50},{10,50}};

        String color="#FFA500";

        iceepeecee.addIsland(color,polygon);

        iceepeecee.islands();

        assertTrue(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldConsultNotExistentIslands(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        iceepeecee.islands();

        assertTrue(iceepeecee.ok());

    }  



@Test

    public void accordingCMShouldConsultFlights(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[]from={0,30,20}; 

        int[]to={78,70,5};

        String color="#0000FF";

        iceepeecee.addFlight(color,from,to);

        iceepeecee.flights();

        assertTrue(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldConsultNotExistentFlights(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        iceepeecee.flights();

        assertTrue(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldConsultObservedIslandsIsNull(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        iceepeecee.observedIslands();

        assertTrue(iceepeecee.ok());

    }



public void accordingCMShouldConsultObservedIslandsSuccess(){   
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[][]polygon={{20,30},{50,50},{10,50}};

        String color="#FFA500";

        int[][]polygon1={{15,45},{45,45},{25,35}};

        String color1="#808080";

        int[]from={0,30,20}; 

        int[]to={78,70,5};

        String color3="#0000FF";

        iceepeecee.addIsland(color,polygon);

        iceepeecee.addIsland(color1,polygon1);

        iceepeecee.addFlight(color3,from,to);

        iceepeecee.photograph(60);

        iceepeecee.observedIslands();

        assertTrue(iceepeecee.ok());  

    }



public void accordingCMShouldConsultUselessFlightsIsNull(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        iceepeecee.uselessFlights();

        assertTrue(iceepeecee.ok());

    }



public void accordingCMShouldConsultUselessFlightsSuccess(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[][]polygon={{40,20},{60,10},{75,20},{60,30}};

        String color="#FFFFFF";

        iceepeecee.addIsland(color,polygon);

        int[]from={100,130,20};

        int[]to={178,170,5};

        String color1="#008000";

        iceepeecee.addFlight(color1,from,to);

        iceepeecee.uselessFlights();

        assertTrue(iceepeecee.ok());

    }

//Forero-Murcia

@Test

    public void accordingFMshouldCreateCase1WithNewConstructor() {

        ICEEPEECEEE manage;

        manage = new ICEEPEECEEE(new int[][][]{{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},

                                {{45,60},{55,55},{60,60},{55,65}}},new int[][][]{{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}});

        assertEquals(true, manage.ok());

        manage.photograph(48.032f);

        assertEquals(true, manage.ok());

        String[] res = manage.observedIslands();

        assertEquals(true, manage.ok());

        assertEquals(3,res.length);

        String[] res1 = manage.uselessFlights();

        assertEquals(true, manage.ok());

        assertEquals(0,res1.length);

        

    }

    @Test

    public void accordingFMShouldNotCreateAllIslandsWithNewConstructor() {

        ICEEPEECEEE manage;

        manage = new ICEEPEECEEE(new int[][][]{{{20,30,50},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},

                                {{45,60},{55,55},{60,60},{55,65}}},new int[][][]{{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}});

        assertEquals(true, manage.ok());

        String [] islas = manage.islands();

        assertEquals(2,islas.length);

    }

    

    @Test

    public void accordingFMshouldCanTakeAPhotoWithNotIntegerAngle() {

        ICEEPEECEEE manage;

        manage = new ICEEPEECEEE(new int[][][]{{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},

                                {{45,60},{55,55},{60,60},{55,65}}},new int[][][]{{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}});

        assertEquals(true, manage.ok());

        manage.photograph(48.032f);

        assertEquals(true, manage.ok());

        

    }

    @Test

    public void accordingFMshouldCanTakeAPhotoWithNotIntegerAngle2() {

        ICEEPEECEEE manage;

        manage = new ICEEPEECEEE(new int[][][]{{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},

                                {{45,60},{55,55},{60,60},{55,65}}},new int[][][]{{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}}});

        assertEquals(true, manage.ok());

        manage.photograph(48.031693036f);

        assertEquals(true, manage.ok());

        

    }

    

    @Test

    public void accordingFMShouldCanGetTheIslandsAndTheFlightsColors(){

        ICEEPEECEEE manage = new ICEEPEECEEE((int)Math.pow(10,6),(int)Math.pow(10,6));

        manage.addIsland("Red",new int[][]{{20,30},{50,50},{10,50}});

        assertEquals(true, manage.ok());

        manage.addIsland("Blue",new int[][]{{40,20},{60,10},{75,20},{60,30}});

        assertEquals(true, manage.ok());

        manage.addIsland("Yellow",new int[][]{{45,60},{55,55},{60,60},{55,65}});

        assertEquals(true, manage.ok());

        manage.addFlight("Black",new int[]{0,30,20},new int[]{78,70,5});

        assertEquals(true, manage.ok());

        manage.addFlight("Blue",new int[]{55,0,20},new int[]{70,60,10});

        assertEquals(true, manage.ok());

        String[] islas = manage.islands();

        assertEquals(true, manage.ok());

        assertArrayEquals(new String[]{"Red","Blue","Yellow"},islas);

        String[] vuelos = manage.flights();

        assertEquals(true, manage.ok());

        assertArrayEquals(new String[]{"Black","Blue"},vuelos);

    }

    @Test

    public void accordingFMShouldCantGetAllTheIslandsAndTheFlightsColors(){

        ICEEPEECEEE manage = new ICEEPEECEEE((int)Math.pow(10,6),(int)Math.pow(10,6));

        manage.addIsland("Red",new int[][]{{20,30},{50,50},{10,50}});

        assertEquals(true, manage.ok());

        manage.addIsland("Blue",new int[][]{{40,20},{60,10},{75,20},{60,30}});

        assertEquals(true, manage.ok());

        manage.delIsland("Blue");

        assertEquals(true, manage.ok());

        manage.addIsland("Yellow",new int[][]{{45,60},{55,55},{60,60},{55,65}});

        assertEquals(true, manage.ok());

        manage.addFlight("Black",new int[]{0,30,20},new int[]{78,70,5});

        assertEquals(true, manage.ok());

        manage.addFlight("Blue",new int[]{55,0,20},new int[]{70,60,10});

        assertEquals(true, manage.ok());

        manage.delFlight("Blue");

        assertEquals(true, manage.ok());

        String[] islas = manage.islands();

        assertEquals(true, manage.ok());

        assertArrayEquals(new String[]{"Red","Yellow"},islas);

        String[] vuelos = manage.flights();

        assertEquals(true, manage.ok());

        assertArrayEquals(new String[]{"Black"},vuelos);

    }

    @Test

    public void accordingFMShouldObservAllIslands5(){
        ICEEPEECEEE manage;

        int[][][] islands;

        int[][][] flights;

        islands = new int[][][] {{{-5,0}, {5,0}, {0,5}}};

        flights = new int[][][] {{{0,10,20}, {-10,0,10}}};

        manage = new ICEEPEECEEE(islands,flights);

        manage.photograph(31.219698447f);

        String[] res = manage.observedIslands();

        assertEquals(1,res.length);

        String[] res1 = manage.uselessFlights();

        assertEquals(0,res1.length);

    }

    

    @Test

    public void accordingFMShouldNotObservAllIslands(){

        ICEEPEECEEE manage = new ICEEPEECEEE((int)Math.pow(10,6),(int)Math.pow(10,6));

        manage.addIsland("Pale Turquoise",new int[][]{{20,30},{50,50},{10,50}});

        manage.addIsland("Blue",new int[][]{{40,20},{60,10},{75,20},{60,30}});

        manage.addIsland("Yellow",new int[][]{{45,60},{55,55},{60,60},{55,65}});

        manage.addFlight("Black",new int[]{0,30,20},new int[]{78,70,5});

        manage.addFlight("Blue",new int[]{55,0,20},new int[]{70,60,10});

        manage.photograph(48.031693035f);

        String[] res = manage.observedIslands();

        assertEquals(2,res.length);

        String[] res1 = manage.uselessFlights();

        assertEquals(1,res1.length);

    }

    

    @Test

    public void accordingFMShouldNotHaveAnyUslessFlights(){

        ICEEPEECEEE manage = new ICEEPEECEEE((int)Math.pow(10,6),(int)Math.pow(10,6));

        manage.addIsland("Pale Turquoise",new int[][]{{20,30},{50,50},{10,50}});

        manage.addIsland("Blue",new int[][]{{40,20},{60,10},{75,20},{60,30}});

        manage.addIsland("Yellow",new int[][]{{45,60},{55,55},{60,60},{55,65}});

        manage.addFlight("Black",new int[]{0,30,20},new int[]{78,70,5});

        manage.addFlight("Blue",new int[]{55,0,20},new int[]{70,60,10});

        manage.photograph(50);

        String[] res = manage.observedIslands();

        assertEquals(3,res.length);

        String[] res1 = manage.uselessFlights();

        assertEquals(0,res1.length);

    }

    

    @Test

    public void accordingFMShouldHaveAllUslessFlights(){

        ICEEPEECEEE manage = new ICEEPEECEEE((int)Math.pow(10,6),(int)Math.pow(10,6));

        manage.addIsland("Pale Turquoise",new int[][]{{20,30},{50,50},{10,50}});

        manage.addIsland("Blue",new int[][]{{40,20},{60,10},{75,20},{60,30}});

        manage.addIsland("Yellow",new int[][]{{45,60},{55,55},{60,60},{55,65}});

        manage.addFlight("Black",new int[]{0,30,20},new int[]{78,70,5});

        manage.addFlight("Blue",new int[]{55,0,20},new int[]{70,60,10});

        manage.photograph(5);

        String[] res = manage.observedIslands();

        assertEquals(0,res.length);

        String[] res1 = manage.uselessFlights();

        assertEquals(2,res1.length);

    }



//Chicuazuque-Sierra    

    

    // Prueba para el primer escenario (input1) del problema F de la maratón.

    @Test

    public void testInput1FotografiaConAngulosNoEnterosParaUnVueloChicuazuqueSierra() {

        ICEEPEECEEE input1 = new ICEEPEECEEE(100, 100);

        input1.addIsland("blue", new int[][]{{20, 30}, {50, 50}, {10, 50}});

        input1.addIsland("green", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});

        input1.addIsland("red", new int[][]{{45, 60}, {55, 55}, {60, 60}, {55, 65}});

        input1.addFlight("fligth1", new int[]{0, 30, 20}, new int[]{78, 70, 5});

        input1.addFlight("fligth2", new int[]{55, 0, 20}, new int[]{70, 60, 10});

        

        // Tomar fotografías de los vuelos en el primer escenario (input1).

        input1.photograph("fligth1", 45.2f);

        input1.photograph("fligth2", 30.0f);

        input1.makeVisible();

        // Verificar que las fotografías se tomaron correctamente en el primer escenario (input1).

        assertTrue(input1.ok());

        

    }

    

    @Test

    public void testInput1FotografiaConAngulosNoEnterosChicuazuqueSierra() {

        ICEEPEECEEE input1 = new ICEEPEECEEE(100, 100);

        input1.addIsland("blue", new int[][]{{20, 30}, {50, 50}, {10, 50}});

        input1.addIsland("green", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});

        input1.addIsland("red", new int[][]{{45, 60}, {55, 55}, {60, 60}, {55, 65}});

        input1.addFlight("fligth1", new int[]{0, 30, 20}, new int[]{78, 70, 5});

        input1.addFlight("fligth2", new int[]{55, 0, 20}, new int[]{70, 60, 10});

       

         // Tomar fotografías de los vuelos en el primer escenario (input1).

        input1.photograph(45.2f);

        input1.makeVisible();

        // Verificar que las fotografías se tomaron correctamente en el primer escenario (input1).

        assertTrue(input1.ok());

        

    }

    

    @Test

    public void testInput1IslandsChicuazuqueSierra() {
        ICEEPEECEEE input1 = new ICEEPEECEEE(100, 100);

        input1.addIsland("blue", new int[][]{{20, 30}, {50, 50}, {10, 50}});

        input1.addIsland("green", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});

        input1.addIsland("red", new int[][]{{45, 60}, {55, 55}, {60, 60}, {55, 65}});

        input1.addFlight("fligth1", new int[]{0, 30, 20}, new int[]{78, 70, 5});

        input1.addFlight("fligth2", new int[]{55, 0, 20}, new int[]{70, 60, 10});

      

      String[] expectedIslands = {"blue", "green", "red"};

        String[] result = input1.islands();



        assertArrayEquals(expectedIslands, result);

    }



    @Test

    public void testInput1FlightsChicuazuqueSierra() {

        ICEEPEECEEE input1 = new ICEEPEECEEE(100, 100);

        input1.addIsland("blue", new int[][]{{20, 30}, {50, 50}, {10, 50}});

        input1.addIsland("green", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});

        input1.addIsland("red", new int[][]{{45, 60}, {55, 55}, {60, 60}, {55, 65}});

        input1.addFlight("fligth1", new int[]{0, 30, 20}, new int[]{78, 70, 5});

        input1.addFlight("fligth2", new int[]{55, 0, 20}, new int[]{70, 60, 10});

        

        String[] expectedFlights = {"fligth1", "fligth2"};

        String[] result = input1.flights();



        assertArrayEquals(expectedFlights, result);

    }



    @Test

    public void testIslasEnFotografiaEnInput1NoSalenTodasChicuazuqueSierra() {

        ICEEPEECEEE input1 = new ICEEPEECEEE(100, 100);

        input1.addIsland("blue", new int[][]{{20, 30}, {50, 50}, {10, 50}});

        input1.addIsland("green", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});

        input1.addIsland("red", new int[][]{{45, 60}, {55, 55}, {60, 60}, {55, 65}});

        input1.addFlight("fligth1", new int[]{0, 30, 20}, new int[]{78, 70, 5});

        input1.addFlight("fligth2", new int[]{55, 0, 20}, new int[]{70, 60, 10});

      

  // Tomar una fotografía del vuelo "fligth1" en input1 que captura la isla "red".

        input1.photograph(10);

        input1.makeVisible();

        // Obtener la lista de islas observadas en la fotografía en input1.

        String [] observedIslands = input1.observedIslands();

        // Verificar que todas las islas ("red", "green", "blue") estén en la lista observada.

        System.out.println(Arrays.asList(observedIslands));

        assertFalse( 

                   Arrays.asList(observedIslands).contains("red") &&

                   Arrays.asList(observedIslands).contains("green") &&

                   Arrays.asList(observedIslands).contains("blue"));

        

    }

    

    @Test

    public void testInput1VuelosFotografiasInutilesChicuazuqueSierra() {

        ICEEPEECEEE input1 = new ICEEPEECEEE(100, 100);

        input1.addIsland("blue", new int[][]{{20, 30}, {50, 50}, {10, 50}});

        input1.addIsland("green", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});

        input1.addIsland("red", new int[][]{{45, 60}, {55, 55}, {60, 60}, {55, 65}});

        input1.addFlight("fligth1", new int[]{0, 30, 20}, new int[]{78, 70, 5});

        input1.addFlight("fligth2", new int[]{55, 0, 20}, new int[]{70, 60, 10});

      

  // Tomar una fotografía del vuelo "fligth1" en input1 que captura la isla "red".

        input1.photograph(0);

        input1.makeVisible();

        // Obtener la lista de islas observadas en la fotografía en input1.

        String [] vuelosConFotosInutiles = input1.uselessFlights();

        // Verificar que todas las islas ("red", "green", "blue") estén en la lista observada.

        System.out.println(Arrays.asList(vuelosConFotosInutiles));

        assertTrue(

                   Arrays.asList(vuelosConFotosInutiles).contains("fligth1") &&

                   Arrays.asList(vuelosConFotosInutiles).contains("fligth2"));

}

//MILTON ANDRES GUTIERREZ - JHON SEBASTIAN SOSA


    

    //Ciclo 2.

    

    //Mini-Ciclo 2:

    @Test

    

    public void accordingGSshouldCreateMapOfIceepeecee(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300, 300);

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        int[][][] islands2 = {};

        int[][][] flights2 = {};

        ICEEPEECEEE iceepeecee2 = new ICEEPEECEEE(islands, flights);

        ICEEPEECEEE iceepeecee3 = new ICEEPEECEEE(islands2, flights2);

        assertTrue(iceepeecee2.ok());

    }

    

    

    @Test

    public void accordingGSshouldnotCreateMapOfIceepeecee(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300, 300);

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        int[][][] islands2 = {};

        int[][][] flights2 = {};

        ICEEPEECEEE iceepeecee2 = new ICEEPEECEEE(islands, flights);

        ICEEPEECEEE iceepeecee3 = new ICEEPEECEEE(islands2, flights2);

        assertFalse(iceepeecee3.ok());

    }

    

    @Test

    public void accordingGSshouldtakePhoto2(){ 
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300, 300);

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        int[][][] islands2 = {};

        int[][][] flights2 = {};

        ICEEPEECEEE iceepeecee2 = new ICEEPEECEEE(islands, flights);

        ICEEPEECEEE iceepeecee3 = new ICEEPEECEEE(islands2, flights2);

        int[] from = {5, 50, 10};

        int[] to = {50, 100, 10};

        String color = "red";

        iceepeecee.addFlight(color, from, to);

        assertTrue(iceepeecee.ok());    

        int[] from1 = {100, 100, 40};

        int[] to1 = {200, 200, 30};

        String color1 = "blue";

        iceepeecee.addFlight(color1, from1, to1);

        assertTrue(iceepeecee.ok());

        float teta = 50.5f;

        iceepeecee.photograph(teta);

        iceepeecee.makeInvisible();

        assertTrue(iceepeecee.ok());

    }

    

    @Test

    public void accordingGSshouldNottakePhoto2(){ 
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300, 300);

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        int[][][] islands2 = {};

        int[][][] flights2 = {};

        ICEEPEECEEE iceepeecee2 = new ICEEPEECEEE(islands, flights);

        ICEEPEECEEE iceepeecee3 = new ICEEPEECEEE(islands2, flights2);

        int[] from = {5, 50, 10};

        int[] to = {50, 100, 10};

        String color = "red";

        iceepeecee.addFlight(color, from, to); // Debe aÃ±adir el vuelo

        assertTrue(iceepeecee.ok());

        float teta = -1.54f;

        iceepeecee.photograph(-1.54f); // No debe tomar la fotografÃ­a.

        assertFalse(iceepeecee.ok());       

        int[] from1 = {100, 100, 40};

        int[] to1 = {200, 200, 30};

        String color1 = "blue";

        iceepeecee.addFlight(color1, from1, to1);// Debe aÃ±adir el vuelo

        assertTrue(iceepeecee.ok());

        float teta1 = 99.4f;

        iceepeecee.photograph(teta1); // No debe tomar la fotografÃ­a.

        assertFalse(iceepeecee.ok());

        

    }

    

    @Test

    public void accordingGSshouldReturnIslands(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300, 300);

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        int[][][] islands2 = {};

        int[][][] flights2 = {};

        ICEEPEECEEE iceepeecee2 = new ICEEPEECEEE(islands, flights);

        ICEEPEECEEE iceepeecee3 = new ICEEPEECEEE(islands2, flights2);

        assertTrue(iceepeecee2.ok());

        iceepeecee.islands();

        assertTrue(iceepeecee2.ok());

    }

    

    @Test

    public void accordingGSshouldReturnEmptyIslands(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300, 300);

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        int[][][] islands2 = {};

        int[][][] flights2 = {};

        ICEEPEECEEE iceepeecee2 = new ICEEPEECEEE(islands, flights);

        ICEEPEECEEE iceepeecee3 = new ICEEPEECEEE(islands2, flights2);

        assertTrue(iceepeecee.ok());

        iceepeecee.islands();

        assertTrue(iceepeecee.ok());

    }

    

    @Test

    public void accordingGSshouldReturnflights(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300, 300);

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        int[][][] islands2 = {};

        int[][][] flights2 = {};

        ICEEPEECEEE iceepeecee2 = new ICEEPEECEEE(islands, flights);

        ICEEPEECEEE iceepeecee3 = new ICEEPEECEEE(islands2, flights2);

        assertTrue(iceepeecee2.ok());

        iceepeecee.flights();

        assertTrue(iceepeecee2.ok());

    }

    

    @Test

    public void accordingGSshouldReturnEmptyVuelos(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300, 300);

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        int[][][] islands2 = {};

        int[][][] flights2 = {};

        ICEEPEECEEE iceepeecee2 = new ICEEPEECEEE(islands, flights);

        ICEEPEECEEE iceepeecee3 = new ICEEPEECEEE(islands2, flights2);

        assertTrue(iceepeecee.ok());

        iceepeecee.flights();

        assertTrue(iceepeecee.ok());

    }

    

    @Test

    public void accordingGSshouldReturnObservedIslands(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300, 300);

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        int[][][] islands2 = {};

        int[][][] flights2 = {};

        ICEEPEECEEE iceepeecee2 = new ICEEPEECEEE(islands, flights);

        ICEEPEECEEE iceepeecee3 = new ICEEPEECEEE(islands2, flights2);

        assertTrue(iceepeecee2.ok());

        iceepeecee2.photograph(50);

        iceepeecee2.makeInvisible();

        assertTrue(iceepeecee2.ok());

        String[] prueba =iceepeecee2.observedIslands();

        assertTrue(iceepeecee2.ok() && prueba.length == 3);

    }

    

    @Test

        public void accordingGSshouldReturnEmptyObservedIslands(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300, 300);

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        int[][][] islands2 = {};

        int[][][] flights2 = {};

        ICEEPEECEEE iceepeecee2 = new ICEEPEECEEE(islands, flights);

        ICEEPEECEEE iceepeecee3 = new ICEEPEECEEE(islands2, flights2);

        assertTrue(iceepeecee2.ok());

        iceepeecee2.photograph(10);

        iceepeecee2.makeInvisible();

        assertTrue(iceepeecee2.ok());

        String[] prueba =iceepeecee2.observedIslands();

        assertTrue(iceepeecee2.ok() && prueba.length == 0);   

    }

    

    @Test

        public void accordingGSshouldnotReturnObservedIslands(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300, 300);

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        int[][][] islands2 = {};

        int[][][] flights2 = {};

        ICEEPEECEEE iceepeecee2 = new ICEEPEECEEE(islands, flights);

        ICEEPEECEEE iceepeecee3 = new ICEEPEECEEE(islands2, flights2);

        //Definimos variables para la isla 

        String color1 = "red";

        int[][] isla1 = {{20,30},{50,50},{10,50}};

        assertTrue(iceepeecee.ok()); // debe poder crear el Iceepeecee

        iceepeecee.addIsland(color1, isla1);

        assertTrue(iceepeecee.ok()); //debe poder aÃ±adir la isla

        iceepeecee.observedIslands();

        assertFalse(iceepeecee.ok());

    }

    

    @Test

    public void accordingGSshouldReturnUselessflights(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300, 300);

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        int[][][] islands2 = {};

        int[][][] flights2 = {};

        ICEEPEECEEE iceepeecee2 = new ICEEPEECEEE(islands, flights);

        ICEEPEECEEE iceepeecee3 = new ICEEPEECEEE(islands2, flights2);

        assertTrue(iceepeecee2.ok());

        iceepeecee2.photograph(50);

        iceepeecee2.makeInvisible();

        assertTrue(iceepeecee2.ok());

        String[] prueba = iceepeecee2.uselessFlights();

        assertTrue(iceepeecee2.ok() && prueba.length == 1);    

    }

    

    @Test

    public void accordingGSshouldReturnEmptyUselessflights(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300, 300);

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        int[][][] islands2 = {};

        int[][][] flights2 = {};

        ICEEPEECEEE iceepeecee2 = new ICEEPEECEEE(islands, flights);

        ICEEPEECEEE iceepeecee3 = new ICEEPEECEEE(islands2, flights2);

        assertTrue(iceepeecee2.ok());

        iceepeecee2.photograph(50);

        iceepeecee2.makeInvisible();

        assertTrue(iceepeecee2.ok());

        String[] prueba = iceepeecee2.uselessFlights();

        assertTrue(iceepeecee2.ok() && prueba.length == 1);

    }

    

    @Test

    public void accordingGSshouldnotReturnUselessflights(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300, 300);

        int[][][] islands = {{{20,30},{50,50},{10,50}},{{40,20},{60,10},{75,20},{60,30}},{{45,60},{55,55},{60,60},{55,65}}};

        int[][][] flights = {{{0,30,20},{78,70,5}},{{55,0,20},{70,60,10}},{{100,130,20},{178,170,5}}};

        int[][][] islands2 = {};

        int[][][] flights2 = {};

        ICEEPEECEEE iceepeecee2 = new ICEEPEECEEE(islands, flights);

        ICEEPEECEEE iceepeecee3 = new ICEEPEECEEE(islands2, flights2);

        //Definimos variables para la isla 

        String color1 = "red";

        String color2 = "blue";

        int[][] vuelo1 = {{0,30,20}, {78,70,5}};

        int[][] vuelo2 = {{70,60,10},{100,130,20}};

        iceepeecee.addFlight(color1,vuelo1[0], vuelo1[1]);

        assertTrue(iceepeecee.ok());

        iceepeecee.addFlight(color2,vuelo2[0], vuelo2[1]);

        assertTrue(iceepeecee.ok()); //Debe verificar que se haya creado correctamente

        iceepeecee.photograph(50);

        assertTrue(iceepeecee.ok());

        iceepeecee.uselessFlights();

        assertFalse(iceepeecee.ok());

        iceepeecee.makeInvisible();

    }

    
// DIAZ - MONROY



    @Test

    public void accordingDMShouldCreateProblemF(){
        color1 = "AA";

        color2 = "DD";

        color3 = "GG";

        color4 = "II";

        islands1 = new int[][][]{{{20,30},{50,50},{10,50}},

                                 {{40,20},{60,10},{75,20},{60,30}},

                                 {{45,60},{55,55},{60,60},{55,65}}};      

        flights1 = new int[][][]{{{0,30,20}, {78,70,5}},

                                 {{55,0,20}, {70,60,10}}};

        polygon1 = new int[][]{{100,110,200},{390,410,395}};

        polygon2 = new int[][]{{590,595,610},{160,180,170}};

        polygon3 = new int[][]{{600,610,700},{390,410,395}};

        polygon4 = new int[][]{{860,950,1000},{450,500,570}};

        to1 = new int[]{20,400,20};

        from1 = new int[]{300,400,60};

        to2 = new int[]{600,100,60};

        from2 = new int[] {600,300,90};

        to3 = new int[]{300,400,20};

        from3 = new int[]{650,700,60};

        to4 = new int[]{20,400,60};

        from4 = new int[] {600,300,90};

        tetaI1 = 20;

        tetaI2 = 60;

        tetaF1 = 47.264f;

        ICEEPEECEEE icpc = new ICEEPEECEEE(islands1, flights1);

        icpc.makeVisible();

    }

    @Test

    public void accordingDMShouldNotCreateProblemFislandsOutOfCanvas(){
        color1 = "AA";

        color2 = "DD";

        color3 = "GG";

        color4 = "II";

        islands1 = new int[][][]{{{20,30},{50,50},{10,50}},

                                 {{40,20},{60,10},{75,20},{60,30}},

                                 {{45,60},{55,55},{60,60},{55,65}}};      

        flights1 = new int[][][]{{{0,30,20}, {78,70,5}},

                                 {{55,0,20}, {70,60,10}}};

        polygon1 = new int[][]{{100,110,200},{390,410,395}};

        polygon2 = new int[][]{{590,595,610},{160,180,170}};

        polygon3 = new int[][]{{600,610,700},{390,410,395}};

        polygon4 = new int[][]{{860,950,1000},{450,500,570}};

        to1 = new int[]{20,400,20};

        from1 = new int[]{300,400,60};

        to2 = new int[]{600,100,60};

        from2 = new int[] {600,300,90};

        to3 = new int[]{300,400,20};

        from3 = new int[]{650,700,60};

        to4 = new int[]{20,400,60};

        from4 = new int[] {600,300,90};

        tetaI1 = 20;

        tetaI2 = 60;

        tetaF1 = 47.264f;

        ICEEPEECEEE icpc = new ICEEPEECEEE(islands1, flights1);

        icpc.addIsland(color1,new int[][]{{10,60,1500},{10,-50,-70}});

        assertFalse(icpc.ok());

    }

@Test

    public void accordingDMShouldPhotographAllFlightsFloat() {
        color1 = "AA";

        color2 = "DD";

        color3 = "GG";

        color4 = "II";

        islands1 = new int[][][]{{{20,30},{50,50},{10,50}},

                                 {{40,20},{60,10},{75,20},{60,30}},

                                 {{45,60},{55,55},{60,60},{55,65}}};      

        flights1 = new int[][][]{{{0,30,20}, {78,70,5}},

                                 {{55,0,20}, {70,60,10}}};

        polygon1 = new int[][]{{100,110,200},{390,410,395}};

        polygon2 = new int[][]{{590,595,610},{160,180,170}};

        polygon3 = new int[][]{{600,610,700},{390,410,395}};

        polygon4 = new int[][]{{860,950,1000},{450,500,570}};

        to1 = new int[]{20,400,20};

        from1 = new int[]{300,400,60};

        to2 = new int[]{600,100,60};

        from2 = new int[] {600,300,90};

        to3 = new int[]{300,400,20};

        from3 = new int[]{650,700,60};

        to4 = new int[]{20,400,60};

        from4 = new int[] {600,300,90};

        tetaI1 = 20;

        tetaI2 = 60;

        tetaF1 = 47.264f;

        ICEEPEECEEE icpc = new ICEEPEECEEE(islands1, flights1);

        icpc.photograph(tetaF1);

        assertTrue(icpc.ok());

        icpc.makeVisible();

    }

    @Test

    public void accordingDMShouldNotPhotographAllFlightsFloat1() {
        color1 = "AA";

        color2 = "DD";

        color3 = "GG";

        color4 = "II";

        islands1 = new int[][][]{{{20,30},{50,50},{10,50}},

                                 {{40,20},{60,10},{75,20},{60,30}},

                                 {{45,60},{55,55},{60,60},{55,65}}};      

        flights1 = new int[][][]{{{0,30,20}, {78,70,5}},

                                 {{55,0,20}, {70,60,10}}};

        polygon1 = new int[][]{{100,110,200},{390,410,395}};

        polygon2 = new int[][]{{590,595,610},{160,180,170}};

        polygon3 = new int[][]{{600,610,700},{390,410,395}};

        polygon4 = new int[][]{{860,950,1000},{450,500,570}};

        to1 = new int[]{20,400,20};

        from1 = new int[]{300,400,60};

        to2 = new int[]{600,100,60};

        from2 = new int[] {600,300,90};

        to3 = new int[]{300,400,20};

        from3 = new int[]{650,700,60};

        to4 = new int[]{20,400,60};

        from4 = new int[] {600,300,90};

        tetaI1 = 20;

        tetaI2 = 60;

        tetaF1 = 47.264f;
        

        ICEEPEECEEE icpc = new ICEEPEECEEE(2000, 2000);

        icpc.addIsland(color1, polygon1);

        icpc.addIsland(color2, polygon2);

        icpc.addIsland(color3, polygon3);

        icpc.photograph(tetaF1);

        assertFalse(icpc.ok());

        icpc.makeVisible();

    }

@Test

    public void accordingDMShouldConsultIslands(){
        //Revisar las islas se intersectan, lo cual no es permitido.

        String color1= "ZA";

        String color2= "AZ";

        String color3= "MZ";

        String color4= "MJ";

        String color5= "JH";

        ICEEPEECEEE icpc = new ICEEPEECEEE(2000, 2000);

        int[][] polygon1 = {{1000,980},{20,60},{950,40}};

        int[][] polygon2 = {{1010,50},{980,80},{1040,90}};

        int[][] polygon3 = {{1100,30},{1200,50},{1150,60}};

        int[][] polygon4 = {{10,20},{60,10},{90,50},{30,70}};

        int[][] polygon5 = {{700,500},{520,603},{460,300}};

        icpc.addIsland(color1, polygon1);

        icpc.addIsland(color2, polygon2);

        icpc.addIsland(color3, polygon3);

        icpc.addIsland(color4, polygon4);

        icpc.addIsland(color5, polygon5);

        String[] colors = {"ZA","AZ","MZ","MJ","JH"};

        assertArrayEquals(colors,icpc.islands());

    }

    @Test

    public void accordingDMShouldNotConsultIslands(){

        String color1= "ZA";

        String color2= "AZ";

        String color3= "MZ";

        String color4= "MJ";

        String color5= "JH";

        ICEEPEECEEE icpc = new ICEEPEECEEE(2000, 2000);

        int[][] polygon1 = {{1000,980,950},{20,60,40}};

        int[][] polygon2 = {{1010,980,1040,1060},{50,80,90,70}};

        int[][] polygon3 = {{1100,1200,1150},{30,50,60}};

        int[][] polygon4 = {{10,60,90,30},{20,10,50,70}};

        int[][] polygon5 = {{700,520,460},{500,603,300}};

        icpc.addIsland(color1, polygon1);

        icpc.addIsland(color2, polygon2);

        icpc.addIsland(color3, polygon3);

        icpc.addIsland(color4, polygon4);

        icpc.addIsland(color5, polygon5);

        String[] colors = {"ZA","AZ","MK","MJ","JH"};

        assertFalse(Arrays.equals(colors,icpc.islands()));

    }

    @Test

    public void accordingDMShouldConsultFlights(){

        String color1= "ZA";

        String color2= "AZ";

        String color3= "MZ";

        ICEEPEECEEE icpc = new ICEEPEECEEE(2000, 2000);

        int[] from1 = {300,500,30};

        int[] to1 = {720,200,60};

        int[] from2 = {360,380,20};

        int[] to2 = {90,60,120};

        int[] from3 = {300,700,40};

        int[] to3 = {500,300,100};

        icpc.addFlight(color1, from1, to1);

        icpc.addFlight(color2, from2, to2);

        icpc.addFlight(color3, from3, to3);

        String[] colors = {"ZA","AZ","MZ"};

        assertArrayEquals(colors,icpc.flights());

    }

    @Test

    public void accordingDMShouldNotConsultFlights(){

        String color1= "ZA";

        String color2= "AZ";

        String color3= "MZ";

        ICEEPEECEEE icpc = new ICEEPEECEEE(2000, 2000);

        int[] from1 = {300,500,30};

        int[] to1 = {720,200,60};

        int[] from2 = {360,380,20};

        int[] to2 = {90,60,120};

        int[] from3 = {300,700,40};

        int[] to3 = {500,300,100};

        icpc.addFlight(color1, from1, to1);

        icpc.addFlight(color2, from2, to2);

        icpc.addFlight(color3, from3, to3);

        String[] colors = {"ZP","AZ","MZ"};

        assertFalse(Arrays.equals(colors,icpc.flights()));

    }

@Test

    public void shouldConsultObservedIslands(){
        String color1= "ZA";

        String color2= "AZ";

        String color3= "MZ";

        ICEEPEECEEE icpc = new ICEEPEECEEE(2000, 2000);

        int[] from1 = {300,500,30};

        int[] to1 = {720,200,60};

        int[] from2 = {360,380,20};

        int[] to2 = {90,60,120};

        int[] from3 = {300,700,40};

        int[] to3 = {500,300,100};
        int[][] polygon1 = {{1000,980,950},{20,60,40}};
        int[][] polygon2 = {{1010,980,1040,1060},{50,80,90,70}};

        icpc.addIsland(color1, polygon1);

        icpc.addIsland(color2, polygon2);

        icpc.addFlight(color3, from1, to1);

        icpc.addFlight(color4, from2, to2);

        icpc.photograph(color3, tetaI1);

        icpc.photograph(color4, tetaI1);

        String[] colors = {"AA","DD"};

        assertArrayEquals(colors,icpc.observedIslands());

    }

    @Test

    public void shouldNotConsultObservedIslands(){

        ICEEPEECEEE icpc = new ICEEPEECEEE(2000, 2000);
        String color1= "ZA";

        String color2= "AZ";

        String color3= "MZ";


        int[] from1 = {300,500,30};

        int[] to1 = {720,200,60};

        int[] from2 = {360,380,20};

        int[] to2 = {90,60,120};

        int[] from3 = {300,700,40};

        int[] to3 = {500,300,100};
        int[][] polygon1 = {{1000,980,950},{20,60,40}};
        int[][] polygon2 = {{1010,980,1040,1060},{50,80,90,70}};

        icpc.addIsland(color1, polygon1);

        icpc.addIsland(color2, polygon2);

        icpc.addFlight(color3, from1, to1);

        icpc.addFlight(color4, from2, to2);

        icpc.photograph(color3, tetaI1);

        icpc.photograph(color4, tetaI1);

        String[] colors = {"AD","DD"};

        assertFalse(Arrays.equals(colors,icpc.observedIslands()));

    }

    @Test

    public void shouldConsultUselessFlights(){

        ICEEPEECEEE icpc = new ICEEPEECEEE(2000, 2000);

        icpc.addIsland(color1, polygon3);

        icpc.addIsland(color2, polygon4);

        icpc.addFlight(color3, from3, to3);

        icpc.addFlight(color4, from4, to4);

        icpc.photograph(color3, tetaI1);

        icpc.photograph(color4, tetaI1);

        String[] colors = {"GG","II"};

        assertArrayEquals(colors,icpc.uselessFlights());

    }

    @Test

    public void shouldNotConsultUselessFlights(){

        ICEEPEECEEE icpc = new ICEEPEECEEE(2000, 2000);

        icpc.addIsland(color1, polygon3);

        icpc.addIsland(color2, polygon4);

        icpc.addFlight(color3, from3, to3);

        icpc.addFlight(color4, from4, to4);

        icpc.photograph(color3, tetaI1);

        icpc.photograph(color4, tetaI1);

        String[] colors = {"GI","GI"};

        assertFalse(Arrays.equals(colors,icpc.uselessFlights()));

    }



// Mendivelso-Rodriguez

     //ciclo 2

    @Test

    public void shouldTestPhotograph2() {
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        String color = "orange";

        int[] from = {10, 10,10};

        int[] to = {20, 20,20};

        int cameraAngle = 90;

        Icep_2.addFlight(color, from, to);

        float teta = 3.14159f;

        Icep_2.photograph(color, teta);



        // Verificar la zona fotografiada
        try{
            Flight f = Icep_2.getFlight(color);

            Photograph photo = f.getCamera();

            assertNotNull(photo);

            assertArrayEquals(from, f.getFrom());

            assertArrayEquals(to, f.getto()); 
        }catch(IceepeeceeExcepcion e){
            
        }
               

    }

    

    @Test

    public void shouldTestPhotograph3() {
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        String color = "yellow";

        int[] from = {10, 10,10};

        int[] to = {20, 20,20};

        int cameraAngle = 90;

        Icep_2.addFlight(color, from, to);

        int teta = 63;

        Icep_2.photograph(color, teta);



        // Verificar la zona fotografiada
        
        try{
            Flight f = Icep_2.getFlight(color);
            Photograph photo = f.getCamera();

            assertNotNull(photo);

            assertArrayEquals(from, f.getFrom());

            assertArrayEquals(to, f.getto());
        }catch(IceepeeceeExcepcion e){
            
        }
        

        //assertEquals(teta, (float)photo.getteta());

    }

    

    @Test

    public void shouldPhotograph5(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        int[]from={10,15,13}; 

        int[]to={56,70,95};

        int[]from2={55,50,36};

        int[]to2={80,60,70};

        Icep_2.addFlight("red",from,to);

        Icep_2.addFlight("yellow",from2,to2);

        Icep_2.photograph(63.1f);

        assertTrue(Icep_2.ok());

    }

    

    @Test

    public void shouldPhotograph6(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        int[]from={10,15,13}; 

        int[]to={56,70,95};

        int[]from2={55,50,36};

        int[]to2={80,60,70};

        Icep_2.addFlight("red",from,to);

        Icep_2.addFlight("yellow",from2,to2);

        Icep_2.photograph(63.1f);

        Icep_2.photograph(23.1f);

        assertTrue(Icep_2.ok());

    }

    

    @Test

    public void shouldnotPhotograph4(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        int[]from={10,15,13}; 

        int[]to={56,70,95};

        String color="green";

        Icep_2.photograph(23.1f);

        assertFalse(Icep_2.ok());

    }

    

    @Test

    public void shouldnotPhotograph5(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        int[]from={10,15,13}; 

        int[]to={56,70,95};

        int[]from2={55,50,36};

        int[]to2={80,60,70};

        Icep_2.addFlight("red",from,to);

        Icep_2.addFlight("yellow",from2,to2);

        Icep_2.photograph(-63.1f);

        assertFalse(Icep_2.ok());

    }

    

    @Test

    public void ShouldConsultIslands(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        int[][] vertix ={{29,70},{60,50},{90,50}};

        Icep_2.addIsland("green",vertix);

        Icep_2.islands();

        assertTrue(Icep_2.ok());

    }

    

    @Test

    public void ShouldConsultIslands2(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        int[][] vertix ={{29,70},{60,50},{90,50}};

        int[][]vertix2={{85,45},{95,45},{15,35}};

        int[][]vertix3={{47,20},{60,17},{75,28},{60,37}};

        Icep_2.addIsland("white",vertix);

        Icep_2.addIsland("red",vertix2);

        Icep_2.addIsland("orange",vertix3);

        Icep_2.islands();

        assertTrue(Icep_2.ok());

    }

    

    @Test

    public void ShouldnotConsultIslands(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        assertEquals(0,Icep_2.islands().length);

    }

    

    @Test

    public void ShouldConsultFlights(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        int[] from = {20,20,30};

        int[] to = {10,10,40};

        Icep_2.addFlight("green",from,to);

        Icep_2.flights();

        assertTrue(Icep_2.ok());

    }

    

    @Test

    public void ShouldConsultFlight2(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        int[]from={10,15,13}; 

        int[]to={56,70,95};

        int[]from2={55,50,36};

        int[]to2={80,60,70};

        int[]from3={105,30,50};

        int[]to3={18,70,50};

        Icep_2.addFlight("red",from,to);

        Icep_2.addFlight("white",from2,to2);

        Icep_2.addFlight("yellow",from3,to3);

        Icep_2.flights();

        assertTrue(Icep_2.ok());

    }

    

    @Test

    public void ShouldnotConsultFlights(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        Icep_2.flights();

        assertFalse(Icep_2.ok());

    }

    

    @Test

    public void ShouldbservedIslands(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        Icep_2.observedIslands();

        assertTrue(Icep_2.ok());

    }

    

    public void ShouldObservedIslands3(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        int[][]vertix={{20,30},{50,50},{10,50}};

        int[][]vertix2={{15,45},{45,45},{25,35}};

        int[]from={0,30,20}; 

        int[]to={78,70,5};

        Icep_2.addIsland("red",vertix);

        Icep_2.addIsland("yellow",vertix2);

        Icep_2.addFlight("black",from,to);

        Icep_2.photograph(60);

        Icep_2.observedIslands();

        assertTrue(Icep_2.ok());  

    }

    

    public void ShouldObservedIslands4(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        int[][]vertix={{20,30},{50,50},{10,50}};

        int[][]vertix2={{15,45},{45,45},{25,35}};

        int[][]vertix3={{15,55},{75,45},{15,35}};

        Icep_2.addIsland("red",vertix);

        Icep_2.addIsland("green",vertix2);

        Icep_2.addIsland("orange",vertix3);

        int[]from={0,30,89}; 

        int[]to={45,0,5};

        int[]from2={55,50,20};

        int[]to2={40,68,10};

        int[]from3={100,50,9};

        int[]to3={16,180,45};

        Icep_2.addFlight("yellow",from,to);

        Icep_2.addFlight("gray",from2,to2);

        Icep_2.addFlight("purple",from3,to3);

        Icep_2.observedIslands();

        assertTrue(Icep_2.ok());

    }

    

    public void ShouldUselessFlight4(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        Icep_2.uselessFlights();

        assertTrue(Icep_2.ok());

    }

    

    public void ShouldUselessFlights4(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        int[][]vertix={{46,50},{70,50},{71,20},{67,12}};

        Icep_2.addIsland("blue",vertix);

        int[]from={18,100,26};

        int[]to={12,100,50};

        Icep_2.addFlight("yellow",from,to);

        Icep_2.uselessFlights();

        assertTrue(Icep_2.ok());

    }

    

    public void ShouldUselessFlights5(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        int[][]vertix ={{98,78},{50,50},{40,60}};

        int[][]vertix2={{15,45},{45,45},{25,35}};

        int[][]vertix3={{40,20},{60,10},{75,20},{60,30}};

        Icep_2.addIsland("blue",vertix);

        Icep_2.addIsland("yellow",vertix2);

        Icep_2.addIsland("orange",vertix3);

        int[]from={40,38,70}; 

        int[]to={98,70,50};

        int[]from2={55,0,20};

        int[]to2={80,40,1};

        int[]from3={56,140,80};

        int[]to3={18,100,50};

        Icep_2.addFlight("gray",from,to);

        Icep_2.addFlight("pink",from2,to2);

        Icep_2.addFlight("magenta",from3,to3);

        Icep_2.uselessFlights();

        assertTrue(Icep_2.ok());

    }

    

    @Test

    public void shouldgetUseless3(){
        ICEEPEECEEE Icep_2= new ICEEPEECEEE(200,200);

        int[][] vertix = {{100,20},{80,40},{30,20}};

        Icep_2.addIsland("red",vertix);

        int[] from = {80,40,50};

        int[] to = {30,30,20};

        

        Icep_2.addFlight("blue",from,to);

        Icep_2.photograph("blue",30);

        assertTrue(Icep_2.uselessFlights().length > 0);   

    }   


// Montero-Villamizar

@Test

    public void ShouldObservedIslands5(){ 
        ICEEPEECEEE ip= new ICEEPEECEEE(200,200);

        int[][] vertices = {{20, 20}, {100, 50}, {80, 30}};



        int[] from = {20, 20, 10};

        int[] to = {50, 10, 15};



        ip.addIsland("blue",vertices);

        ip.addFlight("black",from,to);



        ip.photograph(60);



        ip.observedIslands();



        assertTrue(ip.ok());  



    }



    

    @Test

       public void ShouldUselessFlights6(){
        ICEEPEECEEE ip= new ICEEPEECEEE(200,200);

        ip.uselessFlights();

        assertTrue(ip.ok());



    }

    

    @Test

    public void ShouldUselessFlights7(){
        ICEEPEECEEE ip= new ICEEPEECEEE(200,200);

        int[][] vertices={{46,50},{70,50},{71,20},{67,12}};

    

        ip.addIsland("red",vertices);

    

        int[]from={18,100,26};

    

        int[]to={12,100,50};

    

        ip.addFlight("black",from,to);

    

        ip.uselessFlights();

    

        assertTrue(ip.ok());

    }

    

    

    @Test



    public void shouldPhotograph() {

        ICEEPEECEEE simulator = new ICEEPEECEEE(100, 100);

        String color = "red";

        int[] from = {20, 20, 10};

        int[] to = {50, 10, 15};

        simulator.addFlight("blue", from, to);

        simulator.photograph(60);

        assertTrue(simulator.ok());

    }

    

    

    @Test



    public void shouldNotPhotograph() {

        ICEEPEECEEE simulator = new ICEEPEECEEE(100, 100);

        String color = "red";

        int[] from = {20, 20, 10};

        int[] to = {50, 10, 15};

        simulator.addFlight("blue", from, to);

        simulator.photograph(100);

        assertFalse(simulator.ok());

    }

    

    

    @Test



    public void shouldMakePhotoWithNoIntAngle() {
        ICEEPEECEEE ip= new ICEEPEECEEE(200,200);

        ip.addFlight("red", new int[]{0, 0, 0}, new int[]{1, 1, 1});

        ip.photograph("red", 45.5f);

        assertTrue(ip.ok());        

    }

    

    

    @Test



    public void shouldNotAddCameraWithNoIntAngle() {
        ICEEPEECEEE ip= new ICEEPEECEEE(200,200);

        ip.addFlight("red", new int[]{0, 0, 0}, new int[]{1, 1, 1});

        ip.photograph("red", -45.5f);

        assertFalse(ip.ok());  

    }

    

    

    @Test

    public void shouldConsultIslandsAndFlights() {
        ICEEPEECEEE ip= new ICEEPEECEEE(200,200);

        int[][] vertices={{10,10},{60,30},{20,20}};



        ip.addIsland("blue",vertices);

        

        int[]from={18,100,26};

        int[]to={12,100,50};

        ip.addFlight("black",from,to);



        ip.islands();

        ip.flights();



        assertTrue(ip.ok());

    }

    

    

    @Test

    public void shouldNotConsultIslandsAndFlights() {
        ICEEPEECEEE ip= new ICEEPEECEEE(200,200);

        ip.islands();

        ip.flights();

        

        assertFalse(ip.ok());

    }

    

    @Test

    public void shouldConsultsIslandsInPhotographs(){
        ICEEPEECEEE ip= new ICEEPEECEEE(200,200);

        int[][] vertices1 = {{100, 100}, {200, 100}, {150, 200}};

        int[][] vertices2 = {{300, 300}, {400, 300}, {350, 400}};

        int[][] vertices3 = {{500, 500}, {600, 500}, {550, 600}};

        ip.addIsland("red", vertices1);

        ip.addIsland("blue", vertices2);

        ip.addIsland("green", vertices3);



        int[] from1 = {125, 125, 100};

        int[] to1 = {325, 325, 100};

        int[] from2 = {425, 425, 100};

        int[] to2 = {625, 625, 100};

        ip.addFlight("black", from1, to1);

        ip.addFlight("pink", from2, to2);



        ip.observedIslands();

        assertTrue(ip.ok());

    }

    

    @Test

    public void shouldNotConsultsIslandsInPhotographs(){
        ICEEPEECEEE ip= new ICEEPEECEEE(200,200);

        int[][] vertices1 = {{100, 100}, {200, 100}, {150, 200}};

        int[][] vertices2 = {{300, 300}, {400, 300}, {350, 400}};

        int[][] vertices3 = {{500, 500}, {600, 500}, {550, 600}};

        ip.addIsland("red", vertices1);

        ip.addIsland("blue", vertices2);

        ip.addIsland("green", vertices3);



        int[] from = {5, 5, 10};

        int[] to = {10, 15, 20};

        ip.addFlight("black", from, to);



        ip.observedIslands();

        assertFalse(ip.ok());

    }

    

    @Test

    public void shouldConsultUselessFlights2(){
        ICEEPEECEEE ip= new ICEEPEECEEE(200,200);

        ip.uselessFlights();

        assertFalse(ip.ok());

    }

//Robinson - Yaya

    @Test

    public void ShouldAllowNonIntegerCameraAngles() {
        ICEEPEECEEE icp= new ICEEPEECEEE(200,200);

        icp.addFlight("blue", new int[]{3, 5, 6}, new int[]{7, 4, 8});

            icp.photograph(69.9f);

            assertTrue(icp.ok());

    }

    

    @Test

    public void ShouldNotAllowNonIntegerCameraAngles() {
        ICEEPEECEEE icp= new ICEEPEECEEE(200,200);

        icp.addFlight("blue", new int[]{3, 5, 6}, new int[]{7, 4, 8});

            icp.photograph(-87.f);

            assertFalse(icp.ok());

    }



    @Test

    public void ShouldAllowQueryAllIslandsAndFlights() {
        ICEEPEECEEE icp= new ICEEPEECEEE(200,200);

        // Agregar algunas islas y vuelos

        icp.addIsland("red", new int[][]{{50, 50}, {60, 50}, {60, 60}});

        icp.addFlight("blue", new int[]{50, 50, 0}, new int[]{100, 100, 0});

    

        // Consultar todas las islas y vuelos

        String[] allIslands = icp.islands();

        String[] allFlights = icp.flights();

    

        // Verificar que las islas y vuelos se hayan consultado correctamente

        assertEquals(1, allIslands.length);

        assertEquals(1, allFlights.length);

        assertEquals("red", allIslands[0]);

        assertEquals("blue", allFlights[0]);

    }

    

    @Test

    public void ShouldNotAllowQueryAllIslandsAndFlights() {
        ICEEPEECEEE icp= new ICEEPEECEEE(200,200);

        // Consultar todas las islas y vuelos antes de agregar ninguno

        String[] allIslands = icp.islands();

        String[] allFlights = icp.flights();

    

        // Verificar que los arreglos estén vacíos

        assertEquals(0, allIslands.length);

        assertEquals(0, allFlights.length);

    }

    

    @Test

    public void ShouldAllowQueryIslandsInPhotographs() {
        ICEEPEECEEE icp= new ICEEPEECEEE(200,200);
        // Agregar una isla y un vuelo

        icp.addIsland("red", new int[][]{{50, 50}, {60, 50}, {60, 60}});

        icp.addFlight("blue", new int[]{50, 50, 0}, new int[]{100, 100, 0});

        // Fotografiar la isla registrada por el vuelo

        icp.photograph(45.0f);


        // Consultar las islas registradas en las fotografías

        String[] observedIslands = icp.observedIslands();

        assertTrue(icp.ok());

    }

    

    @Test

    public void ShouldNotAllowQueryIslandsInPhotographs() {
        ICEEPEECEEE icp= new ICEEPEECEEE(200,200);

    

        // Agregar una isla y un vuelo

        icp.addIsland("red", new int[][]{{50, 50}, {60, 50}, {60, 60}});

        icp.addFlight("blue", new int[]{50, 50, 0}, new int[]{100, 100, 0});

    

        // No fotografiar la isla registrada por el vuelo

    

        // Consultar las islas registradas en las fotografías

        String[] observedIslands = icp.observedIslands();

        assertFalse(icp.ok());

    }

    

    @Test

    public void ShouldAllowQueryUselessFlights() {
        ICEEPEECEEE icp= new ICEEPEECEEE(200,200);

        // Agregar una isla y dos vuelos

        icp.addIsland("red", new int[][]{{50, 50}, {60, 50}, {60, 60}});

        icp.addFlight("blue", new int[]{50, 50, 0}, new int[]{100, 100, 0});

        icp.addFlight("green", new int[]{70, 70, 0}, new int[]{120, 120, 0});

    

        // Fotografiar la isla registrada por el vuelo "blue"

        icp.photograph(45.0f);

    

        // Consultar los vuelos con fotografías inútiles

        String[] uselessFlights = icp.uselessFlights();

        assertTrue(icp.ok());



      

    }

    

    @Test

    public void ShouldNotAllowQueryUselessFlights() {
        ICEEPEECEEE icp= new ICEEPEECEEE(200,200);

        // Agregar una isla y un vuelo

        icp.addIsland("red", new int[][]{{50, 50}, {60, 50}, {60, 60}});

        icp.addFlight("blue", new int[]{50, 50, 0}, new int[]{100, 100, 0});

    

        // Fotografiar la isla registrada por el vuelo "blue"

        icp.photograph(45.0f);

    

        // Consultar los vuelos con fotografías inútiles antes de agregar otro vuelo

        String[] uselessFlights1 = icp.uselessFlights();

    

        // Agregar otro vuelo

        icp.addFlight("green", new int[]{70, 70, 0}, new int[]{120, 120, 0});

    

        // Consultar los vuelos con fotografías inútiles después de agregar otro vuelo

        String[] uselessFlights2 = icp.uselessFlights();

        assertFalse(icp.ok());

        

        

    }

//A.MARTINEZ - RAMIREZ

    @Test

    public void testConstructorSuccess() {

        // Prueba que pasará

        int[][][] newIslands = {{{0, 0}, {0, 1}, {1, 1}, {1, 0}}};

        int[][][] newFlights = {{{0, 0, 0}, {1, 1, 0}}};

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(newIslands, newFlights);

        assertEquals(1, iceepeecee.islands().length);

        assertEquals(1, iceepeecee.flights().length);

        assertTrue(iceepeecee.ok());

    }

    @Test

    public void testConstructorFailure() {
    

        // Prueba que fallará

        int[][][] newIslands = null;

        int[][][] newFlights = null;

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(newIslands, newFlights);

        assertEquals(0, iceepeecee.islands().length);

        assertEquals(0, iceepeecee.flights().length);

        assertFalse(iceepeecee.ok());

    }

    

    @Test

    public void testPhotographAllFlightsSuccess() {

        // Prueba que pasará

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(10, 10);

        int[] from = {0, 0, 10};

        int[] to = {1, 1, 10};

        iceepeecee.addFlight("Red", from, to);

        iceepeecee.addFlight("Blue", from, to);

        iceepeecee.photograph(45.0f);

        assertTrue(iceepeecee.ok());

    }

    @Test

    public void testPhotographAllFlightsFailure() {

        // Prueba que fallará

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(10, 10);

        int[] from = {0, 0, 10};

        int[] to = {1, 1, 10};

        iceepeecee.addFlight("Red", from, to);

        iceepeecee.addFlight("Blue", from, to);

        iceepeecee.photograph(95.0f);

        assertFalse(iceepeecee.ok());

    }

    

    @Test

    public void testIslandsSuccess() {

        // Prueba que pasará

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(10, 10);

        int[][] coordinates = {{0, 0}, {0, 1}, {1, 1}, {1, 0}};

        iceepeecee.addIsland("Red", coordinates);

        iceepeecee.addIsland("Blue", coordinates);

        String[] islands = iceepeecee.islands();

        assertEquals(2, islands.length);

        assertTrue(iceepeecee.ok());

    }

    @Test

    public void testIslandsFailure() {

        // Prueba que fallará

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(10, 10);

        String[] islands = iceepeecee.islands();

        assertEquals(0, islands.length);

        assertFalse(iceepeecee.ok());

    }

    

    @Test

    public void testFligthsSuccess() {

        // Prueba que pasará

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(10, 10);

        int[] from = {0, 0, 10};

        int[] to = {1, 1, 10};

        iceepeecee.addFlight("Red", from, to);

        iceepeecee.addFlight("Blue", from, to);

        String[] fligths = iceepeecee.flights();

        assertEquals(2, fligths.length);

        assertTrue(iceepeecee.ok());

    }

    @Test

    public void testFligthsFailure() {

        // Prueba que fallará

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(10, 10);

        String[] fligths = iceepeecee.flights();

        assertEquals(0, fligths.length);

        assertFalse(iceepeecee.ok());

    }

    

    @Test

    public void testObservedIslandsSuccess() {

        // Prueba que pasará

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(10, 10);

        int[][] coordinates = {{0, 0}, {0, 1}, {1, 1}, {1, 0}};

        iceepeecee.addIsland("Red", coordinates);

        iceepeecee.addIsland("Blue", coordinates);

        int[] from = {0, 0, 10};

        int[] to = {1, 1, 10};

        iceepeecee.addFlight("Green", from, to);

        iceepeecee.photograph(45.0f);

        String[] observedIslands = iceepeecee.observedIslands();

        assertEquals(2, observedIslands.length);

    }

    @Test

    public void testObservedIslandsFailure() {

        // Prueba que fallará

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(10, 10);

        String[] observedIslands = iceepeecee.observedIslands();

        assertEquals(0, observedIslands.length);

    }

    

    @Test

    public void testUselessFlightsSuccess() {

        // Prueba que pasará

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(10, 10);

        int[] from = {0, 0, 10};

        int[] to = {1, 1, 10};

        iceepeecee.addFlight("Red", from, to);

        iceepeecee.addFlight("Blue", from, to);

        iceepeecee.photograph(45.0f);

        String[] uselessFlights = iceepeecee.uselessFlights();

        assertEquals(2, uselessFlights.length);

    }

    @Test

    public void testUselessFlightsFailure() {

        // Prueba que fallará

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(10, 10);

        int[][] coordinates = {{0, 0}, {0, 1}, {1, 1}, {1, 0}};

        iceepeecee.addIsland("Green", coordinates);

        int[] from = {0, 0, 10};

        int[] to = {1, 1, 10};

        iceepeecee.addFlight("Red", from, to);

        iceepeecee.addFlight("Blue", from, to);

        iceepeecee.photograph(45.0f);

        String[] uselessFlights = iceepeecee.uselessFlights();

        assertEquals(0, uselessFlights.length);

    }

}


