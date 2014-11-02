package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* ќдин большой массив и два маленьких
1. —оздать массив на 20 чисел.
2. ¬вести в него значени€ с клавиатуры.
3. —оздать два массива на 10 чисел каждый.
4. —копировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. ¬ывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Ќапишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] bigArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];

        for (int i = 0; i < bigArray.length; i++){
            int s = Integer.parseInt(br.readLine());
            bigArray[i] = s;
        }

        for (int i = 0; i < smallArray1.length; i++){
            int s = bigArray[i];
            smallArray1[i] = s;
        }

        for (int i = 0; i < smallArray2.length; i++){
            int s = bigArray[bigArray.length/2 + i];
            smallArray2[i] = s;
            System.out.println(smallArray2[i]);
        }
    }
}