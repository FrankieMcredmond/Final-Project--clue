import java.util.ArrayList;
import java.util.HashMap;

public class Person {
    private static ArrayList<String> murderWeapons = new ArrayList<>(); 
    public static ArrayList<String> suspectList = new ArrayList<>();
    public static ArrayList<String> clueList=new ArrayList<>();
/**
 * Person constructor that initializes the suspect list
 */
    public Person(){
        suspectList.add("Mr. Green");
        suspectList.add("Mrs. White");
        suspectList.add("Ms. Scarlet");
        suspectList.add("Mrs. Peacock");
        suspectList.add("Professor Plum");
        suspectList.add("Colonel Mustard"); 
        murderWeapons.add("Candlestick");
        murderWeapons.add("Knife");
        murderWeapons.add("Wrench");
        murderWeapons.add("Pool cue");
        murderWeapons.add("Shovel");
        murderWeapons.add("Poison");
        murderWeapons.add("Rope");
        murderWeapons.add("Revolver");

    }
 /**
  * removes weapon from the list of possible murder weapons 
  * @param weapon
  */
    public static void removeWeapon(String weapon) {
        if(murderWeapons.contains(weapon)){
            murderWeapons.remove(weapon); 
            System.out.println("The weapon is no longer in the list!");
        }
        else {
         System.out.println("That weapon is not in the list, try again!"); }

    }
/**
 * removes suspect from list to narrow down search 
 * @param suspect
 */
    public static void removeSuspect(String suspect) {
        if(suspectList.contains(suspect)){
            suspectList.remove(suspect); 
            System.out.println("They are no longer a suspect, phew!");
        }
        else{
            System.out.println("That person is not a suspect, try again.");
        }

    }
/**
 * adds clue to clue arraylist. Puts Room name before for organization.
 * @param name
 * @param clue
 */
    public static void addClue(String name, String clue){
        clueList.add(name+":  "+clue);
        ClueMap.roomCounter+=1;
    }


/** 
 * prints out the list of reamining suspects 
*/
    public static void printSuspectList(){
       System.out.println("The remaining suspects are:");
       System.out.println("---------------------------");
        for(int i = 0; i < Person.suspectList.size(); i++){
            System.out.println(Person.suspectList.get(i));
        }
    }
/** 
* prints out the list of reamining weapons 
*/
       public static void printWeaponList(){
          System.out.println("The remaining weapons are:");
          System.out.println("---------------------------");
           for(int i = 0; i < Person.murderWeapons.size(); i++){
               System.out.println(Person.murderWeapons.get(i));
           }
       }
/**
 * prints out clue list */  
    public static void printClueList(){
        System.out.println("The clues you found are:");
        System.out.println("---------------------------");
         for(int i = 0; i < Person.clueList.size(); i++){
             System.out.println(Person.clueList.get(i));
         }
     }
}

