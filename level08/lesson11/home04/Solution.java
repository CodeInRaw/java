package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум
        int minElement = 0;

        while (!array.isEmpty())
        {
            minElement = Collections.min(array);
            break;
        }

/*
        int min = array.get(0);

        while (!array.isEmpty()) {

            for (int num : array){
                min = min > num ? num : min;
           }
            break;
      }*/
        return minElement;
    }

    public static List<Integer> getIntegerList() throws IOException {
        //Тут создать и заполнить список
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        int N = Integer.parseInt(br.readLine());

        for (int i=1; i<=N; i++){
            //System.out.println("Enter number "+i+" ");
            int num = Integer.parseInt(br.readLine());
            list.add(num);
        }

        return list;
    }
}
