package org.elantsev.chores1.scene;

import org.elantsev.chores1.facade.SceneFacade;
import org.elantsev.chores1.shapes.CompositeShape;
import org.elantsev.chores1.shapes.ShapeLeaf;

/**
 * Scene
 * Класс сцены для отображения фигур.
 * Реализует паттерн синглтон.
 *
 * @author Andrey_Elantsev
 */
public class Scene implements SceneFacade {

    private static Scene instance;

    private ShapeLeaf root;

    private Scene() {
    }

    public static synchronized Scene getInstance() {
        if (instance == null) {
            instance = new Scene();
        }
        return instance;
    }

    public void add(CompositeShape compositeShape, ShapeLeaf leaf) {
        if (compositeShape == null && root != null) {
            compositeShape = (CompositeShape) root;
        }
        if (compositeShape == null) {
            root = leaf;
        } else {
            compositeShape.getChildren().add(leaf);
        }

    }

    public void setRoot(ShapeLeaf root) {
        this.root = root;
    }

    @Override
    public void showScene(String... args) {
        //реализация фасада
    }
}
