package ContainmentUnits;

import Living.Insects.Hive;

import java.util.ArrayList;

/**
 * Created by student5 on 3/16/17.
 */
public class Apiary extends Container {
    ArrayList<Hive> hives = new ArrayList<>();
    Apiary(int length,int width,int height){
        super(length,width,height);
    }
}
