public class Clock {
    int hours = 0;
    int minutes = 0;
    int seconds = 0;
    Clock(){
      hours = 12;
    }
    Clock(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    Clock(int secondsSinceMidnight){
      hours = secondsSinceMidnight/60/60;
      minutes = secondsSinceMidnight/60;
      seconds = secondsSinceMidnight%3600;
    }
    public static int setClock(int secondsSinceMidnight){
      Clock(secondsSinceMidnight);
    }
    public int getHours(){
      return hours;
    }
    public int getMinutes(){
      return minutes;
    }
    public int getSeconds(){
      return seconds;
    }
    public void setHours(int hours){
      this.hours = hours;
    }
    public void setMinutes(int minutes){
      this.minutes = minutes;
    }
    public void setSeconds(int seconds){
      this.seconds = seconds;
    }
    public void tick(){
      seconds++;
    }
    public void addClock(Clock clock){
      hours += clock.hours;
      minutes += clock.minutes;
      seconds += clock.seconds;
    }
    public String toString(){
      return "("+(hours < 10?"0"+hours:hours)+":"+
      (minutes < 10?"0"+minutes:minutes)+":"+
      (seconds < 10?"0"+seconds:seconds)+")";
    }
    public void tickDown(){
      seconds--;
    }
    public subtractClock(Clock clock){
      hours = (hours>clock.hours?hours-clock.hours:clock.hours-hours);
      minutes = (minutes>clock.minutes?minutes-clock.minutes:clock.minutes-minutes);
      seconds = (seconds>clock.seconds?seconds-clock.seconds:clock.seconds-seconds);
      return Clock(hours,minutes,seconds);
    }
}
