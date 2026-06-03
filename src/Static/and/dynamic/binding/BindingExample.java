package Static.and.dynamic.binding;

public class BindingExample {
	

	
	
	 public static void main(String[] args) {
		 
		 //ex
		 
	        // Static Binding
	        Animal animal = new Animal(); // Resolved at compile-time
	        animal.sound();

	        // Dynamic Binding
	        Animal animalDog = new Dog(); // Resolved at runtime
	        animalDog.sound();

	        // Note: This will cause a compile-time error since the reference type is Animal
	        // animalDog.specialBehavior(); 

	        // Access Dog-specific behavior
	        Dog specificDog = new Dog();
	        specificDog.specialBehavior();
	       
	        //example no.2
	        
	   	 /* Reference is of Human type and object is
	         * Boy type
	         */
	        Human obj = new Boy();
	        /* Reference is of HUman type and object is
	         * of Human type.
	         */
	        Human obj2 = new Human();
	    
	        obj.walk();
	        obj2.walk();
	        
	    }

	 {
	 
	
     
     
}
}

