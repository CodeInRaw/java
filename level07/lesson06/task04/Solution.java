package com.javarush.test.level07.lesson06.task04;

/* 5 ������� � ������ ������
1. ������ ������ �����.
2. ������ � ���� 5 ������� � ����������, �� ������ ��������� �� � ����� ������, � � ������.
3. ��������� ���� ������ ���������� �� �����, ������ �������� � ����� ������.
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++){
            String s = br.readLine();
            list.add(0,s);
        }

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
