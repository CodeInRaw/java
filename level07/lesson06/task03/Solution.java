package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        ArrayList<String > list = new ArrayList<String>();
        ArrayList<String > rList = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
            list.add(br.readLine());

        for (int i = list.size()-1; i >= 0; i--)
        {
            String s = list.get(i);
            rList.add((list.size()-i-1), s);
        }

        for (int i = 0; i < rList.size(); i++){
            System.out.println(rList.get(i));
        }
    }
}
