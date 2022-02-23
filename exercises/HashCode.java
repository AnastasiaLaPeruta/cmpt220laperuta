import java.util.Scanner;
public class HashCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string s: ");
        String s = input.next();
        System.out.print("Enter an integer b: ");
        int b = input.nextInt();
        input.close();
        System.out.println("The hashCode for " + s + " is " + hashCode(s,b));
    }
    public static int hashCode(String s, int b){
        int result = 0;
        // loops through each char in string and computes the new result
        for (int i = 0; i < s.length(); i++){
            result = (result * b) + s.charAt(i);
        }
        return result;
    }
}
