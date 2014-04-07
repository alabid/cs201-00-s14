import java.util.ArrayList;

public class ParentTester {
    public static void main(String[] args) {
	// Daniel has become a parent
	// he has two kids: love, christie
	// his job is to 'mailman'
	Parent d = new Parent("Daniel", "Alabi");
	d.setJob("mailman");
	Child c1 = new Child("Love", "Alabi");
	Child c2 = new Child("Christie", "Alabi");
	ArrayList<Child> dchildren = new ArrayList<Child>();
	dchildren.add(c1);
	dchildren.add(c2);
	d.setChildren(dchildren);
	
	// Tolu has become a parent
	// kids: daniel, wisdom
	// her job -> 'Goldman Sachs Strats'
	Parent t = new Parent("Tolu", "Alabi");
	t.setJob("Goldman Sachs Stats");
	Child t1 = new Child("Daniel", "Bla");
	Child t2 = new Child("Wisdom", "Bla");
	ArrayList<Child> tchildren = new ArrayList<Child>();
	tchildren.add(t1);
	tchildren.add(t2);
	t.setChildren(tchildren);

	// Daniel meets Tolu
	d.meetParent(t);
	t.meetParent(d);
    }
}
