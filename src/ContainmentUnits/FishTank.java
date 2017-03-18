package ContainmentUnits;

import Inorganic.Water;
import Living.Bacterial.Colony;
import Living.Fishies.School;

import java.util.ArrayList;

/**
 * Created by jnebl on 3/15/2017.
 */
public class FishTank extends Container {
    ArrayList<School> schools = new ArrayList<>();
    private ArrayList<Colony> colonies = new ArrayList<>();
    private Water water;
    private School school;
    public FishTank(int length,int width,int height){
        super(length,width,height);
    }
    public FishTank(){
        super(10,10,10);
    }

    public ArrayList<School> getSchools() {
        return schools;
    }

    public void addNonGenderSpecificFishSchool(int numFish, String fishName){
        school = new Living.Fishies.School(numFish,fishName);
        schools.add(school);
    }
    public void addGenderSpecificFishSchool(String fishName,int femFish,int malFish){
        school = new Living.Fishies.School(fishName,femFish,malFish);
        schools.add(school);
    }
}
