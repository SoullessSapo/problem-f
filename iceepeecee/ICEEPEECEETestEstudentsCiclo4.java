package iceepeecee;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

/**
 * Write a description of class ICEEPEECEETestEstudentsCiclo4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ICEEPEECEETestEstudentsCiclo4
{
    /*Lesmes*/




//AddFlightLAZY

    @Test

    public void accordingLPShouldTakeOnlyAPhotoLAZY() throws java.lang.reflect.InvocationTargetException{
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {0,30,20};

        int[] to = {78,70,5};

        iceepeecee.addFlight("LazyFlight","#EA3333", from, to);

        iceepeecee.photograph(30);

        iceepeecee.photograph(60);

        assertEquals(30, iceepeecee.flightCamera("#EA3333"));

    }

    @Test

    public void accordingLPNotShouldAddFlightTypeLazy() throws java.lang.reflect.InvocationTargetException {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {0,30,20};

        int[] to = {78,70,5};

        iceepeecee.addFlight("LazyFlight1","#EA3333", from, to);

        assertFalse(iceepeecee.ok());

    }

//AddFlightFLAT

    @Test

    public void accordingLPShouldAddFlightTypeFlat() throws java.lang.reflect.InvocationTargetException {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {0,30,20};

        int[] to = {78,70,5};

        iceepeecee.addFlight("FlatFlight","#EA3333", from, to);

        assertTrue(iceepeecee.ok());

    }

    @Test

    public void accordingLPShouldBeTheSameAltitudeFlat() throws java.lang.reflect.InvocationTargetException {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {0,30,20};

        int[] to = {78,70,5};        

        iceepeecee.addFlight("FlatFlight","#EA3333", from, to);

        int[][]location = iceepeecee.flightLocation("#EA3333");

        assertTrue(location[0][location[0].length-1] == location[1][location[0].length - 1 ]);

    }

//AddIslandFixed

    @Test

    public void accordindLPShouldNotBeDeletedIslandFIXED() throws java.lang.reflect.InvocationTargetException{
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon = {{20,30},{50,50},{10,50}};

        iceepeecee.addIsland("FixedIsland","#EA3333", polygon);

        iceepeecee.delIsland("#EA3333");

        assertEquals(1, iceepeecee.islands().length);

    }

    @Test

    public void accordingLPNotShouldAddIslandTypeFixed() throws java.lang.reflect.InvocationTargetException {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon = {{20,30},{50,50},{10,50}};

        iceepeecee.addIsland("FixedIsland9","#EA3333", polygon);

        assertFalse(iceepeecee.ok());

    }

//AddIslandSurprising

    @Test

    public void accordindLPShouldBeLessPointsSurprising() throws java.lang.reflect.InvocationTargetException{
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon = {{20,30},{50,50},{10,50},{40,30}};

        iceepeecee.addIsland("iceepeecee.Surprising","#EA3333", polygon);

        assertEquals(3, iceepeecee.islandLocation("#EA3333").length);

    }

    @Test

    public void accordingLPNotShouldAddIslandTypeSurprising() throws java.lang.reflect.InvocationTargetException {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon = {{20,30},{50,50},{10,50}};

        iceepeecee.addIsland("SurprisingIsland0","#EA3333", polygon);

        assertFalse(iceepeecee.ok());

    }

/********/



//Forero-Murcia

