package Ex10;

public class Main {
    public static void main(String[] args) {
        CinamaHall cinema1 = new CinamaHall(6, 6);
        CinamaHall cinema2 = new CinamaHall(9, 10);

        cinema1.initializeGridWithEmptySeats();
        cinema2.initializeGridWithEmptySeats();

        System.out.println();

        cinema1.printGrid();
        System.out.println();
        cinema2.printGrid();

        System.out.println();
try {
    cinema1.buyTicket(3, 5);
    cinema1.buyTicket(3, 6);
    cinema2.buyTicket(5, 6);
}catch (Exception e){
    System.out.println(e.getMessage());
}
        cinema1.printGrid();
        System.out.println();
        cinema2.printGrid();

        System.out.println(cinema1.getPrice(6,6));
        System.out.println(cinema2.getPrice(4,6));
        System.out.println(cinema2.getPrice(5,6));
        System.out.println(cinema2.getPrice(6,6));

    }
}
