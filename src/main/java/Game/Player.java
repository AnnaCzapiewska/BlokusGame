package Game;

import javafx.scene.paint.Color;

public enum Player {

    NO_PLAYER(0, Color.BEIGE),
    PLAYER_1(1, Color.RED),
    PLAYER_2(2, Color.GREEN);

    private int id;
    private Color color;

    Player(int id, Color colorPieces) {
        this.id = id;
        color = colorPieces;
    }

    public static Player changePlayer(Player player) {
        if(player == Player.PLAYER_1) {
            return Player.PLAYER_2;
        }else {
            return Player.PLAYER_1;
        }
    }

    public int getPlayerId() {
        return id;
    }

    public Color getColor() {
        return color;
    }
}
