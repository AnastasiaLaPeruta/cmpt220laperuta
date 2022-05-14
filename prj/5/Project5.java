import java.util.Scanner;

public class Project5 {
   public static void main(String[] args) {
      // gets numbers from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first complex number: ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      // creates instance of Complex class using input
      Complex first = new Complex(a, b);
      // gets numbers for second complex number
      System.out.print("Enter the second complex number: ");
      double secondA = input.nextDouble();
      double secondB = input.nextDouble();
      // creates a second instance
      Complex second = new Complex(secondA, secondB);
      input.close();
      // displays the results of adding them together
      System.out.println("(" + first.toString() + ") + (" + second.toString() + ") = " +
            (first.add(second)).toString());
      // displays the results of subtracting them
      System.out.println("(" + first.toString() + ") - (" + second.toString() + ") = " +
            (first.subtract(second)).toString());
      // displays the results of multiplying them together
      System.out.println("(" + first.toString() + ") * (" + second.toString() + ") = " +
            (first.multiply(second)).toString());
      // displays the results of dividing them
      System.out.println("(" + first.toString() + ") / (" + second.toString() + ") = " +
            (first.divide(second)).toString());
      // displays the results of the absolute value of the first complex number
      System.out.println("|" + first.toString() + "| = " + first.abs());
   }
}
