package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* ���� ������� ������ � ��� ���������
1. ������� ������ �� 20 �����.
2. ������ � ���� �������� � ����������.
3. ������� ��� ������� �� 10 ����� ������.
4. ����������� ������� ������ � ��� ���������: �������� ����� � ������ ���������, ������ �������� �� ������ ���������.
5. ������� ������ ��������� ������ �� �����, ������ �������� �������� � ����� ������.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //�������� ��� ��� ���
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] bigArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];

        for (int i = 0; i < bigArray.length; i++){
            int s = Integer.parseInt(br.readLine());
            bigArray[i] = s;
        }

        for (int i = 0; i < smallArray1.length; i++){
            int s = bigArray[i];
            smallArray1[i] = s;
        }

        for (int i = 0; i < smallArray2.length; i++){
            int s = bigArray[bigArray.length/2 + i];
            smallArray2[i] = s;
            System.out.println(smallArray2[i]);
        }
    }
}