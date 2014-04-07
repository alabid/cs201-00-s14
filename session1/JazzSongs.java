import java.util.ArrayList;

public class JazzSongs {
    
    public static void main(String[] args) {
	System.out.println("Part 1====================");
	// part 1
	String[] jazzSongs = new String[10];
	jazzSongs[0] = "Strange Fruit";
	jazzSongs[1] = "Lush Life";
	jazzSongs[2] = "God Bless the Child";
	jazzSongs[3] = "How High the Moon";
	jazzSongs[4] = "Mack the Knife (in Berlin)";
	jazzSongs[5] = "At Last";
	jazzSongs[6] = "What a Wonderful World";
	jazzSongs[7] = "My Fun Valentine";
	jazzSongs[8] = "Girl from Ipanema";
	jazzSongs[9] = "Fever";
	for (int i = 0; i < jazzSongs.length; i +=2) {
	    System.out.format("%s <=> %s\n",
			      jazzSongs[i],
			      jazzSongs[i+1]);
	}
	System.out.println("Part 2====================");
	// part 2
	for (int i = 0; i < jazzSongs.length/2; i++) {
	    System.out.format("%s <=> %s\n",
			      jazzSongs[i],
			      jazzSongs[jazzSongs.length - i - 1]);
	}
	System.out.println("Part 3====================");
	// part 3
	ArrayList<String> names = new ArrayList<String>();
	
	names.add("Strange Fruit");
	names.add("Lush Life");	
	names.add("God Bless the Child");
	names.add("How High the Moon");
	names.add("Mack the Knife (in Berlin)");
	names.add("At Last");
	for (int i = 0; i < names.size(); i+=2) {
	    System.out.format("%s <=> %s\n",
			      names.get(i),
			      names.get(i+1));
	}

	
    }
}
