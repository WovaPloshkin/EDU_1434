/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        int data[] = {2, 3, 5, 5, 8};
        for (int i = 0; i < data.length-1; i++) {
            int first = data[i];
            int second = data[i + 1];
            if (first == second) {
                System.out.println("Да");
            } else {
                //System.out.println("no");
            }
        }
    }
}
