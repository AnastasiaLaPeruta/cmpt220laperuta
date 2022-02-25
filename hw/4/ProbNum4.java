import java.util.Scanner;
public class ProbNum4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int integer = input.nextInt();
    input.close();
    boolean rootCalculated = false;
    for(int i = 2; i < integer; i++){
      if (integer % i == 0){
        if (Math.sqrt(integer) - Math.floor(Math.sqrt(integer)) == 0){
          System.out.println("sqrt(" + integer + ") is " + Math.sqrt(integer));
          rootCalculated = true;
          break;
        }
        else if(Math.sqrt(integer/i) - Math.floor(Math.sqrt(integer/i)) == 0){
          System.out.println("sqrt(" + integer + ") is " + Math.sqrt(integer/i) + "sqrt(" + i + ")");
          rootCalculated = true;
          break;
        }
        else
          System.out.println("sqrt(" + integer + ") is " + Math.sqrt(i) + "sqrt(" + integer/i + ")");
      }
    }
    if (rootCalculated == false)
      System.out.println("sqrt(" + integer + ") is sqrt(" + integer + ")"); 
  }
}
      //double firstNum = 1;
      //double secondNum = 0;
      //if ((Math.sqrt(integer) - Math.floor(Math.sqrt(in}teger)) == 0))){
        //System.out.println("sqrt(" + integer + ") is " + Math.sqrt(integer));
        //break;
      //}
     // else if ((integer % i == 0) && (Math.sqrt(integer) - Math.floor(Math.sqrt(integer)) == 0)){
       // if (!(Math.sqrt(i)/100)){
         // firstNum = Math.sqrt(i);
          //secondNum = integer/i;
          //System.out.println("sqrt(" + integer + ") is " + firstNum + "*sqrt(" + secondNum + ")");
          //break;
        //}
        //else{
          //firstNum = i;
          //secondNum = Math.sqrt(integer/i);
          //System.out.println("sqrt(" + integer + ") is " + firstNum + "*sqrt(" + secondNum + ")");
          //break;
        //}
      //}       
    //}

    
