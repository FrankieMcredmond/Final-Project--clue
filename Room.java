public class Room {
    String name;
    String clue;
    String weapon;
    boolean blood;

    /**
     * 
     * @param name   name of room
     * @param clue   clue of room
     * @param weapon weapon in room
     * @param blood  whether the weapon has blood on it or not
     */
    public Room(String name, String clue, String weapon, boolean blood) {
        this.name = name;
        this.clue = clue;
        this.weapon = weapon;
        this.blood = blood;
    }

    /**
     * prints out the clue of that room, and it's weapon
     */
    public void lookAround() {
        System.out.println("\n \nYou found a Clue!!!! \n" + clue);
        System.out.println("\n \n It looks like you found a possible weapon too!\n ");
        if (this.blood) {
            System.out.println("This " + this.weapon + " looks bloody. This could be the murder weapon!");
        } else {
            System.out
                    .println("This " + this.weapon + " doesn't have any blood on it, I guess it's not the weapon then.");
        }
        System.out.println("You should update your lists to with these discoveries!");

    }

    public static void main(String[] args) {
        Room kitchen = new Room("kitchen", " ", "", true);
        System.out.println(kitchen.name);
    }

}
