package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("################# All animals ######################\n");
        printPets(pets);

        removeCats(pets, cats);
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("################ Animals without cats ################\n");

        printPets(pets);

        //printPetsName(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> res = new HashSet<Cat>();

        //напишите тут ваш код
        for (int i=0; i<4; i++){
            String s = "Cat"+i;
            res.add(new Cat(s));
        }

        return res;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> res = new HashSet<Dog>();

        for (int i=0; i<3; i++){
            String s = "Dog"+i;
            res.add(new Dog(s));
        }

        return res;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        //напишите тут ваш код
        Set<Object> pets = new HashSet<Object>(cats);

        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        //напишите тут ваш код
        if (!pets.isEmpty()){
            pets.removeAll(cats);
        }
    }

    public static void printPets(Set<Object> pets)
    {
        //напишите тут ваш код
        for (Object pet : pets)
            System.out.println(pet);

    }
/*
    public static void printPetsName(Set<Object> pets){


        for (Object pet : pets){

            System.out.println(pet);
        }
    }
*/
    //напишите тут ваш код
    public static class Cat{
        String name;

        public Cat(String name){
            this.name = name;
        }
    }

    public static class Dog{
        String name;

        public Dog(String name){
            this.name = name;
        }
    }
}
