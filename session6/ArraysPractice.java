public class ArraysPractice {
    public static void print(String s) {
	System.out.println(s);
    }

    public static void print(int i) {
	print(i + "");
    }

    public static void print(String[] strings) {
	System.out.print("{ ");
	for (int i = 0; i < strings.length; i++) {
	    System.out.print(strings[i]);
	    if (i != strings.length-1) {
		System.out.print(", ");
	    }
	}
	System.out.println(" }");
    }

    public static void print(int[] ints) {
	String[] strings = new String[ints.length];
	for (int i = 0; i < ints.length; i++) {
	    strings[i] = ints[i] + "";
	}
	print(strings);
    }

    public static void reverse(String[] strings) {
	int i, j;
	String temp;
	// find the first non-null index
	i = 0;
	while (strings[i] == null && i < strings.length) {
	    i++;
	}
	// find the last non-null index
	j = strings.length-1;
	while (strings[j] == null && j > 0) {
	    j--;
	}
	while (i < j) {
	    temp = strings[i];
	    strings[i] = strings[j];
	    strings[j] = temp;
	    i++;
	    j--;
	    while (strings[i] == null && i < strings.length) {
		i++;
	    }
	    while (strings[j] == null && j > 0) {
		j--;
	    }
	}
    }

    public static void copiesIter(String[] strings, int n, String string) {
	for (int i = 0; i < n && i < strings.length; i++) {
	    strings[i] = string;
	}
    }

    public static void copiesRecurse(String[] strings, int n, String string) {
	if (n == 0) {
	    return;
	}
	if (n-1 < strings.length) {
	    strings[n-1] = string;   
	}
	copiesRecurse(strings, n-1, string);
    }
    
    // copies(new String[9], 3, "a") -> {"a", "a", "a", null, ...}
    public static void copies(String[] strings, int n, String string) {
	copiesRecurse(strings, n, string);
    }
    
    public static void main(String[] args) {
	int[] someInts = new int[] {1, 2, 3, 4, 7, 5, 6};
	print(someInts);
	int[] someInts2 = new int[10];
	someInts2[0] = 1;
	someInts2[1] = 2;
	someInts2[2] = 3;
	someInts2[3] = 4;
	someInts2[4] = 7;
	someInts2[5] = 5;
	someInts2[6] = 6;
	print(someInts2);
	String[] someStrings = new String[10];
	someStrings[2] = "daniel";
	someStrings[3] = "john";
	someStrings[6] = "moses";
	someStrings[7] = "risako";
	print(someStrings);
	reverse(someStrings);
	print(someStrings);
	String[] empty = new String[9];
	print(empty);
	copies(empty, 13, "a");
	print(empty);
    }
}