@Test

    public void accordingFMShouldAddNormalIslandThatHaveNormalLocationAndCanBeDeleted() {
        ICEEPEECEEE manage = new ICEEPEECEEE(500,500);

        int [][] location = {{0,0},{50,50},{100,50}};

        manage.addIsland("iceepeecee.NormalIsland","Red",location);

        assertTrue(manage.ok());

        int [][] newLocation = manage.islandLocation("Red");

        for (int i = 0 ; i < location.length ;i++){

            assertEquals(location[i][0],newLocation[i][0]);

            assertEquals(location[i][1],newLocation[i][1]);

        }

        assertTrue(manage.ok());

        manage.delIsland("Red");

        assertTrue(manage.ok());

    }

    

    @Test

    public void accordingFMShouldAddFixedIslandThatCantBeDeleted() {
        ICEEPEECEEE manage = new ICEEPEECEEE(500,500);

        manage.addIsland("iceepeecee.Fixed","Red",new int[][]{{0,0},{50,50},{100,50}});

        assertTrue(manage.ok());

        manage.delIsland("Red");

        assertFalse(manage.ok());

    }

    

    @Test

    public void accordingFMShouldAddSurprisingThatModifyTheLocation() {
        ICEEPEECEEE manage = new ICEEPEECEEE(500,500);

        int [][] location = {{0,0},{50,0},{50,50},{25,60},{0,50}};

        manage.addIsland("iceepeecee.Surprising","Red",location);

        assertTrue(manage.ok());

        assertTrue(manage.ok());

        manage.islandLocation("Red");

        manage.islandLocation("Red");

    }

    @Test

    public void accordingFMShouldAddNormalFlightPassingTheTypeThatCanMakeManyPhotos() {
        ICEEPEECEEE manage = new ICEEPEECEEE(500,500);

        int[] from = {0,0,20};

        int[] to = {20,20,40};

        manage.addFlight("iceepeecee.NormalFlight","Red",from,to);

        assertTrue(manage.ok());

        manage.photograph("Red",45);

        assertTrue(manage.ok());

        manage.photograph("Red",70);

        assertTrue(manage.ok());

        manage.photograph("Red",15);

        assertTrue(manage.ok());

    }

    

    @Test

    public void accordingFMShouldNotAddFlatFlightPassingTheTypeThatGainOrLoseHeight() {
        ICEEPEECEEE manage = new ICEEPEECEEE(500,500);

        int[] from = {0,0,20};

        int[] to = {20,20,30};

        manage.addFlight("iceepeecee.Flat","Red",from,to);

        assertFalse(manage.ok());

        to = new int[]{20,20,10};

        manage.addFlight("iceepeecee.Flat","Red",from,to);

        assertFalse(manage.ok());

    }

    

    @Test

    public void accordingFMShouldAddLazyFlightPassingTheTypeThatOnlyCantTakeOnePhoto() {
        ICEEPEECEEE manage = new ICEEPEECEEE(500,500);

        int[] from = {0,0,20};

        int[] to = {20,20,40};

        manage.addFlight("lazy","Red",from,to);

        assertTrue(manage.ok());

        manage.photograph("Red",45);

        assertTrue(manage.ok());

        manage.photograph("Red",70);

        assertFalse(manage.ok());

        manage.photograph("Red",15);

        assertFalse(manage.ok());

    }



//CASALLAS-MURCIA

//CICLO 4



@Test

    public void accordingCMShouldSurprisingIslandLessPoints(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon = {{20,30},{50,50},{10,50},{40,30}};

        iceepeecee.addIsland("iceepeecee.Surprising","green", polygon);

        assertEquals(3, iceepeecee.islandLocation("green").length);

    }



@Test

    public void accordingCMShouldNotAddSurprisingIslandDuplicateColor() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[][] polygon1 = {{10, 10}, {20, 10}, {20, 20}, {10, 20}};

        int[][] polygon2 = {{30, 30}, {40, 30}, {40, 40}, {30, 40}};

        

        iceepeecee.addIsland("iceepeecee.Surprising","white", polygon1);

        iceepeecee.addIsland("iceepeecee.Surprising","white", polygon2);

        assertFalse(iceepeecee.ok());

    }



@Test

    public void accordingCMShouldFlatFlightSameAltitude2(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {0,30,20};

        int[] to = {78,70,5};

        iceepeecee.addFlight("iceepeecee.Flat","#CD5C5C",from,to);

        int altitude = iceepeecee.flightLocation("#CD5C5C")[1][2];

        assertTrue(from[2]==altitude);

    }

