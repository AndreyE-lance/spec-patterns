package org.elantsev.chores1.shapes.external;

import org.elantsev.chores1.shapes.Coordinate;

/**
 * Triangle
 * Класс для описания графической фигуры "Треугольник".
 *
 * @author Andrey_Elantsev
 */
public class Triangle {

    private final Integer vertexX1;
    private final Integer vertexY1;
    private final Integer vertexX2;
    private final Integer vertexY2;
    private final Integer vertexX3;
    private final Integer vertexY3;

    public Triangle(Integer vertexX1, Integer vertexY1, Integer vertexX2, Integer vertexY2, Integer vertexX3, Integer vertexY3) {
        this.vertexX1 = vertexX1;
        this.vertexY1 = vertexY1;
        this.vertexX2 = vertexX2;
        this.vertexY2 = vertexY2;
        this.vertexX3 = vertexX3;
        this.vertexY3 = vertexY3;
    }

    public Integer getVertexX1() {
        return vertexX1;
    }

    public Integer getVertexY1() {
        return vertexY1;
    }

    public Integer getVertexX2() {
        return vertexX2;
    }

    public Integer getVertexY2() {
        return vertexY2;
    }

    public Integer getVertexX3() {
        return vertexX3;
    }

    public Integer getVertexY3() {
        return vertexY3;
    }
}
