import java.util.Scanner;
public class Probm1{
  public static void main(String[] args) {
      //gets input from user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of items: ");
    int i = input.nextInt();
    System.out.print("Enter the weights for each item: ");
    //initializes array
    double [] w = new double[i];
    for (int j = 0; j < i; j++){ ///adds weights to an array
      w[j] = input.nextDouble();
    }
    System.out.print("Enter the weight limit for the bag: ");
    double weightLimit = input.nextDouble();
    input.close();
    //prints results with recursive method call
    i -= 1; //will be out of bounds in method if this isn't subtracted by 1
    System.out.println("The maximum weight of the items placed in the bag is " + m(i,weightLimit,w));
  }
  // recursive method for computing m(i, w)
  public static double m(int i, double weightLimit, double[] w){
    if (i == 0 || weightLimit == 0 || w[i] > weightLimit) //base case
      return 0;
    else
      return Math.max(m(i-1,weightLimit,w),w[i] + m(i-1, weightLimit - w[i], w)); //goes through weights recursively
  }
}