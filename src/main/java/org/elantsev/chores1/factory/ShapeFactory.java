package org.elantsev.chores1.factory;

import org.elantsev.chores1.scene.Scene;
import org.elantsev.chores1.shapes.Circle;
import org.elantsev.chores1.shapes.Coordinate;
import org.elantsev.chores1.shapes.Line;
import org.elantsev.chores1.shapes.Point;
import org.elantsev.chores1.shapes.colors.Color;

/**
 * ColorShapeFactory
 * Фабрика для создания цветных наследников
 * {@link org.elantsev.chores1.shapes.AbstractGraphObject}
 *
 * @author Andrey_Elantsev
 */
public class ShapeFactory<T extends Color> extends AbstractSceneAppender
        implements ShapeAbstractFactory<T> {

    public ShapeFactory(Scene scene) {
        super(scene);
    }

    @Override
    public Point createPoint(Coordinate coordinate, T color) {
        var point = new Point(color, coordinate);
        addOnScene(point);
        return point;
    }

    @Override
    public Line createLine(Coordinate start, Coordinate end, T color) {
        var line = new Line(color, start, end);
        addOnScene(line);
        return line;
    }

    @Override
    public Circle createCircle(Coordinate center, int radius, T color) {
        var circle = new Circle(color, center, radius);
        addOnScene(circle);
        return circle;
    }

}
