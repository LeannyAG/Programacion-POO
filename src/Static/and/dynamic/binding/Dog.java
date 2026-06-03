package Static.and.dynamic.binding;

public class Dog extends Animal{
	
	
	
	
	// Dynamic Binding Example, here we are overriding the sound()
    // method of parent class Animal
    @Override
    void sound() { // Overridden method (Note method name is same)
        System.out.println("Dog barks");
    }
    
 // Method specific to child class Dog
    void specialBehavior() { 
        System.out.println("Dog wags tail");
    }
}
