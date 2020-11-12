/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int heap[]={1,3,5,7,2,6};
        int sum =0;
        int count =0;
        for (int i = 0; i <heap.length-1 ; i++) {
          if (sum<10)  {
              sum = sum+heap[i];
              count++;
          }

        }
        System.out.println("Всего элементов:"+count);
    }
}
