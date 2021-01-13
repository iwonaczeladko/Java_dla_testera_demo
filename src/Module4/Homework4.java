package Module4;

public class Homework4 {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};

        // 9, 2, 1, 4, 5, 2, 4, 0, 5, 8
        // 9, 8, 1, 2, 4, 2, 4, 0, 5, 5

        int max;

        for (int i = 0; i < numbers.length; i++) {
            max = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    max = numbers[j];
                    numbers[j] = numbers [i];
                    numbers [i] = max;
                }
            }
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
