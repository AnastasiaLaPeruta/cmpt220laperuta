public class Complex extends Number{
  //data fields
  private double a;
  private double b;
  //Constructors
  Complex(){
    a = 0;
    b = 0;
  }
  Complex(double a, double b){
    this.a = a;
    this.b = b;
  }
  Complex(double a){
  this.a = a;
  b = 0;
  }

  //getters and setters
  public double getA(){
    return a;
  }
  public void setA(double a){
    this.a = a;
  }
  public double getB(){
    return b;
  }
  public void setB(double b){
    this.b = b;
  }
  //adds the complex numbers
  public static Complex add(Complex firstCom, Complex secondCom){
    double first = firstCom.getA() + secondCom.getA(); 
    double second = firstCom.getB() + secondCom.getB();
    return new Complex(first,second);   
  }
  //subtracts the complex numbers
  public static Complex subtract(Complex firstCom, Complex secondCom){
    double first = firstCom.getA() - secondCom.getA();
    double second = firstCom.getB() - secondCom.getB();
    return new Complex(first,second);
  }
  //return the real part of a complex number
  public static double getRealPart() {
  
  }
  //implements these because they are abstract in parent class
  public abstract int intValue(){
    return (int) num;
  }

}
