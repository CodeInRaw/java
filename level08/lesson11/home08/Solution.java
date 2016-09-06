package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        //printArray(array);
/*
        int[] numbers = array;
        Date startTime1 = new Date();
        Arrays.sort(numbers);
        Date endTime1 = new Date();
        long elapsedTime1 = endTime1.getTime() - startTime1.getTime();
        System.out.println("time for standartsort: "+elapsedTime1);
        printArray(numbers);
*/
        Quicksort sorter = new Quicksort();
        //long startTime = System.currentTimeMillis();
        sorter.sort(array);
        //long endTime = System.currentTimeMillis();
        //long elapsedTime = endTime - startTime;
        //System.out.println("time for quicksort: "+elapsedTime);

        //printArray(array);
        //sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }


    public static void printArray(int[] array){
        for (int arr : array){
            System.out.print(arr+" ");
        }

        System.out.println();
    }


    public static class Quicksort{

        private int [] numbers;
        private int number;

        public void sort(int[] array){
            //check for empty or null array
            if (array == null || array.length == 0){
                return;
            }
            this.numbers = array;
            number = array.length;
            quicksort(0, number - 1);
        }

        private void quicksort(int low, int heigh){
            int i = low, j = heigh;
            //Get the pivot element from the middle of the list
            int middle = numbers[low + (heigh-low)/2];
            //System.out.println("pivot: "+middle);

            //Divide into two lists
            while (i<=j){
                while (numbers[i]>middle){
                    i++;
                }

                while (numbers[j]<middle){
                    j--;
                }

                if (i<=j){
                    swap(i,j);
                    i++;
                    j--;
                }
            }

            //Recursion
            if (low < j)
                quicksort(low, j);
            if (i < heigh)
                quicksort(i, heigh);
        }

        private void swap(int i, int j){
            int tmp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = tmp;
        }
    }

    /*
    public static void sort(int[] array){
        //check for empty or null array
        if (array == null || array.length == 0){
            return;
        }

        int number = array.length;
        quicksort(array, 0, number - 1);
    }

    private static void quicksort(int[] arr, int low, int heigh){
        int i = low, j = heigh;
        //Get the pivot element from the middle of the list
        int middle = arr[low + (heigh-low)/2];
        //System.out.println("pivot: "+middle);

        //Divide into two lists
        while (i<=j){
            while (arr[i]>middle){
                i++;
            }

            while (arr[j]<middle){
                j--;
            }

            if (i<=j){
                swap(arr,i,j);
                i++;
                j--;
            }
        }

        //Recursion
        if (low < j)
            quicksort(arr, low, j);
        if (i < heigh)
            quicksort(arr, i, heigh);
    }

    private static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
*/

}


