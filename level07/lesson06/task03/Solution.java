package com.javarush.test.level07.lesson06.task03;

/* 5 ������� � �������� �������
1. ������ ������ �����.
2. ������ � ���������� 5 ����� � ������ � ����.
3. ��������� �� � �������� �������.
4. ��������� ���� ������ ���������� �� �����, ������ �������� � ����� ������.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //�������� ��� ��� ���
        ArrayList<String > list = new ArrayList<String>();
        ArrayList<String > rList = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
            list.add(br.readLine());

        for (int i = list.size()-1; i >= 0; i--)
        {
            String s = list.get(i);
            rList.add((list.size()-i-1), s);
        }

        for (int i = 0; i < rList.size(); i++){
            System.out.println(rList.get(i));
        }
    }
}
