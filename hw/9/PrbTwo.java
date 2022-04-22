import java.util.Scanner;
public class PrbTwo {
  public static int bin2Dec(String binaryString){
    for (int i = 0; i < binaryString.length() - 1; i++){  //loops through each character in string
      if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') //checks if invalid characters are entered
        throw new NumberFormatException("Input must only conatin 1's and 0's"); //throws exception if invalid 
    }
    int multiplier = 1;
    int total = 0;
    for (int i = binaryString.length() - 1; i >= 0; i--){ //starts at end of string
      if (binaryString.charAt(i) == '1') //if digit is 1
        total += (binaryString.charAt(i) - '0') * multiplier; //updates total
      multiplier *= 2; //makes sure placevalues are increased as travelling left
      
    }
    return total;
  }
  public static void main(String[] args) {
    //gets string from user and stores it
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a binary number as a string: ");
    String binaryString = input.nextLine();
    input.close();
    //tests if its valid input that can be converted to decimal
    try{
      int result = bin2Dec(binaryString);
      System.out.println("The decimal equivalent of the string entered is: " + result);
    }
    catch(NumberFormatException ex){ //catches exception of thrown in the method
      System.out.println("Not a binary number");
    }    
  }  
}
