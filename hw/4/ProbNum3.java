import java.util.Scanner;
public class ProbNum3{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a genome string: ");
    String genomeString = input.nextLine();
    input.close();
    boolean found = false;
    int start = -1;
    for (int i = 0; i < genomeString.length() - 2; i++) {
      String triplet = genomeString.substring(i, i + 3);
      if (triplet.equals("ATG")) {
        start = i + 3;
      } 
      else if (((triplet.equals("TAG")) || (triplet.equals("TAA")) || (triplet.equals("TGA"))) && (start != -1)){
        String gene = genomeString.substring(start, i);
          if (gene.length() % 3 == 0){
            found = true;
            System.out.println(gene);
            start = -1;
            break;
          }
      }
    }
    if (!found)
      System.out.println("no gene is found");
  }
}