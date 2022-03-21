import java.util.Scanner;
import java.util.Arrays;
public class Project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers each under 1000, one per line: ");
        //creates array containing all integers from input
        int[] numList = new int[10];
        for (int i = 0; i < 10; i++){
          int number = input.nextInt();
          numList[i] = number;
        }
        input.close();

        //goes through array to make new one with resulting numbers
        int[] finalList = new int[10];
        for (int i = 0; i < 10; i++){
          int newNum = numList[i] % 42;
          finalList[i] = newNum;
        }

        //more easily find repeated numbers next to each other by sorting array
        Arrays.sort(finalList);
        //goes through each number in the now sorted array
        int count = 0;
        for (int i = 0; i < 10; i++){
          //index increases while there are duplicates found
          while (i < 10 - 1 && finalList[i] == finalList[i + 1]){
            i ++;
          }
          count++;
        }
 
        //prints amount of distinct integers
        System.out.println(count);      
    }
}
//written by Anastasia LaPeruta for CMPT220L