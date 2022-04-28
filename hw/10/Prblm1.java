import java.util.GregorianCalendar;
import java.util.Scanner;
public class Prblm1{
  public static void main(String[] args) {
    //get input from user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter time1 (hour minute second): ");
    int hour = input.nextInt();
    int minute = input.nextInt();
    int second = input.nextInt();
    Time time1 = new Time(hour,minute,second);
    System.out.println(time1.toString()); //prints the current time
    System.out.println("Elapsed seconds in time1: " + time1.getSeconds()); //returns elapsed seconds
    //creates 2nd instance of Time using input
    System.out.print("Enter time2 (elapsed time): ");
    long seconds = input.nextLong();
    input.close();
    Time time2 = new Time(seconds);
    System.out.println(time2.toString()); //prints the current time
    System.out.println("Elapsed seconds in time2: " + time2.getSeconds()); //returns elapsed seconds
    System.out.println("time1.compareTo(time2)? " + time1.compareTo(time2));
    //creates clone of first instance
    System.out.println("time3 is created as a clone of time1");
    Time time3 = (Time)time1.clone();
    //compares the clone with the original
    System.out.print("time1.compareTo(time3)? " + time1.compareTo(time3));
  }
}
//class that will encapsulate time
class Time implements Comparable<Time>, Cloneable{
  //data fields
  private long time; //will store the elapsed time since midnight, Jan 1, 1970
  private int hour;
  private int minute;
  private int second;
  //A no-arg constructor that constructs a Time for the current time.
  Time(){
    time = (new GregorianCalendar().getTimeInMillis()/1000);
  }
  //A constructor with the specified hour, minute, and second to create a Time.
  Time(int hour, int minute, int second){
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }
  //A constructor with the specified elapsed time since midnight, Jan 1, 1970
  Time(long time){
    this.time = time;
    hour = (int)(time / 60) / 60;
    minute = (int)(time / 60) % 60;
    second = (int)(time % 60);
  }
  //getters
  public int getHour(){
    return (int)(time/(1000*60*60))%24;
  }
  public int getMinute(){
    return (int)(time/(1000*60)%60);
  }
  public int getSecond(){
    return (int)(time/1000)%60;
  }
  public long getSeconds(){
    return ((hour*60*60)+(minute*60)+second);
  }
  @Override
  public String toString(){
    return (hour%24) + ((hour>1)? " hours ":" hour ") + 
      (minute%60) + ((minute>1)? " minutes ":" minute ") + (second%60) + ((second>1)? " seconds ":" second ");
  }
  @Override
  public int compareTo(Time o){ //compares Time objects and returns difference
    if (getSeconds()>o.getSeconds())
      return (int)(getSeconds()-o.getSeconds());
    else if (getSeconds()<o.getSeconds())
      return (int)(getSeconds()-o.getSeconds());
    else
      return 0;
  }
  @Override
  public Object clone(){
    try{
      return super.clone();
    }
    catch(CloneNotSupportedException ex){
      return null;
    }
  }
}