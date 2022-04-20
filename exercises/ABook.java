import java.util.Date;
public abstract class ABook{
  private String title;
  protected int dayTaken;
  protected Date date;

  ABook(){
    date = new Date();
  }

  public String getTitle(){
    return title;
  }
  public void setTitle(String title){
    this.title = title;
  }
  public int getDayTaken(){
    return dayTaken;
  }
  public void setDayTaken(int dayTaken){
    this.dayTaken = dayTaken;
  }
  public Date getDate(){
    return date;
  }
  public void setDate(Date date){
    this.date = date;
  }
  public abstract int daysOverdue();
  public abstract boolean isOverdue();

}
class Book extends ABook{
  private String author;

  Book(){
    date = new Date();
  }
  public String getAuthor(){
    return author;
  }
  public void setAuthor(String author){
    this.author - author;
  }
  @Override
  public int daysOverdue(){
    if (date.after(dayTaken + 14))
      return (int)((date.getTime()/86400000) + (365 * 31))- dayTaken;
    else
      return dayTaken - (int)((date.getTime()/86400000) + (365 * 31));
  }
}
class RefBook extends ABook{
  RefBook(){
    date = new Date();
  }
  @Override
  public int daysOverdue(){
    if (date.after(dayTaken + 2))
      return (int)((date.getTime()/86400000) + (365 * 31))- dayTaken;
    else
      return dayTaken - (int)((date.getTime()/86400000) + (365 * 31));
  }
}
class AudioBook extends ABook{
  private String author;
  AudioBook(){
    date = new Date();
  }
  public String getAuthor(){
    return author;
  }
  public void setAuthor(String author){
    this.author = author;
  }
  @Override
  public int daysOverdue(){
    if (date.after(dayTaken + 14))
      return (int)((date.getTime()/86400000) + (365 * 31))- dayTaken;
    else
      return dayTaken - (int)((date.getTime()/86400000) + (365 * 31));
  }
}