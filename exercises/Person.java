import java.util.Date;
public class Person{
  private String firstName; //store the first name
  private String lastName; //store the last name

  //default constructor
  public Person(){
    firstName = "";
    lastName = "";
  }

  //Constructor with parameters
  public Person(String first, String last){
      setName(first,last);
  }

  //method to output the first name and last name
  //in the form firstName lastName.
  public String toString(){
      return (firstName + " " + lastName);
  }

  //method to set firstName and lastName according to 
  //the parameters
  public void setName(String firstName, String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
  }

  //method to return firstName
  public String getFirstName(){
      return firstName;
  }

  //method to return lastName
  public String getLastName(){
      return lastName;
  }

  class Doctor extends Person{
      private String specialty;
      public Doctor(){
      }
      public Doctor(String specialty, String firstName, String lastName){
        this.specialty = specialty;
        super.firstName = firstName;
        super.lastName = lastName;    
      }
      public String getSpecialty(){
          return specialty;
      } 
      public void setSpecialty(String specialty){
          this.specialty = specialty;
      }
  }
  class Patient extends Person{
      private String patientID;
      private int age;
      private Date dateOfBirth;
      private Doctor physicianName;
      private Date dateAdmitted;
      private Date dateDischarged;
      Patient(){
      }
      Patient(String patientID, int age, Date dateOfBirth, Doctor physicianName,
        Date dateAdmitted, Date dateDischarged, String firstName, String lastName){
        super(firstName, lastName);
        this.patientID = patientID;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.physicianName = physicianName;
        this.dateAdmitted = dateAdmitted;
        this.dateDischarged = dateDischarged;
      }
      public String getPatientID(){
          return patientID;
      }
      public void setPatientID(String patientID){
          this.patientID = patientID;
      }
      public int getAge(){
          return age;
      }
      public void setAge(int age){
          this.age = age;
      }
      public Date getDateOfBirth(){
          return dateOfBirth;
      }
      public void setDateOfBirth(Date dateOfBirth){
          this.dateOfBirth = dateOfBirth;
      }
      public Doctor getPhysicianName(){
          return physicianName;
      }
      public void setPhysicianName(Doctor physicianName){
          this.physicianName = physicianName;
      }
      public Date getDateAdmitted(){
          return dateAdmitted;
      }
      public void setDateAdmitted(Date dateAdmitted){
          this.dateAdmitted = dateAdmitted;
      }
      public Date getDateDischarged(){
          return dateDischarged;
      }
      public void setDateDischarged(Date dateDischarged){
          this.dateDischarged = dateDischarged;
      }
  }
  class Bill extends Patient{
      private Patient patient;
      private double pharmacyCharges;
      private double doctorsFee;
      private double roomCharges;
      Bill(){ 
      }
      Bill(Patient patient, double pharmacyCharges, double doctorsFee, double roomCharges){
        this.patient = patient;
        this.pharmacyCharges = pharmacyCharges;
        this.doctorsFee = doctorsFee;
        this.roomCharges = roomCharges;
      }
      public Patient getPatient(){
          return patient;
      }
      public void setPatient(Patient patient){
          this.patient = patient;
      }
      public double getPharmacyCharges(){
          return pharmacyCharges;
      }
      public void setPharmacyCharges(double pharmacyCharges){
          this.pharmacyCharges = pharmacyCharges;
      }
      public double getDoctorsFee(){
          return doctorsFee;
      }
      public void setDoctorsFee(double doctorsFee){
          this.doctorsFee = doctorsFee;
      }
      public double getRoomCharges(){
          return roomCharges;
      }
      public void setRoomCharges(double roomCharges){
          this.roomCharges = roomCharges;
      }
  }
  public static void main(String[] args) {
      Patient patient1 = new Patient("14133", 18, Date(2003,5,19), Doctor("Greg"),
      Date(2022,3,30), Date(2022,3,31), "Anastasia", "LaPeruta");
      patient1.getPatientID();
  }
}
    
