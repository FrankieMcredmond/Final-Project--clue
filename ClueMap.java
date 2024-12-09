import java.util.Scanner;
public class ClueMap {
    public static int xPosition;
    public static int yPosition;
    public  static int roomCounter;
    
    public ClueMap(){
        xPosition=5;
        yPosition=-1;
        roomCounter=0;

        

    }
    



    public static String checkLocation (){
        if (xPosition>= -10 && xPosition<= -5 && yPosition<=10 && yPosition>=6){
            return("Kitchen");}
        if (xPosition>=-3 && xPosition<=1 && yPosition<=10 && yPosition>=4) {
            return("Ballroom");}
        if (xPosition>=5 && xPosition<=10 && yPosition<=10 && yPosition>=4) {
            return("Conservatory");}
        if (xPosition>=3 && xPosition<=10 && yPosition<= 2 && yPosition>= -2) {
            return("Billiard Room");}
        if (xPosition>= -10 && xPosition<= -5 && yPosition<= 2 && yPosition>= -3) {
            return("Dining Room");}
        if (xPosition>= -10 && xPosition<= -4 && yPosition<= -7 && yPosition>= -10) {
            return("Lounge");}
        if (xPosition>= -1 && xPosition<= 2 && yPosition<= -5 && yPosition>= -10) {
            return("Hall");}
        if (xPosition>= 5 && xPosition<= 10 && yPosition<= -4 && yPosition>= -10) {
            return("Study");}
        else{
            return ("no room");}
    }


    public void move (){
        Scanner mover= new Scanner(System.in);
        System.out.println("Select A to move up \n Select B to move right \n Select C to move down \n Select D to move left");
        String directionInput= mover.nextLine();
        System.out.println("Direction selected: " + directionInput);
        System.out.println("Enter how far you would like to move: ");
        int distanceInput= mover.nextInt();
        System.out.println("Distance selected: " + distanceInput);
        mover.close();
        if (directionInput == "A"){
            yPosition=+ distanceInput;}
        if (directionInput == "B"){
            xPosition=+ distanceInput;}
        if (directionInput == "C"){
            yPosition=- distanceInput;}
        if (directionInput == "D"){
            xPosition=- distanceInput;}
        else{}
        System.out.println( "You are now in the " +ClueMap.checkLocation());
    }




    public static void main(String[] args) {
        ClueMap map= new ClueMap();
        System.out.println(ClueMap.checkLocation());
        map.move();




    }
}