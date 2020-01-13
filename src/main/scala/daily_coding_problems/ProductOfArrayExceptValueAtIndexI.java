package daily_coding_problems;

public class ProductOfArrayExceptValueAtIndexI {
    public int[] calculate(int[] numbers) {
        int totalProduct = 1;
        for (int number : numbers) totalProduct *= number;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = totalProduct / numbers[i];
        }
        return numbers;
    }
}
