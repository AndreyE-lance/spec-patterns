package org.elantsev.chores1.shapes;

import org.elantsev.chores1.shapes.colors.Color;

/**
 * Point
 * Класс для описания графической фигуры "Точка".
 *
 * @author Andrey_Elantsev
 */
public class Point extends ShapeLeaf {

    /**
     * Координата точки.
     */
    private final Coordinate coordinates;

    public Point(Color color, Coordinate coordinates) {
        super(color);
        this.coordinates = coordinates;
    }

    public Point(Point point) {
        super(point);
        this.coordinates = new Coordinate(point.coordinates);
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public Object clone() {
        return new Point(this);
    }
}
