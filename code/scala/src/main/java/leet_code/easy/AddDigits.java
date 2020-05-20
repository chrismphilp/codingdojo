package leet_code.easy;

public class AddDigits {
    public int addDigits(int num) {
        int total = 0;
        while (num > 0) {
            total += (num % 10);
            num /= 10;
        }
        if (total >= 10) return addDigits(total);
        return total;
    }
}
