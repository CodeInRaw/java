package com.javarush.test.level05.lesson12.home05;
import java.io.*;
/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word;
        int sum = 0;
        while (!"сумма".equals(word = reader.readLine()))
        {
            int num = Integer.parseInt(word);
            sum += num;
        }

        System.out.println(sum);
    }
}
