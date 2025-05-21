public class ParkingLotSystem {

    // Vehicle class
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

    // ParkingLot class
    static class ParkingLot {
        private Vehicle[] vehicles = new Vehicle[5];
        private int count = 0;

        public void parkVehicle(Vehicle v) {
            if (count < vehicles.length) {
                vehicles[count++] = v;
            } else {
                System.out.println("Parking lot is full.");
            }
        }

        public void removeVehicle(String licensePlate) {
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (vehicles[i].getLicensePlate().equals(licensePlate)) {
                    for (int j = i; j < count - 1; j++) {
                        vehicles[j] = vehicles[j + 1];
                    }
                    vehicles[--count] = null;
                    found = true;
                    System.out.println("Vehicle removed: " + licensePlate);
                    break;
                }
            }
            if (!found) {
                System.out.println("Vehicle not found.");
            }
        }

        public void displayVehicles() {
            System.out.println("Parked Vehicles:");
            for (int i = 0; i < count; i++) {
                System.out.println(vehicles[i]);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();

        lot.parkVehicle(new Vehicle("ABC123", "John Doe", 2));
        lot.parkVehicle(new Vehicle("XYZ789", "Jane Smith", 4));
        lot.parkVehicle(new Vehicle("LMN456", "Bob Brown", 1));

        lot.removeVehicle("XYZ789");

        lot.displayVehicles();
    }
}
