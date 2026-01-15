import java.util.*;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read n
        int n = sc.nextInt();

        // Read calorie counts into an array
        int[] calories = new int[n];
        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextInt();
        }

        // Sort the array in descending order
        Arrays.sort(calories);
        // Reverse traversal will give descending order

        long miles = 0;
        long power = 1; // represents 2^j

        // Calculate minimum miles
        for (int i = n - 1; i >= 0; i--) {
            miles += calories[i] * power;
            power *= 2;
        }

        // Print the result
        System.out.println(miles);

        sc.close();
    }
}
