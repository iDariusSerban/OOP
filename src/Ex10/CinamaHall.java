package Ex10;

public class CinamaHall {
    private int numberOfRows;
    private int numberOfCols;

    private String[][] grid;
    private int totalNumberOfSeats;
    private int seatPrice;

    public CinamaHall(int numberOfRows, int numberOfCols) {
        this.numberOfRows = numberOfRows;
        this.numberOfCols = numberOfCols;
        this.grid = new String[numberOfRows][numberOfCols];
        this.totalNumberOfSeats = numberOfRows * numberOfCols;
        this.seatPrice = 10;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public int getNumberOfCols() {
        return numberOfCols;
    }

    public void setNumberOfCols(int numberOfCols) {
        this.numberOfCols = numberOfCols;
    }

    public String[][] getGrid() {
        return grid;
    }

    public void setGrid(String[][] grid) {
        this.grid = grid;
    }

    public void initializeGridWithEmptySeats() {
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfCols; j++) {
                grid[i][j] = "E";
            }
        }
    }

    public void showStatistics() {
        int numberOfSoldTickets = 0;
        int percentageOfBookedSeats = 0;
        int soldTicketsTotalSum = 0;
        int possibleTotalSum = 0;

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfCols; j++) {
                if (grid[i][j].equals("B")) {
                    numberOfSoldTickets++;
                    soldTicketsTotalSum += getPrice(i, j);
                }
            }
        }
        percentageOfBookedSeats = totalNumberOfSeats / numberOfSoldTickets;

        System.out.println("Bilete vandute:" + numberOfSoldTickets);
        System.out.println("Procentajul de locuri ocupate:" + percentageOfBookedSeats + " %");
        System.out.println("Suma obtinuta din vanzari:" + soldTicketsTotalSum);
        System.out.println("Suma maxima care se poate obtine din vanzari:" + possibleTotalSum);

    }

    public int getPossibleTotalSum() {
        int possibleTotalSum = 0;
        if (totalNumberOfSeats < 60) {
            possibleTotalSum = totalNumberOfSeats * seatPrice;
        }else {
            possibleTotalSum = (numberOfRows/2 *seatPrice);
        }
        return possibleTotalSum;
    }

    public void printGrid() {
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfCols; j++) {
                System.out.print((i + 1) + " " + (j + 1) + grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getPrice(int row, int col) {

        if (totalNumberOfSeats > 60 && row > numberOfRows / 2) {
            return seatPrice * 2;
        } else {
            return seatPrice;
        }

    }

    public void buyTicket(int row, int col) throws Exception {
        row--;
        col--;
        if (row < numberOfRows && col < numberOfCols && grid[row][col].equals("E")) {
            grid[row][col] = "B";
        }
        Exception InvalidSeatException = new Exception("Locul este ocupat sau nu exista.");
        throw InvalidSeatException;
    }
}
