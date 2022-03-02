import java.util.Scanner;
public class CheckAnagram {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first string: ");
      String first = input.next();
      System.out.print("Enter the second string: ");
      String second = input.next();
      input.close();
      boolean trueOrFalse = isAnagram(first,second);
      if (trueOrFalse == true)
        System.out.println(first + " and " + second + "are anagram.");
      else
        System.out.println(first + " and " + second + "are not anagram.");
    }
    public static boolean isAnagram(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        char[] list1 = s1.toCharArray();
        char[] list2 = s2.toCharArray();

        for (int i = 0; i < list1.length; i++){
            if (s2.contains(list1[i]) == false){
                return false;
            }
        } 
        return true;
        }


    }
    
