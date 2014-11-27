package com.javarush.test.level08.lesson08.task04;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE      1 1980"));
        map.put("Сталлон",  new Date("JULY      1 1980"));
        map.put("Сталло",   new Date("AUGUST    1 1980"));
        map.put("Сталл",    new Date("SEPTEMBER 1 1980"));
        map.put("Стал",     new Date("OCTOBER   1 1980"));
        map.put("Ста",      new Date("NOVEMBER  1 1980"));
        map.put("Ст",       new Date("DECEMBER  1 1980"));
        map.put("С",        new Date("JANUARY   1 1981"));
        map.put("Stall",    new Date("FEBRUARY  1 1981"));
        map.put("Stallone", new Date("MARCH     1 1981"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Date> pair = iterator.next();
            Date date = pair.getValue();
            int month = date.getMonth();
            if (month>4&&month<8){
                iterator.remove();
            }
        }

    }

    public static void printMap(Map<String,Date> map){
        int i = 0;
        for (Map.Entry<String,Date> pairs : map.entrySet()){

            String name = pairs.getKey();
            Date   date = pairs.getValue();
            System.out.println(i+" : "+name+" "+date);
            i++;
        }
    }

    public static void main(String args[]){
        HashMap<String, Date> map = new HashMap<String, Date>(createMap());

        printMap(map);
        removeAllSummerPeople(map);
        System.out.println();
        printMap(map);
    }
}
