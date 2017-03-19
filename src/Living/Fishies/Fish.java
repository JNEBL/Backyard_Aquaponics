package Living.Fishies;

import Inorganic.Time;
import Living.Life;

/**
 * Created by student5 on 3/15/17.
 */
public class Fish extends Life {
    private int mouthSize,speed,ammoniumProduction,meat,mass,
            eggLength,fat,reproduction,metabolism,hunger;
    private Time age,fingerlingEndAge,breedingAge,deathAge,birtDate;
    private FishDataBase fishDataBase;
    Fish(String fish,String gender){
        super(0,0,0);
        fishDataBase = new FishDataBase(fish);
        birtDate = new Time();
        age = new Time();
        deathAge = new Time();
        super.name=fishDataBase.name;
        super.gender = gender;
        deathAge = FishDecider.deathAgeDecider(fishDataBase.averageOldAge,
                fishDataBase.percentDeathVariance, deathAge);
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
    public Time getDeathAge() {
        return deathAge;
    }
    public Time getAge() {
        return age;
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
    public static Time deathAgeDecider(int probableDeath,double percentVariance,Time time){
        double odds = Math.random();
        if (odds > .9996)
            percentVariance *= 2;
        if (odds > .92)
            percentVariance *= 2;
        double percent = probableDeath * percentVariance;
        double variance = percent * Math.random();
        if (odds<.44){
            variance = variance * -1;
        }
        double variable = probableDeath + variance;
        int year = (int)(variable);
        int month = (int)(13 * Math.random());
        int day = (int)(28 * Math.random());
        int hour = (int)(24 * Math.random());
        time.setAllTime(year,month,day,hour,0,0);
        return time;
    }
}
