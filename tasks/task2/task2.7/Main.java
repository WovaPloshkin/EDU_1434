*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так -
 выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/
package com.company;

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
double a= 9;
double b= 2;
double r=0;
r=a%b;
if (r!=0) {System.out.println("Делится с остатком "+r);}
else {
        System.out.println("Результат деления :"+a/b);}

    }
}
