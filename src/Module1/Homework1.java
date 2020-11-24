package Module1;

public class Homework1 {

    public static void main(String[] args) {

        int a = 0;
        int b = 9;
        int c = 4;
        int d = 6;

        boolean isSumFirstTwoNumbersEven;
        boolean isSumLastTwoNumbersEven;

        if ((a + b) % 2 == 0) {
            isSumFirstTwoNumbersEven = true;
            System.out.println("Sum the first two numbers is even");
        } else {
            isSumFirstTwoNumbersEven = false;
            System.out.println("Sum the first two numbers is odd");
        }

        if ((c + d) % 2 == 0) {
            isSumLastTwoNumbersEven = true;
            System.out.println("Sum the last two numbers is even");
        } else {
            isSumLastTwoNumbersEven = false;
            System.out.println("Sum the last two numbers is odd");
        }

        if (isSumFirstTwoNumbersEven && isSumLastTwoNumbersEven) {
            System.out.println("All numbers are even");
        } else {
            System.out.println("Some numbers are odd");
        }

    }

}
