import java.util.Arrays;
import java.util.Scanner;

public class SameString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringOne = getKeyboardData(scanner);
        String stringTwo = getKeyboardData(scanner);

        lenghtComparsion(stringOne, stringTwo);

        signComparsion(stringOne, stringTwo);

    }

    public static String getKeyboardData(Scanner scanner) {
        System.out.println("введите строку:");
        return scanner.next();
    }

    public static void lenghtComparsion(String stringOne, String stringTwo) {
        if (stringOne.length() == stringTwo.length()) {
            System.out.println("длины строк совпадают, продолжаем сравнение ))");
        } else {
            System.out.println("длины строк не совпадают, дальнейшее сравнение не нужно");
            System.exit(0);
        }
    }

    public static void signComparsion(String stringOne, String stringTwo) {

        String[] listOne = stringOne.split("");
        String[] listTwo = stringTwo.split("");

        Arrays.sort(listOne);
        Arrays.sort(listTwo);

        for (int i = 0; i < listOne.length; i++) {
            if (!listOne[i].equals(listTwo[i])) {
                System.out.println("путем перестановки символов нельзя из первой строки " + stringOne + " получить вторую " + stringTwo);
                System.exit(0);
            }
        }
        System.out.println("путем перестановки символов первой строки " + stringOne + " можно получить вторую строку" + stringTwo);
    }
}

