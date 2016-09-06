package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        int[] a = {0,1,2,3,4};
        int[] b = {0,1};
        int[] c = {0,1,2,3};
        int[] d = {0,1,2,3,4,5,6};
        int[] e = {};
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        arrayList.add(d);
        arrayList.add(e);

        return arrayList;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
