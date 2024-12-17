import java.io.IOException;
import java.util.Scanner; 

public class Game extends Display {
    public Game() throws IOException {
        super();
        //TODO Auto-generated constructor stub
    }


    private String murderer ; 
    private String murderWeapon;
    private String murderPlace; 
    private static boolean stillPlaying = true; 
    private static int guessCounter = 0; 
        
        
        public static void main(String[] args) throws IOException{
            //Room kitchen= new Room(null, null, null);
            Scanner player = new Scanner(System.in); 
            System.out.println("Welcome Detective, thank you for making the journey on such short notice.");
            System.out.println("Please get started right away, here are the details:");
            System.out.println("Yvette the Maid found Mr. Body dead in the lobby around 9 pm but it was obvious his body had been placed there.");
            System.out.println("Six people were here for a dinner party, Mrs. White, Ms. Scarlet, Mrs. Peacock, Colonel Mustard, Professor Plum, and Mr. Green.");
            System.out.println("Your job is to figure out how Mr. Body died, where, and who did it");
            System.out.println("You'll only have three guesses so make them count!");
           do{
                String response = player.nextLine(); 
                 if(response.contains("move")){
                    System.out.println("\n Select A to move up \n Select B to move right \n Select C to move down \n Select D to move left");
                    String directionInput= player.nextLine();
                    System.out.println("\n Direction selected: " + directionInput);
                    System.out.println("\n Enter how far you would like to move: ");
                    int distanceInput= player.nextInt();
                    System.out.println("\n Distance selected: " + distanceInput);
                    ClueMap.move(directionInput, distanceInput); 
                    
                    }
                else if(response.contains("look around")){
                    
                    System.out.println("You are in a room!");
                    }
                else if(response.contains("show options")){
                    ClueMap.showOptions(); 
                    }
                else if (response.contains("accuse")){
                    System.out.println("What is your accusation?");
                    String guess = player.nextLine();
                    if(guess.contains("Mr. Green") && guess.contains("candlestick") && guess.contains("dining room")){
                     System.out.println("You did it! Congratulations!");
                     stillPlaying = false;
                    }
                    else if(guessCounter == 2){
                        System.out.println("You are out of guesses!");
                        stillPlaying = false; 
                        System.out.println("You didn't catch the killer! Try again next time!");
                    }
                    else if(guessCounter == 1){
                        System.out.println("You have one more guess!");
                        guessCounter++;
                    }
                    else if(guessCounter == 0){ 
                        System.out.println("You have two more guesses!");
                        guessCounter++; 
                        }}
                 else if(response.equals("Map")){
                   Display image = new Display(); 
                
                }
        

            } while(stillPlaying);  
            player.close();    
            
            



        
        

    }
}
