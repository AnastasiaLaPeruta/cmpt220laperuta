import java.util.Scanner;
public class ProblemFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int numMin = input.nextInt();
        int years = numMin/525600;
        int days = numMin%525600/1440;
        System.out.println(numMin + " minutes is approximately " + years + " years and " + days + " days");
        input.close();
    }
}
