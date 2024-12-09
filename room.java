public class Room {
    String clue;

    public Room(){
        String clue= " ";
    }


    public String lookAround(){
        System.out.println("You found a Clue!!!! \n" + this.clue);
    }

    public void showOptions(){
        if (ClueMap.roomCounter==8){System.out.println("Move, Accuse");}
        else {System.out.println("Move");}
    }
}


