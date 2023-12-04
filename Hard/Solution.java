package Hard;
//import java.util.Scanner;
//
//public class Solution {
//    public String shortestPalindrome(String s) {
//        int i = 0;
//        int j = s.length() - 1;
//
//        while (j >= 0) {
//            if (s.charAt(i) == s.charAt(j)) {
//                i++;
//            }
//            j--;
//        }
//
//        if (i == s.length()) {
//            return s; // The input string is already a palindrome
//        }
//
//        String suffix = s.substring(i);
//        String prefix = new StringBuilder(suffix).reverse().toString();
//        String mid = shortestPalindrome(s.substring(0, i));
//
//        return prefix + mid + suffix;
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String userInput = scanner.nextLine();
//
//        System.out.println("Shortest Palindrome: " + solution.shortestPalindrome(userInput));
//    }
//}
import java.util.Scanner;

public class Solution {
    // Method to find the shortest palindrome by adding characters to the beginning of the input string
    public String shortestPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        // Find the longest prefix that is a palindrome
        while (j >= 0) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
            }
            j--;
        }

        // If the entire string is a palindrome, no additions are needed
        if (i == s.length()) {
            return s; // The input string is already a palindrome
        }

        // Extract the non-palindromic suffix
        String suffix = s.substring(i);
        // Reverse the suffix to make it a palindrome
        String prefix = new StringBuilder(suffix).reverse().toString();
        // Recursively find the shortest palindrome for the remaining substring
        String mid = shortestPalindrome(s.substring(0, i));

        // Concatenate the reversed suffix, mid, and original suffix to form the shortest palindrome
        return prefix + mid + suffix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Print the shortest palindrome for the user input
        System.out.println("Shortest Palindrome: " + solution.shortestPalindrome(userInput));
    }
}