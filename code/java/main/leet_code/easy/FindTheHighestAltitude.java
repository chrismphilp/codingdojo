package leet_code.easy;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int currentMax = 0;
        int altitude = 0;
        for (int g : gain) {
            altitude += g;
            currentMax = Math.max(altitude, currentMax);
        }
        return currentMax;
    }
}
