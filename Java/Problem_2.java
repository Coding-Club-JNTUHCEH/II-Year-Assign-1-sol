import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of shoe sizes: ");
        int n = scanner.nextInt();

        List<Integer> shoeSizes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter shoe size " + (i + 1) + ": ");
            int size = scanner.nextInt();
            shoeSizes.add(size);
        }

        int secondLargestSize = findSecondLargest(shoeSizes);

        if (secondLargestSize != Integer.MIN_VALUE) {
            System.out.println("Ram's chosen shoe size: " + secondLargestSize);
        } else {
            System.out.println("There is no second-largest element.");
        }

        scanner.close();
    }

    public static int findSecondLargest(List<Integer> list) {
        if (list.size() < 2) {
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return secondLargest;
        }
    }
}
