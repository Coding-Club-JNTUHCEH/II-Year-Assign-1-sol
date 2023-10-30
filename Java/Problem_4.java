import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of tickets bought: ");
        int n = scanner.nextInt();
        
        int[] tickets = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter ticket value for ticket " + (i + 1) + ": ");
            tickets[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the value of the winning ticket: ");
        int winningTicket = scanner.nextInt();
        
        int result = findTicket(tickets, winningTicket);
        
        if (result == 1) {
            System.out.println("Won");
        } else {
            System.out.println("Lost");
        }
        scanner.close();
    }

    public static int findTicket(int[] tickets, int winningTicket) {
        int low = 0;
        int high = tickets.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (tickets[mid] == winningTicket) {
                return 1; // Won
            } else if (tickets[mid] < winningTicket) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return 0; // Lost
    }
}

