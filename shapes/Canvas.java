package shapes;
import iceepeecee.IceepeeceeExcepcion;
import iceepeecee.ICEEPEECEEE;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
import java.util.Random;

/**
 * Canvas is a class to allow for simple graphical drawing on a canvas.
 * This is a modification of the general purpose Canvas, specially made for
 * the BlueJ "shapes" example.
 *
 * @author Bruce Quig
 * @author Michael Kolling (mik)
 *
 * @version 1.6 (shapes)
 */
public class Canvas {
    private static Canvas canvasSingleton;
    /**
     * Factory method to get the canvas singleton object.
     */
    public static Canvas getCanvas() {
        if (canvasSingleton == null) {
            canvasSingleton = new Canvas("BlueJ Shapes Demo", ICEEPEECEEE.width, ICEEPEECEEE.length,
                    Color.white);
        }
        canvasSingleton.setVisible(true);
        return canvasSingleton;
    }

    private JFrame frame;
    private CanvasPane canvas;
    private Graphics2D graphic;
    private Color backgroundColour;
    private Image canvasImage;
    private List<Object> objects;
    private HashMap<Object, ShapeDescription> shapes;
    private HashMap<String,Color>differentColors;
    private ArrayList<String>colorsCreate;
    private Canvas(String title, int width, int height, Color bgColour) {
        frame = new JFrame();
        canvas = new CanvasPane();
        frame.setContentPane(canvas);
        frame.setTitle(title);
        canvas.setPreferredSize(new Dimension(width, height));
        backgroundColour = bgColour;
        frame.pack();
        objects = new ArrayList<>();
        shapes = new HashMap<>();
        colorsCreate = new ArrayList<>();
        differentColors = new HashMap<String,Color>();
        setColor();
    }

    public void setVisible(boolean visible) {
        if (graphic == null) {
            Dimension size = canvas.getSize();
            canvasImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
            graphic = (Graphics2D) canvasImage.getGraphics();
            graphic.setColor(backgroundColour);
            graphic.fillRect(0, 0, size.width, size.height);
            graphic.setColor(Color.black);
        }
        frame.setVisible(visible);
    }

