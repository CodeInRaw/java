package com.javarush.test.level07.lesson06.task04;

/* 5 строчек в начало списка
1. —оздай список строк.
2. ƒобавь в него 5 строчек с клавиатуры, но только добавл€ть не в конец списка, а в начало.
3. »спользу€ цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Ќапишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++){
            String s = br.readLine();
            list.add(0,s);
        }

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
