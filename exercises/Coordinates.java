import java.util.Scanner;

public class Coordinates{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coordinates for two points: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("The slope for the line that connects two points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + (y2-y1)/(x2-x1));
        input.close();
    }
}