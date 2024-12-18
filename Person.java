import java.util.ArrayList;
import java.util.HashMap;

public class Person {
    private HashMap<String, Boolean> murderWeapons = new HashMap<>();
    private ArrayList<String> suspectList = new ArrayList<>();

    public Person(){
        suspectList.add("Mr. Green");
        suspectList.add("Mrs. White");
        suspectList.add("Ms. Scarlet");
        suspectList.add("Mrs. Scarlet");
        suspectList.add("Professor Plum");
        suspectList.add("Colonel Mustard"); 

    }

    public void addWeapon(String weapon) {
        if(murderWeapons.containsKey(weapon)){
            System.out.println("Weapon is already in the list!");
        }
        else {
         murderWeapons.put(weapon, true);
         System.out.println("Weapon added to the list!"); }

    }

    public void removeSuspect(String suspect) {
        if(suspectList.contains(suspect)){
            suspectList.remove(suspect); 
        }
        else{
            System.out.println("That person is not a suspect, try again.");
        }

    }

}
