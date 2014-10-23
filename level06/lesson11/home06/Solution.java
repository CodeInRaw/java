package com.javarush.test.level06.lesson11.home06;

/* KissMyShinyMetalAss
Создай класс с именем KissMyShinyMetalAss. Создай объект этого класса, выведи его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //KissMyShinyMetalAss ass = new KissMyShinyMetalAss();
        System.out.println(KissMyShinyMetalAss.voice);
    }

    public static class KissMyShinyMetalAss
    {
        static final String voice = "Kiss My Shiny Metal Ass";
    }

}
