public class QuadraticEquation{
    //private data fields for coefficients
    private double a;
    private double b;
    private double c;
    //constructors
    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //getter methods for data fields
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    //method to get discriminant
    public double getDiscriminant(){
        return (b * b) - (4 * a * c);
    }
    //methods that return roots
    public double getRoot1(){
        //if discriminant is negative, return 0
        if ((b * b) - (4 * a * c) < 0)
          return 0;
        //otherwise return result of this formula
        else
          return(-b + Math.sqrt((b*b)-(4*a*c)))/2 * a;
    }
    public double getRoot2(){
        //if discriminant is negative, return 0
        if ((b * b) - (4 * a * c) < 0)
          return 0;
        //otherwise return result of this formula
        else
          return(-b - Math.sqrt((b*b)-(4*a*c)))/2 * a;
    }
}
