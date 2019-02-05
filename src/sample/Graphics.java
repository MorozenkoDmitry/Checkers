package sample;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Graphics {

    private Pane root;

    public Graphics(Pane root) {
        this.root = root;
    }

    public Pane getRoot() {
        return root;
    }

    public void setRoot(Pane root) {
        this.root = root;
    }

    public void setBackgroundColor() {
        BackgroundFill backgroundFill = new BackgroundFill(Color.LIGHTSLATEGRAY, null, null);
        Background background = new Background(backgroundFill);
        root.setBackground(background);
    }

    public void makeBoard() {
        int sideSize = 30;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle ceil = new Rectangle(j * sideSize,i * sideSize,sideSize, sideSize);
                if ((i + j + 1)% 2 == 0) {
                    ceil.setFill(Color.BROWN);
                } else {
                    ceil.setFill(Color.BISQUE);
                }
                root.getChildren().addAll(ceil);
            }
        }
    }

    public void makeGraphics() {
        setBackgroundColor();
        makeBoard();
    }
}
