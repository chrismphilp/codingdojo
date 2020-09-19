package leet_code.medium;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = calculateArea(height, 0, height.length - 1);
        int lower = 0;
        int upper = height.length - 1;

        while (lower != upper) {
            if (height[lower] < height[upper]) lower++;
            else upper--;

            int newArea = calculateArea(height, lower, upper);
            if (newArea > max) max = newArea;
        }
        return max;
    }

    private int calculateArea(int[] height, int indexA, int indexB) {
        int width = indexB - indexA;
        return (height[indexA] > height[indexB]) ? height[indexB] * width : height[indexA] * width;
    }
}
