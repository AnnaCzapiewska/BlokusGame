package Game;


import java.util.ArrayList;
import java.util.List;

public class PiecesBase {

    public static List<Square> squareList = new ArrayList<>();
    public static List<Piece> pieceList = new ArrayList<>();

    public static List<Square> createSquereList1() {
        squareList.add(new Square(0,0));
        return squareList;
    }
    public static List<Square> createSquereList2() {
        squareList.add(new Square(0,0));
        squareList.add(new Square(0,1));
        return squareList;
    }
    public static List<Square> createSquereList3() {
        squareList.add(new Square(0,0));
        squareList.add(new Square(0,1));
        squareList.add(new Square(0,2));
        return squareList;
    }

    public static void createPiece1(Player player) {
        Piece piece = new Piece(50, 800, player.getColor(), createSquereList1());
        piece.draw(player);
        pieceList.add(piece);
    }
    public static void createPiece2(Player player) {
        Piece piece = new Piece(100, 800, player.getColor(), createSquereList2());
        piece.draw(player);
        pieceList.add(piece);
    }
    public static void createPiece3(Player player) {
        Piece piece = new Piece(150, 800, player.getColor(), createSquereList3());
        piece.draw(player);
        pieceList.add(piece);
    }

    public static void createAllPieces(Player player) {
        createPiece1(player);
        createPiece2(player);
        createPiece3(player);
    }




}
