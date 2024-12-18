import java.util.ArrayList;
import java.util.HashMap;

public class Person {
    private static HashMap<String, Boolean> murderWeapons = new HashMap<>();
    public static ArrayList<String> suspectList = new ArrayList<>();

    public Person(){
        suspectList.add("Mr. Green");
        suspectList.add("Mrs. White");
        suspectList.add("Ms. Scarlet");
        suspectList.add("Mrs. Peacock");
        suspectList.add("Professor Plum");
        suspectList.add("Colonel Mustard"); 

    }

    public static void addWeapon(String weapon) {
        if(murderWeapons.containsKey(weapon)){
            System.out.println("Weapon is already in the list!");
        }
        else {
         murderWeapons.put(weapon, true);
         System.out.println("Weapon added to the list!"); }

    }

    public static void removeSuspect(String suspect) {
        if(suspectList.contains(suspect)){
            suspectList.remove(suspect); 
            System.out.println("They are no longer a suspect, phew!");
        }
        else{
            System.out.println("That person is not a suspect, try again.");
        }

    }
    public static void printList(){
       System.out.println("The remaining suspects are:");
       System.out.println("---------------------------");
        for(int i = 0; i < Person.suspectList.size(); i++){
            System.out.println(Person.suspectList.get(i));
        }
    }
}
