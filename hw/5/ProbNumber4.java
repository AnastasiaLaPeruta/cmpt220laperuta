import java.util.Scanner;
public class ProbNumber4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total seconds: ");
        int sec = input.nextInt();
        input.close();
        System.out.print("The hours, minutes, and seconds for total seconds " + sec + " is " + format(sec));
    }
    // JA: Output format is missing the leading 0 when les than 10
    public static String format(long seconds){
      long hours = (seconds / 3600) % 24;
      long minutes = (seconds % 3600) / 60;
      long secs = (seconds % 3600) % 60;
      return hours + ":" + minutes + ":" + secs;
    }
    
}
