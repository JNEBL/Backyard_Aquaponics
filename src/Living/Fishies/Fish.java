package Living.Fishies;

import Inorganic.Time;
import Living.Life;

/**
 * Created by student5 on 3/15/17.
 */
public class Fish extends Life {
    private int length,height,width,mouthSize,speed,ammoniumProduction,meat,mass,
            eggLength,fat,reproduction,volume,metabolism,hunger;
    private Time age,fingerlingEndAge,breedingAge,deathAge;
    private FishDataBase fishDataBase;
    Fish(String fish,String gender){
        fishDataBase = new FishDataBase(fish);
        age = new Time();
        deathAge = new Time();
        super.name=fishDataBase.getName();
        super.gender = gender;
        deathAge = FishDecider.deathAgeDecider(fishDataBase.fishTrait(2),
                fishDataBase.dFishTrait(0), deathAge);

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
        time.setYear(year);
        int month = (int)(13 * Math.random());
        time.setMonth(month);
        int day = (int)(28 * Math.random());
        time.setDay(day);
        int hour = (int)(24 * Math.random());
        time.setHour(hour);
        return time;
    }
}
