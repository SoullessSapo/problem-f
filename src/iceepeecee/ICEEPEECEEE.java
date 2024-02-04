package iceepeecee;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.Random;
import java.util.Arrays;
import java.util.regex.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.lang.reflect.InvocationTargetException;

/**
 * In this class we solved the problem F.
 *
 * @author Andrea Camila Torres
 * @author Esteban Valencia
 * @version 1.2
 */
public class ICEEPEECEEE{
    private ArrayList<Island> islas;
    private ArrayList<Flight> flights;
    public static boolean lastAction = true;
    public static int length;
    public static int width;
    /**
     * Constructor para objetos de la clase ICEEPEECEEE.
     */
    public ICEEPEECEEE(int length, int width) {
        islas = new ArrayList<>();
        flights = new ArrayList<>();
        if(verifyTablero(length, width)){
            this.length = length;
            this.width = width;
        }
        else{
            this.length = (int)Math.pow(10,6);
            this.width = (int)Math.pow(10,6);
        }
        
    }
    /**
     * Constructor para objetos de la clase ICEEPEECEEE.
     * Inicializa la variable de instancia islas y flights con un arrayList.
     */
    public ICEEPEECEEE(int[][][]islands,int[][][]flights){
        this.length = (int)Math.pow(10,6);
        this.width = (int)Math.pow(10,6);
        islas = new ArrayList<>();
        this.flights = new ArrayList<>();
        createIslands(islands);
        createFlights(flights);
    }
    //PRIMER CICLO
    /**
     * Método para agregar una isla con color y puntos de polígono especificados.
     * @param color El color de la isla.
     * @param polygon Un arreglo de arreglos de enteros que representan puntos de polígono.
     */
    public void addIsland(String color, int[][] polygon) {
        addIsland("iceepeecee.NormalIsland",color,polygon);
    }
    
    /**
     * Método para agregar un vuelo con un color especificado.
     * @param color El color del vuelo.
     */
    public void addFlight(String color, int[] from, int[] to) {
        addFlight("iceepeecee.NormalFlight",color,from,to);
    }
    
    /**
     * Metodo para crear una fotografia.
     * @param String flight color del vuelo a tomar la fotografía.
     * @param double teta angulo de la fotografía.
     */
    public void photograph(String flight, float teta) {
        try{
            Flight f = getFlight(flight);
            if(verifyAngle(teta)){
                if(f.getCamera() != null && f.getCamera().getIsVisible()){
                    f.getCamera().makeInvisible();
                }
                f.photograph(teta);
            }
        }catch (IceepeeceeExcepcion e){
            lastAction = false;
            System.out.println(e.getMessage());
        }
    }
    /**
     * Metodo para crear una fotografia de todos los vuelos con el mismo angulo.
     * @param int teta angulo de la fotografía.
     */
    public void photograph(int teta) {
        for (Flight f: flights){
            photograph(f.getID(),teta);
        }
    }
    /**
     * Método para eliminar una isla con color especificado.
     * @param color El color de la isla.
     */
     public void delIsland(String color) {
        try{
            Island island = getIsland(color);
            if(island.canErase()){
                if(island.getisVisible()){
                    island.makeInvisible();
                }
                islas.remove(island);
            }
        }catch(IceepeeceeExcepcion e){
            System.out.println(e.getMessage());
        }
    }
    /**
     * Método para eliminar una vuelo con color especificado.
     * @param El color del vuelo.
     */
    public void delFlight(String color) {
        try{
            Flight f = getFlight(color);
            if(f.getIsVisible()){
                f.makeInvisible();
            }
            flights.remove(f);
        }catch(IceepeeceeExcepcion e){
            System.out.println(e.getMessage());
        }
    }
    /**
     * Método para obtener la ubicación de una isla con color especificado.
     * @param El color de la isla.
     */
    public int[][] islandLocation(String island){
        int[][] islaLocation=null;
        try{
            Island isla = getIsland(island);
            islaLocation = isla.getLocation(); 
        }catch(IceepeeceeExcepcion e){
            System.out.println(e.getMessage());
        }
        return islaLocation;
    }
    /**
     * Método para encontrar la ubicación de un vuelo con color especificado.
     * @param El color del vuelo.
     */
    public int[][] flightLocation(String flight){
        int[] fromL=new int[3];
        int[] toL =new int[3];
        int[][] flightL=new int[2][3];
        try{
            Flight f = getFlight(flight);
            fromL = f.getFrom();
            toL = f.getto();
            flightL[0] = fromL;
            flightL[1] = toL;
        }catch(IceepeeceeExcepcion e){
            System.out.println(e.getMessage());
        }
        return flightL;
    }
    /**
     * Método para encontrar el angulo del vuelo.
     * @param El color del vuelo.
     * @return int angulo de la camara del vuelo.
     */
    public int flightCamera(String color){
        int cameras = 0;
        try{
            Flight f = getFlight(color);
            if(f.getCamera()!= null){
                cameras=(int) f.getCamera().getAngle();
            }
        }catch(IceepeeceeExcepcion e){
            System.out.println(e.getMessage());
        }
        return cameras;
    }
    /**
     * Método para hacer visible todo lo creado.
     */
    public void makeVisible(){
        for(Island i: islas){
            i.makeVisible();
            if(observed(i)){
                //Si la isla es observada, hace un triangulo en un vertice de la isla.
                i.getTriangle().makeVisible();
            }
        }
        for(Flight f: flights){
            f.makeVisible();
        }
    }
    /**
     * Método para hacer invisible todo lo creado.
     */
    public void makeInvisible(){
        for(Island i: islas){
            i.makeInvisible();
        }
        for(Flight f: flights){
            f.makeInvisible();
        }
    }
    
