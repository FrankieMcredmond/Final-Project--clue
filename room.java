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
        System.out.println("You found a Clue!!!! \n" + clue + "\n You also found a potential murder weapon!!!\n  the " + weapon+" does not have blood on it\n");
        System.out.println("The object you found has been removed from your potential weapon list, would you like to remove any suspects ");

    }

    public void showOptions(){
        if (ClueMap.roomCounter==8){System.out.println("Move, Accuse");}
        else {System.out.println("Move");}
    }
}


