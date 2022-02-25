import java.util.Scanner;
public class ProbNum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(Systme.in);
        System.out.print("Enter the number of sides: ");
        double n = input.nextDouble();
        System.out.print("Enter the side length: ");
        double s = input.nextDouble();
        input.close();
        double area = (n * s * s)/(4 * Math.tan(Math.PI/n));
        System.out.println("The area of the polygon is " + area);
    }
    
}
