package sample.BoardElements;

import java.awt.*;

public class Ceil extends Rectangle {
    private Figure figure;
    public Rectangle rectangle;

    Ceil(int x, int y, int width, int height) {
        Rectangle rect = new Rectangle(x, y, width, height);
        this.rectangle = rect;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }
}
