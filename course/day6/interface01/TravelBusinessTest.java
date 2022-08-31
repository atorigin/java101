package course.day6.interface01;

public class TravelBusinessTest {
    public static void main(String[] args) {
        TravelBusiness b1 = new TravelBusiness();
        b1.setCarBMW(new CarBMW());
        b1.travelByBMW();
        TravelBusiness b2 = new TravelBusiness();
        b2.setCarBenz(new CarBenz());
        b2.travelByBenz();
    }
}
