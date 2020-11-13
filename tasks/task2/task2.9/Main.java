/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/
package com.company;

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        boolean flag = true ;
        int heap[] = {3, 7, 6, 2, 9, 4, 9, 2, 7, 5};
        for (int i = 0; i < heap.length; i++) {
            if (heap[i]%5==0 & heap[i]/5==1) {
                System.out.println("Да");
                flag = false;
            }

        }
        if(flag) System.out.println("Нет");
    }
}
