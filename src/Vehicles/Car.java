package Vehicles;

public class Car  extends Vehicles {

    int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void showInfo() {
        System.out.println("Car:");
        System.out.println("Plate: " + licensePlate);
        System.out.println("Owner: " + getOwner());
        System.out.println("Seats: " + numberOfSeats);
 
   }

	@Override
	public void setLicensePlate(String licensePlate) {
		// TODO Auto-generated method stub
		 this.licensePlate = licensePlate.toUpperCase();
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}




	
	
	
