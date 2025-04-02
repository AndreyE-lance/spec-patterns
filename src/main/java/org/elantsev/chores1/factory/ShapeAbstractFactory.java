package org.elantsev.chores1.factory;

import org.elantsev.chores1.shapes.Circle;
import org.elantsev.chores1.shapes.Coordinate;
import org.elantsev.chores1.shapes.Line;
import org.elantsev.chores1.shapes.Point;
import org.elantsev.chores1.shapes.colors.Color;


/**
 * ShapeAbstractFactory
 * Параметризированный интерфейс абстрактной фабрики для создания фигур.
 * Параметр </T> отвечает за выбор цветовой схемы.
 *
 * @author Andrey_Elantsev
 */
public interface ShapeAbstractFactory<T extends Color> {

    Point createPoint(Coordinate coordinate, T color);
    Line createLine(Coordinate start, Coordinate end, T color);
    Circle createCircle(Coordinate center, int radius, T color);
}
