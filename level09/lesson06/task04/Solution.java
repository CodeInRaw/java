package com.javarush.test.level09.lesson06.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Исключение при работе с коллекциями List
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            ArrayList<String> list = new ArrayList<String>();
            //String str = list.get(18);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 5; i++)
            {
                String s = br.readLine();
                list.add(s);
            }
            int max = 0;
            for (int i = 0; i < 5; i++)
            {
                String s = list.get(i);
                int count = s.length();
                if (count > max)
                    max = count;
            }
            for (int i = 0; i < 5; i++)
            {
                String s = list.get(i);
                if (max == s.length())
                {
                    System.out.println(list.get(i));
                }
            }

        }catch (Exception e){

            System.out.print(e);
        }

    }
}
