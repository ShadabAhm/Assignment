public class PangramChecker {
    public static void main(String[] args) {
        // Example usage
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Convert the input to lowercase for case-insensitive comparison
        String lowerCaseInput = input.toLowerCase();

        // Create an array to track the presence of each letter
        boolean[] isPresent = new boolean[26];

        // Iterate through each character in the input
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char ch = lowerCaseInput.charAt(i);

            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // Mark the presence of the letter
                isPresent[ch - 'a'] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are present
        for (boolean present : isPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
