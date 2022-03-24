import java.util.Scanner;
public class Pr2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //gets each point from user
        System.out.print("Enter 6 points of convex polygon (x and y seperated by space): ");
        //stores all inputs as points
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();  
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        double x5 = input.nextDouble();
        double y5 = input.nextDouble();
        input.close();
        //array to store each triangle's area
        double[] triangleAreas = new double[4];
        double a;
        double b;
        double c;

        //first triangle's area calculated and stored in array
        //distance formula used here
        a = Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2))); //side 1
        b = Math.sqrt((Math.pow(x1-x0,2)+Math.pow(y1-y0,2)));; //side 2
        c = Math.sqrt((Math.pow(x2-x0,2)+Math.pow(y2-y0,2)));; //side 3
        //uses heron's formula to find area using length of all sides
        triangleAreas[0] = (Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c))/4);

        //second triangle's area calculated and stored in array
        //distance formula used here
        a = Math.sqrt((Math.pow(x2-x0,2)+Math.pow(y2-y0,2))); //side 1
        b = Math.sqrt((Math.pow(x3-x2,2)+Math.pow(y3-y2,2)));; //side 2
        c = Math.sqrt((Math.pow(x3-x0,2)+Math.pow(y3-y0,2)));; //side 3
        //uses heron's formula to find area using length of all sides
        triangleAreas[1] = (Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c))/4);

        //third triangle's area calculated and stored in array
        //distance formula used here
        a = Math.sqrt((Math.pow(x3-x0,2)+Math.pow(y3-y0,2))); //side 1
        b = Math.sqrt((Math.pow(x4-x3,2)+Math.pow(y4-y3,2)));; //side 2
        c = Math.sqrt((Math.pow(x4-x0,2)+Math.pow(y4-y0,2)));; //side 3
        //uses heron's formula to find area using length of all sides
        triangleAreas[2] = (Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c))/4);

        //fourth triangle's area calculated and stored in array
        //distance formula used here
        a = Math.sqrt((Math.pow(x4-x0,2)+Math.pow(y4-y0,2))); //side 1
        b = Math.sqrt((Math.pow(x5-x4,2)+Math.pow(y5-y4,2)));; //side 2
        c = Math.sqrt((Math.pow(x5-x0,2)+Math.pow(y5-y0,2)));; //side 3
        //uses heron's formula to find area using length of all sides
        triangleAreas[3] = (Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c))/4);

        //goes through loop to add up areas of small triangles for total area of polygon
        double total = 0;
        for(int i = 0; i < 4; i++){
          total += triangleAreas[i];
        }
        System.out.println("The area of the convex polygon is " + total);
    }
}