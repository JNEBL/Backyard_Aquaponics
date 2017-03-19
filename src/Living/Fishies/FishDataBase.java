package Living.Fishies;

import Inorganic.Time;
import PersonalProperty.Personal.Farmer;

import java.util.ArrayList;

/**
 * Created by jnebl on 3/15/2017.
 */
public class FishDataBase {
    private int averageOldAge,fingerlingEndAge;
    private int[] dimension = new int[3];
    private int[] breedingAge = new int[2];
    private double percentDeathVariance,mouthPercentage;
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
    public int getFingerlingEndAge() {
        return fingerlingEndAge;
    }
    public int[] getBreedingAge() {
        return breedingAge;
    }
    public double getMouthPercentage() {
        return mouthPercentage;
    }
    //    private void genericFish(){
//        name = name
//    }

    private void SushiFish(){
        name = "Sushi Fish";
        averageOldAge = 34;
        percentDeathVariance = .15;
        fingerlingEndAge = 9;
        breedingAge[0] = 1;
        breedingAge[1] = 7;
        carnivore = true;
        herbivore = true;
        bacteriophage = true;
        nitrosomonas = false;
        nitrobacter = false;
        dimension[0] = 3;
        dimension[1] = 1;
        dimension[2] = 1;
        mouthPercentage = .25;
    }

}
