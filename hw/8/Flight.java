import java.util.GregorianCalendar;
public class Flight {
  //data fields
  private String flightNo;
  private GregorianCalendar departureTime;
  private GregorianCalendar arrivalTime;
  //constructors
  Flight(){
  }
  Flight(String flightNo, GregorianCalendar departureTime, GregorianCalendar arrivalTime){
    this.flightNo = flightNo;
    this.departureTime = departureTime;
    this.arrivalTime = arrivalTime;
  }
  //getter and setter methods
  public String getFlightNo(){
    return flightNo;
  }
  public GregorianCalendar getDepartureTime(){
    return departureTime;
  }    
  public void setDepartureTime(GregorianCalendar departureTime){
    this.departureTime = departureTime;
  }
  public GregorianCalendar getArrivalTime(){
    return arrivalTime;
  }
  public void setArrivalTime(GregorianCalendar arrivalTime){
    this.arrivalTime = arrivalTime;
  }
  //method that returns flight time in minutes
  public long getFlightTime(){
    //converts the times to minutes
    return (long)(arrivalTime.getTimeInMillis() - departureTime.getTimeInMillis())/60000;
  }
}
