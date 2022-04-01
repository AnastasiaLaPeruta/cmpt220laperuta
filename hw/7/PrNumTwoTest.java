import java.util.Scanner;
public class PrNumTwoTest {
    //testing point class
    public static void main(String[] args) {
        //prompts user to enter three points
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        input.close();
        //creates instances of different points using input
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Point p3 = new Point(x3,y3);
        Point p4 = new Point(x4,y4);
        //prints results by calling the above method
        if (getIntersectingPoint(p1,p2,p3,p4) == null)
          System.out.println("The two lines are parallel");
        else
          System.out.println("The intersecting point is at " + getIntersectingPoint(p1,p2,p3,p4).toString() );
    }
    //method that returns intersecting point between two lines
    public static Point getIntersectingPoint(Point p1, Point p2, Point p3, Point p4){
        //stores different points as simpler variables
        double a = p1.getY() - p2.getY();
        double b = -(p1.getX() - p2.getX());
        double c = p3.getY() - p4.getY();
        double d = -(p3.getX() - p4.getX());
        double e = (p1.getY() - p2.getY()) * p1.getX() - (p1.getX() - p2.getX()) * p1.getY();
        double f = (p3.getY() - p4.getY()) * p3.getX() - (p3.getX() - p4.getX()) * p3.getY();
        //check if ad-bc equals 0
        if (a * d - b * c == 0)
          return null;
        else{ 
          double newX = (e * d - b * f)/(a * d - b * c);
          double newY = (a * f - e * c)/(a * d - b * c);
          Point finalPoint = new Point(newX,newY);
          return finalPoint;
        }
    }
}
