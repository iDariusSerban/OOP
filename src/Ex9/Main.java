package Ex9;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(20);
        Car car1 = new Car("CJ99BOS", "verde");
        Car car2 = new Car("CJ98BOS", "verde");
        Car car3= new Car("CJ987OS", "rosu");
        try {
            parkingLot.park(car1);
            parkingLot.park(car2);
            parkingLot.park(car3);
            //parkingLot.status();
            String[] resultReqNumbers = parkingLot.getRegNumbersByColor("verde");
            for (int i = 0; i < resultReqNumbers.length; i++) {
                System.out.println(resultReqNumbers[i]);
            }
            System.out.println(parkingLot.getSpotByRegNumber("CJ99BOS"));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }





        //leave 25
    }
}
