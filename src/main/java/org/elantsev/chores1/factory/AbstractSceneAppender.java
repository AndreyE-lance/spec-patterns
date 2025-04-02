package org.elantsev.chores1.factory;

import org.elantsev.chores1.scene.Scene;
import org.elantsev.chores1.shapes.AbstractGraphObject;
import org.elantsev.chores1.shapes.CompositeShape;
import org.elantsev.chores1.shapes.ShapeLeaf;

/**
 * AbstractSceneAppender
 * Абстрактный класс служит для добавления хука в реализации фабрик
 * создания наследников {@link org.elantsev.chores1.shapes.AbstractGraphObject}
 *
 * @author Andrey_Elantsev
 */
public abstract class AbstractSceneAppender {
    private final Scene scene;
    private final CompositeShape compositeShape;

    public AbstractSceneAppender(Scene scene, CompositeShape compositeShape) {
        this.scene = scene;
        this.compositeShape = compositeShape;
    }

    protected void addOnScene(ShapeLeaf leaf) {
        scene.add(compositeShape, leaf);
    }
}
