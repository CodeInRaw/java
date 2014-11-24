package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static final int N = 20;
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        //Напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();

        //create list with 20 digits
        for (int i = 0; i<N; i++){
            int num = Integer.parseInt(reader.readLine());
            list.add(num);
        }

        //search max and min digit
        maximum = list.get(1);
        minimum = list.get(0);
        for (int i = 0; i<list.size();i++){
            int s = list.get(i);
            if (s<=minimum){minimum = list.get(i);}
            else if (s>=maximum){maximum = list.get(i);}
            else i++;
        }

        //output max and min
        System.out.println(maximum);
        System.out.println(minimum);
    }
}