@Test

    public void accordingCMShouldNotAddFlatFlightWithLessThanThreeCoordinates(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[] from1 = {100,100};

        int[] to1 = {700,780};

        iceepeecee.addFlight("iceepeecee.Flat","#FF0000",from1,to1);

        assertFalse(iceepeecee.ok());

    }    
//Chicuazuque-Sierra

@Test

    public void agregarIslasPorTipoCorrectamenteChicuazuqueSierra()throws Exception{
        ICEEPEECEEE input1 = new ICEEPEECEEE(100, 100);

        input1.addIsland("iceepeecee.NormalIsland","blue", new int[][]{{20, 30}, {50, 50}, {10, 50}});

        assertTrue(input1.ok());

        input1.addIsland("iceepeecee.Surprising","green", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});

        assertTrue(input1.ok());

        input1.addIsland("iceepeecee.Fixed","red", new int[][]{{45, 60}, {55, 55}, {60, 60}, {55, 65}});

        assertTrue(input1.ok());

        input1.makeVisible();

    }

    



    @Test

    public void agregarIslasPorTipoIncorrectamenteChicuazuqueSierra() throws Exception {
        ICEEPEECEEE input1 = new ICEEPEECEEE(100, 100);

        input1.addIsland("noexiste","blue", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});

        assertFalse(input1.ok());

    }

    

    @Test

    public void agregarVueloPorTipoCorrectamenteChicuazuqueSierra() throws Exception{
        ICEEPEECEEE input1 = new ICEEPEECEEE(100, 100);

        input1.addFlight("iceepeecee.NormalFlight","fligth1", new int[]{0, 30, 20}, new int[]{78, 70, 5});

        assertTrue(input1.ok());

        input1.addFlight("iceepeecee.Lazy","fligth2", new int[]{55, 0, 20}, new int[]{70, 60, 10});

        assertTrue(input1.ok());

        input1.addFlight("iceepeecee.Flat","fligth2", new int[]{10, 0, 20}, new int[]{20, 30, 20});

        assertTrue(input1.ok());

        

    }

    

    @Test

    public void agregarVueloPorTipoIncorrectamenteChicuazuqueSierra() throws Exception{
        ICEEPEECEEE input1 = new ICEEPEECEEE(100, 100);

        input1.addFlight("Noexiste","fligth1", new int[]{0, 30, 20}, new int[]{78, 70, 5});

        assertFalse(input1.ok());

    }

    

    @Test

    public void ConsultarDosVecesUnaIslaSurprisingChicuazuqueSierra() throws Exception{
       ICEEPEECEEE input1 = new ICEEPEECEEE(100, 100);

        input1.addIsland("iceepeecee.Surprising","green", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});

        input1.islandLocation("green");

        input1.makeVisible();

    }

    

    @Test

    public void tomarDosFotosParaUnVueloLazyChicuazuqueSierra() throws Exception{
        ICEEPEECEEE input1 = new ICEEPEECEEE(100, 100);

        input1.addFlight("iceepeecee.Lazy","fligth2", new int[]{55, 0, 20}, new int[]{70, 60, 10});

        input1.photograph(10);

        input1.photograph(40);

        input1.makeVisible();

    }


//Silva-Suarez: 

