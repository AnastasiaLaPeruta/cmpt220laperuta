import java.util.Scanner;
//test program that prompts the user to enter two rational numbers as strings and displays their addition
public class Prblm3{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first rational number: ");
    String first = input.nextLine();
    System.out.print("Enter the second rational number: ");
    String second = input.nextLine();
    input.close();
    //parse string and returns object
    Rational firstR = Rational.parseRationalNumber(first);
    Rational secondR = Rational.parseRationalNumber(second);
    //prints results of adding them together
    System.out.println(firstR + " + " + secondR + " = " + firstR.add(secondR));

  }
}
class Rational extends Number implements Comparable<Rational> {
  // Data fields for numerator and denominator
  private long numerator = 0;
  private long denominator = 1;

  /** Construct a rational with default properties */
  public Rational() {
    this(0, 1);
  }
  
  /** Construct a rational with specified numerator and denominator */
  public Rational(long numerator, long denominator) {
    long gcd = gcd(numerator, denominator);
    this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
    this.denominator = Math.abs(denominator) / gcd;
  }
    
  /** Find GCD of two numbers */
  private static long gcd(long n, long d) {
    long n1 = Math.abs(n);
    long n2 = Math.abs(d);
    int gcd = 1;
    
    for (int k = 1; k <= n1 && k <= n2; k++) {
      if (n1 % k == 0 && n2 % k == 0)
        gcd = k;
    }
    
    return gcd;
  }
  
  /** Return numerator */
  public long getNumerator() {
    return numerator;
  }
  
  /** Return denominator */
  public long getDenominator() {
    return denominator;
  }
  
  /** Add a rational number to this rational */
  public Rational add(Rational secondRational) {
    long n = numerator * secondRational.getDenominator() +
      denominator * secondRational.getNumerator();
    long d = denominator * secondRational.getDenominator();
    return new Rational(n, d);
  }
  
  /** Subtract a rational number from this rational */
  public Rational subtract(Rational secondRational) {
    long n = numerator * secondRational.getDenominator()
      - denominator * secondRational.getNumerator();
    long d = denominator * secondRational.getDenominator();
    return new Rational(n, d);
  }
  
  /** Multiply a rational number by this rational */
  public Rational multiply(Rational secondRational) {
    long n = numerator * secondRational.getNumerator();
    long d = denominator * secondRational.getDenominator();
    return new Rational(n, d);
  }
  
  /** Divide a rational number by this rational */
  public Rational divide(Rational secondRational) {
    long n = numerator * secondRational.getDenominator();
    long d = denominator * secondRational.numerator;
    return new Rational(n, d);
  }
  
  @Override
  public String toString() {
    if (denominator == 1)
      return numerator + "";
    else
      return numerator + "/" + denominator;
  }
  
  @Override // Override the equals method in the Object class
  public boolean equals(Object other) {
    if ((this.subtract((Rational)(other))).getNumerator() == 0)
      return true;
    else
      return false;
  }
  
  @Override // Implement the abstract intValue method in Number
  public int intValue() {
    return (int)doubleValue();
  }
  
  @Override // Implement the abstract floatValue method in Number
  public float floatValue() {
    return (float)doubleValue();
  }
  
  @Override // Implement the doubleValue method in Number
  public double doubleValue() {
    return numerator * 1.0 / denominator;
  }
  
  @Override // Implement the abstract longValue method in Number
  public long longValue() {
    return (long)doubleValue();
  }
  
  @Override // Implement the compareTo method in Comparable
  public int compareTo(Rational o) {
    if (this.subtract(o).getNumerator() > 0)
      return 1;
    else if (this.subtract(o).getNumerator() < 0)
      return -1;
   else
     return 0;
  }
  
  //The method returns a Rational object from a string that represents a rational number
  public static Rational parseRationalNumber(String s){
    //uses string to build onto so can use parseInt()
    String num = "";
    String denom = "";
    int count = 0;
    while(count<s.length()){//goes through each character in string until reads entire string
      if (!s.contains("/")){ //makes sure not infinite loop if there is no slash
        num = s;
        denom = "1";
        break;
      }
      while(s.charAt(count) != '/'){ //adds char to numerator until it finds a forward slash
        num+=(s.charAt(count));
        //increments so we know when string has been read completely, increments at end so start index is 0
        count++;
      }
      count++; //as soon as breaks out of loop, that slash is skipped over
      denom = s.substring(count); //remainder of string is made the denominator
      break; 
    }
    //gets rid of spaces and turns the strings into integers
    int firstNum = Integer.parseInt(num.trim());
    int secondNum = Integer.parseInt(denom.trim());
    //returns a Rational object
    return new Rational(firstNum,secondNum);
  }
}