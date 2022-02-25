import java.util.Scanner;
public class Project1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter S1 and T as two integers seperated by a space: ");
        int s1 = input.nextInt();
        int t = input.nextInt();
        System.out.println(s1 + " " + t);
        input.close();
    }
    
}
