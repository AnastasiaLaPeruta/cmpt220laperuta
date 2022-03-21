import java.util.Scanner;
public class ProbNumber3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String words = input.next();
        input.close();
        System.out.print("The new string is: " + title(words));
    }
    public static String title(String s){
        String[] splitUp = s.split(" ");
        for (int i = 0; i < splitUp.length; i++)
          // JA: You can't modify an existing string
          splitUp[i].substring(0,1) = splitUp[i].substring(0,1).toUpperCase();
        String title = "";
        for (int i = 0; i < splitUp.length; i++){
            title = title + " " + splitUp[i];
        }
        return title;
    }
    
}
