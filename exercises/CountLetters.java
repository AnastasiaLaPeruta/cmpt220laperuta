//reads a words from the standard input and prints the number of 
// occurences of each letter in that word. 
import java.util.Scanner;
public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        //get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();
        scan.close();

        //convert to all upper case
        word = word.toUpperCase();

        //count frequency of each letter in string
        try{
          for (int i = 0; i < word.length(); i++)
            if (word.substring(i,i).isDigit())
              int error = word.substring(i,i);
            counts[word.charAt(i)-'A']++;
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Not a letter.");
            System.out.println("Cannot process: " + word.indexOf(i));
        }
        //print frequencies
        for (int i=0; i < counts.length; i++){
            if (counts [i]  != 0)
              System.out.println((char)(i + 'A') + ": " + counts[i]);
        }
    }
}
