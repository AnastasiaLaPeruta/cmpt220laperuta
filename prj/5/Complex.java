public class Complex extends Number implements Cloneable, Comparable<Complex> {
  // data fields
  private double a;
  private double b;

  // Constructors
  Complex() {
    a = 0;
    b = 0;
  }

  Complex(double a, double b) {
    this.a = a;
    this.b = b;
  }

  Complex(double a) {
    this.a = a;
    b = 0;
  }

  // getters and setters
  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }

  // adds the complex numbers
  public Complex add(Complex secondCom) {
    double first = getA() + secondCom.getA();
    double second = getB() + secondCom.getB();
    return new Complex(first, second);
  }

  // subtracts the complex numbers
  public Complex subtract(Complex secondCom) {
    double first = getA() - secondCom.getA();
    double second = getB() - secondCom.getB();
    return new Complex(first, second);
  }

  // multiplies the complex numbers
  public Complex multiply(Complex secondCom) {
    double first = (getA() * secondCom.getA()) - (getB() * secondCom.getB());
    double second = (getB() * secondCom.getA()) + (getA() * secondCom.getB());
    return new Complex(first, second);
  }

  // divides the complex numbers
  public Complex divide(Complex secondCom) {
    double first = ((getA() * secondCom.getA() + getB() * secondCom.getB())
        / (getA() * secondCom.getA() + secondCom.getB() * secondCom.getB()));
    double second = ((getB() * secondCom.getA() - getA() * secondCom.getB())
        / (secondCom.getA() * secondCom.getA() + secondCom.getB() * secondCom.getB()));
    return new Complex(first, second);
  }

  // gets the absolute value of a complex number
  public double abs() {
    return Math.sqrt(getA() * getA() + getB() * getB());
  }

  // return the real part of a complex number
  public double getRealPart() {
    return a;
  }

  // return the imaginary part of a complex number
  public double getImaginaryPart() {
    return b;
  }

  // turns it into string
  @Override
  public String toString() {
    return (b == 0 ? "" + a : a + " + " + b + "i"); // returns string, if b = 0 returns just "a"
  }

  // implements these because they are abstract in parent class, changes abs value
  // to different types
  @Override
  public int intValue() {
    return (int) Complex.abs(new Complex(getA(), getB()));
  }

  @Override
  public double doubleValue() {
    return (double) Complex.abs(new Complex(getA(), getB()));
  }

  @Override
  public float floatValue() {
    return (float) Complex.abs(new Complex(getA(), getB()));
  }

  @Override
  public long longValue() {
    return (long) Complex.abs(new Complex(getA(), getB()));
  }

  // overrides compareTo method from Comparable and compares the abs value
  @Override
  public int compareTo(Complex o) {
    if (abs() > o.abs())
      return 1;
    else if (abs() < o.abs())
      return -1;
    else
      return 0;
  }

  @Override
  public Object clone() {
    try {
      return super.clone();
    } catch (CloneNotSupportedException ex) {
      return null;
    }
  }

}
