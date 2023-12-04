package Medium;
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");// do not separate elements with coma
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Create an instance of the Solution class
        Solution solution = new Solution();
        // Call the majorityElement method to find majority elements in the array
        List<Integer> result = solution.majorityElement(arr);

        // Print the majority elements
        System.out.println("Majority elements: " + result);
    }
}

class Solution {
    // Method to find majority elements in an array (elements occurring more than n/3 times)
    public List<Integer> majorityElement(int[] arr) {
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Get the length of the input array
        int n = arr.length;

        // Count the frequency of each element in the array
        for (int i = 0; i < n; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        // Calculate the threshold for majority elements
        int threshold = n / 3;
        // Create a list to store majority elements
        List<Integer> majorityElements = new ArrayList<>();

        // Identify elements with frequency greater than n/3 and add them to the result list
        for (var element : frequencyMap.keySet()) {
            if (frequencyMap.get(element) > threshold) {
                majorityElements.add(element);
            }
        }

        // Return the list of majority elements
        return majorityElements;
    }
}

