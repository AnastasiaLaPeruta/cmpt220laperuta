import java.util.Scanner;
public class ReadFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        input.close();
        java.io.File file = new java.io.File(fileName);
        Scanner input2 = new Scanner(file);
        while (input2.hasNextLine()){
          System.out.println(input2.nextLine());
        }
        input2.close();
    }
    
}
