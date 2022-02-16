import java.util.Scanner;
public class NumbersBefore {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter a floating point number: ");
        String number = input.next();
        int before = 0;
        for (int i=0;i<number.length();i++){
            if (number.charAt(i) == '.')
                break;
            before += 1;
        }
        System.out.print("The number of digits before the decimal point is " + before);
        input.close();
    }
}
