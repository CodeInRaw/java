package com.javarush.test.level07.lesson06.task01;

/* 5 ��������� ������� � ������
1. ������ ������ �����.
2. ������ � ���� 5 ��������� �������.
3. ������ ��� ������ �� �����.
4. ��������� ���� ������ ��� ���������� �� �����, ������ �������� � ����� ������.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //�������� ��� ��� ���
        ArrayList<String> list = new ArrayList<String>();

        list.add("ad");
        list.add("adf");
        list.add("saf");
        list.add("asfa");
        list.add("awf");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}