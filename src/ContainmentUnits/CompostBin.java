package ContainmentUnits;

import Living.WormFarming.Clew;
import Living.WormFarming.Worm;

import java.util.ArrayList;

/**
 * Created by student5 on 3/16/17.
 */
public class CompostBin extends Container {
    ArrayList<Clew> clews = new ArrayList<>();
    CompostBin(int length,int width,int height){
        super(length,width,height);
    }
}
