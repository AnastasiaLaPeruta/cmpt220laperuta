public class Pr1{
    public static void main(String[] args) {
        //variables to keep track of the count for each number 0 through 9
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;
        int fourCount = 0;
        int fiveCount = 0;
        int sixCount = 0;
        int sevenCount = 0;
        int eightCount = 0;
        int nineCount = 0;
        //generates 100 integers 0 to 9 and increases the counters for the corresponding numbers
        for (int i = 0; i < 100; i++){
          switch((int)(Math.random() * 10)){
            case 0: zeroCount++; break;
            case 1: oneCount++; break;
            case 2: twoCount++; break;
            case 3: threeCount++; break;
            case 4: fourCount++; break;
            case 5: fiveCount++; break;
            case 6: sixCount++; break;
            case 7: sevenCount++; break;
            case 8: eightCount++; break;
            case 9: nineCount++; break;
          }
        }
        //prints the cout for each number
        System.out.println("0's: "+zeroCount+"\n1's: "+oneCount+"\n2's: "+twoCount+"\n3's: "+threeCount+
                          "\n4's: "+fourCount+"\n5's: "+fiveCount+"\n6's: "+sixCount+"\n7's: "+sevenCount+
                          "\n8's: "+eightCount+"\n9's: "+nineCount);
    }
}