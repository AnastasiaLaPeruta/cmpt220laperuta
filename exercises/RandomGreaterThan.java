public class RandomGreaterThan {
    public static void main(String[] args) {
        do {
            double rand = Math.random();
            System.out.println(rand);
        } while (rand < .75);
    }
    
}
