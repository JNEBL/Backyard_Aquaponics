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
        justinTheGreat.addGreenhouseThroughFarmer(0);
        justinTheGreat.addFishTankThroughFarmer(0,0);
        justinTheGreat.addNonGenderSpecificFishSchoolThroughFarmer(0,0,0,
                100,"SushiFish");
        System.out.println(justinTheGreat.getAllDeathAgeThroughFarmer(0,0,0,0));
        System.out.println(justinTheGreat.getReportThroughFarmer(0,0,0,0));
    }
}
