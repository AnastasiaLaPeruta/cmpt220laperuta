import java.util.Scanner;
public class Prob2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a numerator: ");
        int numerator = input.nextInt();
        System.out.print("Enter a denominator: ");
        int denominator = input.nextInt();
        if (numerator > denominator){
          if (numerator % denominator == 0){
            int result = numerator/denominator;
            System.out.println(numerator+" / "+denominator+" is an improper fraction and it can be reduced to "+result);
          }
          else{
            int firstNum = numerator/denominator;
            int secondNum = numerator%denominator;
            System.out.println(numerator+" / "+denominator+" is an improper fraction and it can be reduced to "+firstNum+" + "+secondNum+"/"+denominator);
          }
        }
        else{
          System.out.println(numerator+" / "+denominator+" is a proper fraction");
        }
        input.close();

    }
    
}
