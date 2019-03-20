package Game;

import javafx.scene.paint.Color;


public class Square {

    private int positionX;
    private int positionY;
    private static final int squareSize = 25;


    public Square(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public boolean isOutOfBoard() {
        if(positionX < 0 || positionX > Utilities.BOARD_SIZE) {
            return true;
        }
        if(positionY < 0 || positionY > Utilities.BOARD_SIZE) {
            return true;
        }
        return false;
    }
    public boolean isSideCollision(Square square) {
        if(Math.abs(positionX - square.positionX) == 1 && positionY == square.positionY) {
            return true;
        }
        if(Math.abs(positionY - square.positionY) == 1 && positionX == square.positionX) {
            return true;
        }
        return false;
    }
    public boolean isCrossCollision(Square square) {
        if(Math.abs(positionX - square.positionX) == 1 && Math.abs(positionY - square.positionY) == 1) {
            return true;
        }
        return false;
    }
    public boolean isCollision(Square square) {
        if(positionX == square.positionX && positionY == square.positionY) {
            return true;
        }
        return false;
    }

    public void draw(Color color, int positionX, int positionY) {
        Utilities.graphicsContext.setStroke(Color.BLACK);
        Utilities.graphicsContext.setLineWidth(3.0);
        Utilities.graphicsContext.setFill(color);

        Utilities.graphicsContext.strokeRect(this.positionX*squareSize + positionX, this.positionY*squareSize + positionY, squareSize, squareSize);
        Utilities.graphicsContext.fillRect(this.positionX*squareSize + positionX, this.positionY*squareSize + positionY, squareSize, squareSize);
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
