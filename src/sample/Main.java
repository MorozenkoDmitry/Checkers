package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane root = new Pane();

        Graphics graphics = new Graphics(root);
        graphics.makeGraphics();

        primaryStage.setScene(new Scene(root, 240, 240));
        primaryStage.setTitle("Hello World");
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
