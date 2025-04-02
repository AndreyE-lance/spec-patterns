package org.elantsev;

import org.elantsev.chores1.scene.builder.SceneBuilderImpl;
import org.elantsev.chores1.shapes.Coordinate;
import org.elantsev.chores1.shapes.colors.Monochrome;

public class Main {
    public static void main(String[] args) {
        var point = new Coordinate(1, 2);
        var builder = new SceneBuilderImpl<Monochrome>();
        builder.buildPoint(new Coordinate(1, 2), Monochrome.BLACK);
        builder.buildCircle(new Coordinate(point), 4, Monochrome.WHITE);
        System.out.println(builder.getResult());
    }
}