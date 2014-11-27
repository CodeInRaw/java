package com.javarush.test.level08.lesson08.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();

        for (int i=0; i<10; i++){
            map.put("M"+i,"A"+1);
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код


        int count = 0;
        for (Map.Entry<String,String> pairs : map.entrySet()){
            String lastName = pairs.getValue();
            if (lastName.equals(name))
                count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код
        int x = map.containsKey(familiya) ? 1 : 0;
        return x;
    }

    public static void printMap(Map<String,String> map){
        for (Map.Entry<String,String> pairs : map.entrySet()){
            String firstName = pairs.getKey();
            String lastName = pairs.getValue();
            System.out.println(firstName+" "+lastName);
        }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,String> person = new HashMap<String, String>(createMap());
        printMap(person);
        System.out.println("Input lastname for search : ");
        String searchLastName = br.readLine();
        int numberOfSameLastname = getCountTheSameLastName(person,searchLastName);
        System.out.println(numberOfSameLastname);
        System.out.println("Input name for search : ");
        String searchName = br.readLine();
        int numberOfSameName = getCountTheSameFirstName(person, searchName);
        System.out.println(numberOfSameName);

    }
}
