import java.util.Scanner;
public class ProbNum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the sides: ");
        double numOfSides = input.nextDouble();
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();
        input.close();
        double angle = 360/numOfSides;
        double increment = angle;
        System.out.println("The coordinates of the points on the polygon are");
        System.out.println("(" + radius + ", 0.0)");
        System.out.printf("(%4.2f, ", Math.cos(Math.toRadians(angle)) * radius);
        System.out.printf("%4.2f)", Math.sin(Math.toRadians(angle)) * radius);
        System.out.println();
        for (int i = 1; i < (numOfSides - 1); i++){
          angle += increment;
          System.out.printf("(%4.2f, ", Math.cos(Math.toRadians(angle)) * radius);
          System.out.printf("%4.2f)", Math.sin(Math.toRadians(angle)) * radius);
          System.out.println();
             
        }
    }
    
}
