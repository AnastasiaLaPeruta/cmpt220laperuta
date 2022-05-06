import java.util.Scanner;
import java.util.ArrayList;
public class Project4 {
  public static void main(String[] args) {
      //gets information through input from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the year: ");
      int year = input.nextInt();
      System.out.print("Enter the gender ('M' or 'F'): ");
      String gender = input.nextLine();
      System.out.print("Enter the name: ");
      String name = input.nextLine();
      input.close();
      //uses switch statement to choose which year to load names from
      String fileName = "";
      switch (year){
        case 2001: fileName = "babynameranking2001"; break;
        case 2002: fileName = "babynameranking2002"; break;
        case 2003: fileName = "babynameranking2003"; break;
        case 2004: fileName = "babynameranking2004"; break;
        case 2005: fileName = "babynameranking2005"; break;
        case 2006: fileName = "babynameranking2006"; break;
        case 2007: fileName = "babynameranking2007"; break;
        case 2008: fileName = "babynameranking2008"; break;
        case 2009: fileName = "babynameranking2009"; break;
        case 2010: fileName = "babynameranking2010"; break;
      } 
      //creates instance of class
      BabyName baby = new BabyName(year,gender,name,fileName);
      //creates copy of arraylist and stores results of method that loads names
      ArrayList<BabyName> finalNames = new ArrayList<>(baby.loadNames(fileName));
      BabyName nameFound = baby.findName(name,year,finalNames); //returns instance of name if found or certain values if not
      //print results
      if(nameFound.getName() == "") //if name wasn't found when findName method was ran
        System.out.println("The name " + name + " is not ranked in year " + year);
      else //otherwise name was found
        //looks for ranking, it is either one index before name or two
        System.out.println(name + " is ranked " + ((finalNames.get(finalNames.indexOf(nameFound.getName())-1).getGender()) == "M"? (finalNames.get(finalNames.indexOf(nameFound.getName())-1)):(finalNames.get(finalNames.indexOf(nameFound.getName())-2))));
  }
}
//BabyName class
class BabyName{
  //data fields
  private String ranking;
  private int year;
  private String gender;
  private String name;
  private String fileName;
  //empty constrcutor
  BabyName(){
  }
  //constructor that sets data fields for that instance
  public BabyName(int year,String gender, String name, String fileName){
    this.year = year;
    this.gender = gender;
    this.name = name;
    this.fileName = fileName;
  }
  //constructor that doesn't need file name or gender
  public BabyName(int year,String name){
    this.year = year;
    this.name = name;
  }

  //getter and setter methods
  public int getYear(){
    return year;
  }
  public void setYear(int year){
    this.year = year;
  }
  public String getGender(){
    return gender;
  }
  public void setGender(String gender){
    this.gender = gender;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getFileName(){
    return fileName;
  }
  public void setFileName(String fileName){
    this.fileName = fileName;
  }
  public String getRanking(){
    return ranking;
  }
  public void setRanking(String ranking){
    this.ranking = ranking;
  }
  //method that loads the names from the correct file
  // JA: This should not be part of the BabyName class
  protected ArrayList<String> loadNames(String fileName){
    //creates an ArrayList that will store names
    ArrayList<String> names = new ArrayList<>(); 
    String ranking;
    String boyName;
    String girlName;
    int scrap; //disregards the number which aren't part of name
    //creates scanner so can read from file
    Scanner input1 = new Scanner(fileName);
    //loops through lines in selected file and adds to list
    for (int i = 0; i < 1000; i++){
      ranking = input1.next();
      boyName = input1.next();
      scrap = input1.nextInt();
      girlName = input1.next();
      scrap = input1.nextInt();
      //adds names to an array
      names.add(ranking);
      names.add(girlName);
      names.add(boyName);
    }
    input1.close();
    return names;
  }
  //method that searches names
  protected BabyName findName(String name, int year, ArrayList<BabyName> names){
    BabyName baby = new BabyName(); 
    //loops through the ArrayList to find name
    for (int i = 0; i < names.size() - 1; i++){
      if ((names.get(i)).getName() == this.name){ //if the name is found in list is found
        baby = new BabyName(year,name);
        return baby;
      }
      else{ //if the name is not found
        baby = new BabyName(year,"");
        return baby;
      }
    }
  }
}
