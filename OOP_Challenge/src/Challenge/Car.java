package Challenge;

import Challenge.VehicleType;

import java.time.LocalDate;

public class Car extends Vehicle {
    public Car(String noPolice, VehicleType vehicleType, int year, double price, double tax, int seat, LocalDate transactionDate) {
        super(noPolice, vehicleType, year,  price, tax, seat, transactionDate);

        totalTax += tax;
        totalIncomeCar += calculateIncome();  // Bisa disesuaikan nanti
    }

    @Override
    public long calculateIncome() {
        return 0; // Karena belum punya komponen income khusus di class ini
    }
}
