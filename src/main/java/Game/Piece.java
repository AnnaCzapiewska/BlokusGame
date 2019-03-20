package Game;
import javafx.scene.paint.Color;

import java.util.List;

import static Game.Utilities.*;

public class Piece {

    private int positionX;
    private int positionY;
    private Color color;
    private boolean isActiv = false;
    private boolean isAvailable = true;
    private List<Square> squareList;


    Piece(int positionX, int positionY, Color color, List<Square> squares) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
        squareList = squares;

    }
    public boolean isCollision(Piece piece) {

        for(Square square : squareList) {
            if(square.isOutOfBoard()) {
                return true;
            }
        }
        for(Square square : squareList) {
            for (Square item : piece.squareList) { //TODO refactor name "item"
                if(square.isCollision(item)) {
                    return true;
                }
            }
        }
        if(color == piece.color) {
            for(Square square : squareList) {
                for (Square item : piece.squareList) { //TODO refactor name "item"
                    if(square.isSideCollision(item)) {
                        return true;
                    }
                }
            }
        }
        if(color == piece.color) {
            for (Square square : squareList) {
                for (Square item : piece.squareList) { //TODO refactor name "item"
                    if (square.isCrossCollision(item)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    void draw(Player player) {
        for (Square square : squareList) {
            square.draw(player.getColor(), positionX, positionY);
        }
    }



    void movePiece (int newPositionX, int newPositionY) {
        if(positionX + newPositionX < BOARD_SIZE) {
            if(positionX + newPositionX >= 0) {
                positionX += newPositionX;
            }
        }
        if(positionY +newPositionY < BOARD_SIZE) {
            if(positionY + newPositionY >= 0) {
                positionY = newPositionY;
            }
        }
    }

    void setPosition(int newPositionX, int newPositionY) {
        positionX = newPositionX;
        positionY = newPositionY;
    }

    void rotatePieceX() {
        for (Square square : squareList) {
            square.setPositionX(square.getPositionX());
            square.setPositionY(-square.getPositionY());
        }
    }

   /* void rotatePieceX() {
        for(Piece item:pieces) {
            item.setPosition(item.getPositionX(), -item.getPositionY());
        }
    }

    void rotatePieceY() {
        for (Piece item:pieces) {
            item.setPosition(item.getPositionX(), item.getPositionY());
        }
    }

    void rotatePieceZ() {
        for (Piece item:pieces) {
            item.setPosition(item.getPositionY(), -item.getPositionX());
        }
    }
*/

    public double getPiecePositionX() {
        return positionX;
    }

    public double getPiecePositionY() {
        return positionY;
    }
    /*

  */

}