    /**
     * Método que termina el programa.
     */
    public void finish() {
        System.exit(0);
    }
    /**
     * Método que verififica si la ultima accion pudo realizarce.
     */
    public boolean ok(){
        return lastAction;
    }
    
    //SEGUNDO CICLO.
    /**
     * Metodo para crear una fotografia de todos los vuelos con el mismo angulo.
     * @param float teta angulo de la fotografía.
     */
    public void photograph(float teta) {
        for (Flight f: flights){
            photograph(f.getID(),teta);
        }
    }
    /**
     * Metodo para obtener los colores de los vuelos construidos.
     * @return ArrayList<String> lista con los colores de las islas.
     */
    public String[] islands(){
        ArrayList<String>colors = new ArrayList<>();
        for (Island i: islas){
            colors.add(i.getColor());
        }
        return convertArrayListToArray(colors);
    }
    /**
     * Metodo para obtener los colores de los vuelos construidos.
     * @return ArrayList<String> lista con los colores de los vuelos.
     */
    public String[] flights(){
        ArrayList<String>colors = new ArrayList<>();
        for (Flight f: flights){
            colors.add(f.getID());
        }
        return convertArrayListToArray(colors);
    }
    /**
     * Metodo para obtener los colores de las islas fotografiadas.
     * @return ArrayList<String> lista con los colores de las islas fotografiadas.
     */
    public String[] observedIslands() {
        ArrayList<String> islandsObserved = new ArrayList<>();
        for (Island i: islas) {
            if(observed(i)&& !islandsObserved.contains(i.getColor())) {
                islandsObserved.add(i.getColor());
            }
        }
        return convertArrayListToArray(islandsObserved);
    }   
    /**
     * Metodo para obtener los vuelos inútiles (los que no tomaron foto).
     * @return ArrayList<String> lista con los colores de las vuelos que no toman fotografia de las islas.
     */
    public String[] uselessFlights(){
         ArrayList<String> flightsObserved = notUselessFlights();
         ArrayList<String> flightsNotObserved = new ArrayList<>();
         for(Flight f:flights){
             if(!flightsObserved.contains(f.getID())){
                 flightsNotObserved.add(f.getID());
             }
         }
         return convertArrayListToArray(flightsNotObserved);
    }
    //CICLO 4
    /**
     * Método para agregar una isla con color y puntos de polígono especificados.
     * @param type Tipo de isla.
     * @param color El color de la isla.
     * @param polygon Un arreglo de arreglos de enteros que representan puntos de polígono.
     */
    public void addIsland(String type, String color, int[][] polygon) {
        if(okIsland(color,polygon)){
            try{
                Class<?> clase = Class.forName(type);
                Constructor<?> constructor = clase.getConstructor(int[][].class,String.class);
                Object object = constructor.newInstance(polygon,color);
                Island newIsland = (Island) object;
                islas.add(newIsland);
            }catch(ClassNotFoundException e){
                lastAction = false;
                System.out.println(e.getMessage());
            }catch(IllegalAccessException e){
                lastAction = false;
                System.out.println(e.getMessage());
            }catch(InstantiationException e){
                lastAction = false;
                System.out.println(e.getMessage());
            }catch(InvocationTargetException e){
                lastAction = false;
                System.out.println(e.getMessage());
            }catch(NoSuchMethodException e){
                lastAction = false;
                System.out.println(e.getMessage());
            }
        }
    }
    /**
     * Método para agregar un vuelo con un color especificado.
     * @param type Tipo de vuelo.
     * @param color El color del vuelo.
     * @param from punto de inicio del vuelo.
     * @param to punto final del vuelo.
     */
    public void addFlight(String type, String color, int[] from, int[] to){
        if(okFlight(color,from,to)){
            try{
                Class<?> clase = Class.forName(type);
                Constructor<?> constructor = clase.getConstructor(String.class,int[].class,int[].class);
                Object object = constructor.newInstance(color,from,to);
                Flight newFlight = (Flight) object;
                newFlight.verifyAltitude(from,to);
                flights.add(newFlight);
            }catch(ClassNotFoundException e){
                lastAction = false;
                System.out.println(e.getMessage());
            }catch(IllegalAccessException e){
                lastAction = false;
                System.out.println(e.getMessage());
            }catch(InstantiationException e){
                lastAction = false;
                System.out.println(e.getMessage());
            }catch(InvocationTargetException e){
                lastAction = false;
                System.out.println(e.getMessage());
            }catch(NoSuchMethodException e){
                lastAction = false;
                System.out.println(e.getMessage());
            }catch(IceepeeceeExcepcion e){
                lastAction = false;
                System.out.println(e.getMessage());
            }
        }
    }
    /**
     * Metodo auxiliar para crear las islas como la entrada del problem F.
     */
    private void createIslands(int[][][] islands){
        ArrayList<String> choosenColors = new ArrayList<>();
        String color;
        try{
            for(int i = 0; i < islands.length;i++){
            color = chooseColor();
            while(choosenColors.contains(color)){
                color = chooseColor();
            }
            choosenColors.add(color);
            addIsland(color,islands[i]);
            }
            
        }catch(NullPointerException e){
            lastAction = false;
            System.out.println(e.getMessage());
        }
    }
    /**
     * Metodo auxiliar para crear los vuelos como la entrada del problem F.
     */
    private void createFlights(int[][][] newFlights){
        ArrayList<String> choosenColors = new ArrayList<>();
        String color;
        try{
            for(int i = 0; i < newFlights.length;i++){
            color = chooseColor();
            while(choosenColors.contains(color)){
                color = chooseColor();
            }
            choosenColors.add(color);
            addFlight(color,newFlights[i][0],newFlights[i][1]);
            }
            
        }catch(NullPointerException e){
            lastAction = false;
            System.out.println(e.getMessage());
        }
        
    }
    /**
     * Metodo auxiliar para elegir colores al azar en formato rgb.
     */
    private String chooseColor(){
        Random r = new Random();
        int red = r.nextInt(256);
        int green = r.nextInt(256);
        int blue = r.nextInt(256);
        String color = convertRGBtoHex(red, green, blue);
        return color;
    }
    /**
     * Metodo auxiliar para pasar de rgb a formato hexadecimal.
     */
    private String convertRGBtoHex(int red, int green, int blue){
        String hexRed = Integer.toHexString(red);
        String hexGreen = Integer.toHexString(green);
        String hexBlue = Integer.toHexString(blue);
        hexRed = (hexRed.length() == 1) ? "0" + hexRed : hexRed;
        hexGreen = (hexGreen.length() == 1) ? "0" + hexGreen : hexGreen;
        hexBlue = (hexBlue.length() == 1) ? "0" + hexBlue : hexBlue;
        String hex = hexRed + hexGreen + hexBlue;
        return hex.toUpperCase();
    }
    /**
     * Metodo para obtener los vuelos de las islas fotografiadas.
     * @return ArrayList<String> lista con los colores de las vuelos que tomaron la fotografía.
     */
    private ArrayList<String> notUselessFlights(){
        ArrayList<String> flightsObserved = new ArrayList<>();
        for (Flight f: flights) {
            if(flightCamera(f.getID()) != 0){
                Photograph photo = f.getCamera();
                for (Island i: islas) {
                    if(i.isObserved(photo)&& !flightsObserved.contains(f.getID())) {
                            flightsObserved.add(f.getID());
                    }
                }
            }
        }
        return flightsObserved;
    }
    /**
     * Metodo para saber si una isla está fotografiada.
     * @return boolean isObserved booleano indicando si está fotografiada.
     */
    private boolean observed(Island i){
        boolean isObserved = false;
        for (Flight f: flights) {
            if(flightCamera(f.getID()) != 0){
                Photograph photo = f.getCamera();
                if(i.isObserved(photo)) {
                    isObserved = true;
                }
            }
        }
        return isObserved;
    }
    /**
     * Método para realizar verificar si una isla es válida.
     */
    private boolean okIsland(String color, int[][] polygon) {
        boolean isValid = true;
        int[][] locations = null;
        if (polygon.length < 3) {
            isValid = false;
        }
        if(intesectingIsland(polygon)){
            isValid = false;
        }
        int maxX = 0;
        int maxY = 0;
        for (int[] vertex : polygon) {
            if(vertex.length != 2){
                isValid = false;
            }
            maxX = Math.max(maxX, vertex[0]);
            maxY = Math.max(maxY, vertex[1]);
        }
        if (maxX > width || maxY > length) {
            isValid = false;
        }
        try{
            Island isla = getIsland(color);
            isValid = false;
        }catch(IceepeeceeExcepcion e){
        }
        lastAction = isValid;
        return isValid;
    }
    
