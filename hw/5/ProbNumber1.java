import java.util.Scanner;
public class ProbNumber1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        input.close();
        System.out.print(multiplyDigits(number));
    }
    public static int multiplyDigits(long n){
      int totalNum = 1;
      while (n > 0){
        totalNum *= n % 10;
        n /= 10;
      }

      return totalNum;
    }
    
}
