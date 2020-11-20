/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        List<String> citys =new ArrayList<>();
        String family;
        String city;
        while (true) {
            family = scanner.nextLine();
            city = scanner.nextLine();
            if (family.isEmpty()||city.isEmpty())
                break;
            list.add(family);
            citys.add(city);

        }

        

        // Read the house number
        System.out.print( "Задайте город поиска: ");
        String houseNumber = scanner.nextLine();


            int  familyCity = citys.indexOf(houseNumber);

            System.out.println(list.get(familyCity));

    }
}

