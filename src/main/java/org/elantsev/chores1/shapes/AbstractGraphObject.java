package org.elantsev.chores1.shapes;

import org.elantsev.chores1.scene.Scene;
import org.elantsev.chores1.shapes.colors.Color;

/**
 * AbstractGraphObject
 * Абстрактный класс, содержащий общие поля и методы для отображаемых
 * на сцене {@link Scene} фигур.
 * Классы-наследники должны реализовывать метод {@link AbstractGraphObject#draw()}
 * в соответствии с имеющимися особенностями вычисления положения
 * на координатной сетке. Обязательным параметром для каждого наследника
 * является цвет {@link Color}, передаваемый в конструктор по-умолчанию.
 *
 * @author Andrey_Elantsev
 */
public abstract class AbstractGraphObject implements Cloneable {

    /**
     * Метод служит для изображения фигур на сцене {@link Scene}
     */
    abstract public void draw();
}
