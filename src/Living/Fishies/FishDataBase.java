package Living.Fishies;

import Inorganic.Time;
import PersonalProperty.Personal.Farmer;

import java.util.ArrayList;

/**
 * Created by jnebl on 3/15/2017.
 */
public class FishDataBase {
    private int averageOldAge;
    private double percentDeathVariance;
    private String name;
    private Time age = new Time(Farmer.time);
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
    public Time getAge() {
        return age;
    }
    //    private void genericFish(){
//        name = name
//    }

    private void SushiFish(){
        name = "Sushi Fish";
        averageOldAge = 34;
        percentDeathVariance = .15;
    }

}
