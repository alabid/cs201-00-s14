public class Child implements Person {
    String firstName;
    String lastName;
    String typeOfCry;

    public Child() {
	firstName = "";
	lastName = "";
	typeOfCry = "loud";
    }
    
    public Child(String first, String last) {
	firstName = first;
	lastName = last;
	typeOfCry = "loud";
    }

    public String toString() {
	return firstName + " " + lastName;
    }

    /*
      print out the type of chair I sit down on.
     */
    public void sit(String chairType) {
	System.out.print(this);
	System.out.println(" sat on a " + chairType);
    }

    public void setCry(String typeOfCry) {
	this.typeOfCry = typeOfCry;
    }

    /*
     * cry should return one of {loud, soft}
     */
    public String cry() {
	return typeOfCry;
    }

    /*
     * eat should return the type of food.
     */
    public String eat() {
	return "spaghetti";
    }

    /*
     * sleep should return the hours of sleep
     */
    public int sleep() {
	return 8;
    }
}
