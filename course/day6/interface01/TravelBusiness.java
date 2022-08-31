package course.day6.interface01;

public class TravelBusiness {
    private CarBenz carBenz;
    private CarBMW carBMW;

    public CarBMW getCarBMW() {
        return carBMW;
    }
    public void setCarBMW(CarBMW carBMW) {
        this.carBMW = carBMW;
    }

    public CarBenz getCarBenz() {
        return carBenz;
    }

    public void setCarBenz(CarBenz carBenz) {
        this.carBenz = carBenz;
    }

    public void travelByBenz() {
        if(carBenz == null) {
            throw new RuntimeException("未輸入汽車種類.....");
        }
        carBenz.travelByCar();
    }
    public void travelByBMW() {
        if (carBMW == null) {
            throw new RuntimeException("未輸入汽車種類.....");
        }
        carBMW.travelByCar();
    }
}
