import Inorganic.Time;
import Living.Fishies.School;
import PersonalProperty.Personal.Farmer;

/**
 * Created by student5 on 3/16/17.
 */
public class DevRunner {
    public  static void main(String args[]){
//        School a = new School(150,"Sushi Fish");
//        System.out.println(a.getAllDeathAge());
//        System.out.println(a.report());
        Farmer justinTheGreat = new Farmer();
        justinTheGreat.getYards().get(0).addGreenhouse();
        justinTheGreat.getYards().get(0).getGreenhouse().addFishTank();
        justinTheGreat.getYards().get(0).getGreenhouse().getFishTanks().get(0)
                .addNonGenderSpecificFishSchool(100,"SushiFish");
        justinTheGreat.getYards().get(0).getGreenhouse().getFishTanks().get(0)
                .getSchools().get(0).getAllDeathAge();
        System.out.println(justinTheGreat.getYards().get(0).getGreenhouse().getFishTanks().get(0)
                .getSchools().get(0).getAllDeathAge());
        System.out.println(justinTheGreat.getYards().get(0).getGreenhouse().getFishTanks().get(0)
                .getSchools().get(0).report());
    }
}
