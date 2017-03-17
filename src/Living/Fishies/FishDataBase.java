package Living.Fishies;

import java.util.ArrayList;

/**
 * Created by jnebl on 3/15/2017.
 */
public class FishDataBase {
    private int[] fishTraits = new int[3];
    private double[] dFishTraits = new double[1];
    private String name;
    FishDataBase(String fish){
        fishStats(fish);
    }
    public int fishTrait(int x){
        return fishTraits[x];
    }
    public double dFishTrait(int x){
        return dFishTraits[x];
    }
    public String getName(){
        return name;
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
        fishTraits[0] = 4;
        fishTraits[1] = 2;
        fishTraits[2] = 34;
        dFishTraits[0] = .1;
    }

}
