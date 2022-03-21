import java.util.Scanner;
public class HighFive{
  public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("Enter an integer: ");
    int number = input.nextInt();
    input.close();
    if (number % 5 == 0)
      System.out.print("HiFive ");
    if (number % 2 == 0 || number % 3 == 0)
      System.out.print("Georgia");
  }
}