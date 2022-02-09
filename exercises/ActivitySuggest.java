import java.util.Scanner;
public class ActivitySuggest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("What is the temperature?: ");
        int temp = input.nextInt();
        if (temp >= 80 && temp <= 95)
          System.out.println("You should go swimming!");
        else if (temp >= 60 && temp < 80)
          System.out.println("You should play tennis!");
        else if (temp >= 40 && temp < 60)
          System.out.println("You should golf!");
        else if (temp < 40 && temp >= 20)
          System.out.println("You should go skiing!");
        else
          System.out.println("Visit our shops!");
        input.close();
    }

}
