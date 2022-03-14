import java.util.Scanner;
// JA: Comments?
public class Project1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter S1 and T as two integers seperated by a space (must be between -1000 and 1000): ");
        int s1 = input.nextInt();
        int t = input.nextInt();
        System.out.println(t * 2 - s1);
        input.close();
    }
    
}
