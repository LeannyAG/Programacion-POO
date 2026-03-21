package initializer.block;

public class InstanceBlockExample {
	

	    {
	        System.out.println("Instance initializer block 1");
	    }
	    
	    {
	        System.out.println("Instance initializer block 2");
	    }
	    
	    public InstanceBlockExample() {
	        System.out.println("Class constructor");
	    }

	    public static void main(String[] args) {
	        new InstanceBlockExample();
	        System.out.println("Main Method");
	    }
	}