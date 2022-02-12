import java.util.Scanner;
public class ProblemTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ball travel time in seconds: ");
        double travelTime = input.nextDouble();
        double answer = 0 * travelTime + 9.8 * travelTime * travelTime/2;
        System.out.println("The height of the building is " + answer + " meters");
        input.close();
    }
}
