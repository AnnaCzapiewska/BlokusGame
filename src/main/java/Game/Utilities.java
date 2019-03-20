package Game;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;



public class Utilities {

    public static final int BOARD_SIZE = 15;
    public static int windowWidth = 1500;
    public static int windowHeight = 1000;
    public static Canvas WINDOW = new Canvas(windowWidth, windowHeight);
    public static GraphicsContext graphicsContext = WINDOW.getGraphicsContext2D();

}

