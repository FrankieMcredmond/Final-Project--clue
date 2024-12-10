public class Room {
    String name;
    String clue;
    String weapon;

    public Room(String name, String clue, String weapon){
        this.name= name;
        this.clue= clue;
        this.weapon= weapon;
    }


    public void lookAround(){
        System.out.println("You found a Clue!!!! \n" + clue );

    }

    public void showOptions(){
        if (ClueMap.roomCounter==8){System.out.println("Move, Accuse");}
        else {System.out.println("Move");}
    }
}


