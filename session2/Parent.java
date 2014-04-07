import java.util.ArrayList;

public class Parent extends Child {
    String job;
    ArrayList<Child> children;

    public void setUpOtherVars() {
	job = "parenting";
	children = new ArrayList<Child>();
    }
    
    public Parent() {
	super();
	setUpOtherVars();
    }

    public Parent(String firstName, String lastName) {
	super(firstName, lastName);
	setUpOtherVars();
    }

    public void setJob(String s) {
	job = s;
    }

    public String getJob() {
	return job;
    }

    public void meetParent(Parent p2) {
	System.out.println("Hi! I'm " + this);
	System.out.println("I work as " + job);
	System.out.println("My children: ");
	for (int i = 0; i < children.size(); i++) {
	    System.out.println(children.get(i));
	}
	System.out.println();
	if (!p2.job.equals("mailman")) {
	    System.out.println("Nice to meet you!");
	} else {
	    System.out.println("Cool stuff!");
	}
    }

    public void setChildren(ArrayList<Child> children) {
	this.children = children;
    }

    public ArrayList<Child> getChildren() {	
	return children;
    }
}

