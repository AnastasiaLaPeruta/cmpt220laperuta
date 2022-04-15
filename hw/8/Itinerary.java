import java.util.List;
public class Itinerary extends Flight{
  //data field
  private List<Flight> flights;
  //constructors
  Itinerary(){
  }
  Itinerary(List<Flight> flights){
    this.flights = flights;
  }
  public long getTotalTime(){
    //converts the times to minutes
    return (flights.get(flights.size()-1).getArrivalTime().getTimeInMillis() - 
      flights.get(0).getDepartureTime().getTimeInMillis())/60000;
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

