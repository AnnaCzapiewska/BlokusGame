package Game;

import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.List;


public class Board {
    private List<Piece> pieces = new ArrayList<>();

    public boolean isCollision(Piece piece) {
        for (Piece item : pieces) {         //TODO refactor name "item"
            if(piece.isCollision(item)) {
                return true;
            }
        }
        return false;
    }
    public void draw() {
        Utilities.graphicsContext.setFill(Color.GAINSBORO);
        Utilities.graphicsContext.fillRect(100, 100, 350,350);
        for(int i = 0; i <= 14; i++) {
            for(int j = 0; j <= 14; j++){
                Utilities.graphicsContext.strokeRect(100,100, i*25, 25*j);
            }

        }
        /*
        for (Piece piece : pieces) {
            //piece.draw();
        }
         */

    }








}
