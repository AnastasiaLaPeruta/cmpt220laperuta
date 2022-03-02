import java.util.Scanner;
public class EvaluatePolynomial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the order of the polynomial n: ");
        int n = input.nextInt();
        System.out.print("Enter coefficients: ");
        int a0 = input.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
          list[i] == input.nextInt();
        System.out.print("Enter x: ");
        int x = input.nextInt();
        input.close();
        System.out.print("The polynomial expression is " + evaluatePolynomial(list,x));
    }
    public static double evaluatePolynomial(double[] a, double x){
        

    }
    
}
