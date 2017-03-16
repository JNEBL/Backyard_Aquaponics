/**
 * Created by student5 on 3/15/17.
 */
public class Fish extends Life{
    protected int length,height,width,mouthSize,speed,ammoniumProduction,meat,mass,
            age,birthAge,eggLength,fat,reproduction,volume,deathAge,metabolism;
    private String name;
    protected Boolean gender;
    protected FishDataBase fishDataBase;
    Fish(String fish,boolean gender){
        this.name=fishDataBase.getName();
        this.gender = gender;
    }
    Fish(String fish){
        this(fish,FishDecider.randomGenderSelection());
    }


}
class FishDecider{
    public static boolean randomGenderSelection(){
        double randomness = Math.random();
        if (randomness<.5)
            return true;
        else
            return false;
    }
    public void lengthDecider(){
        //fishtype  age   metabolism
        
    }
}
