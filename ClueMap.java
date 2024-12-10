
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
        if (roomCounter==8){System.out.println("Move, Accuse");}
        else {System.out.println("Move");}
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
        
        if (directionInput.equals ("A")){
            yPosition=+ distanceInput;}
        else if (directionInput.equals("B")){
            xPosition=+ distanceInput;}
        else if (directionInput.equals("C")){
            yPosition=- distanceInput;}
        else if (directionInput.equals("D")){
            xPosition=- distanceInput;}
        else{}
        System.out.println(yPosition);
        System.out.println( "You are now in the " +ClueMap.checkLocation());
    }




    public static void main(String[] args) {
        ClueMap map= new ClueMap();
        System.out.println(ClueMap.checkLocation());
        map.move("A", 5);




    }
}