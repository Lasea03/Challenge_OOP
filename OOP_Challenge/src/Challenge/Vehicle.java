package Challenge;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vehicle {
    private String noPolice;
    private VehicleType vehicleType;
    private int year;
    private double price;
    private double tax;
    private int seat;
    private LocalDate transactionDate;
    private double total;
    public static int totalCar;
    public static int totalPlane;
    public static int totalBoat;

    public static long totalIncomeCar;
    public static long totalIncomePlane;
    public static long totalIncomeBoat;

    public static long totalTax;




    public Vehicle() {}

    public Vehicle(String noPolice, VehicleType vehicleType, int year, double price, double tax, int seat, LocalDate transactionDate) {
        this.noPolice = noPolice;
        this.vehicleType = vehicleType;
        this.year = year;
        this.price = price;
        this.tax = tax;
        this.seat = seat;
        this.transactionDate = transactionDate;
    }

    // Getter & Setter
    public String getnoPolice() {
        return noPolice;
    }

    public void setnoPolice(String noPolice) {
        this.noPolice = noPolice;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(long price) {
        if (price > 10_000_000_000L) {
            throw new IllegalArgumentException("Harga kendaraan tidak boleh lebih dari 10 miliar");
        }
            this.price = price;
    }

    public double gettax() {
        return tax;
    }

    public void settax(double tax) {
        this.tax = tax;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }



    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public static int getTotalCar() {
        return totalCar;
    }

    public static void setTotalCar(int totalCar) {
        Vehicle.totalCar = totalCar;
    }

    public static int getTotalPlane() {
        return totalPlane;
    }

    public static void setTotalPlane(int totalPlane) {
        Vehicle.totalPlane = totalPlane;
    }

    public static int getTotalBoat() {
        return totalBoat;
    }

    public static void setTotalBoat(int totalBoat) {
        Vehicle.totalBoat = totalBoat;
    }

    public static long getTotalIncomeCar() {
        return totalIncomeCar;
    }

    public static void setTotalIncomeCar(long totalIncomeCar) {
        Vehicle.totalIncomeCar = totalIncomeCar;
    }

    public static long getTotalIncomePlane() {
        return totalIncomePlane;
    }

    public static void setTotalIncomePlane(long totalIncomePlane) {
        Vehicle.totalIncomePlane = totalIncomePlane;
    }

    public static long getTotalIncomeBoat() {
        return totalIncomeBoat;
    }

    public static void setTotalIncomeBoat(long totalIncomeBoat) {
        Vehicle.totalIncomeBoat = totalIncomeBoat;
    }

    public static long getTotalTax() {
        return totalTax;
    }

    public static void setTotalTax(long totalTax) {
        Vehicle.totalTax = totalTax;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "noPolice='" + noPolice + '\'' +
                ", vehicleType=" + vehicleType +
                ", year=" + year +
                ", price=" + price +
                ", tax=" + tax +
                ", seat=" + seat +
                ", transactionDate=" + transactionDate +
                ", total=" + total +
                '}';
    }

    public long calculateIncome() {
        return 0;
    }
}