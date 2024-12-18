import java.util.ArrayList;
import java.util.HashMap;

public class Person {
    private static HashMap<String, Boolean> murderWeapons = new HashMap<>();
    public static ArrayList<String> suspectList = new ArrayList<>();
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

    }
 /**
  * adds weapon to the list of possible murder weapons 
  * @param weapon
  */
    public static void addWeapon(String weapon) {
        if(murderWeapons.containsKey(weapon)){
            System.out.println("Weapon is already in the list!");
        }
        else {
         murderWeapons.put(weapon, true);
         System.out.println("Weapon added to the list!"); }

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
 * prints out the list of reamining suspects 
*/
    public static void printSuspectList(){
       System.out.println("The remaining suspects are:");
       System.out.println("---------------------------");
        for(int i = 0; i < Person.suspectList.size(); i++){
            System.out.println(Person.suspectList.get(i));
        }
    }
    public static void printWeaponList(){
        System.out.println("The possible weapons are:");
        System.out.println("---------------------------");
         for(int i = 0; i < murderWeapons.; i++){
             System.out.println(suspectList.get(i));
         }
     }
}
