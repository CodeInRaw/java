package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //Напишите тут ваш код
    private String cName;
    private String cColor;
    private String cAdress;
    private int cWeight;
    private int cAge;
    
    public Cat(String name){
        this.cName = name;
    }
    
    public Cat(String name, int weight, int age){
        this.cName = name;
        this.cWeight = weight;
        this.cAge = age;
    }
    
    public Cat(String name, int age){
        this.cName = name;
        this.cAge = age;
        this.cWeight = 5;
        
    }
    
    public Cat(int weight, String color){
        this.cAdress = "Cat havan't home";
        this.cWeight = weight;
        this.cAge = 3;
        this.cColor = color;
    }
    
    public Cat(int weight, String color, String adress){
        this.cWeight = weight;
        this.cColor = color;
        this.cAdress = adress;
    }
}

