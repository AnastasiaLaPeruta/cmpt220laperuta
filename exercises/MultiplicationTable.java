import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        System.out.println(number + " X 1 = " + number*1);
        System.out.println(number + " X 2 = " + number*2);
        System.out.println(number + " X 3 = " + number*3);
        System.out.println(number + " X 4 = " + number*4);
        System.out.println(number + " X 5 = " + number*5);
        System.out.println(number + " X 6 = " + number*6);
        System.out.println(number + " X 7 = " + number*7);
        System.out.println(number + " X 8 = " + number*8);
        System.out.println(number + " X 9 = " + number*9);
        System.out.println(number + " X 10 = " + number*10);
    }
}