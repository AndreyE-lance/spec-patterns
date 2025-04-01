package org.elantsev.chores1.scene;

import org.elantsev.chores1.shapes.AbstractGraphObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Scene
 * Класс сцены для отображения фигур.
 * Реализует паттерн синглтон.
 *
 * @author Andrey_Elantsev
 */
public class Scene {
    private static Scene instance;
    private List<AbstractGraphObject> graphObjects = new ArrayList<>();

    private Scene() {
    }

    public static synchronized Scene getInstance() {
        if (instance == null) {
            instance = new Scene();
        }
        return instance;
    }

    public void add(AbstractGraphObject graphObject) {
        graphObjects.add(graphObject);
    }
}
