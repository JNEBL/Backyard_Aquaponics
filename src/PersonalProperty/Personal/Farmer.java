package PersonalProperty.Personal;

import PersonalProperty.Property.Yard;

import java.util.ArrayList;

/**
 * Created by jnebl on 3/15/2017.
 */
public class Farmer {
    ArrayList<Yard> yards = new ArrayList<>();
    Yard yard;
    Inventory inventory;
    public Farmer(){
        yard = new Yard();
        yards.add(yard);
    }

    public ArrayList<Yard> getYards() {
        return yards;
    }
}
