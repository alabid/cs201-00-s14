public class ChildTester {
    public static void main(String[] args) {
	// make "Daniel"
	Child d = new Child("Daniel", "Alabi");
	// make some dude with no name
	Child blank = new Child();
	// John 
	Child j = new Child("John", "Cho");
	
	// make Daniel do some stuff
	System.out.println(d);
	d.sit("soft sofa");

	// make John do some stuff
	String food = j.eat();	
	System.out.println(j + " ate " + food);
    }
}
