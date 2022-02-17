public class Permutation {

    public static void main(String[] args) {

        String mutableString = "asd";

        String[] mutableArray = mutableString.split("");

        int numberOfIteration = calculateFuctorial(mutableArray.length);
        int maxIndex = mutableArray.length - 1;

        System.out.println("количество переборов всех символов: " + numberOfIteration);
        System.out.println("результаты перебора всех символов: ");

        int indexForRemove = maxIndex;
        while (numberOfIteration > 0) {
            String valueForRemove = mutableArray[indexForRemove];
            mutableArray[indexForRemove] = mutableArray[indexForRemove - 1];
            mutableArray[indexForRemove - 1] = valueForRemove;
            printPermutation(mutableArray);
            numberOfIteration--;
            if (indexForRemove != 1) {
                indexForRemove--;
            } else {
                indexForRemove = maxIndex;
            }
        }
    }

    public static void printPermutation(String[] arrName) {
        String arrayToString = String.join("", arrName);
        System.out.print(arrayToString + " ");
    }

    public static int calculateFuctorial(int stringLenght) {
        int result = 1;
        for (int i = 1; i <= stringLenght; i++) {
            result = result * i;
        }
        return result;
    }
}
