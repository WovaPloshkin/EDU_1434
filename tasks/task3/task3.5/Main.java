/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию
 и не используя цикл.
*/

package com.company;

public class Main {
    public static void main(String[] args) {
        int num[] = {4,2,6,2,65 };
    //public int ii=0;
        outmas(num, 0);
    }
    public static void outmas(int mass[], int n) {
        if(n==mass.length-1) System.out.println(mass[0]);
        else {
            n++;
            outmas(mass, n);
            System.out.println(mass[n]);
        }

    }

}