@Test

    public void shouldNewAddIsland() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(100, 100);

        String color = "Blue";

        int[][] polygons = {{1, 1}, {2, 2}, {3, 3}};



        iceepeecee.addIsland("iceepeecee.NormalIsland", color, polygons);

        assertTrue(iceepeecee.ok());



        iceepeecee.addIsland("iceepeecee.Fixed", color, polygons);

        assertFalse(iceepeecee.ok());



        iceepeecee.addIsland("iceepeecee.Surprising", color, polygons);

        assertFalse(iceepeecee.ok());

    }

    

     @Test

    public void shouldNotAddIslandWithExistingColor() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(100, 100);

        String color = "Green";

        int[][] polygons = {{1, 1}, {2, 2}, {3, 3}};

    

        iceepeecee.addIsland("iceepeecee.NormalIsland", color, polygons);

        assertTrue(iceepeecee.ok());



        iceepeecee.addIsland("iceepeecee.Fixed", color, polygons);

        assertFalse(iceepeecee.ok()); 

    }

    

    @Test

    public void shouldAddNewFlight() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(100, 100);

        String color1 = "Red";

        String color2 = "Blue";

        String color3 = "Green";

        int[] from = {10, 10, 10};

        int[] to = {20, 20, 20};



        iceepeecee.addFlight("iceepeecee.Flat", color1, from, to);

        assertTrue(iceepeecee.ok());



        iceepeecee.addFlight("iceepeecee.Lazy", color2, from, to);

        assertTrue(iceepeecee.ok());



        iceepeecee.addFlight("iceepeecee.NormalFlight", color3, from, to);

        assertTrue(iceepeecee.ok());

    }



    @Test

    public void shouldNotAddFlightWithExistingColor() {
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(100, 100);


        String color = "red";

        int[] from1 = {10, 10, 10};

        int[] to1 = {20, 20, 20};

        int[] from2 = {60, 10, 10};

        int[] to2 = {50, 20, 20};



        iceepeecee.addFlight("iceepeecee.Flat", color, from1, to1);

        iceepeecee.addFlight("iceepeecee.Lazy", color, from2, to2);

        assertFalse(iceepeecee.ok()); 

    }



//MILTON ANDRES GUTIERREZ - JHON SEBASTIAN SOSA



    @Test

    public void accordingGSsholdAddEveryTypeOfNewIsland(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300,300);

        iceepeecee.addIsland("iceepeecee.NormalIsland", "#FFFFFF", new int[][]{{20,30},{50,50},{10,50}});

        assertTrue(iceepeecee.ok());

        assertEquals(iceepeecee.islands().length, 1);

        iceepeecee.addIsland("iceepeecee.Fixed", "#FFFF00", new int[][]{{40,20},{60,10},{75,20},{60,30}});

        assertTrue(iceepeecee.ok());

        assertEquals(iceepeecee.islands().length, 2);

        iceepeecee.addIsland("iceepeecee.Surprising", "#FF0000", new int[][]{{45,60},{55,55},{60,60},{55,65}});

        assertTrue(iceepeecee.ok());

        assertEquals(iceepeecee.islands().length, 3);

    }

    

    @Test

    public void accordingGSsholdAddEveryTypeOfFligth(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300,300);

        iceepeecee.addFlight("iceepeecee.NormalFlight", "#FFFFFF", new int[]{55,0,20}, new int[]{70,60,10});

        assertTrue(iceepeecee.ok());

        assertEquals(iceepeecee.flights().length, 1);

        iceepeecee.addFlight("iceepeecee.Flat", "#FFFF00", new int[]{100,130,20}, new int[]{178,170,5});

        assertTrue(iceepeecee.ok());

        assertEquals(iceepeecee.flights().length, 2);

        iceepeecee.addFlight("iceepeecee.Lazy", "#08FF00", new int[]{5,5,10}, new int[]{15,5,10});

        assertTrue(iceepeecee.ok());

        assertEquals(iceepeecee.flights().length, 3);

    }

    

    @Test

    public void accordingGSflatFlightShouldBeFlat(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300,300);

        iceepeecee.addFlight("iceepeecee.Flat", "#FFFFFF", new int[]{55,0,20}, new int[]{70,60,9});

        assertEquals(iceepeecee.flightLocation("#FFFFFF")[0][2], iceepeecee.flightLocation("#FFFFFF")[1][2]);

    }

    

    @Test

    public void accordingGSlazyFlightShouldTakeAphoto(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300,300);

        iceepeecee.addFlight("iceepeecee.Lazy", "#08FF00", new int[]{5,5,10}, new int[]{15,5,10});

        iceepeecee.photograph("#08FF00", 30);

        assertTrue(iceepeecee.ok());

        iceepeecee.makeInvisible();

    }

    

    @Test

    public void accordingGSlazylazyFlightShouldnotTakeMoreThanOnePhoto(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300,300);

        iceepeecee.addFlight("iceepeecee.Lazy", "#08FF00", new int[]{5,5,10}, new int[]{15,5,10});

        iceepeecee.photograph("#08FF00", 30);

        assertTrue(iceepeecee.ok());

        assertEquals(30, iceepeecee.flightCamera("#08FF00"));

        iceepeecee.photograph("#08FF00", 40);

        assertEquals(30, iceepeecee.flightCamera("#08FF00"));

        iceepeecee.makeInvisible();

    }

    

    @Test

    public void accordingGSfixedIslandShouldBeFixed(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300,300);

        iceepeecee.addIsland("iceepeecee.Fixed", "#FFFF00", new int[][]{{40,20},{60,10},{75,20},{60,30}});

        iceepeecee.delIsland("#FFFF00");

        assertFalse(iceepeecee.ok());

    }

    

    @Test

    public void accordingGSsurprisingIslandShouldBeSurprising(){
        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300,300);

        iceepeecee.addIsland("iceepeecee.Surprising", "#FF0000", new int[][]{{45,60},{55,55},{60,60},{55,65},{55,70},{60,75},{65,60}});

        assertEquals(iceepeecee.islandLocation("#FF0000").length, 6); //Se elimina un vertice. 

        assertTrue(iceepeecee.ok()); // se considera que la accion se pudo realizar

        assertEquals(iceepeecee.islandLocation("#FF0000").length, 5); //Se elimina un vertice. 

        assertTrue(iceepeecee.ok()); // se considera que la accion se pudo realizar

        assertEquals(iceepeecee.islandLocation("#FF0000").length, 4); //Se elimina un vertice. 

        assertTrue(iceepeecee.ok()); // se considera que la accion se pudo realizar

        assertEquals(iceepeecee.islandLocation("#FF0000").length, 3); //Se elimina un vertice. 

        assertTrue(iceepeecee.ok()); // se considera que la accion se pudo realizar

        assertEquals(iceepeecee.islandLocation("#FF0000").length, 3); //Llega al limite de vertices eliminados

        assertTrue(iceepeecee.ok()); // se considera que la accion se pudo realizar

    }



