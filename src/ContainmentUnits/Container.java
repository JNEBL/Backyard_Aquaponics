package ContainmentUnits;

/**
 * Created by student5 on 3/15/17.
 */
public class Container {
    private int height,length,width,volume;
    public Container(int length,int width,int height){
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = ContainerMathematics.determineVolume(this.length,this.width,this.height);
    }

    public int getHeight() {
        return height;
    }
    public int getLength() {
        return length;
    }
    public int getVolume() {
        return volume;
    }
    public int getWidth() {
        return width;
    }
}
class ContainerMathematics{
    public static int determineVolume(int length,int width,int height){
        int volume = length * width * height;
        return volume;
    }
}
