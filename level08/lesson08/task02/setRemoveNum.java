package com.javarush.test.level08.lesson08.task02;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //Напишите тут ваш код
        HashSet<Integer> setNumbers = new HashSet<Integer>();
        int amount = 20;
        for (int i=0; i<amount; i++){
            setNumbers.add(i);
        }
        return setNumbers;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //Напишите тут ваш код

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            int num = iterator.next();
            if (num > 10){
                iterator.remove();
            }
        }
        return set;
    }

    public static void printSet(HashSet<Integer> set){
        for (Integer num : set)
            System.out.println(num);
    }

    public static void main(String args[]) throws IOException
    {
        HashSet<Integer> num = new HashSet<Integer>(createSet());
        printSet(num);
        removeAllNumbersMoreThan10(num);
        printSet(num);
    }
}