//Mendivelso-Rpdriguez


     @Test

    public void testFixedShould() {

        // Prueba cuando no se puede eliminar una isla fija

        Island island = new Fixed(new int[][]{{200, 100}, {150, 100}, {150, 200}},"red");

        assertFalse(island.canErase()); // Esto debería mostrar un mensaje en la consola, no eliminar la isla

    }

    

     @Test

    public void testSurprisingShould() {

        // Prueba cuando una isla sorprendente pierde un vértice

        Island surprisingIsland = new Surprising(new int[][]{{0, 0}, {0, 10}, {10, 10}, {10, 0}},"green");

        int[][] originalPolygon = {{0, 0}, {0, 10}, {10, 10}, {10, 0}};

        surprisingIsland.getLocation();

        int[][] newPolygon = surprisingIsland.getLocation();

        assertEquals(originalPolygon.length - 1, newPolygon.length);

    }

    

    

    @Test

    public void testFlightShould() {

        // Prueba la creación de una zona fotografiada por Flat
        try{
        Flat flatFlight = new Flat("red", new int[]{0, 0, 0}, new int[]{10, 10, 10});

        flatFlight.photograph(45);



        // Prueba la creación de una zona fotografiada por Lazy

        Lazy lazyFlight = new Lazy("green", new int[]{0, 0, 0}, new int[]{10, 10, 10});

        lazyFlight.photograph(30);

        assertTrue(lazyFlight.getIsPhotograph());
    }catch(IceepeeceeExcepcion e){
        
    }

    }





//Alvarez-Morales



@Test

