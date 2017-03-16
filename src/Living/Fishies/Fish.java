package Living.Fishies;

import Living.Life;

/**
 * Created by student5 on 3/15/17.
 */
public class Fish extends Life {
    private int length,height,width,mouthSize,speed,ammoniumProduction,meat,mass,
            age,birthAge,eggLength,fat,reproduction,volume,deathAge,metabolism,hunger;

    private FishDataBase fishDataBase;
    Fish(String fish,String gender){
        this.name=fishDataBase.getName();
        this.gender = gender;
    }
    Fish(String fish){
        this(fish,FishDecider.randomGenderSelection());
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
class FishDecider{
    public static String randomGenderSelection(){
        double randomness = Math.random();
        if (randomness<.5)
            return "Female";
        else
            return "Male";
    }
    public void lengthDecider(){
        //fishtype  age   metabolism
    }
}
