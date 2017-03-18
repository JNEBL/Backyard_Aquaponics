package Living.Fishies;

import java.util.ArrayList;

/**
 * Created by student5 on 3/15/17.
 */
public class School{
    ArrayList<Fish> fishSchool = new ArrayList<>();
    private Fish fish;
    public School(int numFish,String fishName){
        for (int x = 0;x<numFish;x++){
            fish = new Fish(fishName);
            fishSchool.add(fish);
        }
    }
    public School(String fishName,int femFish,int malFish){
        for (int x = 0;x<malFish;x++){
            fish = new Fish(fishName,"Male");
            fishSchool.add(fish);
        }
        for (int x = 0;x<femFish;x++){
            fish = new Fish(fishName,"Female");
            fishSchool.add(fish);
        }
    }
    public String report(){
        String fishType = reportFishType();
        String gender = reportGender();
        String print = reportFishType() + "\n" + reportGender();
        return print;
    }
    public String reportGender(){
        int[] both = getBothGenders();
        String print = "Ratio:" + getGenderRatio() +
                "\nFemales:"+both[0] + "     Males:"+both[1];
        return print;
    }
    public String reportFishType(){
        String print = "FishType:  " + getFishType();
        return print;
    }
    public void addFish(Fish f){
        if (getFishType().equalsIgnoreCase(f.getName()))
            fishSchool.add(f);
    }
    public Fish getFish(int x){
        return fishSchool.get(x);
    }
    public String getFishType(){
        return fishSchool.get(0).getName();
    }
    public String getFishType(Fish f){
        return f.getName();
    }
    public int getMales(){
        int males=0;
        for (int x = 0;x < fishSchool.size();x++){
            if (fishSchool.get(x).getGender().equalsIgnoreCase("Male"))
                males++;
        }
        return males;
    }
    public int getFemales(){
        int females=0;
        for (int x = 0;x < fishSchool.size();x++){
            if (fishSchool.get(x).getGender().equalsIgnoreCase("Females"))
                females++;
        }
        return females;
    }
    public int[] getBothGenders(){
        int[] genders = new int[2];
        genders[0] = 0;
        genders[1] = 0;
        for (int x = 0;x < fishSchool.size();x++){
            if (fishSchool.get(x).getGender().equalsIgnoreCase("Female"))
                genders[0]++;
            else
                genders[1]++;
        }
        return genders;
    }
    public String getGender(Fish f){
        return f.getGender();
    }
    public String getGenderRatio(){
        int[] both = getBothGenders();
        both = reduce(both);
        String ratio = both[0]+":"+both[1];
        return ratio;
    }
    public String getAllDeathAge(){
        String print = "";
        for (int x = 0;x < fishSchool.size();x++){
            print += getFish(x).getDeathAge().toStringFull() + "\n";
        }
        return print;
    }

    private int[] reduce(int[] both){
        int d;
        if (both[0] >= 0){
            for (int x = 0;x < both[0];x++){
                d = both[0] - x;
                if (both[0] % d == 0)
                    if (both[1] % d == 0){
                        both[1] /= d;
                        both[0] /= d;
                        return both;
                    }
            }
            return both;
        }
        else {
            both[0] *= -1;
            for (int x = 0;x < both[0];x++){
                d = both[0] - x;
                if (both[0] % d == 0)
                    if (both[1] % d == 0){
                        both[1] /= d;
                        both[0] /= d;
                        both[0] *= -1;
                        return both;
                    }
            }
            return both;
        }
    }

}
