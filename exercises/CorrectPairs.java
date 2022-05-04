import java.util.Stack;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class CorrectPairs{
  public static void main(String[] args) {
    //creates a stack
    Stack<Character> collection = new Stack<>();
    //begins reading from file
    try{
      File readFrom = new File(args[0]);
      Scanner reader = new Scanner(readFrom);
      do{ 
        String data = reader.nextLine();
        for (int i = 0; i < data.length(); i++){
          if (data.charAt(i) == '(' || data.charAt(i) == '[' || data.charAt(i) == '{'){ //if character is opening
            collection.push(data.charAt(i)); //add opener to stack
          }
          else if (data.charAt(i) == ')' || data.charAt(i) == ']' || data.charAt(i) == '}'){//if character is closing
            collection.pop(); //gets rid of opening char to signal completion
          }
        }
      } while (reader.hasNextLine()); //will loop through each line if there are more than one
      reader.close();
      System.out.println(collection.empty()? "There are all matching pairs.":"File contains not all matching pairs.");
    } catch (FileNotFoundException ex){
      System.out.println("An error has occured.");
      ex.printStackTrace();
    } 
  }
}