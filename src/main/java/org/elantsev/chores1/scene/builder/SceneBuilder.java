package org.elantsev.chores1.scene.builder;

import org.elantsev.chores1.scene.Scene;
import org.elantsev.chores1.shapes.Coordinate;
import org.elantsev.chores1.shapes.colors.Color;

/**
 * SceneBuilder
 * Параметризированный интерфейс билдера для построения сцены.
 * Параметр </T> отвечает за выбор цветовой схемы.
 *
 * @author Andrey_Elantsev
 */
public interface SceneBuilder<T extends Color> {
    void buildPoint(Coordinate coordinate, T color);
    void buildLine(Coordinate start, Coordinate end, T color);
    void buildCircle(Coordinate center, int radius, T color);
    Scene getResult();
}
