package com.javarush.test.level07.lesson06.task05;

/* ����� ��������� ������ � ������ � � ������
1. ������ ������ �����.
2. ������ � ���� 5 ������� � ����������.
3. ����� ��������� ������ � ������ � � ������. ��������� 13 ���.
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
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 5; i++){
            String s = br.readLine();
            list.add(s);
        }
        int listLength = list.size()-1;
        for (int i = 0; i < 13; i++){
            String s = list.get(listLength);
            list.remove(listLength);
            list.add(0,s);
        }

        for (String element : list){
            System.out.println(element);
        }
    }
}