    /**
     * Método para realizar verificar si un vuelo es válido.
     */
    private boolean okFlight(String color, int[] from, int[] to) {
        boolean isValid = true;
        if(from.length == 3 && to.length == 3){
            if(Math.abs(from[0]) > Math.pow(10,6) || from[0] > width || Math.abs(from[1]) > Math.pow(10,6) || from[1] > length || 
            to[0] > width || Math.abs(to[0]) > Math.pow(10,6) || Math.abs(to[1]) > Math.pow(10,6) || to[1] > length || from[2] <= 0 || to[2] <= 0){
                isValid = false;
            }
            for (Flight flight : flights) {
                String flightColor = flight.getID();
                int[] flightFrom = flight.getFrom();
                int[] flightTo = flight.getto();
                if (color.equals(flightColor) || Arrays.equals(from, flightFrom) && Arrays.equals(to, flightTo)) {
                    isValid = false;
                }
                
            }
        }
        else{
            isValid = false;
        }
        lastAction = isValid;
        return isValid;
    }
    /**
     * Método para devolver una isla con el color indicado.
     */
    public Island getIsland(String color) throws IceepeeceeExcepcion {
        Island isla = null;
        for(Island i: islas){
            if(color.equals(i.getColor())){
                isla = i;
            }
        }
        if (isla == null){
            lastAction = false;
            throw new IceepeeceeExcepcion(IceepeeceeExcepcion.NO_ISLAND);
        }
        return isla;
    }
    /**
     * Método para devolver un vuelo con el color indicado.
     */
    public Flight getFlight(String color) throws IceepeeceeExcepcion {
        Flight flight = null;
        for(Flight f: flights){
            if(color.equals(f.getID())){
                flight = f;
            }
        }
        if (flight == null){
            lastAction = false;
            throw new IceepeeceeExcepcion(IceepeeceeExcepcion.NO_FLIGHT);
        }
        return flight;
    }
    /**
     * Método para convertir una ArrayList a Array.
     */
    private String[] convertArrayListToArray(ArrayList<String> array){
        String[] arrayList = new String[array.size()];
        if(!array.isEmpty()){
            for(int i = 0;i<array.size();i++){
                arrayList[i] = array.get(i);
            }
        }
        return arrayList;
    }
    /**
     * Método para verificar el angulo.
     */
    private boolean verifyAngle(float angle){
        if(angle > 0 && angle <= 90){
            return true;
        }
        lastAction = false;
        return false;
    }
    /**
     * Método para verificar si una isla está intersectada.
     */
    private boolean intesectingIsland(int[][] polygon){
        boolean intersected = false;
        for(Island i:islas){
            if(i.isIntersected(polygon)){
                intersected = true;
            }
        }
        return intersected;
    }
    /**
     * Método para verificar si el tablero es válido.
     */
    private boolean verifyTablero(int n, int m){
        if(n == m && n >= 50 && m >= 50 ){
            lastAction = true;
            return true;
        }
        lastAction = false;
        return false;
    }
}
