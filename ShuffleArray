import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an array
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array using Fisher-Yates Shuffle
        shuffleArray(array);

        // Print the shuffled array
        System.out.println(Arrays.toString(array));
    }

    private static void shuffleArray(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int randomIndex = random.nextInt(i + 1);

            // Swap array[i] and array[randomIndex]
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}
