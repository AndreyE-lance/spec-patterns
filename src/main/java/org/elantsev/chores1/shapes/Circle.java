package org.elantsev.chores1.shapes;

import org.elantsev.chores1.shapes.colors.Color;

/**
 * Circle
 * Класс для описания графической фигуры "Окружность".
 * @author Andrey_Elantsev
 */
public class Circle extends AbstractGraphObject {

    /**
     * Координата центра.
     */
    private final Coordinate center;

    /**
     * Радиус.
     */
    private final Integer radius;

    public Circle(Color color, Coordinate center, Integer radius) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle);
        this.center = new Coordinate(circle.center);
        this.radius = circle.radius;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return new Circle(this);
    }
}
