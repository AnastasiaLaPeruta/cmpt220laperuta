import java.util.Scanner;
public class BinaryToDecimal{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a binary string: ");
        String binary = input.next();
        input.close();
        System.out.print("The decimal value of " + binary + " is " + binaryToDecimal(binary));
    }
    public static int binaryToDecimal(String binaryString){
        int number = 0;
        for (int i = 0; i < binaryString.length(); i++){
          if (binaryString.charAt(i) == 1)
            number = number + Math.pow(2,binaryString.length() - binaryString.charAt(i));
        }
        return number;
    }
}