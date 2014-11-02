package com.javarush.test.level07.lesson06.task05;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
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
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 5; i++){
            String s = br.readLine();
            list.add(s);
        }
        int listLength = list.size()-1;
        for (int i = 0; i < 13; i++){
            String s = list.get(listLength);
            list.remove(listLength);
            list.add(0,s);
        }

        for (String element : list){
            System.out.println(element);
        }
    }
}