package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Input number : ");
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i<N; i++){
        Integer num = Integer.parseInt(br.readLine());
        list.add(num);
    }

        printList(list);
    }

    public static void printList(ArrayList<Integer> list){

        for (int i = list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
    }
}
