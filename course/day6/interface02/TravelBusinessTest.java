package course.day6.interface02;

public class TravelBusinessTest {
    public static void main(String[] args) {
        TravelBusiness b1 = new TravelBusiness();
        b1.setCar(new CarBenz());
        b1.travel();

        TravelBusiness b2 = new TravelBusiness();
        b2.setCar(new CarBMW());
        b2.travel();
    }
}
