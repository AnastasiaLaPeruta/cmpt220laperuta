import java.util.Scanner;
public class ProblemThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the friction force in Newtons: ");
        double f = input.nextDouble();
        System.out.print("Enter the object's mass in kg: ");
        double m = input.nextDouble();
        System.out.print("Enter the object's acceleration in m/s^2: ");
        double a = input.nextDouble();
        double answer = (f/m - a)/9.8;
        System.out.println("The coefficient for friction is " + answer);
        input.close();
    }
}
