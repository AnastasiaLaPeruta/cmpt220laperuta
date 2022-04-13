import java.util.Scanner;
import java.util.ArrayList;
public class Prb2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //gets user input
        System.out.print("Enter the number of objects: ");
        int numOfObjects = input.nextInt();
        System.out.print("Enter the weights of the objects: ");
        //collects weight values and puts them in an ArrayList so easy to work with
        ArrayList<Integer> weightValues = new ArrayList<Integer>();
        for (int i = 0; i < numOfObjects; i++){
          weightValues.add(input.nextInt());
        }
        input.close();
        int containerNum = 0;
        while (!weightValues.isEmpty()){ //while values remain in ArrayList
          int currentHigh = 0;
          int currentLow = 0;
          containerNum++; //keeps track of repetition to label container
          if (weightValues.size() == 1){//handles odd number of items
            System.out.println("Container " + containerNum + " contains objects with weight " + weightValues.get(0));
            break;
          }
            //starting values
          currentHigh = weightValues.get(0);
          currentLow = weightValues.get(weightValues.size() - 1);
          //output results
          for (int i = 0; i < weightValues.size(); i++){ //find min and max within that sum to 10 or less
            if (weightValues.get(i) > currentHigh) //sets new highest value
              currentHigh = weightValues.get(i);
            if (weightValues.get(i) < currentLow && currentHigh + weightValues.get(i) <= 10) //sets new lowest value if sum under 10
              currentLow = weightValues.get(i);
          }
          //outputs results
          System.out.println("Container " + containerNum + " contains objects with weight " + currentHigh + " " + currentLow);
          //removes values so doesn't repeat values
          weightValues.remove(weightValues.indexOf(currentHigh));
          weightValues.remove(weightValues.indexOf(currentLow));

        }

    }
}
