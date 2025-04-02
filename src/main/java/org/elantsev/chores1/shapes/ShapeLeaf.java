package org.elantsev.chores1.shapes;

import org.elantsev.chores1.scene.Scene;
import org.elantsev.chores1.shapes.colors.Color;

/**
 * ShapeLeaf
 * Класс для построения иерархической зависимости фигур.
 *
 * @author Andrey_Elantsev
 */
public abstract class ShapeLeaf extends AbstractGraphObject {

    /**
     * Поле для хранения цвета фигуры.
     */
    Color color;

    public ShapeLeaf(Color color) {
        this.color = color;
    }

    public ShapeLeaf(ShapeLeaf shapeLeaf) {
        this.color = shapeLeaf.color;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
