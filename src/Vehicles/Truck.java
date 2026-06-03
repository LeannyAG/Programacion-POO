package Vehicles;

public class Truck extends Vehicles {

    double loadCapacity;

    public Truck(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void showInfo() {
        System.out.println("Truck:");
        System.out.println("Plate: " + licensePlate);
        System.out.println("Owner: " + getOwner());
        System.out.println("Load: " + loadCapacity);
    }

	@Override
	public void setLicensePlate(String licensePlate) {
		// TODO Auto-generated method stub
		this.licensePlate = licensePlate.toLowerCase();
	}
    
    
    
    
    
    
}

	
	
	
	