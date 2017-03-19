package ContainmentUnits;

/**
 * Created by student5 on 3/15/17.
 */
public class Container {
    private int height,length,width,surfaceArea,volume;
    public Container(int length,int width,int height){
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = ContainerMathematics.determineVolume(this.length,this.width,this.height);
        this.surfaceArea = ContainerMathematics.determineSurfaceArea(this.length,this.width,this.height);
    }
    public Container(int length,int width){
        this.length = length;
        this.width = width;
        this.height = 0;
        this.volume = ContainerMathematics.determineVolume(this.length,this.width,this.height);
        this.surfaceArea = ContainerMathematics.determineSurfaceArea(this.length,this.width);
    }
    public Container(){
        this.containerReEquate(0,0,0);
    }

    public int getHeight() {
        return height;
    }
    public int getLength() {
        return length;
    }
    public int getSurfaceArea() {
        return surfaceArea;
    }
    public int getVolume() {
        return volume;
    }
    public int getWidth() {
        return width;
    }
    public void setHeight(int height) {
        if (height > 0){
            this.height = height;
            containerReEquate(this.length,this.width,this.height);
        }
    }
    public void setLength(int length) {
        if (length > 0){
            this.length = length;
            if (this.height == 0)
                containerReEquate(this.length,this.width);
            else
                containerReEquate(this.length,this.width,this.height);
        }
    }
    public void setWidth(int width) {
        if (width > 0){
            this.width = width;
            if (this.height == 0)
                containerReEquate(this.length,this.width);
            else
                containerReEquate(this.length,this.width,this.height);
        }
    }

    public void containerReEquate(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = ContainerMathematics.determineVolume(this.length,this.width,this.height);
        this.surfaceArea = ContainerMathematics.determineSurfaceArea(this.length,this.width,this.height);
    }
    public void containerReEquate(int length,int width){
        this.length = length;
        this.width = width;
        this.surfaceArea = ContainerMathematics.determineSurfaceArea(this.length,this.width);
    }
}
class ContainerMathematics{
    public static int determineVolume(int length,int width,int height){
        int volume = length * width * height;
        return volume;
    }
    public static int determineSurfaceArea(int length,int width){
        int surface = length * width;
        return surface;
    }
    public static int determineSurfaceArea(int length,int width,int height){
        int surface = (2 * length * width) + (2 * length * height) + (2 * width * height);
        return surface;
    }
}
