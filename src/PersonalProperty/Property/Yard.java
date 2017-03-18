package PersonalProperty.Property;

import Inorganic.Environment;

import java.util.ArrayList;

/**
 * Created by student5 on 3/16/17.
 */
public class Yard {
    ArrayList<Greenhouse> greenhouses = new ArrayList<>();
    Greenhouse greenhouse;
    Environment environment;
    public Yard(){

    }

    public Greenhouse getGreenhouse() {
        return greenhouse;
    }

    public void addGreenhouse(){
        greenhouse = new Greenhouse();
        greenhouses.add(greenhouse);
    }
    public void addGreenhouse(int length,int width,int height){
        greenhouse = new Greenhouse(length,width,height);
        greenhouses.add(greenhouse);
    }
}
