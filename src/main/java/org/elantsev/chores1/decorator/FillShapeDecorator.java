package org.elantsev.chores1.decorator;

import org.elantsev.chores1.shapes.ShapeLeaf;
import org.elantsev.chores1.shapes.colors.Color;

/**
 * FillShapeDecorator
 * Класс-декоратор для заливки фигур.
 *
 * @author Andrey_Elantsev
 */
public class FillShapeDecorator extends ShapeLeaf {
    private final ShapeLeaf decorateLeaf;
    private Color decorateColor;

    public FillShapeDecorator(Color color, ShapeLeaf decorateLeaf, Color decorateColor) {
        super(color);
        this.decorateLeaf = decorateLeaf;
        this.decorateColor = decorateColor;
    }

    public FillShapeDecorator(ShapeLeaf decorateLeaf, Color color) {
        super(color);
        this.decorateLeaf = decorateLeaf;
    }

    public void setDecorateColor(Color decorateColor) {
        this.decorateColor = decorateColor;
    }

    @Override
    public void draw() {
        this.decorateLeaf.draw();
        if(decorateColor != null) {
            System.out.println("Decorate Color: " + decorateColor);
        } else {
            System.out.println("Decorate Color is null");
        }
    }
}
