import java.io.IOException;
import java.util.Scanner;

public class Game extends Display {
    public Game() throws IOException {
        super();
        // TODO Auto-generated constructor stub
    }

    private static boolean stillPlaying = true;
    private static int guessCounter = 0;

    public static void main(String[] args) throws IOException {
        Room kitchen = new Room("Kitchen", "This place is a disaster! Mrs. White and Mrs. Peacock were in here for hours fighting over the shark fin soup!", "Knife", false);
        Room ballroom = new Room("Ballroom", "The ballroom was full of music, they had got to the tipsy dancing portion of the night. I heard Colonel Mustard stepped on Plum’s foot!", "Wrench", false);
        Room conservatory = new Room("Conservatory", "The gardner said after the lights went out he saw someone rushing into the conservatory. Though he didn’t see who it was, he said they were coming from the dining room.", "Rope", false);
        Room billiardRoom = new Room("Billiard Room", "The balls are all over the pool table, looks like people were in the middle of a game when this occured.", "Pool cue", false);
        Room diningRoom = new Room("Dining Room", "This room looks untouched. Absolutely spotless. Almost too spotless for after a dinner party.", "Candlestick", true);
        Room study = new Room("Study", "A crumpled note in the trash reads, 'Meet me in the dining room. Bring no one. G." , "Revolver", false);
        Room hall = new Room("Hall", "The groundskeeper was walking in and out of here all night, nothing would have happened without him knowing.", "Shovel", false);
        Room lounge = new Room("Lounge","The piano in the lounge had sheet music with a big S across the top on the bench. She must have been playing during the commotion." , "Poison", false);
        ClueMap test = new ClueMap(); 
        Person call = new Person(); 
        Scanner player = new Scanner(System.in);
        System.out.println("Welcome Detective, thank you for making the journey on such short notice.");
        System.out.println("Please get started right away, here are the details:");
        System.out.println(
                "Yvette the Maid found Mr. Body dead in the lobby around 9 pm but it was obvious his body had been placed there.");
        System.out.println(
                "Six people were here for a dinner party, Mrs. White, Ms. Scarlet, Mrs. Peacock, Colonel Mustard, Professor Plum, and Mr. Green.");
        System.out.println("Your job is to figure out how Mr. Body died, where, and who did it");
        System.out.println("You'll only have three guesses so make them count!");
        ClueMap.showOptions();
        do {
            String response = player.nextLine();
            if (response.contains("move")) {
                System.out.println(
                        "\n Select A to move up \n Select B to move right \n Select C to move down \n Select D to move left");
                String directionInput = player.nextLine();
                System.out.println("\n Direction selected: " + directionInput);
                System.out.println("\n Enter how far you would like to move: ");
                int distanceInput = player.nextInt();
                System.out.println("\n Distance selected: " + distanceInput);
                ClueMap.move(directionInput, distanceInput);
                ClueMap.showOptions();

            } else if (response.contains("look around")) {
                if(ClueMap.checkLocation().equals("Kitchen")){
                    kitchen.lookAround(); 
                }
                else if(ClueMap.checkLocation().equals("Lounge")){
                    lounge.lookAround(); 
                }
                else if(ClueMap.checkLocation().equals("Ballroom")){
                    ballroom.lookAround(); 
                }
                else if(ClueMap.checkLocation().equals("Study")){
                    study.lookAround(); 
                }
                else if(ClueMap.checkLocation().equals("Conservatory")){
                    conservatory.lookAround(); 
                }
                else if(ClueMap.checkLocation().equals("Billiard Room")){
                    billiardRoom.lookAround(); 
                } 
                else if(ClueMap.checkLocation().equals("Dining Room")){
                    diningRoom.lookAround(); 
                }
                else if(ClueMap.checkLocation().equals("Hall")){
                    hall.lookAround(); 
                }
                else if(ClueMap.checkLocation().equals("Outside")){
                    System.out.println("You are outside, please reenter the house.");
                }
                else{
                    System.out.println("You are not in a room, keep moving around.");
                }
                ClueMap.showOptions();
            } else if (response.contains("show options")) {
                ClueMap.showOptions();
            } else if (response.contains("accuse")) {
                System.out.println("What is your accusation?");
                String guess = player.nextLine();
                if (guess.contains("Mr. Green") && guess.contains("candlestick") && guess.contains("dining room")) {
                    System.out.println("You did it! Congratulations!");
                    stillPlaying = false;
                } else if (guessCounter == 2) {
                    System.out.println("You are out of guesses!");
                    stillPlaying = false;
                    System.out.println("You didn't catch the killer! Try again next time!");
                } else if (guessCounter == 1) {
                    System.out.println("You have one more guess!");
                    guessCounter++;
                } else if (guessCounter == 0) {
                    System.out.println("You have two more guesses!");
                    guessCounter++;
                }
            } else if (response.equals("map")) {
                Display image = new Display();

            }
            else if (response.equals("edit weapon list")) {
                System.out.println("What weapon would you like to add?");
                String weapon = player.nextLine();
                Person.removeWeapon(weapon); 
            }
            else if (response.equals("edit suspect list")) {
                System.out.println("What suspect would you like to remove?");
                String suspect = player.nextLine();
                Person.removeSuspect(suspect);
            }
            else if (response.equals("suspect list")) {
                Person.printSuspectList(); 
            }
            else if (response.equals("secret door")) {
                System.out.println("Where would you like to go?");
                String room = player.nextLine(); 
                ClueMap.secretDoor(room);
            }
            else if(response.equals("clues")){
                System.out.println("Here are the clues:");
                Person.printClueList();
            }
            else if (response.equals("print evidence")) {
                System.out.println("Here's everything you know so far:");
                System.out.println("----------------------------------");
                Person.printSuspectList();
                System.out.println();
                Person.printWeaponList();
                System.out.println();
                Person.printClueList(); 
            }
        

        } while (stillPlaying);
        player.close();

    }
}
