package com.javarush.test.level08.lesson11.home09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Input date: ");
        String inputDate = br.readLine();
        System.out.println(isDateOdd(inputDate));
    }

    public static boolean isDateOdd(String date)
    {
        Date yearStartTimes = new Date(date);
        yearStartTimes.setHours(0);
        yearStartTimes.setMinutes(0);
        yearStartTimes.setSeconds(0);

        yearStartTimes.setMonth(0); //January 0-11
        yearStartTimes.setDate(1); // 1-st january
        //System.out.println(yearStartTimes);
        Date currentTimes = new Date(date);
        //System.out.println(currentTimes);
        long mscInDay = 24*60*60*1000;
        long mscTimeDistance = currentTimes.getTime() - yearStartTimes.getTime();
        int dayAmount = (int) (mscTimeDistance/mscInDay)+1;

        boolean oddDay;
        oddDay = (dayAmount%2 == 0) ? false : true;
        return oddDay;
    }
}
