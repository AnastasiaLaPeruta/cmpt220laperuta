import java.util.Scanner;

public class ProblemOne{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        double radius = input.nextDouble();
        System.out.println("The diameter is " + 2 * radius);
        System.out.println("The area is " + radius * radius * 3.14159);
        input.close();
    }
}