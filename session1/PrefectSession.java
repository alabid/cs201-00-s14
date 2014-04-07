public class PrefectSession {
    private int upToNum;

    public PrefectSession(int num) {
	upToNum = num;
    }

    public void printXNumbers() {
	int i;
	for (i = 1; i < upToNum; i++) {
	    System.out.println(i);
	}	
    }

    public static void main(String[] risakos) {
	PrefectSession p = new PrefectSession(21);
	p.printXNumbers();
    }

}
