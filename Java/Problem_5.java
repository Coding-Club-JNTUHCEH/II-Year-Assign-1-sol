import java.util.*;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        
        List<Integer> studentHeights = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the height of student " + (i + 1) + ": ");
            int height = scanner.nextInt();
            studentHeights.add(height);
        }
        
        if (checkHeightOrder(studentHeights)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }

    public static boolean checkHeightOrder(List<Integer> heights) {
        for (int i = 1; i < heights.size(); i++) {
            if (heights.get(i) < heights.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
