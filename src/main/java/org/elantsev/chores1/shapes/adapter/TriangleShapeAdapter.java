package org.elantsev.chores1.shapes.adapter;

import org.elantsev.chores1.shapes.AbstractGraphObject;
import org.elantsev.chores1.shapes.Coordinate;
import org.elantsev.chores1.shapes.ShapeLeaf;
import org.elantsev.chores1.shapes.colors.Color;
import org.elantsev.chores1.shapes.external.Triangle;

/**
 * TriangleShapeAdapter
 * Класс-адаптер для фигуры "Треугольник"
 *
 * @author Andrey_Elantsev
 */
public class TriangleShapeAdapter extends ShapeLeaf {

    private Triangle triangle;

    public TriangleShapeAdapter(Color color, Coordinate coordinate1, Coordinate coordinate2, Coordinate coordinate3) {
        super(color);
        this.triangle = new Triangle(coordinate1.getX(), coordinate1.getY(), coordinate2.getX(), coordinate2.getY(),
                coordinate3.getX(), coordinate3.getY());
    }

    @Override
    public void draw() {
        System.out.println(triangle);
    }
}
