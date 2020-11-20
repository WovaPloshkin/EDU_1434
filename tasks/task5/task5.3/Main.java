/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 =new ArrayList<>();
        list1.add(3);
        list1.add(5);
        list1.add(10);
        list1.add(6);
        list1.add(8);
        list1.add(121);

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i)>0&&list1.get(i)<=10) list2.add(list1.get(i));


        }
        System.out.println(list1);
        System.out.println(list2);

    }
}
