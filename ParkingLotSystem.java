public class ParkingLotSystem {

    
    static class Vehicle {
        private String licensePlate;
        private String ownerName;
        private int hoursParked;

        public Vehicle(String licensePlate, String ownerName, int hoursParked) {
            this.licensePlate = licensePlate;
            this.ownerName = ownerName;
            this.hoursParked = hoursParked;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public String toString() {
            return "License: " + licensePlate + ", Owner: " + ownerName + ", Hours Parked: " + hoursParked;
        }
    }

    
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();

        lot.parkVehicle(new Vehicle("ABC123", "John Doe", 2));
        lot.parkVehicle(new Vehicle("XYZ789", "Jane Smith", 4));
        lot.parkVehicle(new Vehicle("LMN456", "Bob Brown", 1));

        lot.removeVehicle("XYZ789");

        lot.displayVehicles();
    }
}
