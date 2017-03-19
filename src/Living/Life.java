package Living;

import ContainmentUnits.Container;

/**
 * Created by student5 on 3/15/17.
 */
public class Life extends Container{
    protected int energy;
    protected Boolean carnivore,herbivore;
    protected String gender,name;
    public Life(){
        super(0,0,0);
    }
    public Life(int length,int width,int height){
        super(length,width,height);
    }
    public Life(int length,int width){
        super(length,width);
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
}