    public Graphics2D getGraphics2D() {
    if (canvasImage == null) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        canvasImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    }
    return (Graphics2D) canvasImage.getGraphics();
}

    public void draw(Object referenceObject, String color, Shape shape,int opacity) {
        objects.remove(referenceObject);
        objects.add(referenceObject);
        shapes.put(referenceObject, new ShapeDescription(shape, color,opacity));
        redraw();
    }

    public void erase(Object referenceObject) {
        objects.remove(referenceObject);
        shapes.remove(referenceObject);
        redraw();
    }

    public void setForegroundColor(String hexColor,int opacity){
        try{
            isValidColor(hexColor);
            graphic.setColor(differentColors.get(hexColor));
        }catch (IceepeeceeExcepcion e){
            int[] rgbColor = hexToRgb(hexColor);
            if (rgbColor[0] >= 0 && rgbColor[0] <= 255 && rgbColor[1] >= 0 && rgbColor[1] <= 255 && rgbColor[2] >= 0 && rgbColor[2] <= 255){
                    graphic.setColor(new Color(rgbColor[0], rgbColor[1], rgbColor[2],opacity));
            } else{
                graphic.setColor(new Color(220, 220, 220));
            }
        }
    }
    public int[] hexToRgb(String hex) {
        int[] colors = new int[3];
        if (hex.startsWith("#")) {
            hex = hex.substring(1);
        }
        
        // Verificar si la cadena es un color hexadecimal válido
        if (hex.matches("[A-Fa-f0-9]{6}") || hex.matches("[A-Fa-f0-9]{3}")) {
            int red = Integer.parseInt(hex.substring(0, 2), 16);
            int green = Integer.parseInt(hex.substring(2, 4), 16);
            int blue = Integer.parseInt(hex.substring(4, 6), 16);
            colors[0] = red;
            colors[1] = green;
            colors[2] = blue;
        } else {
            // La cadena no es un color hexadecimal válido, establecer valores a -1
            colors[0] = -1;
            colors[1] = -1;
            colors[2] = -1;
        }
        return colors;
}


    public void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            // Handle the exception properly, e.g., log it or print an error message.
            e.printStackTrace();
        }
    }

    private void redraw() {
        erase();
        for (Iterator<Object> i = objects.iterator(); i.hasNext(); ) {
            shapes.get(i.next()).draw(graphic);
        }
        canvas.repaint();
    }

    private void erase() {
        Color original = graphic.getColor();
        graphic.setColor(backgroundColour);
        Dimension size = canvas.getSize();
        graphic.fill(new java.awt.Rectangle(0, 0, size.width, size.height));
        graphic.setColor(original);
    }

    private class CanvasPane extends JPanel {
        @Override
        public void paint(Graphics g) {
            g.drawImage(canvasImage, 0, 0, null);
        }
    }

    private class ShapeDescription {
        private Shape shape;
        private String colorString;
        private int opacity;

        public ShapeDescription(Shape shape, String color,int newOpacity) {
            this.shape = shape;
            colorString = color;
            opacity = newOpacity;
            
        }

        public void draw(Graphics2D graphic) {
            setForegroundColor(colorString,opacity);
            graphic.draw(shape);
            graphic.fill(shape);
        }
    }
    
    /**
     * Close the canvas window.
     */
    public void close() {
        if (frame != null) {
            frame.dispose(); // Dispose of the frame
            frame = null; // Set the frame reference to null
        }
    }
    private void setColor(){
        differentColors.put("Red", new Color(255, 0, 0));
        differentColors.put("Blue", new Color(0, 0, 255));
        differentColors.put("Yellow", new Color(255, 255, 0));
        differentColors.put("Black", new Color(0, 0, 0));
        differentColors.put("Brown", new Color(165, 42, 42));
        differentColors.put("Purple", new Color(128, 0, 128));
        differentColors.put("Green", new Color(0, 128, 0));
        differentColors.put("Orange", new Color(255, 165, 0));
        differentColors.put("Pink", new Color(255, 192, 203));
        differentColors.put("Gold", new Color(255, 215, 0));
        differentColors.put("Silver", new Color(192, 192, 192));
        differentColors.put("Lavender", new Color(230, 230, 250));
        differentColors.put("Turquoise", new Color(64, 224, 208));
        differentColors.put("Gray", new Color(128, 128, 128));
        differentColors.put("Teal", new Color(0, 128, 128));
        differentColors.put("Olive", new Color(128, 128, 0));
        differentColors.put("Cyan", new Color(0, 255, 255));
        differentColors.put("Magenta", new Color(255, 0, 255));
        differentColors.put("Lime", new Color(0, 255, 0));
        differentColors.put("Maroon", new Color(128, 0, 0));
        differentColors.put("Navy", new Color(0, 0, 128));
        differentColors.put("Aquamarine", new Color(127, 255, 212));
        differentColors.put("Azure", new Color(240, 255, 255));
        differentColors.put("Beige", new Color(245, 245, 220));
        differentColors.put("Bisque", new Color(255, 228, 196));
        differentColors.put("Coral", new Color(255, 127, 80));
        differentColors.put("Crimson", new Color(220, 20, 60));
        differentColors.put("Dark Blue", new Color(0, 0, 139));
        differentColors.put("Dark Cyan", new Color(0, 139, 139));
        differentColors.put("Dark Goldenrod", new Color(184, 134, 11));
        differentColors.put("Dark Gray", new Color(169, 169, 169));
        differentColors.put("Dark Green", new Color(0, 100, 0));
        differentColors.put("Dark Khaki", new Color(189, 183, 107));
        differentColors.put("Dark Magenta", new Color(139, 0, 139));
        differentColors.put("Dark Olive Green", new Color(85, 107, 47));
        differentColors.put("Dark Orange", new Color(255, 140, 0));
        differentColors.put("Dark Orchid", new Color(153, 50, 204));
        differentColors.put("Dark Red", new Color(139, 0, 0));
        differentColors.put("Dark Salmon", new Color(233, 150, 122));
        differentColors.put("Dark Sea Green", new Color(143, 188, 143));
        differentColors.put("Dark Slate Blue", new Color(72, 61, 139));
        differentColors.put("Dark Slate Gray", new Color(47, 79, 79));
        differentColors.put("Dark Turquoise", new Color(0, 206, 209));
        differentColors.put("Dark Violet", new Color(148, 0, 211));
        differentColors.put("Deep Pink", new Color(255, 20, 147));
        differentColors.put("Deep Sky Blue", new Color(0, 191, 255));
        differentColors.put("Dim Gray", new Color(105, 105, 105));
        differentColors.put("Dodger Blue", new Color(30, 144, 255));
        differentColors.put("Firebrick", new Color(178, 34, 34));
        differentColors.put("Floral White", new Color(223, 221, 24));
        differentColors.put("Forest Green", new Color(34, 139, 34));
        differentColors.put("Gainsboro", new Color(220, 220, 220));
        differentColors.put("Ghost White", new Color(248, 248, 25));
        differentColors.put("Goldenrod", new Color(218, 165, 32));
        differentColors.put("Green Yellow", new Color(173, 255, 47));
        differentColors.put("Honeydew", new Color(240, 255, 240));
        differentColors.put("Hot Pink", new Color(255, 105, 180));
        differentColors.put("Indian Red", new Color(205, 92, 92));
        differentColors.put("Indigo", new Color(75, 0, 130));
        differentColors.put("Ivory", new Color(255, 255, 240));
        differentColors.put("Khaki", new Color(240, 230, 140));
        differentColors.put("Lemon Chiffon", new Color(255, 250, 205));
        differentColors.put("Light Blue", new Color(173, 216, 230));
        differentColors.put("Light Coral", new Color(240, 128, 128));
        differentColors.put("Light Cyan", new Color(224, 255, 255));
        differentColors.put("Light Goldenrod", new Color(238, 221, 130));
        differentColors.put("Light Green", new Color(144, 238, 144));
        differentColors.put("Light Pink", new Color(255, 182, 193));
        differentColors.put("Light Salmon", new Color(255, 160, 122));
        differentColors.put("Light Sea Green", new Color(32, 178, 170));
        differentColors.put("Light Sky Blue", new Color(135, 206, 250));
        differentColors.put("Light Slate Gray", new Color(119, 136, 153));
        differentColors.put("Light Steel Blue", new Color(176, 196, 222));
        differentColors.put("Light Yellow", new Color(255, 255, 224));
        differentColors.put("Lime Green", new Color(50, 205, 50));
        differentColors.put("Linen", new Color(250, 240, 230));
        differentColors.put("Medium Aquamarine", new Color(102, 205, 170));
        differentColors.put("Medium Blue", new Color(0, 0, 205));
        differentColors.put("Medium Orchid", new Color(186, 85, 211));
        differentColors.put("Medium Purple", new Color(147, 112, 219));
        differentColors.put("Medium Sea Green", new Color(60, 179, 113));
        differentColors.put("Medium Slate Blue", new Color(123, 104, 238));
        differentColors.put("Medium Spring Green", new Color(0, 250, 154));
        differentColors.put("Medium Turquoise", new Color(72, 209, 204));
        differentColors.put("Medium Violet Red", new Color(199, 21, 133));
        differentColors.put("Midnight Blue", new Color(25, 25, 112));
        differentColors.put("Mint Cream", new Color(245, 255, 250));
        differentColors.put("Misty Rose", new Color(255, 228, 225));
        differentColors.put("Moccasin", new Color(255, 228, 181));
        differentColors.put("Navajo White", new Color(255, 222, 173));
        differentColors.put("Old Lace", new Color(253, 245, 230));
        differentColors.put("Olive Drab", new Color(107, 142, 35));
        differentColors.put("Orange Red", new Color(255, 69, 0));
        differentColors.put("Orchid", new Color(218, 112, 214));
        differentColors.put("Pale Goldenrod", new Color(238, 232, 170));
        differentColors.put("Pale Green", new Color(152, 251, 152));
        differentColors.put("Pale Turquoise", new Color(175, 238, 238));
        differentColors.put("Pale Violet Red", new Color(219, 112, 147));
        differentColors.put("Papaya Whip", new Color(255, 239, 213));
        differentColors.put("Peach Puff", new Color(255, 218, 185));
        differentColors.put("Peru", new Color(205, 133, 63));
        differentColors.put("Plum", new Color(221, 160, 221));
        differentColors.put("Powder Blue", new Color(176, 224, 230));
        differentColors.put("Rosy Brown", new Color(188, 143, 143));
        differentColors.put("Royal Blue", new Color(65, 105, 225));
        differentColors.put("Saddle Brown", new Color(139, 69, 19));
        differentColors.put("Salmon", new Color(250, 128, 114));
        differentColors.put("Sandy Brown", new Color(244, 164, 96));
        differentColors.put("Sea Green", new Color(46, 139, 87));
        differentColors.put("Seashell", new Color(255, 245, 238));
        differentColors.put("Sienna", new Color(160, 82, 45));
        differentColors.put("Sky Blue", new Color(135, 206, 235));
        differentColors.put("Slate Blue", new Color(106, 90, 205));
        differentColors.put("Slate Gray", new Color(112, 128, 144));
        differentColors.put("Snow", new Color(255, 250, 250));
        differentColors.put("Spring Green", new Color(0, 255, 127));
        differentColors.put("Steel Blue", new Color(70, 130, 180));
        differentColors.put("Tan", new Color(210, 180, 140));
        differentColors.put("Thistle", new Color(216, 191, 216));
        differentColors.put("Tomato", new Color(255, 99, 71));
        differentColors.put("Turquoise", new Color(64, 224, 208));
        differentColors.put("Violet", new Color(238, 130, 238));
        differentColors.put("Wheat", new Color(245, 222, 179));
        differentColors.put("White Smoke", new Color(245, 245, 245));
        differentColors.put("Yellow Green", new Color(154, 205, 50));
        
    }
    private boolean isValidColor(String color) throws IceepeeceeExcepcion {
        if(!differentColors.containsKey(color)){
            throw new IceepeeceeExcepcion(IceepeeceeExcepcion.NO_COLOR);
        }
        return true;
    }
}
    



