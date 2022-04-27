import java.util.Scanner;
public class DigitPlay {
  public static void main(String[] args) {
    int num;
    Scanner scan = new Scanner(System.in);
    System.out.println();
    System.out.print("Please enter a positive integer: ");
    num = scan.nextInt();
    scan.close();

    if(num <= 0)
      System.out.println(num + " isn't positive -- start over!!");
    else{
      // Call numDigits to find the number of digits in the number
      // Print the number returned from numDigits
      System.out.println("\nThe number " + num + " contains " + 
        + numDigits(num) + " digits.");
      System.out.println();
      System.out.println("The number " + num + "'s digits add up to " + sumDigits(num) + ".");
    }
  }
  //recursively counts the digits in a positive integer
  public static int numDigits(int num){
    if(num < 10)
      return 1;
    else 
      return 1 + numDigits(num/10);
  }

  public static int sumDigits(int num){
    if(num < 10)
      return num;
    else 
      return num + sumDigits(num/10);
  }
  
}
