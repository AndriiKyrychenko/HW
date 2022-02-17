import java.util.Arrays;
import java.util.Random;

public class NumberSquared {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numberArray = new int[10];
        int[] squaredNumberArray = new int[numberArray.length];
        int min = -10;
        int max = 10;

        fillArray(numberArray, random, min, max);
        squaredArray(numberArray, squaredNumberArray);
    }

    public static void fillArray(int[] numberArray, Random random, int min, int max) {
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = min + random.nextInt(max - min + 1);
        }
        System.out.println(Arrays.toString(numberArray));
    }

    public static void squaredArray(int[] numberArray, int[] squaredNumberArray) {
        for (int i = 0; i < squaredNumberArray.length; i++) {
            squaredNumberArray[i] = numberArray[i] * numberArray[i];
        }
        Arrays.sort(squaredNumberArray);
        System.out.println(Arrays.toString(squaredNumberArray));
    }
}
