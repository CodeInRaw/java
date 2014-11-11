package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human grandpa_1 = new Human("Granny1", true, 70);
        Human grandpa_2 = new Human("Granny2", true, 75);
        Human grandma_1 = new Human("Gramma1", false, 65);
        Human grandma_2 = new Human("Gramma2", false, 67);
        Human father = new Human("Andri", true, 55, grandpa_1, grandma_1);
        Human mother = new Human("Anna", false, 50, grandpa_2, grandma_2);
        Human child_1 = new Human("Igor", true, 21, father, mother);
        Human child_2 = new Human("Sofy", false, 5, father, mother);
        Human child_3 = new Human("Anka", false, 2, father, mother);

        System.out.println(grandpa_1);
        System.out.println(grandpa_2);
        System.out.println(grandma_1);
        System.out.println(grandma_2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child_1);
        System.out.println(child_2);
        System.out.println(child_3);
    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        int age;
        boolean sex;
        Human father;
        Human mother;

        //constructor for children
        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        //constructor for grandparents
        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        //output method
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
