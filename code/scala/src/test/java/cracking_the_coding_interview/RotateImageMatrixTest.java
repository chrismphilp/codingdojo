package cracking_the_coding_interview;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotateImageMatrixTest {

    private RotateImageMatrix rotateImageMatrix;

    @Before
    public void setup() {
        rotateImageMatrix = new RotateImageMatrix();
    }

    @Test
    public void rotated_matrix_should_have_the_correct_values() {
        int[][] image = new int[2][2];
        image[0][0] = 1;
        image[0][1] = 0;
        image[1][0] = 0;
        image[1][1] = 1;

        int[][] newImage = rotateImageMatrix.calculate(image);

        assertEquals(0, newImage[0][0]);
        assertEquals(1, newImage[0][1]);
        assertEquals(1, newImage[1][0]);
        assertEquals(0, newImage[1][1]);
    }
}
