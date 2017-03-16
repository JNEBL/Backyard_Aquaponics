package Living.Fishies;

import Inorganic.Time;
import Living.Life;

/**
 * Created by student5 on 3/15/17.
 */
public class Fish extends Life {
    private int length,height,width,mouthSize,speed,ammoniumProduction,meat,mass,
            age,eggLength,fat,reproduction,volume,metabolism,hunger;
    private Time fingerlingEndAge,breedingAge,deathAge;
    private int[] ageRatio;

    private FishDataBase fishDataBase;
    Fish(String fish,String gender){
        fishDataBase = new FishDataBase(fish);
        super.name=fishDataBase.getName();
        super.gender = gender;
    }
    Fish(String fish){
        this(fish,FishDecider.randomGenderSelection());
    }

    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getGender() {
        return super.getGender();
    }
}
class FishDecider{
    public static String randomGenderSelection(){
        double randomness = Math.random();
        if (randomness<.2)
            return "Female";
        else
            return "Male";
    }
    public void deathAgeDecider(int probableDeath){

    }
}
