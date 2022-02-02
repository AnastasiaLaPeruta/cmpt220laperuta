import java.util.Scanner;

public class ReverseOrder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 4-digit integer: ");
        int integer = input.nextInt();
        int first = integer/1000;
        int second = (integer/100)%10;
        int third = (integer/10)%10;
        int fourth = integer%10;
        System.out.print(fourth);
        System.out.print(third);
        System.out.print(second);
        System.out.println(first);
        input.close();
    }
}