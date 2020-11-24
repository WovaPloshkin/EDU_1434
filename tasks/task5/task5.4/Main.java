/*
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Collection;
public class Main {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String filePath = " ";
        ArrayList<String> lst = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        while (filePath != "") {
            System.out.println("Введите путь к файлу :");
            filePath = scanner.nextLine();
            filePath += "\\txt1.txt";
           // filePath = "C:\\tmp\\txt1.txt";

            try {
                FileReader reader = new FileReader(filePath);
                System.out.println("Читаю из файла: " + filePath);
                int c;
                String cc = "";
                while ((c = reader.read()) != -1) {
                    if (c == 13) continue;
                    else {
                        if (c == 10) {
                            lst.add((cc));
                            cc = "";

                        }
                    }

                    cc += (char) c;
                }
                lst.add(cc);
            } catch (IOException e) {
                System.out.println("* Файл не найден *");
            }
            //
            int d;
            System.out.println(lst);
            System.out.println(lst.size());
            for (int i = 0; i < lst.size(); i++) {
                String srr=lst.get(i);
                d =Integer.parseInt(srr.trim());
                if (d%2==0)
                            row1.add(d);
                            }

            //System.out.print(lst);
            Collections.sort(row1);
            System.out.println(row1);
            break;

        }

    }
}