public void shouldNotAddFlightWithInsufficientCoordinates() {
    ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300,300);

    int[] from = {0, 30};

    int[] to = {78,70};

    iceepeecee.addFlight("IncompleteFlight", "#00FFFF", from, to);

   assertFalse(iceepeecee.ok());

}



@Test

public void shouldNotAddDuplicateIslandWithSameColor(){
    ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300,300);

    int[][] polygon1 = {{10, 10}, {20, 10}, {20, 20}, {10, 20}};

    int[][] polygon2 = {{30, 30}, {40, 30}, {40, 40}, {30, 40}};

    iceepeecee.addIsland("SurprisingIsland1", "#0000FF", polygon1);

    iceepeecee.addIsland("SurprisingIsland2", "#0000FF", polygon2);

    assertFalse(iceepeecee.ok());

}



@Test

public void flatFlightShouldMaintainSameAltitude() {
    ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300,300);

    int[] from = {0, 30, 20};

   int[] to = {78, 70, 5};

   iceepeecee.addFlight("iceepeecee.Flat", "#FFFF00", from, to);

   int initialAltitude = iceepeecee.flightLocation("#FFFF00") [0][2];

   iceepeecee.addFlight("iceepeecee.Flat", "#FF00FF", from, to);

   int newAltitude = iceepeecee.flightLocation("#FF00FF") [0][2];

   assertEquals(initialAltitude, newAltitude);

}



@Test

public void normalFlightCanTakeMultiplePhotos(){
    ICEEPEECEEE iceepeecee = new ICEEPEECEEE(300,300);

    int[] from = {0, 0, 20};

    int[] to = {20, 20, 40};

    iceepeecee.addFlight("iceepeecee.NormalFlight", "#00FF00", from, to);

    iceepeecee.photograph("#00FF00", 45);

    assertTrue(iceepeecee.ok());

    iceepeecee.photograph("#00FF00", 70);

    assertTrue(iceepeecee.ok());

   iceepeecee.photograph("#00FF00", 15);

   assertTrue(iceepeecee.ok());

}

