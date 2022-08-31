package course.day6.interface03;

public class TravelBusiness {
    private Car car;
    
    public Car getCar() {
        return car;
    }
    
    public void setCar(Car car) {
        this.car = car;
    }

    public void travel() {
        if(car == null){
            throw new RuntimeException("未輸入汽車....");
        }
        car.travelByCar();
    }
}
