import java.io.IOException;
import java.util.Scanner; 

public class Game {
    private String murderer ; 
    private String murderWeapon;
    private String murderPlace; 
    private static boolean stillPlaying = true; 
        
        
        public static void main(String[] args){
            Scanner player = new Scanner(System.in); 
            System.out.println("Welcome Detective, thank you for making the journey on such short notice.");
            System.out.println("Please get started right away, here are the details:");
            System.out.println("Yvette the Maid found Mr. Body dead in the lobby around 9 pm but it was obvious his body had been placed there.");
            System.out.println("Six people were here for a dinner party, Mrs. White, Ms. Scarlet, Mrs. Peacock, Colonel Mustard, Professor Plum, and Mr. Green.");
            System.out.println("Your job is to figure out how Mr. Body died, where, and who did it");
            System.out.println("You'll only have three guesses so make them count!");
           do{
                String response = player.nextLine(); 
                if(response.contains("left")|| response.contains("right") || response.contains("straight") || response.contains("backwards")){
                    //ClueMap.move(response); 
                    System.out.println("This one works");  
                }
                else if(response.contains("look around")){
                   // ClueMap.lookAround(); 
                    System.out.println("This one too");
                }
                else if(response.contains("Mr. Green") && response.contains("candlestick") && response.contains("dining room")){
                    System.out.println("You have figured it out! Congratulations!");
                    stillPlaying = false; }
            

            } while(stillPlaying);        



        
        

    }
}
