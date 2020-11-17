/*
        Реализовать метод boolean fight(Cat anotherCat):
        реализовать механизм драки котов в зависимости от их веса, возраста и силы.
        Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
        Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
        Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
        если cat1.fight(cat2) возвращает true,
        то cat2.fight(cat1) должен возвращать false.
        Требования:
        •	Класс Cat должен содержать конструктор без параметров.
        •	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
        •	В классе Cat должен быть метод fight.
        •	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
        •	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
        •	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
        */
package com.company;
public class Main {
    public static void main(String[] args) {
Cat cat1 = new Cat(5,4,2);
Cat cat2 = new Cat(5,10,3);
Cat cat3 = new Cat(2,1,4);
        System.out.println(cat1.fight(cat2));
    }
}

class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat(int age, int weight, int strength) {
this.age=age;
this.weight=weight;
this.strength=strength;
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш
        int sum1 = this.age+this.strength+this.weight;
        int sum2 = anotherCat.age+anotherCat.strength+anotherCat.weight;
        if (sum1>=sum2) return true;
        else return false;
    }
}
