import java.util.Scanner;
public class PrbOne{
  public static void main(String[] args) {
    //creates new array
    int[] randomArray = new int[100];
    //loop fills array with random integer
    for (int i = 0; i < 100; i++){
      randomArray[i] = (int)(Math.random() * 100);
    }
    Scanner input = new Scanner(System.in);
    //asks user to pick an index
    System.out.print("Enter the index of the array: ");
    int index = input.nextInt();
    input.close();
    //checks to see if that index isn't out of bounds
    try{
      System.out.println(randomArray[index]); //displays value at index selected
    }
    catch(ArrayIndexOutOfBoundsException ex){ // if index was out of bounds
      System.out.println("Out of bounds");
    }
  }
}