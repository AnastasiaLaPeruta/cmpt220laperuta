public class Point{
    // private data fields to store a point
    private double x;
    private double y;

    //constructor to create a point
    Point(double x, double y){
      this.x = x;
      this.y = y;
    }
     //getters and setters for the data fields
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y;
    }
    //overrides object classes toString method
    @Override
    public String toString(){
      return "(" + x + ", " + y + ")";
    }
}