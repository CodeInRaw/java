package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        //printCatMap(map);
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    private static String [] names = {"vas", "mur", "mia", "Bars", "Push", "Rizhik", "Kisa", "cat", "cat1", "cat2"};

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<String, Cat>();
        for (String name : names){
            map.put(name, new Cat(name));
        }
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<Cat>();
        set.addAll(map.values());
        /*
        for(Map.Entry<String,Cat> pair : map.entrySet()){

            Cat catValue = pair.getValue();

            set.add(catValue);
        }*/

        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static void printCatMap(Map<String, Cat> map){

        for (Map.Entry<String,Cat> pair : map.entrySet()){

            String nameKey = pair.getKey();
            Cat catValue = pair.getValue();
            System.out.println(nameKey+" : "+catValue);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
