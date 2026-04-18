package Vehicles;

public class Main {

	
	public static void main(String[] args) {

        Car car = new Car(4);
        car.setLicensePlate("ABC123");
        car.setOwner("Juan");

        Truck truck = new Truck(5000);
        truck.setLicensePlate("TRK999");
        truck.setOwner("Pedro");

        Vehicles v1 = car;   // upcasting
        Vehicles v2 = truck; // upcasting

        v1.setLicensePlate("NEW111");
        v2.setLicensePlate("NEW222");

        car.showInfo();
        truck.showInfo();

        // instanceof
        System.out.println(v1 instanceof Car);   // true
        System.out.println(v2 instanceof Truck); // true
        
        
        Car car1 = new Car(0);
        Truck truck1 = new Truck(3);

        car1.setLicensePlate("abc123");
        truck1.setLicensePlate("XYZ999");

        System.out.println("Car plate: " + car1.getLicensePlate());
        System.out.println("Truck plate: " + truck1.getLicensePlate());
        
        
        

        Vehicles v = new Car(4);

    
        v.setLicensePlate("AAA111");

  
        Car c = (Car) v;

        System.out.println(c.getLicensePlate());
    }
    }
    

	
	
	
	
	
	
	
	
	
	

