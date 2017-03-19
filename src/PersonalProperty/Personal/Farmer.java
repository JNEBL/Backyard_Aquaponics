package PersonalProperty.Personal;

import ContainmentUnits.FishTank;
import Inorganic.Time;
import Living.Fishies.School;
import PersonalProperty.Property.Yard;

import java.util.ArrayList;

/**
 * Created by jnebl on 3/15/2017.
 */
public class Farmer {
    ArrayList<Yard> yards = new ArrayList<>();
    Yard yard;
    Inventory inventory;
    public static Time time = new Time();
    public Farmer(){
        yard = new Yard();
        yards.add(yard);
    }

    public ArrayList<Yard> getYards() {
        return yards;
    }
    public Yard getYard(int x) {
        return yards.get(x);
    }
    public void addFishTankThroughFarmer(){
        getYards().get(0).getGreenhouses().get(0).addFishTank();
    }
    public void addFishTankThroughFarmer(int yard,int greenhouse){
        getYards().get(yard).getGreenhouses().get(greenhouse).addFishTank();
    }
    public FishTank getSpecificFishTank(int yard, int greenhouse, int fishTank){
        return getYards().get(yard).getGreenhouses().get(greenhouse).getFishTanks().get(fishTank);
    }
    public void addNonGenderSpecificFishSchoolThroughFarmer(int yard, int greenhouse, int fishTank,int numFish, String fishName){
        getSpecificFishTank(yard,greenhouse,fishTank).addNonGenderSpecificFishSchool(numFish,fishName);
    }
    public School getSchoolThroughFarmer(int yard, int greenhouse, int fishTank,int school){
        return getSpecificFishTank(yard,greenhouse,fishTank).getSchools().get(school);
    }
    public String getAllDeathAgeFishThroughFarmer(int yard, int greenhouse, int fishTank,int school){
        String print = getSchoolThroughFarmer(yard,greenhouse,fishTank,school).getAllDeathAge();
        return print;
    }
    public String getFishReportThroughFarmer(int yard, int greenhouse, int fishTank,int school){
        String print = getSchoolThroughFarmer(yard,greenhouse,fishTank,school).report();
        return print;
    }
    public void addGreenhouseThroughFarmer(int yard){
        getYards().get(yard).addGreenhouse();
    }
}
