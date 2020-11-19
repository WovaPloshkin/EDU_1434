/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод
 public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод
 public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/
package com.company;


public class Main{
    public static void main(String[] args) {
        //Ваш код
        Horse myHorse = new Horse("Рысак","пегая",4,3);
        myHorse.run();
        Horse.Pegasus myPegasus = new Horse.Pegasus("horse","white",4,7);
        myPegasus.fly();
    }
}
abstract class Animal{
    String breed;
    String color;
    int quantityoflegg;
    int age;

    public Animal(String breed, String color, int quantityoflegg, int age) {
        this.breed = breed;
        this.color = color;
        this.quantityoflegg = quantityoflegg;
        this.age = age;
    }
}
class Horse extends Animal {

    public Horse(String breed, String color, int quantityoflegg, int age) {
        super(breed, color, quantityoflegg, age);
    }

    public void run() {
        System.out.println("Игого, я поскакал(а)");
    }

    static class Pegasus extends Horse {
        public Pegasus(String breed, String color, int quantityoflegg, int age) {
            super(breed, color, quantityoflegg, age);
        }

        public void fly() {
            System.out.println("Игого, я полетел(а)");
        }
    }
}
