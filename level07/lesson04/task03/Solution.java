package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 �������
1. ������� ������ �� 10 �����.
2. ������� ������ �� 10 �����.
3. ������ � ���������� 10 �����, ��������� ��� ������ �����.
4. � ������ ������ ������� ����� �������� ����� ������ �� ������� �����, ������/����� ������ ������� ��������� � ������� �������� �� ������� �����. ������� ���������� ������� ����� �� �����, ������ �������� �������� � ����� ������.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //�������� ��� ��� ���
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] wordList = new String[10];
        int[] numberList = new int[10];

        for (int i = 0; i < wordList.length; i++){
            String s = br.readLine();
            wordList[i] = s;
        }

        for (int i = 0; i < numberList.length; i++){
            int s = wordList[i].length();
            numberList[i] = s;
            System.out.println(numberList[i]);
        }
    }
}