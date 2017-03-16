package Living.Fishies;

import java.util.ArrayList;

/**
 * Created by jnebl on 3/15/2017.
 */
public class FishDataBase {
    private int[] fishTraits = new int[22];
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

    private int[] fishStats(String fish){
        if (fish.equalsIgnoreCase("Sushi Living.Fishies.Fish"))
            SushiFish();


        return null;
    }


//    private void genericFish(){
//        fishTraits[0] = length;
//        fishTraits[1] = height;
//        fishTraits[2] = width;
//        fishTraits[3] = mouthSize;
//        fishTraits[4] = speed;
//        fishTraits[5] = lengthGrowth;
//        fishTraits[6] = heightGrowth;
//        fishTraits[7] = widthGrowth;
//        fishTraits[8] = mouthSizeGrowth;
//        fishTraits[9] = ammoniumProduction;
//        fishTraits[10] = meat;
//        fishTraits[11] = meatGrowth;
//        fishTraits[12] = mass;
//        fishTraits[13] = massGrowth;
//        fishTraits[14] = age;
//        fishTraits[15] = birthAge;
//        fishTraits[16] = eggLength;
//        fishTraits[17] = fat;
//        fishTraits[18] = fatGrowth;
//        fishTraits[19] = reproduction
//        name = name
//    }

    private void SushiFish(){
        fishTraits[0] = 1;
        fishTraits[1] = 1;
        fishTraits[2] = 1;
        fishTraits[3] = 1;
        fishTraits[4] = 1;
        fishTraits[5] = 1;
        fishTraits[6] = 1;
        fishTraits[7] = 1;
        fishTraits[8] = 1;
        fishTraits[9] = 1;
        fishTraits[10] = 1;
        fishTraits[11] = 1;
        fishTraits[12] = 1;
        fishTraits[13] = 1;
        fishTraits[14] = 1;
        fishTraits[15] = 1;
        fishTraits[16] = 1;
        fishTraits[17] = 1;
        fishTraits[18] = 1;
        fishTraits[19] = 1;
        fishTraits[20] = 1;
        fishTraits[21] = 1;
        name = "Sushi Living.Fishies.Fish";
    }

}
