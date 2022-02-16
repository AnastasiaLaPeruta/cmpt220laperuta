public class SquareRootTable {
    public static void main(String[] args) {
        System.out.println("Number   Square Root");
        System.out.println("--------------------");
        for (int i = 0; i <= 20; number+=2){
            System.out.printf(("%-5d + %5.4f"), number, Math.sqrt(number)));
        }
    }
    
}
