import java.util.Scanner;
public class Pr4 {
    public static void main(String[] args) {
        //reads and stores input in variables
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        input.close();
        //puts values in two-dimensional array and calls method
        double[][] A = new double[2][2];
        A[0][0] = a;
        A[0][1] = b;
        A[1][0] = c;
        A[1][1] = d;
        //stores changes made in method
        double[][] newA = inverse(A);
        //displays if return value is null
        if (newA == null)
          System.out.println("No inverse matrix");
        //otherwise prints inverse matrix
        else{
          System.out.println(newA[0][0] + " " + newA[0][1] +
          " \n" + newA[1][0] + " " + newA[1][1]);
        }
    }

    public static double[][] inverse(double[][] A){
      //stores the doubles within array as short-named variables to easily use in computations
      double a = A[0][0];
      double b = A[0][1];
      double c = A[1][0];
      double d = A[1][1];
      //returns null if denominator in equation equals 0
      if (a*d-b*c == 0)
        return A = null;
        //otherwise computes the inverse and returns the modified array
      else{
        A[0][0] = (1/(a*d-b*c)) * d;
        A[0][1] = (1/(a*d-b*c)) * -b;
        A[1][0] = (1/(a*d-b*c)) * -c;
        A[1][1] = (1/(a*d-b*c)) * a;
        return A;
      }
    } 
}
