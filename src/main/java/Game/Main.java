package Game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        AnchorPane root = new AnchorPane();

        primaryStage.setScene(new Scene(root));
        primaryStage.setHeight(Utilities.windowHeight);
        primaryStage.setWidth(Utilities.windowWidth);
        primaryStage.show();

        root.getChildren().add(Utilities.WINDOW);

        Board board = new Board();
        board.draw();

        Player player = Player.PLAYER_1;
        player = Player.changePlayer(player);

        PiecesBase.createAllPieces(player);
/*
        Button button = new Button("rotate");
        root.getChildren().add(button);
        button.setOnAction(e-> System.out.println("Lal la"));
 */






    }


}
