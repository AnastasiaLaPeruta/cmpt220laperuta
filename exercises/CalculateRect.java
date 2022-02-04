import java.util.Scanner;
import java.lang.Math;

public class CalculateRect{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width and height of a rectangle: ");
        double width = input.nextDouble();
        double height = input.nextDouble();
        System.out.println("The perimeter is " + width * 2 + height * 2);
        System.out.println("The area is " + width * height);
        System.out.println("The length of the diagonal is " + Math.pow(width*width+height*height,.5));

        input.close();

    }
}
