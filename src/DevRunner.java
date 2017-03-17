import Inorganic.Time;
import Living.Fishies.School;

/**
 * Created by student5 on 3/16/17.
 */
public class DevRunner {
    public  static void main(String args[]){
        School a = new School(100,"Sushi Fish");
        System.out.println(a.getFish(2).getDeathAge().toStringFull());


}
}
