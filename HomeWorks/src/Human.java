import java.util.Scanner;

public class Human {

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

        getFullName(surname, name, patronymic);

        getShortName(surname, name, patronymic);

    }

    public static String getString(Scanner scanner) {
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
        } else {
            System.out.println(surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ".");
        }
    }
}
