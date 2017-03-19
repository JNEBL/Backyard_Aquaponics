package Living.Fishies;

import ContainmentUnits.Container;
import Inorganic.Time;
import Living.Life;

/**
 * Created by student5 on 3/15/17.
 */
public class Fish extends Life {
    private int mouthSize,speed,ammoniumProduction,meat,mass,eggLength,
            reproduction,metabolism,hunger;
    private Time age,fingerlingEndAge,breedingAge,deathAge,birthDate;
    private FishDataBase fishDataBase;
    private  int[] dimensions = new int[3];
    Fish(String fish,String gender){
        super(0,0,0);
        fishDataBase = new FishDataBase(fish);
        birthDate = new Time(fishDataBase.getBirthDate().getCurrentTime());
        age = new Time();
        deathAge = new Time();
        super.name=fishDataBase.getName();
        super.gender = gender;
        deathAge = FishDecider.deathAgeDecider(fishDataBase.getAverageOldAge(),
                fishDataBase.getPercentDeathVariance(), deathAge);
        this.carnivore = fishDataBase.getCarnivore();
        this.herbivore = fishDataBase.getHerbivore();
        this.bacteriophage = fishDataBase.getBacteriophage();
        this.nitrobacter = fishDataBase.getNitrobacter();
        this.nitrosomonas = fishDataBase.getNitrosomonas();
        dimensions = FishDecider.dimensionDecider(fishDataBase.getDimension());
        containerReEquate(dimensions[0],dimensions[1],dimensions[2]);
    }
    Fish(String fish){
        this(fish,FishDecider.randomGenderSelection());
    }


    public String getName() {
        return super.getName();
    }

    public String getGender() {
        return super.getGender();
    }
    public Time getDeathAge() {
        return deathAge;
    }
    public Time getAge() {
        return age;
    }
    public int getWidth() {
        return super.getWidth();
    }
    public int getHeight() {
        return super.getHeight();
    }
    public int getSurfaceArea() {
        return super.getSurfaceArea();
    }
    public int getLength() {
        return super.getLength();
    }
    public int getVolume() {
        return super.getVolume();
    }
    public Time getBirthDate() {
        return birthDate;
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
    public static int[] dimensionDecider(int[] dimensions){
        int[] dim = new int[3];
        //Place Holder
        return dimensions;
    }
}
