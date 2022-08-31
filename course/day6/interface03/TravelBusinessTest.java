package course.day6.interface03;

public class TravelBusinessTest {
    public static void main(String[] args) {
        TravelBusiness b1 = new TravelBusiness();
        b1.setCar(new CarBenz());

        TravelBusiness b2 = new TravelBusiness();
        b2.setCar(new CarBMW());

        b1.travel();
        b2.travel();
    }
    
}
