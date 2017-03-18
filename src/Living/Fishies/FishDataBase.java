package Living.Fishies;

import java.util.ArrayList;

/**
 * Created by jnebl on 3/15/2017.
 */
public class FishDataBase {
    public int averageOldAge;
    public double percentDeathVariance;
    public String name;
    FishDataBase(String fish){
        fishStats(fish);
    }

    private void fishStats(String fish){
        if (fish.equalsIgnoreCase("SushiFish")||fish.equalsIgnoreCase("Sushi Fish"))
            SushiFish();
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
