import java.util.Scanner;
public class MinPayment {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("What is the previous balance on the account?: ");
      double prevBalance = input.nextDouble();
      System.out.print("What is the total amount of additional charges during the month?: ");
      double addCharges = input.nextDouble();
      double interest = 0;
      if (prevBalance > 0)
        interest = (prevBalance + addCharges) * .02;
      double newBalance = prevBalance + addCharges + interest;
      double minPay = 0;
      if (newBalance < 50)
        minPay = newBalance;
      else if (newBalance <= 300)
        minPay = 50;
      else
        minPay = newBalance * .2;
      System.out.println("Your previous balance: $" + prevBalance);
      System.out.println("Your additional charges: $" + addCharges);
      System.out.println("Your interest: $" + interest);
      System.out.println("Your new balance: $" + newBalance);
      System.out.println("Your minimum payment: $" + minPay);
      input.close();
    }
}
