import java.util.Scanner;
public class PrNumThree{
    //modification of method that returns intersecting point between two lines from question two
    public static Point getIntersectingPoint(Point p1, Point p2, Point p3, Point p4){
        //stores different points as simpler variables
        double a = p1.getY() - p2.getY();
        double b = -(p1.getX() - p2.getX());
        double c = p3.getY() - p4.getY();
        double d = -(p3.getX() - p4.getX());
        double e = (p1.getY() - p2.getY()) * p1.getX() - (p1.getX() - p2.getX()) * p1.getY();
        double f = (p3.getY() - p4.getY()) * p3.getX() - (p3.getX() - p4.getX()) * p3.getY();
        //here is changed so will never return null like it would originally
        double newX = (e * d - b * f)/(a * d - b * c);
        double newY = (a * f - e * c)/(a * d - b * c);
        Point finalPoint = new Point(newX,newY);
        return finalPoint;
    }
    //returns the center of a triangle
    public static Point getCenterPoint(Point p1, Point p2, Point p3){
      //uses intersecting point method from problem two
      Point point1 = getIntersectingPoint(p1,p2,p2,p3);
      Point point2 = getIntersectingPoint(p2,p3,p3,p1);
      Point point3 = getIntersectingPoint(p3,p1,p1,p2);
      //returns centerpoint by calculating average of the x and y values
      double resultingX = (point1.getX() + point2.getX() + point3.getX())/3;
      double resultingY = (point1.getY() + point2.getY() + point3.getY())/3;
      Point resultingPoint = new Point(resultingX,resultingY);
      return resultingPoint;
    }
    public static void main(String[] args) {
        //gets input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        //makes instances of Point class from user input
        Point p1 = new Point(input.nextDouble(),input.nextDouble());
        Point p2 = new Point(input.nextDouble(),input.nextDouble());
        Point p3 = new Point(input.nextDouble(),input.nextDouble());
        input.close();
        System.out.println("The center point is at " + getCenterPoint(p1,p2,p3).toString());
    }

}