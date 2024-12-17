public class Room {
    String name;
    String clue;
    String weapon;
    boolean blood;

    public Room(String name, String clue, String weapon, boolean blood) {
        this.name = name;
        this.clue = clue;
        this.weapon = weapon;
        this.blood = blood;
    }

    public void lookAround() {
        System.out.println("You found a Clue!!!! \n" + clue);
        System.out.println("\n \n It looks like you found a possible weapon too!\n ");
        if (this.blood) {
            System.out.println("This " + this.weapon + " looks bloody. This could be the murder weapon!");
        } else {
            System.out
                    .println("This " + this.weapon + " doesn't have any blood on it, I guess it's not the weapon then");
        }

    }

    public static void main(String[] args) {
        Room kitchen = new Room("kitchen", " ", "", true);
        System.out.println(kitchen.name);
    }

}
