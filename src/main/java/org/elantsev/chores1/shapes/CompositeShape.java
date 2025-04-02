package org.elantsev.chores1.shapes;

import org.elantsev.chores1.shapes.colors.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * CompositeShape
 * Класс для хранения сложносоставных фигур, наследников {@link ShapeLeaf}
 *
 * @author Andrey_Elantsev
 */
public class CompositeShape extends ShapeLeaf {

    private  List<ShapeLeaf> children = new ArrayList<>();

    public CompositeShape(Color color) {
        super(color);
    }

    public List<ShapeLeaf> getChildren() {
        return children;
    }

    @Override
    public void draw() {
        children.forEach(ShapeLeaf::draw);
    }
}
