package PersonalProperty.Property;

import ContainmentUnits.*;
import Inorganic.Conditions;
import Living.Fishies.Fish;

import java.util.ArrayList;

/**
 * Created by student5 on 3/15/17.
 */
public class Greenhouse extends Container {
    private Conditions greenHouseConditions;
    ArrayList<Apiary> apiaries = new ArrayList<>();
    ArrayList<CompostBin> compostBins = new ArrayList<>();
    ArrayList<FishTank> fishTanks = new ArrayList<>();
    ArrayList<GrowBed> growBeds = new ArrayList<>();
    ArrayList<Pipe> pipes = new ArrayList<>();
    Apiary apiary;
    CompostBin compostBin;
    FishTank fishTank;
    GrowBed growBed;
    Pipe pipe;
    Greenhouse(int length,int width,int height){
        super(length,width,height);
    }
    Greenhouse(){
        super(100,100,100);
    }

    public ArrayList<FishTank> getFishTanks() {
        return fishTanks;
    }

    public void addFishTank(int length, int width, int height){
        fishTank = new FishTank(length,width,height);
        fishTanks.add(fishTank);
    }
    public void addFishTank(){
        fishTank = new FishTank();
        fishTanks.add(fishTank);
    }
}
