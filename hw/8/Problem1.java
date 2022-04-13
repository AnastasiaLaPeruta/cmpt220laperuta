//written by Anastasia LaPeruta
//for CMPT 220L
import java.util.Scanner;
import java.util.ArrayList;
public class Problem1{
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    //gets user input
    System.out.print("Enter a string, press enter, then enter delimeters: ");
    //reads each line and stores it accordingly
    String str = input.nextLine();
    String delimiters = input.nextLine();
    input.close();
    //stores results of method in a list
    ArrayList<String> finalList = split(str, delimiters);
    //loops through list to print results
    for (int i = 0; i < finalList.size(); i ++){
      System.out.print(finalList.get(i) + " ");
    }
  }
  //splits a string into substrings using delimiter characters
  public static ArrayList<String> split(String s, String delimiters){
    int nextStartPoint = 0; //index where to start for next substring, begins at index 0
    //creates ArrayList to store values in that will ultimately get returned
    ArrayList<String> splitString = new ArrayList<>();
    //goes through each index of string and checks to see if delimiter is present 
    for (int i = 0; i < s.length(); i++){
      //loops through delimeters for each repetition
      for (int j = 0; j < delimiters.length(); j++){
        if (i == j){ //if delimiter is found in string
          splitString.add(s.substring(nextStartPoint,i));
          nextStartPoint = i + 1; //index where to start for next substring
        }
      }
    }
    //give resulting ArrayList as method must return
    return splitString;
  }
}