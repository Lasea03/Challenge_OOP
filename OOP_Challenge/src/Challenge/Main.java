package Challenge;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Vehicle vch1 = new Suv("D 1001 UM",2010,350_000_000, 3_500_000,
                4, LocalDate.of(2023,1,10),500_000,150_000);
        Vehicle vch2 = new Suv("D 1002 UM",2010,350_000_000, 3_500_000,
                4, LocalDate.of(2023,1,10),500_000,150_000);
        Vehicle vch3 = new Suv("D 1003 UM",2015,350_000_000, 3_500_000,
                5, LocalDate.of(2023,1,12),500_000,150_000);
        Vehicle vch4 = new Suv("D 1004 UM",2015,350_000_000, 3_500_000,
                5, LocalDate.of(2023,1,13),500_000,150_000);
        Vehicle vch5 = new Taxi("D 11 UK",2002,175_000_000, 1_750_000,
                4, LocalDate.of(2023,1,12),45,4_500);
        Vehicle vch6 = new Taxi("D 12 UK",2015,275_000_000, 2_250_000,
                4, LocalDate.of(2023,1,12),75,4_500);
        Vehicle vch7 = new Taxi("D 13 UK",2020,275_000_000, 2_750_000,
                4, LocalDate.of(2023,1,12),90,4_500);
        Vehicle vch8 = new Plane("ID8089", 2015,150E9,15E8,12,
                LocalDate.of(2022,12,23),55_000_000);
        Vehicle vch9 = new Plane("ID8099", 2018,175E9,175E7,15,
                LocalDate.of(2022,12,25),75_000_000);
        Vehicle vch10  = new Boat("Boat18", 2020,2E9,20_000_000,12,
                LocalDate.of(2022,12,25),10_000_000);

        List<Vehicle> listVehicle = List.of(vch1, vch2, vch3, vch4, vch5, vch6, vch7, vch8, vch9, vch10);
        int TotalIncomePlane = 0;
        int TotalIncomeBoat = 0;
        int TotalIncomeCar = 0;
        long TotalIncomeTax = 0;
        for (Vehicle vhc : listVehicle){
            TotalIncomeTax += vhc.gettax();
            if (vhc.getVehicleType() == VehicleType.PrivateJet){
                TotalIncomePlane += vhc.getTotal();
            } else if (vhc.getVehicleType() == VehicleType.Boat) {
                TotalIncomeBoat += vhc.getTotal();
            } else {
                TotalIncomeCar += vhc.getTotal();
            }
            System.out.println(vhc.toString());
        }

        // Summary
        System.out.println("Total Income Car : " + TotalIncomeCar);
        System.out.println("Total Income Plane : " + TotalIncomePlane);
        System.out.println("Total Income Boat : " + TotalIncomeBoat);
        System.out.println("Total Tax : " + TotalIncomeTax);
        System.out.println("Total Car : "+ Vehicle.totalCar);
        System.out.println("Total Plane : "+ Vehicle.totalPlane);
        System.out.println("Total Boat : "+ Vehicle.totalBoat);
    }
}
