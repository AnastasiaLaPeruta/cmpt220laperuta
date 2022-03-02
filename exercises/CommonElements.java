import java.util.Scanner;
public class CommonElements {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter list1: ");
    int n1 = input.nextInt();
    int[] numbers1 = new int[n1]
    for (int i=0; i < n1; i++)
      numbers1[i] = input.nextInt();
    System.out.print("Enter list2: ");
    int n2 = input.nextInt();
    int[] numbers2 = new int[n2]
    for (int i=0; i < n2; i++)
      numbers2[i] = input.nextInt();
    // Find common elements
    System.out.print("The common elements are");
    for (int i = 0; i < n1; i++)
      for (int j = 0; j < n2; j++)
        if (numbers1[i] == numbers2[j])
          System.out.print(" " + numbers1[i]);
  }
}
