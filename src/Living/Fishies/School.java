package Living.Fishies;

import java.util.ArrayList;

/**
 * Created by student5 on 3/15/17.
 */
public class School{
    ArrayList<Fish> fishSchool = new ArrayList<>();
    private Fish fish;
    public School(int numFish,String fishName){
        for (int x = 0;x<numFish;x++){
            fish = new Fish(fishName);
            fishSchool.add(fish);
        }
    }
    public School(String fishName,int femFish,int malFish){
        for (int x = 0;x<malFish;x++){
            fish = new Fish(fishName,"Male");
            fishSchool.add(fish);
        }
        for (int x = 0;x<femFish;x++){
            fish = new Fish(fishName,"Female");
            fishSchool.add(fish);
        }
    }public void addFish(Fish f){
        if (getFishType().equalsIgnoreCase(f.getName()))
            fishSchool.add(f);
    }
    public String getFishType(){
        return fishSchool.get(0).getName();
    }
}
