import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the value of n:");
        int n = scanner.nextInt();

        System.out.println("Please enter the value of m:");
        int m = scanner.nextInt();

        // Create the circular array
        int[] circularArray = new int[n];
        for (int i = 0; i < n; i++) {
            circularArray[i] = i + 1;
        }

        // Calculate the path
        StringBuilder path = new StringBuilder();
        int currentIndex = 0;
        for (int i = 0; i < n; i++) {
            path.append(circularArray[currentIndex]);
            currentIndex = (currentIndex + m) % n;
        }

        // Print the result
        System.out.println(path.toString());
    }
}
