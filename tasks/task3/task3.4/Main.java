/*Задание: Сделайте функцию, которая параметрами принимает 2 числа.
 Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
 */
        

package com.company;

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш ко

        System.out.println(compare1(3 ,5));

    }
    public static boolean compare1(int a, int b) {
     if ((a+b)>10) return true;
     else return false;
    }
}
