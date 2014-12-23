﻿package com.javarush.test.level08.lesson08.task01;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //Напишите тут ваш код
        HashSet<String> setWord = new HashSet<String>();

        for (int i = 0; i<20; i++){
            setWord.add("Л"+i);
        }
        return setWord;
    }

    public static void main(String args[]) throws IOException{
        HashSet<String> set = createSet();
        for (String text:set){
            System.out.println(text);
        }
    }
}