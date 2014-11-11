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

    //search min digit
    public static int min(ArrayList<Integer> list){
        int min = list.get(0);

        for (int i = 0; i<list.size();i++){
            int s = list.get(i);
            min = s<min ? s : min;
        }
        return min;
    }
    
    //search max digit
    public static int max(ArrayList<Integer> list){
        int max = list.get(1);

        for (int i = 0; i<list.size();i++){
            int s = list.get(i);
            max = s>max ? s : max;
        }
        return max;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum = 0;
        int  minimum = 0;

        //Напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();

        //create list with 20 digits
        for (int i = 0; i<N; i++){
            int num = Integer.parseInt(reader.readLine());
            list.add(num);
        }

        //output max and min
        minimum = min(list);
        maximum = max(list);
        System.out.println(maximum);
        System.out.println(minimum);
    }
}