//CASTILLO - SUAREZ



    @Test

    public void testAddIslandShouldCreateIsland() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);



        // Prueba con un tipo válido y datos válidos

        String type = "iceepeecee.Fixed";

        String color = "blue";

        int[][] polygon = {{0, 0}, {0, 1}, {1, 1}, {1, 0}};

        iceepeecee.addIsland(type, color, polygon);

   



        // Verifica que se haya agregado una isla a la lista

        assertEquals(1, iceepeecee.islands().length);

    }

    

    @Test

    public void testAddIslandShouldDelIsland() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);



        // Prueba con un tipo válido y datos válidos

        String type = "iceepeecee.Fixed";

        String color = "blue";

        int[][] polygon = {{0, 0}, {0, 1}, {1, 1}, {1, 0}};

        iceepeecee.addIsland(type, color, polygon);

        iceepeecee.delIsland("blue");



        // Verifica que se haya eliminado una isla de la lista

        assertEquals(0, iceepeecee.islands().length);

    }

    

      @Test

    public void ShouldAddDifferentIslands() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500); 



        // Prueba con un tipo válido y datos válidos

        String type = "iceepeecee.Fixed";

        String color = "blue";

        int[][] polygon = {{10, 10}, {10, 20}, {20, 20}, {10, 20}};

        iceepeecee.addIsland(type, color, polygon);

        int [][] polygon2 = {{40,20},{60,10},{75,20},{60,30}};

        iceepeecee.addIsland("blue",polygon2);



        // Verifica que se haya agregado unicamente una isla sin importar que sean de distintos tipos

        assertEquals(1, iceepeecee.islands().length);

    }



    @Test

    public void testAddIslandShouldNotCreateIsland() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500); 



        // Prueba con un tipo inválido

        String type = "InvalidType";

        String color = "blue";

        int[][] polygon = {{0, 0}, {0, 1}, {1, 1}, {1, 0}};

        iceepeecee.addIsland(type, color, polygon);



        // Verifica que no se haya agregado ninguna isla

        assertEquals(0, iceepeecee.islands().length);



        // Prueba con datos inválidos

        type = "iceepeecee.Surprising";

        color = "blue";

        int[][] invalidPolygon = {{0, 0}, {0, 1}, {1, 1}}; // Polígono inválido

        iceepeecee.addIsland(type, color, invalidPolygon);



        // Verifica que no se haya agregado ninguna isla

        assertEquals(1, iceepeecee.islands().length);

    }



    @Test

    public void testAddFlightShouldCreateFlight() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);



        // Prueba con un tipo válido y datos válidos

        String type = "iceepeecee.Lazy";

        String color = "black";

        int[] from = {0, 0};

        int[] to = {1, 1};

        int cameraAngle = 45;

        iceepeecee.addFlight(type, color, from, to);



        // Verifica que se haya agregado un vuelo a la lista

        assertEquals(1, iceepeecee.flights().length);

    }



    @Test

    public void testAddFlightShouldNotCreateFlight() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

    

        // Prueba con un tipo inválido

        String type = "INVALIDO";

        String color = "red";

        int[] from = {0, 0};

        int[] to = {1, 1};

        int cameraAngle = 45;

        iceepeecee.addFlight(type, color, from, to);


        assertEquals(0, iceepeecee.flights().length);

    }

 



    @Test

    public void testGetPolygonWhenVerticesAreLost() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

    

        // Crea una isla del tipo SurprisingIsland

        String type = "iceeepeecee.Surprising";

        String color = "red";

        

        int[][] initialPolygon = {{0, 0}, {1, 0}, {1, 1}, {0, 1}};

        iceepeecee.addIsland(type, color, initialPolygon);



        // Carga la isla y comprueba si perdió uno de sus vertices al llamar el metodo getPolygon
        try{
            Island island = iceepeecee.getIsland("red");

            int[][] updatedPolygon = island.getLocation();

            assertEquals(initialPolygon.length - 1, updatedPolygon.length);
        }catch(IceepeeceeExcepcion e){
            
        }
        

    }

    

     @Test

    public void testGetPolygonWhenVerticesAreNotLost() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);
 

    

        // Crea una isla del tipo SurprisingIsland

        String type = "iceepeecee.Surprising";

        String color = "red";

        

        int[][] initialPolygon = {{0, 0}, {1, 0}, {1, 1}};

        iceepeecee.addIsland(type, color, initialPolygon);

    

        // Llama getPolygon para comprobar que la isla no perdió el vertice
    try{
        Island island = iceepeecee.getIsland("red");

        int[][] updatedPolygon = island.getLocation();

        assertArrayEquals(initialPolygon, updatedPolygon);

    }catch(IceepeeceeExcepcion e){
        
    }
}



    @Test

    public void testPhotographFirstCapture() {

        ICEEPEECEEE iceepeecee = new ICEEPEECEEE(500,500);

        int[] from = {0, 0};

        int[] to = {1, 1};

        

        //crea la primera fotografía

        iceepeecee.addFlight("iceepeecee.Lazy", "green", from, to);

        
        try{
            Flight flight = iceepeecee.getFlight("green");

        

            //intenta crear la segunda fotografía
    
            flight.photograph(45);
    
            
    
            assertTrue(flight.getIsPhotograph());
        }catch(IceepeeceeExcepcion e){
            
        }

    }



