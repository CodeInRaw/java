package com.javarush.test.level08.lesson08.task05;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        Map<String,String> map = new HashMap<String, String>();
        map.put("Samuel", "Steave");
        map.put("Samson", "Derek");
        map.put("Solomon", "Alex");
        map.put("simon", "Peter");
        map.put("Gexon", "Peter");
        map.put("Sammy", "Alex");
        map.put("Sanches", "Alexandro");
        map.put("Heidu", "Keita");
        map.put("Klitsko", "Vitaliy");
        map.put("Korogva", "Steave");
        return (HashMap)map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //Напишите тут ваш код
        Map<String,String> map2 = new HashMap<String, String>(map);
        Map<String,String> map3 = new HashMap<String, String>(map);

        for (Map.Entry<String,String> pair : map2.entrySet()){
            map3.remove(pair.getKey());
            String name = pair.getValue();
            if (map3.containsValue(name)){
                removeItemFromMapByValue(map,name);
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void printMap(HashMap<String,String>map){
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        int i=0;
        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            System.out.println(i+" : "+pair.getKey()+" "+pair.getValue());
            i++;
        }
    }

    public static void main(String args[]) throws IOException{
        HashMap<String,String> map = createMap();
        printMap(map);
        removeTheFirstNameDuplicates(map);
        printMap(map);
    }
}
