package Ex9;

public class ParkingLot {
    Car[] spots;

    public ParkingLot(int size) {
        this.spots = new Car[size];

    }

    public void park(Car car) throws Exception {
        for (int i = 0; i < spots.length; i++) {
            if (spots[i] == null) {
                //parchez masina la spots[i]
                spots[i] = car;
                return;
            }
        }
        throw new Exception("parking is full");

    }

    public void leave(int number) throws Exception {
        if (number > spots.length - 1) {
            throw new Exception("spot does not exist");
        }
        if (spots[number] == null) {
            throw new Exception("spot already free");
        }
        spots[number] = null;
    }

    public void status () throws Exception{
        boolean atLeastOneSpotOccupied = false;
        for (int i = 0; i < spots.length; i++) {
            if (spots[i]!=null){
                atLeastOneSpotOccupied = true;
                System.out.println(i + " " + spots[i].getNumber() + " " + spots[i].getColor());
            }

        }
        if (!atLeastOneSpotOccupied){
            throw new Exception("parking lot is empty");
        }


    }

    public String[] getRegNumbersByColor (String color){
        //outout avem nevoie de o variabila de tip array de string numita regNumbers
        //parcurgem lista de locuri
            //daca masina curenta are aceeasi culoare ca si parametrul
                  //punem numarul masinii in regNumbers

        //reuturnam regNumbers
        String[] regNumbers = new String[spots.length];
        int j = 0;
        for (int i = 0; i < spots.length; i++) {
            if (spots[i]!=null && color.equals(spots[i].getColor())) {
                regNumbers[j] = spots[i].getNumber();
                j++;
            }

        }
        return regNumbers;
    }

    public int getSpotByRegNumber( String regNumber) throws Exception{
        for (int i = 0; i < spots.length; i++) {
            if (spots[i]!=null && regNumber.equals(spots[i].getNumber())){

                return i;
            }
        }
        throw new Exception("not car with this number found");
    }

}
