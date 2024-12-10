public class Kitchen extends Room{
    
    public Kitchen(){
        clue= "This kitchen is a mess, there's soup everywhere. It looks like there was a fight in here.";
        weapon = "Knife";
    }

    public void showOptions(){
        if (ClueMap.roomCounter==8){System.out.println("Move, Look Around, Accuse");}
        else {System.out.println("Move, Look Around");}
}

public static void main(String[] args) {
    Kitchen kitchen= new Kitchen();
    kitchen.showOptions();
    kitchen.lookAround();




}
}
