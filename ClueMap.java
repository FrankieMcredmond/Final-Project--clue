
public class ClueMap {
    public static int xPosition;
    public static int yPosition;
    public static int roomCounter;
    public String directionInput;
    public int distanceInput;

    public ClueMap() {
        xPosition = 0;
        yPosition = 0;
        roomCounter = 0;

    }

    public static void showOptions() {
        System.out.println("\n\n Your options are:\n");
        if (checkLocation().equals("no room")) {
            if (roomCounter == 8) {
                System.out.println(" -Move\n -Accuse\n -Map");
            } else {
                System.out.println(" -Move");
            }
        } else if (checkLocation().equals("Conservatory")) {
            if (roomCounter == 8) {
                System.out.println(" -Move\n -Look Around\n -Accuse\n -Map\n -Secret Door");
            } else {
                System.out.println(" -Move\n -Look Around\n -Secret Door");
            }
        } else {
            if (roomCounter == 8) {
                System.out.println("-Move\n -Look Around\n -Accuse\n -Map");
            } else {
                System.out.println(" -Move\n -Look Around");
            }
        }
    }

    public static String checkLocation() {
        if (xPosition >= -10 && xPosition <= -5 && yPosition <= 10 && yPosition >= 6) {
            return ("Kitchen");
        } else if (xPosition >= -3 && xPosition <= 1 && yPosition <= 10 && yPosition >= 4) {
            return ("Ballroom");
        } else if (xPosition >= 5 && xPosition <= 10 && yPosition <= 10 && yPosition >= 4) {
            return ("Conservatory");
        } else if (xPosition >= 3 && xPosition <= 10 && yPosition <= 2 && yPosition >= -2) {
            return ("Billiard Room");
        } else if (xPosition >= -10 && xPosition <= -5 && yPosition <= 2 && yPosition >= -3) {
            return ("Dining Room");
        } else if (xPosition >= -10 && xPosition <= -4 && yPosition <= -7 && yPosition >= -10) {
            return ("Lounge");
        } else if (xPosition >= -1 && xPosition <= 2 && yPosition <= -5 && yPosition >= -10) {
            return ("Hall");
        } else if (xPosition >= 5 && xPosition <= 10 && yPosition <= -4 && yPosition >= -10) {
            return ("Study");
        } else if (xPosition >= 11) {
            return ("Outside");
        } else if (xPosition <= -11) {
            return ("Outside");
        } else if (yPosition >= 11) {
            return ("Outside");
        } else if (xPosition <= -11) {
            return ("Outside");
        } else {
            return ("no room");
        }
    }

    public static void move(String directionInput, int distanceInput) {
        if (directionInput.equals("A")) {
            yPosition = +distanceInput;
        } else if (directionInput.equals("B")) {
            xPosition = +distanceInput;
        } else if (directionInput.equals("C")) {
            yPosition = -distanceInput;
        } else if (directionInput.equals("D")) {
            xPosition = -distanceInput;
        } else {
        }
        movePrintOut();
    }

    public static void movePrintOut() {
        if (checkLocation().equals("no room")) {
            System.out.println(" You have not discovered a room. Try Again.");
            showOptions();
        } else if (checkLocation().equals("Outside")) {
            System.out.println(
                    "\n\n  You accidentally walked outside *THUNDER* You better get back inside before the guard dogs get to you...");
            xPosition = 0;
            yPosition = 0;
            System.out.println("\n.....\n\n You are now back at your start point safe and sound, only soaking wet.");
            showOptions();
        } else {
            System.out.println(" You are now in the " + ClueMap.checkLocation());
        }
    }

    public static void secretDoor(String location) {
        if (location.equals("Kitchen")) {
            xPosition = -7;
            yPosition = 8;
            System.out.println("\n You are now in the " + ClueMap.checkLocation());
        } else if (location.equals("Ballroom")) {
            xPosition = -1;
            yPosition = 8;
            System.out.println("\n You are now in the " + ClueMap.checkLocation());
        } else if (location.equals("Billiard Room")) {
            xPosition = 6;
            yPosition = 1;
            System.out.println("\n You are now in the " + ClueMap.checkLocation());
        } else if (location.equals("Dining Room")) {
            xPosition = -7;
            yPosition = 1;
            System.out.println("\n You are now in the " + ClueMap.checkLocation());
        } else if (location.equals("Lounge")) {
            xPosition = -7;
            yPosition = -7;
            System.out.println("\n You are now in the " + ClueMap.checkLocation());
        } else if (location.equals("Hall")) {
            xPosition = 0;
            yPosition = -8;
            System.out.println("\n You are now in the " + ClueMap.checkLocation());
        } else if (location.equals("Study")) {
            xPosition = 7;
            yPosition = -7;
            System.out.println("\n You are now in the " + ClueMap.checkLocation());
        } else {
            System.out.println("\n The room you have entered does not exist. Try Again.");
        }

    }

    public static void main(String[] args) {
        new ClueMap();
        move("A", 0);
        move("A", 12);
        secretDoor("Kitchen");

    }
}