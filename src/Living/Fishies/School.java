package Living.Fishies;

import java.util.ArrayList;

/**
 * Created by student5 on 3/15/17.
 */
public class School{
    ArrayList<Fish> fishSchool = new ArrayList<>();
    private Fish fish;
    School(int numFish,String fishName){
        for (int x = 0;x<numFish;x++){
            fish = new Fish(fishName);
            fishSchool.add(fish);
        }
    }
    School(String fishName,int femFish,int malFish){
        for (int x = 0;x<malFish;x++){
            fish = new Fish(fishName,false);
            fishSchool.add(fish);
        }
        for (int x = 0;x<femFish;x++){
            fish = new Fish(fishName,true);
            fishSchool.add(fish);
        }
    }
}
