import java.util.Scanner;
public class Pr3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.next();
        input.close();
        //calls method using the input to store and print the results using loop
        int[] counts = count(string);
        String output = "";
        for (int i = 1; i < counts.length; i++) {
          output += "Digit " + (char)('0' + i) + " appears " +
          counts[i-1] + " times\n";
        }
        System.out.print(output);
    }

    public static int[] count(String s){
        //creates array
        int[] counts = new int[10];
        //loops and adds to count if it finds another occurence of the digit
        //if-else statement that executes differently depending on length of string
        if (s.length() < 10){
          for(int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
              counts[s.charAt(i) - '0']++;
            }
          }
        }
        else{
          for(int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
              counts[s.charAt(i) - '0'- 1]++;
            }
          }
        }
        //returns an array like method requires
        return counts;
    }
}
