import java.util.ArrayList;
import java.util.HashMap;

public class Person {
    private HashMap<String, Boolean> murderWeapons = new HashMap<>();
    private ArrayList<String> suspectList = new ArrayList<>();
    // private ArrayList<String>;

    public void addWeapon(String weapon) {
        murderWeapons.put(weapon, true);

    }

    public void removeSuspect(String suspect) {

    }

}
