import Inorganic.Time;
import Living.Fishies.School;

/**
 * Created by student5 on 3/16/17.
 */
public class DevRunner {
    public  static void main(String args[]){
        School a = new School(100,"Sushi Fish");
        School b = new School(100,"Sushi Fish");
        School c = new School(150,"Sushi Fish");
        School d = new School("Sushi Fish",40,60);
        School e = new School("Sushi Fish",60,40);
        School f = new School("Sushi Fish",200,150);

        System.out.println(a.report());

}
}
