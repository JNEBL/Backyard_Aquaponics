package Living.Fishies;

import Inorganic.Time;
import PersonalProperty.Personal.Farmer;

import java.util.ArrayList;

/**
 * Created by jnebl on 3/15/2017.
 */
public class FishDataBase {
    private int averageOldAge;
    private int[] dimension = new int[3];
    private double percentDeathVariance;
    private String name;
    private Boolean carnivore,herbivore,bacteriophage,nitrosomonas,nitrobacter;
    private Time birthDate = new Time(Farmer.time);
    FishDataBase(String fish){
        fishStats(fish);
    }

    private void fishStats(String fish){
        if (fish.equalsIgnoreCase("SushiFish")||fish.equalsIgnoreCase("Sushi Fish"))
            SushiFish();
    }

    public String getName() {
        return name;
    }
    public double getPercentDeathVariance() {
        return percentDeathVariance;
    }
    public int getAverageOldAge() {
        return averageOldAge;
    }
    public Time getBirthDate() {
        return birthDate;
    }
    public Boolean getBacteriophage() {
        return bacteriophage;
    }
    public Boolean getCarnivore() {
        return carnivore;
    }
    public Boolean getHerbivore() {
        return herbivore;
    }
    public Boolean getNitrobacter() {
        return nitrobacter;
    }
    public Boolean getNitrosomonas() {
        return nitrosomonas;
    }
    public int[] getDimension() {
        return dimension;
    }
    //    private void genericFish(){
//        name = name
//    }

    private void SushiFish(){
        name = "Sushi Fish";
        averageOldAge = 34;
        percentDeathVariance = .15;
        carnivore = false;
        herbivore = true;
        bacteriophage = true;
        nitrosomonas = false;
        nitrobacter = false;
        dimension[0] = 3;
        dimension[1] = 1;
        dimension[2] = 1;
    }

}