// Montero Villamizar

 @Test

    public void testFixedIslandCannotBeDeleted() {

        // Prueba que no se puede eliminar una isla fija

        Island island = new Fixed(new int[][]{{0, 0}, {0, 10}, {10, 10}},"red");

        assertFalse(island.canErase());

    }



    @Test

    public void testSurprisingIslandLosesVertex() {

        // Prueba que una isla sorprendente pierde un vértice

        Island surprisingIsland = new Surprising(new int[][]{{0, 0}, {0, 10}, {10, 10}, {10, 0}},"green");

        int[][] originalPolygon = new int[][]{{0, 0}, {0, 10}, {10, 10}, {10, 0}};

        int[][] newPolygon = surprisingIsland.getLocation();

        assertEquals(originalPolygon.length - 1, newPolygon.length);

    }



    @Test

    public void testFlatAndLazyFlightPhotograph() {

        // Prueba la creación de una zona fotografiada por Flat
        try{
            Flat flatFlight = new Flat("red", new int[]{0, 0, 0}, new int[]{10, 10, 10});

            flatFlight.photograph(45);
    
            assertTrue(flatFlight.getIsPhotograph());
    
    
    
            // Prueba la creación de una zona fotografiada por Lazy
    
            Lazy lazyFlight = new Lazy("green", new int[]{0, 0, 0}, new int[]{10, 10, 10});
    
            lazyFlight.photograph(30);
    
            assertTrue(lazyFlight.getIsPhotograph());
            
        }catch(IceepeeceeExcepcion e){
            
        }

        

    }

//**BERNAL - HERNANDEZ **//

@Test

    public void accordingBHshouldAddIslandwithType() {

        ICEEPEECEEE map = new ICEEPEECEEE(600,600);

        map.addIsland("iceepeecee.Surprising","red", new int[][]{{40, 20}, {60, 10}, {75, 20}, {60, 30}});

        assertTrue(map.ok());

        map.addIsland("iceepeecee.Fixed","blue", new int[][]{{20, 30}, {50, 50}, {10, 50}});

        assertTrue(map.ok());

        map.addIsland("iceepeecee.NormalIsland","green", new int[][]{{20, 30}, {50, 50}, {10, 50}});

        assertTrue(map.ok());

    }

    

    @Test

    public void accordingBHshouldAddFlightwithType() {

        ICEEPEECEEE map = new ICEEPEECEEE(600,600);

        map.addFlight("iceepeecee.Lazy","red", new int[]{0,30,20},new int[]{78,70,5});

        assertTrue(map.ok());

        map.addFlight("iceepeecee.Flat","black", new int[]{5,5,10},new int[]{15,5,10});

        assertTrue(map.ok());

        map.addFlight("iceepeecee.NormalFlight","magenta", new int[]{55,0,20},new int[]{70,60,10}); 

        assertTrue(map.ok());

    }

    

    @Test

    public void accordingBHShouldRemovePointsFromSurprisingIsland(){

        ICEEPEECEEE map = new ICEEPEECEEE(600,600);

        int[][] polygon = {{70,30},{50,50},{80,100},{40,300}};

        map.addIsland("iceepeecee.Surprising","red", polygon);

        assertEquals(3, map.islandLocation("red").length);

        map.makeInvisible();

    }

    

    @Test

    public void accordingBHshouldNotAddFlatFlightWithDifferentAltitude(){

        ICEEPEECEEE map = new ICEEPEECEEE(600,600);

        map.addFlight("iceepeecee.Flat","red", new int[]{5,5,6},new int[]{15,5,10}); 

        assertEquals(0, map.flights().length);

    }

    

    @Test

    public void accordingBHShouldNotTakeMoreThanOnePhotoLazyFlight(){

        ICEEPEECEEE map = new ICEEPEECEEE(600,600);

        map.addFlight("iceepeecee.Lazy", "red", new int[]{50,50,10}, new int[]{150,50,10});

        map.photograph("red", 20);

        assertTrue(map.ok());

        map.photograph("red", 80);

        assertNotEquals(map.flightCamera("red"), 80); // Verificamos que la camara no cambie su angulo

        assertEquals(map.flightCamera("red"), 20);  // Verificamos que la camara no cambie su angulo

    }

    

    @Test

    public void accordingBHShouldNotDeleteFixedIsland(){

        ICEEPEECEEE map = new ICEEPEECEEE(600,600);

        map.addIsland("iceepeecee.Fixed", "blue", new int[][]{{40,20},{60,10},{75,20},{60,30}});

        map.delIsland("blue");

        assertFalse(map.ok());

        assertTrue(map.islands() != null);

    }
}
