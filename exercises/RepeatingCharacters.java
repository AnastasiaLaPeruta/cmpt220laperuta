import java.util.Scanner;
public class RepeatingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String characters = input.next();
        double previous = 0;
        double current = -1;
        double count = 0;
        for ( int i=0;i<characters.length();i++){
            previous = current;
            current = characters.charAt(i);
            if (current == previous)
                count +=1;
        }
        System.out.print("The number of consecutive repeating characters is " + count);
        input.close();
    }
    
}
