package Challenge;

import java.time.LocalDate;

public class Taxi extends Car {
    private int order;
    private long orderPerKM;

    public Taxi(String noPolice, int year, double price, double tax, int seat,
                LocalDate transactionDate, int order, long orderPerKM) {
        super(noPolice, VehicleType.Taxi, year, price, tax, seat, transactionDate);
        // nilai sewa, sopir, dan jarak diset 0 karena tidak dipakai di taxi
        this.order = order;
        this.orderPerKM = orderPerKM;
        super.setTotal(order * orderPerKM);

        // Hitung pajak total
        Vehicle.totalTax += tax;
        Vehicle.totalIncomeCar += calculateIncome();
        Vehicle.totalCar++;
    }

    public int getorder() {
        return order;
    }

    public void setorder(int order) {
        this.order = order;
    }

    public long getOrderPerKM() {
        return orderPerKM;
    }

    public void setOrderPerKM(long orderPerKM) {
        this.orderPerKM = orderPerKM;
    }

    @Override
    public long calculateIncome() {
        return order * orderPerKM;
    }
}
