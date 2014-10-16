package com.javarush.test.level05.lesson07.task05;

/**
 * JavaRush.ru
 * Level 05, Lesson 07, task 05
 * <p/>
 * Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя,
 * ширина и высота).
 * Создать для него как можно больше методов initialize(…)
 * Примеры:
 * - заданы 4 параметра: left, top, width, height
 * - ширина/высота не задана (оба равны 0)
 * - высота не задана (равно ширине) создаём квадрат
 * - создаём копию другого прямоугольника (он и передаётся в параметрах)
 * <p/>
 * Date: 23.01.13
 * @author Sergey Kandalintsev
 */
public class Rectangle
{
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize( int left, int top, int width, int height )
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize( int left, int top )
    {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }

    public void initialize( int left, int top, int width )
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    public void initialize( Rectangle rectangle )
    {
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }
}