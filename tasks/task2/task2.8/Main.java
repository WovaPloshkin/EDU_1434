/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/
package com.company;
public class Main {
    public static void main(String[] args) {
       int mass[] = {2, 3, 4, 5};
       double summ=0;
        for (int i = 0; i <= mass.length-1; i++) {
           summ = summ+mass[i];
        }
        System.out.println("Total Summ:"+summ);
    }
}
