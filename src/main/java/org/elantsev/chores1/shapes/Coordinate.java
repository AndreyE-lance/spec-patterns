package org.elantsev.chores1.shapes;

import org.elantsev.chores1.scene.Scene;

/**
 * Coordinate
 * Класс для описания точки координат для размещения
 * объектов-наследников {@link AbstractGraphObject} на сцене {@link Scene}
 * @author Andrey_Elantsev
 */
public class Coordinate {
    private final Integer x;
    private final Integer y;

    public Coordinate(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate(Coordinate coordinate) {
        this.x = coordinate.x;
        this.y = coordinate.y;
    }

    public Integer getY() {
        return y;
    }

    public Integer getX() {
        return x;
    }
}
