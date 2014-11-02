package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(br.readLine());

        int[] arr = new  int[10];
        for (int i = array.length - 1; i >= 0; i--)
        {
            arr[10 - i - 1] = array[i];
        }

        for (int i = 0; i < array.length; i++)
            System.out.println(arr[i]);

    }
}
