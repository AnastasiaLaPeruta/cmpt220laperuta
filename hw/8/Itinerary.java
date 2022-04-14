import java.util.ArrayList;
import java.util.List;
public class Itinerary extends Flight{
  //data field
  private List<Flight> flights;
  //constructor
  Itinerary(List<Flight> flights){
    this.flights = flights;
  }
  public long getTotalTravelTime(){
    //converts the times to minutes
    long arrivalMinutes = (flights.get(flights.size()-1)).get(arrivalTime.HOUR_OF_DAY) * 60 + (flights.get(flights.size()-1)).get(arrivalTime.MINUTE);
    long departureMinutes = (flights.get(0)).get(departureTime.HOUR_OF_DAY) * 60 + (flights.get(0)).get(departureTime.MINUTE);
    return  arrivalMinutes - departureMinutes;
}
  //returns total minutes in air
  public long getTotalFlightTime(){
    //loops through each item in list and adds up
    long sum = 0; //initializes where the minutes will be added to for each flight
    for (int i = 0; i < flights.size(); i++){
      sum += (flights.get(i)).getFlightTime();
    }
    return sum;
  }
  
    
}

