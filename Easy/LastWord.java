package Easy;
import java.util.*;

class LastWord {
    // Method to find the length of the last word in a string
    public static int lengthOfLastWord(String s) {
        int n = s.length();
        if (n == 0) return 0; // If the input string is empty, the length of the last word is 0

        int start = 0;
        while (start < n && s.charAt(start) == ' ') start++; // Left trim to find the start of the last word

        int end = n - 1;
        while (end >= 0 && s.charAt(end) == ' ') end--; // Right trim to find the end of the last word

        if (start > end) return 0; // If there are only spaces, the length of the last word is 0

        int pos = end;
        while (pos >= start) {
            // Traverse from end to start to find the last word's length
            if (s.charAt(pos) == ' ') return end - pos; // Return the length once the space before the last word is found
            else pos--;
        }

        return end - pos; // Return the length of the last word if it is the first word in the string
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        // Print the length of the last word for the user input
        System.out.println("Length of the last word: " + lengthOfLastWord(s));

        scanner.close();
    }
}