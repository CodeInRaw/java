package com.javarush.test.level07.lesson12.home02;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
/*create the list with digits*/
        for (int i = 0; i<N; i++){
            int s = Integer.parseInt(reader.readLine());
            list.add(s);
        }
        
        permutationList(list, M);
        printList(list);
    }

    /*@return permutation list.
    Where first M digits moved to the end of the list */
    public static ArrayList<Integer> permutationList(ArrayList<Integer> list, int M){
        for (int i = 0; i<M; i++){
            int num = list.get(0);
            list.add(num);
            list.remove(0);
        }
        return list;
}
    //Input our list
    public static void printList(ArrayList<Integer> list){
        for (int element : list){
            System.out.println(element);
        }
    }
}
