package org.elantsev.chores1.scene.builder;

import org.elantsev.chores1.factory.ShapeAbstractFactory;
import org.elantsev.chores1.factory.ShapeFactory;
import org.elantsev.chores1.scene.Scene;
import org.elantsev.chores1.shapes.Coordinate;
import org.elantsev.chores1.shapes.colors.Color;

/**
 * SceneBuilderImpl
 * Реализация SceneBuilder
 *
 * @author Andrey_Elantsev
 */
public class SceneBuilderImpl<T extends Color> implements SceneBuilder<T> {

    private final ShapeAbstractFactory<T> factory;
    private final Scene scene;

    public SceneBuilderImpl() {
        this.scene = Scene.getInstance();
        this.factory = new ShapeFactory<T>(scene);
    }

    @Override
    public void buildPoint(Coordinate coordinate, T color) {
        factory.createPoint(coordinate, color);
    }

    @Override
    public void buildLine(Coordinate start, Coordinate end, T color) {
        factory.createLine(start, end, color);
    }

    @Override
    public void buildCircle(Coordinate center, int radius, T color) {
        factory.createCircle(center, radius, color);
    }

    @Override
    public Scene getResult() {
        return scene;
    }
}
