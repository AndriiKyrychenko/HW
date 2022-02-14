import java.util.*;

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
            System.out.println("длины строк совпадают!!! продолжаем проверку ))");
        } else {
            System.out.println("длины строк не совпадает, дальнейшие проверки бесполезны");
            System.exit(0);
        }
    }

    public static void signComparsion(String stringOne, String stringTwo) {
        List<String> listOne = new ArrayList<>(Arrays.asList(stringOne.split(",")));
        List<String> listTwo = new ArrayList<>(Arrays.asList(stringTwo.split(",")));
        Collections.sort(listOne);
        Collections.sort(listTwo);
        for (int i = 0; i < listOne.size(); i++) {
            if (!listOne.get(i).equalsIgnoreCase(listTwo.get(i))) {
                System.out.println("путем перестановки символов нельзя из первой строки " + stringOne + " получить вторую " + stringTwo);
                System.exit(0);
            }
        }
        System.out.println("путем перестановки символов можно из первой строки " + stringOne + " получить вторую " + stringTwo);
    }
}

