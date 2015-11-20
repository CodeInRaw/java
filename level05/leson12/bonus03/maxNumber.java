package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numN = Integer.parseInt(reader.readLine());
        int maximum = max(numN);


        System.out.println(maximum);
    }

    public static int max(int N) throws Exception{
        //int max = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(reader.readLine()); //first number
        // numbers from 1 to 9
        for (int i=N; i>1; i--){
            int num = Integer.parseInt(reader.readLine());
            max = max > num ? max : num;
        }
        return max;
    }
}
