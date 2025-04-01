package org.elantsev.chores1.factory;

import org.elantsev.chores1.scene.Scene;
import org.elantsev.chores1.shapes.AbstractGraphObject;

/**
 * AbstractSceneAppender
 * Абстрактный класс служит для добавления хука в реализации фабрик
 * создания наследников {@link org.elantsev.chores1.shapes.AbstractGraphObject}
 *
 * @author Andrey_Elantsev
 */
public abstract class AbstractSceneAppender {
    private final Scene scene;

    public AbstractSceneAppender(Scene scene) {
        this.scene = scene;
    }

    protected void addOnScene(AbstractGraphObject object) {
        scene.add(object);
    }
}
