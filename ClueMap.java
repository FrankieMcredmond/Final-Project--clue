
public class ClueMap {
    public static int xPosition;
    public static int yPosition;
    public  static int roomCounter;
    public String directionInput;
    public int distanceInput;
    
    public ClueMap(){
        xPosition=0;
        yPosition=0;
        roomCounter=0;

        

    }
    public static void showOptions(){
        System.out.println("\n\n Your options are:\n");
        if (checkLocation().equals("no room")){
            if (roomCounter==8){
                System.out.println(" -Move\n -Accuse\n -Map");}
            else{System.out.println(" -Move");}}
        else if (checkLocation().equals("Conservatory")) {
            if (roomCounter==8){
                System.out.println(" -Move\n -Look Around\n -Accuse\n -Map\n -Secret Door");}
                else{System.out.println(" -Move\n -Look Around\n -Secret Door");}
            }
        else {
            if (roomCounter==8){
            System.out.println("-Move\n -Look Around\n -Accuse\n -Map");}
            else{System.out.println(" -Move\n -Look Around");}}
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


    public static void move (String directionInput, int distanceInput){
        System.out.println("\n Move Selected: ");
        if (directionInput.equals ("A")){
            yPosition=+ distanceInput;}
        else if (directionInput.equals("B")){
            xPosition=+ distanceInput;}
        else if (directionInput.equals("C")){
            yPosition=- distanceInput;}
        else if (directionInput.equals("D")){
            xPosition=- distanceInput;}
        else{}

        if (checkLocation().equals("no room")){
            System.out.println(" You have not discovered a room. Try Again.");
            showOptions();
        }
        else {System.out.println( " You are now in the " +ClueMap.checkLocation());}
    }


    public static void secretDoor(String location){
        if (location.equals("Kitchen")){
            xPosition= -7 ;
            yPosition= 8 ;
        }
        else if (location.equals("Ballroom")){
            xPosition= -1 ;
            yPosition= 8 ;
        }
        else if (location.equals("Billiard Room")){
            xPosition= 6 ;
            yPosition= 1 ;
        }
        else if (location.equals("Dining Room")){
            xPosition= -7 ;
            yPosition= 1 ;
        }
        else if (location.equals("Lounge")){
            xPosition= -7 ;
            yPosition= -7 ;
        }
        else if (location.equals("Hall")){
            xPosition= 0 ;
            yPosition= -8 ;
        }
        else if (location.equals("Study")){
            xPosition= 7 ;
            yPosition= -7 ;
        }
        else{System.out.println("The room you have entered does not exist. Try Again.");}
        
    }




    public static void main(String[] args) {
        new ClueMap();
        move("A", 0);
        move("A", 5);
        showOptions();
        move("B", 5);
        showOptions();




    }
}