import java.util.Scanner;
public class PrNumOne {
    public static void main(String[] args) {
        //testing the class here
        Scanner input = new Scanner(System.in);
        //get coefficients
        System.out.print("Enter values for a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();
        //create instance of the class
        QuadraticEquation test1 = new QuadraticEquation(a,b,c);
        //prints both roots if discriminant is positive
        if (test1.getDiscriminant() > 0)
          System.out.println("Root 1: " + test1.getRoot1() + "\nRoot 2: " + test1.getRoot2());
        //prints only one root if discriminant is 0
        else if (test1.getDiscriminant() == 0)
          System.out.println("Root 1: " + test1.getRoot1());
        //otherwise prints that there are no roots
        else
          System.out.println("The equation has no roots.");
    }
}
