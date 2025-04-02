package org.elantsev.chores1.shapes.colors;

import org.elantsev.chores1.shapes.AbstractGraphObject;

/**
 * Color
 * Класс-перечисление, служит для описания возможных цветов
 * фигур-наследников {@link AbstractGraphObject}
 *
 * @author Andrey_Elantsev
 */
public enum Colors implements Color {

    /**
     * Синий
     */
    BLUE,

    /**
     * Красный
     */
    RED,

    /**
     * Зеленый
     */
    GREEN,

    /**
     * Желтый
     */
    YELLOW;
}
