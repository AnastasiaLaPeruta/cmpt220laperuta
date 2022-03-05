import java.util.Scanner;
public class ProbNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        input.close();
        System.out.print("The binary value is " + decimalToBinary(number));
    }
    public static String decimalToBinary(int value){
      int placeHolder = 1;
      int currentValue = 1;
      String binary = "";
      while (currentValue < value)
        currentValue *= 2;
      placeHolder = currentValue;
      while (currentValue / 2 >= 1){
        if (currentValue == value){
          currentValue -= value;
          placeHolder = currentValue;
          binary += "1";
        }  
        else if (currentValue > value){
          currentValue -= value;
          placeHolder = currentValue;
          binary += "1";
        }
        else{
          binary += "0";
          placeHolder/=2;
        }
      } 
      return binary;
    }
    
}
