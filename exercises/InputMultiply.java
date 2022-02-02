import java.util.Scanner;
public class InputMultiply{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first = input.nextInt();
        System.out.print("Input second number: ");
        int second = input.nextInt();
        System.out.println(first + "X" + second + "=" + first * second);

        input.close();
    }
}