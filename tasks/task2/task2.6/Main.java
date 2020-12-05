
    /*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b.
Если это так - выведите 'Делится' и результат деления, иначе выведите
'Делится с остатком' и остаток от деления.
*/

    public class Main {
        public static void main(String[] args) {
            //напишите тут ваш код
        double a = 4.5;
        double b =2;
        if (a%b==0) System.out.println("Делится: "+ (double)a/b);
        else {
            System.out.println("Делится с остатком : "+(double)a%b);
        }
        }
    }

