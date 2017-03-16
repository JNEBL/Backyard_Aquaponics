package Living.Fishies;

import java.util.ArrayList;

/**
 * Created by jnebl on 3/15/2017.
 */
public class FishDataBase {
    private int[] fishTraits = new int[22];
    private int[][] fishTraitsDimensional = new int[22][3];
    private String name;
    FishDataBase(String fish){
        fishStats(fish);
    }
    public int fishTrait(int x){
        return fishTraits[x];
    }
    public String getName(){
        return name;
    }

    private void fishStats(String fish){
        if (fish.equalsIgnoreCase("SushiFish")||fish.equalsIgnoreCase("Sushi Fish"))
            SushiFish();
        System.exit(1);
    }


//    private void genericFish(){
//        name = name
//    }

    private void SushiFish(){
        name = "Sushi Fish";
        fishTraitsDimensional[0][0] = 4;
        fishTraitsDimensional[0][1] = 2;
        fishTraitsDimensional[0][2] = 34;
    }

}
