import java.util.Scanner;
public class Project3{
  public static void main(String[] args) {
    //make sure values start off at 1 so while loop will run
    int width = 1;
    int length = 1;
    //keeps track of iterations
    int count = 0;
    //enables user to choose the length and width of room
    //can make as many houses as permitted
    while ((width != 0 && length != 0) || count <= 39){
      Scanner input = new Scanner(System.in);
      System.out.print(" Enter the width and length (0 and 0 to end program) then create house: ");
      width = input.nextInt();
      length = input.nextInt();
      String line;
      //stores values in an array from string
      char[][] roomAsArray = new char[length][width];
      line = input.nextLine();
      for (int i = 0; i < length; i++){
        line = input.nextLine();
        for (int j = 0; j < line.length(); j++){
          roomAsArray[i][j] = line.charAt(j);
        }
      }
      //keeps track of number of instances created
      count++;
      int row = 0;
      int column = 0;
      String direction;
      System.out.println("HOUSE " + count);
      //starts path to find exit
      for (int i = 0; i < length; i++){
        for (int j = 0; j < width; j++){
          if(roomAsArray[i][j] == '*'){
            //changes to new variables so can easily change and track
            row = i;
            column = j;
            break;
          }
        }
      }
            if (row == 0){ //if entrance is on top, direction is down
              direction = "down";
            }  
            else if (row == length - 1){ //if entrance is on the bottom, go up
              direction = "up";
            }
            else if (column == 0){ //if entrance is on the left, go right
                direction = "right";
            }
            else{ //entrance is on the right, go left
                direction = "left";
            }

            //decides direction to head based on location of entrance
            while (roomAsArray[row][column] != 'x'){ //goes until hits x which would be exit
              if(direction == "down"){ // head down until hits character
                while(roomAsArray[row][column] != '\\' && roomAsArray[row][column] != '/' && roomAsArray[row][column] != 'x'){
                  row++; 
                }
              }
              else if(direction == "up"){ //go up until hits character
                while(roomAsArray[row][column] != '\\' && roomAsArray[row][column] != '/' && roomAsArray[row][column] != 'x'){
                    row--;
                  }
              }
              else if (direction == "right"){ //go right until hits character
                while(roomAsArray[row][column] != '\\' && roomAsArray[row][column] != '/' && roomAsArray[row][column] != 'x'){
                  column++;
                }
              }
              else{ //go left until hit other character
                while(roomAsArray[row][column] != '\\' && roomAsArray[row][column] != '/' && roomAsArray[row][column] != 'x'){
                  column--; 
                }
              }


              //options to switch if hit this character depending on direction traveling
              if(roomAsArray[row][column] == '\\'){//if comes across mirror facing this way change direction
                if(direction == "left"){
                  direction = "up";
                  row--;
                }
                else if(direction == "right"){
                  direction = "down";
                  row++;
                }
                else if(direction == "up"){
                  direction = "left";
                  column--;
                }
                else if(direction == "down"){
                  direction = "right";
                  column++;
                }
              }
              else if(roomAsArray[row][column] == '/'){ //if comes across mirror facing this way
                if(direction == "left"){
                  direction = "down";
                  row++;
                }
                else if(direction == "right"){
                  direction = "up";
                  row--;
                }
                else if(direction == "up"){
                  direction = "right";
                  column++;
                }
                else if(direction == "down"){
                  direction = "left";
                  column--;
                }  
              }
            }
            roomAsArray[row][column] = '&';
            //print the solution with exit
            for (int i = 0; i < length; i++){
              for (int j = 0; j < width; j++){
              System.out.print(roomAsArray[i][j]);
              if (j == width - 1) //divides them into their individual rows
                System.out.print("\n");
              } 
            }
          } 
  }
}
  
