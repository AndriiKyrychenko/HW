package NameSurname;

import java.util.Scanner;

public class Human {
//    Написать класс Human, который содержит фамилию, имя и отчество человека

//    Реализовать 2 конструктора, первый принимает фамилию и имя, второй все 3 параметра
//    реализовать метод getFullName, который возвращает полное имя (Пупкин Иван Василиевич), учесть что отчества может не быть (Пупкин Иван)
//    реализовать метод getShortName который возвращает фамилию и инициалы (Пупкин И. В. или Пупкин И., если отчества нет)

    public static void main(String[] args) {

        String surname;
        String name;
        String patronymic;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        surname = getString(scanner);

        System.out.println("Введите имя: ");
        name = getString(scanner);

        System.out.println("Введите отчество: ");
        patronymic = getString(scanner);

        getFullName(surname,name,patronymic);

        getShortName(surname,name,patronymic);

    }
    public static String  getString(Scanner scanner) {
        String str = scanner.nextLine().trim();
        if (str.isEmpty()) {
            str = null;
        }
        return str;
    }

    public static void getFullName(String surname, String name, String patronymic) {
        if (patronymic == null) {
            System.out.println(surname + " " + name);
        } else {
            System.out.println(surname + " " + name + " " + patronymic);
        }
    }

    public static void getShortName(String surname, String name, String patronymic) {
        if (patronymic == null) {
            System.out.println(surname + " " + name.charAt(0) + ".");
        }else{
        System.out.println(surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ".");
        }
    }
}
