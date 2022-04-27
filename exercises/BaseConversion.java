import java.util.Scanner;
public class BaseConversion {
  public static void main(String[] args) {
    int base10Num;
    int base;

    Scanner scan = new Scanner(System.in);

    System.out.println();
    System.out.println("Base Conversion Program");
    System.out.print("Enter an integer: ");
    base10Num = scan.nextInt();
    System.out.print("Enter the base: ");
    base = scan.nextInt();


  }
  //Converts a base 10 number to another base
  public static String convert(int num, int b){
    int quotient;
    int remainder;
    quotient = num/b;
    remainder = num%b;
    if(quotient == 0)
      return "" + remainder;
    else
      return "" + convert(quotient,remainder)
  }
}
