package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код

        ArrayList<Human> smallChildren = new ArrayList<Human>();
        ArrayList<Human> grosChild_family_1 = new ArrayList<Human>();
        ArrayList<Human> grosChild_family_2 = new ArrayList<Human>();

        //create children
        Human child_1 = new Human("Garry", true, 11, new ArrayList<Human>());
        Human child_2 = new Human("Ron", true, 12, new ArrayList<Human>());
        Human child_3 = new Human("Germiona", false, 12, new ArrayList<Human>());

        smallChildren.add(child_1);
        smallChildren.add(child_2);
        smallChildren.add(child_3);

        //parents
        Human father   = new Human("Patrik", true, 45, smallChildren);
        Human mother   = new Human("Marta", false, 35, smallChildren);

        grosChild_family_1.add(father);
        grosChild_family_2.add(mother);

        //grandparents
        Human granny_1 = new Human("Granny1", true, 78, grosChild_family_1);
        Human granny_2 = new Human("Granny2", true, 79, grosChild_family_2);

        Human gramma_1 = new Human("Gramma1", false, 68, grosChild_family_1);
        Human gramma_2 = new Human("Gramma2", false, 65, grosChild_family_2);

        System.out.println(granny_1.toString());
        System.out.println(gramma_1.toString());
        System.out.println(granny_2.toString());
        System.out.println(gramma_2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child_1.toString());
        System.out.println(child_2.toString());
        System.out.println(child_3.toString());

    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){

            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
