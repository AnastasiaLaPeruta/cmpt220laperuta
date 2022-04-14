import java.util.GregorianCalendar;
public class Flight {
  //data fields
  private String flightNo;
  private GregorianCalendar departureTime;
  private GregorianCalendar arrivalTime;
  //constructor
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
    long arrivalMinutes = arrivalTime.get(arrivalTime.HOUR_OF_DAY) * 60 + arrivalTime.get(arrivalTime.MINUTE);
    long departureMinutes = departureTime.get(departureTime.HOUR_OF_DAY) * 60 + departureTime.get(departureTime.MINUTE);
    //returns the difference in minutes
    return arrivalTime - departureTime;
  }
}
