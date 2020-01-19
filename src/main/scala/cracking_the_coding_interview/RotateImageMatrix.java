package cracking_the_coding_interview;

public class RotateImageMatrix {
    public int[][] calculate(int[][] image) {
        int[][] newImage = new int[image.length][image[0].length];

        for (int i = 0; i < image.length; i++) {
            int columnLocator = image[i].length - 1;
            for (int j = 0; j < image[0].length; j++) {
                newImage[columnLocator--][i] = image[i][j];
            }
        }
        return newImage;
    }
}
