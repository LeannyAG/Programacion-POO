package pass.by.value.referense;

public class PassByReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Person p = new Person("Juan");
		
		
		changeName(p);

        System.out.println(p.name); // debe imprimir Pedro
    }

    public static void changeName(Person person) {
        person.name = "Pedro";
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}
	
