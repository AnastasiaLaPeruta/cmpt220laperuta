import java.util.Scanner;
public class Salary{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the current salary: ");
        double currentSalary = input.nextDouble();
        System.out.print("Enter the performance rating: ");
        double rating = input.nextDouble();
        double raise = 1;
        if (rating == 1)
          raise = currentSalary * .06;
        else if (rating == 2)
          raise = currentSalary * .04;
        else
          raise = currentSalary * .015;
        System.out.println("Amount of your raise: $" + (int)(raise * 100)/100.0);
        input.close();

    }
}