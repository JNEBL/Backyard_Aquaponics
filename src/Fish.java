/**
 * Created by student5 on 3/15/17.
 */
public class Fish extends Life {
    private int length,height,width,mouthSize,speed,lengthGrowth,heightGrowth,widthGrowth,
            mouthSizeGrowth,ammoniumProduction,meat,meatGrowth,mass,massGrowth,
            age,birthAge,eggLength,fat,fatGrowth,reproduction;
    private String name;
    Fish(String fish){
        FishDataBase fishDataBase = new FishDataBase(fish);
        length = fishDataBase.fishTraits[0];
        height =fishDataBase.fishTraits[1];
        width =fishDataBase.fishTraits[2];
        mouthSize =fishDataBase.fishTraits[3];
        speed =fishDataBase.fishTraits[4];
        lengthGrowth =fishDataBase.fishTraits[5];
        heightGrowth=fishDataBase.fishTraits[6];
        widthGrowth=fishDataBase.fishTraits[7];
        mouthSizeGrowth=fishDataBase.fishTraits[8];
        ammoniumProduction=fishDataBase.fishTraits[9];
        meat=fishDataBase.fishTraits[10];
        meatGrowth=fishDataBase.fishTraits[11];
        mass=fishDataBase.fishTraits[12];
        massGrowth=fishDataBase.fishTraits[13];
        age=fishDataBase.fishTraits[14];
        birthAge=fishDataBase.fishTraits[15];
        eggLength=fishDataBase.fishTraits[16];
        fat=fishDataBase.fishTraits[17];
        fatGrowth=fishDataBase.fishTraits[18];
        reproduction=fishDataBase.fishTraits[19];
        this.name=name;
    }
    
}
