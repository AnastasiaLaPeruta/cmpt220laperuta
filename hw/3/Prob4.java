import java.lang.Math;
public class Prob4 {
    public static void main(String[] args) {
        double x = 0;
        double posOrNegX = 0;
        double y = 0;
        double posOrNegY = 0;
        double distance = 0;
        do{
        x = Math.random();
        posOrNegX = Math.random();
        if (posOrNegX < 0.25)
          x = x - 2 * x;
        x *= 10;
        y = Math.random();
        posOrNegY = Math.random();
        if (posOrNegY < 0.25)
          y = y - 2 * y;
        y *= 10;
        distance = Math.sqrt((x-0) * (x-0) + (y-0) * (y-0));
        } while(distance > 5);
        System.out.println("The point is ("+x+","+y+")");
        System.out.println("and its distance to the center is " + distance);
    }
    
}
