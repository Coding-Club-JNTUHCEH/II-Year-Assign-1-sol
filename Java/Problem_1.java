import java.util.*;
public class Problem_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the number of food items ordered (n): ");
        int el;
        int count=0;
        List<Integer>delivery_times=new ArrayList<>(n);
        System.out.println("Enter the delivery times of food items");
        for(int i=0;i<n;i++){
            el=sc.nextInt();
            delivery_times.add(el);
            if(el<=30) count++;
        }
        if(count >= n/2) System.out.println("Satisfied");
        else System.out.println("Frustrated");
        sc.close();
    }
}