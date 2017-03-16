/**
 * Created by student5 on 3/15/17.
 */
public class Fish extends Life{
    private int length,height,width,mouthSize,speed,lengthGrowth,heightGrowth,widthGrowth,
            mouthSizeGrowth,ammoniumProduction,meat,meatGrowth,mass,massGrowth,
            age,birthAge,eggLength,fat,fatGrowth,reproduction,volume,maxAge;
    private String name;
    private Boolean gender;
    private FishDataBase fishDataBase;
    Fish(String fish,boolean gender){
        fishDataBase = new FishDataBase(fish);
        length=fishDataBase.fishTrait(0);
        height=fishDataBase.fishTrait(1);
        width =fishDataBase.fishTrait(2);
        mouthSize =fishDataBase.fishTrait(3);
        speed=fishDataBase.fishTrait(4);
        lengthGrowth=fishDataBase.fishTrait(5);
        heightGrowth=fishDataBase.fishTrait(6);
        widthGrowth=fishDataBase.fishTrait(7);
        mouthSizeGrowth=fishDataBase.fishTrait(8);
        ammoniumProduction=fishDataBase.fishTrait(9);
        meat=fishDataBase.fishTrait(10);
        meatGrowth=fishDataBase.fishTrait(11);
        mass=fishDataBase.fishTrait(12);
        massGrowth=fishDataBase.fishTrait(13);
        age=fishDataBase.fishTrait(14);
        birthAge=fishDataBase.fishTrait(15);
        eggLength=fishDataBase.fishTrait(16);
        fat=fishDataBase.fishTrait(17);
        fatGrowth=fishDataBase.fishTrait(18);
        reproduction=fishDataBase.fishTrait(19);
        volume=fishDataBase.fishTrait(20);
        maxAge=fishDataBase.fishTrait(21);
        this.name=fishDataBase.getName();
        this.gender = gender;
    }
    Fish(String fish){
        this(fish,randomGenderSelection());
    }

    public int getAge() {
        return age;
    }
    public int getAmmoniumProduction() {
        return ammoniumProduction;
    }
    public int getBirthAge() {
        return birthAge;
    }
    public int getEggLength() {
        return eggLength;
    }
    public int getFat() {
        return fat;
    }
    public int getFatGrowth() {
        return fatGrowth;
    }
    public int getHeight() {
        return height;
    }
    public int getHeightGrowth() {
        return heightGrowth;
    }
    public int getLength() {
        return length;
    }
    public int getLengthGrowth() {
        return lengthGrowth;
    }
    public int getMass() {
        return mass;
    }
    public int getMassGrowth() {
        return massGrowth;
    }
    public int getMeat() {
        return meat;
    }
    public int getMeatGrowth() {
        return meatGrowth;
    }
    public int getMouthSize() {
        return mouthSize;
    }
    public int getMouthSizeGrowth() {
        return mouthSizeGrowth;
    }
    public int getReproduction() {
        return reproduction;
    }
    public int getSpeed() {
        return speed;
    }
    public int getWidth() {
        return width;
    }
    public int getWidthGrowth() {
        return widthGrowth;
    }
    public String getName() {
        return name;
    }
    public boolean getGender() {
        return gender;
    }

    private boolean randomGenderSelection(){
        double randomness = Math.random();
        if (randomness<.5)
            return true;
        else
            return false;
    }
}
