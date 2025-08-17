package Week12;
import java.util.Random;

public class Example_3 {
    public static void main(String[] args) {
        int[][][] image = new int[10][10][3];
        fillImageWithRandomColors(image);
        int[] averageColor = calculateAverageColor(image);
        System.out.printf("Average Color RGB: (%d, %d, %d)", averageColor[0], averageColor[1], averageColor[2]);
    }
    public static void fillImageWithRandomColors(int[][][] image) {
        Random random = new Random();
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j][0] = random.nextInt(256);
                image[i][j][1] = random.nextInt(256);
                image[i][j][2] = random.nextInt(256);
            }
        }
    }
    public static int[] calculateAverageColor(int[][][] image) {
        int totalRed = 0, totalGreen = 0, totalBlue = 0;
        int totalPixels = image.length * image[0].length;

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                totalRed += image[i][j][0];
                totalGreen += image[i][j][1];
                totalBlue += image[i][j][2];
            }
        }

        int averageRed = totalRed / totalPixels;
        int averageGreen = totalGreen / totalPixels;
        int averageBlue = totalBlue / totalPixels;

        return new int[]{averageRed, averageGreen, averageBlue};
    }
}