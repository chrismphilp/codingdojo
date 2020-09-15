package leet_code.easy;

public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        int index = 0;
        int count = 0;
        int lengthOfString = s.length() - 1;

        while (index <= lengthOfString) {
            if (s.charAt(index) != ' ') {
                while (index <= lengthOfString && s.charAt(index) != ' ') index++;
                count++;
            } else {
                index++;
            }
        }
        return count;
    }
}
