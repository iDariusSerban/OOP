package Ex9;

public class ParkingSpot {
    private Car parkedCar;

    public boolean isOccupied(){
        return parkedCar !=  null;
    }

    public void park (Car car) throws Exception{
        if (parkedCar != null){
            throw new Exception(" car already parked");
        }
        parkedCar = car;
        System.out.println(car.getNumber() + " was parked");
    }

    public void leave() throws Exception{
        if (parkedCar == null){
            throw new Exception("spot already empty");
        }
        System.out.println(parkedCar.getNumber() +" left");
        parkedCar = null;
    }
}
