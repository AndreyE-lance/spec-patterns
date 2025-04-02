package org.elantsev.chores1.shapes;

import org.elantsev.chores1.shapes.colors.Color;

/**
 * Line
 * Класс для описания графической фигуры "Линия".
 *
 * @author Andrey_Elantsev
 */
public class Line extends ShapeLeaf {

    /**
     * Начальная координата.
     */
    private final Coordinate start;

    /**
     * Конечная координата.
     */
    private final Coordinate end;

    public Line(Color color, Coordinate start, Coordinate end) {
        super(color);
        this.start = start;
        this.end = end;
    }

    public Line(Line line) {
        super(line.color);
        this.start = new Coordinate(line.start);
        this.end = new Coordinate(line.end);
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public Object clone() {
        return new Line(this);
    }
}
