import java.util.Iterator;

public class LinkedListTester {
    public static void print(String l) {
        System.out.println(l);
    }

    public static void print(boolean b) {
        System.out.println(b + "");
    }

    public static void print(int i) {
        System.out.println(i + "");
    }

    public static void print(List<String> l) {
        System.out.print("{ ");
        int length = l.length(),
            i;
        for (i = 0; i < length-1; i++) {
            System.out.print(l.at(i) + ", ");
        }
        if (i == length-1) {
            System.out.print(l.at(length-1));
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {        
        List<String> l1 = new LinkedListImplementation<String>();
        l1.add("daniel");
        l1.add("anield");
        l1.add("nielda");
        l1.add("ieldan");
        l1.add("eldani");
        print(l1);
        // l1 = {"daniel", "anield", "nielda", "ieldan", "eldani"}
        l1.add(2, "alabi");
        l1.add(4, "labia");
        // l1 = {"daniel", "anield", "alabi", "nielda", "labia", "ieldan",
        //       "eldani"}
        print(l1);
        print(l1.remove(3));
        // l1.remove(3) -> "nielda"
        print(l1);
        // l1 = {"daniel", "anield", "alabi", "labia", "ieldan", "eldani"}
        print(l1.at(4));
        // l1.at(4) -> "ieldan"
        l1.replace(2, "ibala");
        print(l1);
        // l1 = {"daniel", "anield", "ibala", "labia", "ieldan", "eldani"}
        print(l1.contains("babe"));
        print(l1.contains("ibala"));
        // l1.contains("babe") -> false
        // l1.contains("ibala") -> true
        print(l1.length()); 
        // l1.length() -> 6
        print("toArray() output ----->");
        for (Object o : l1.toArray()) {
            String s = (String) o;
            print(s);
        }
        print("iterator() output ----->");
        Iterator<String> it = l1.iterator();
        while (it.hasNext()) {
            print(it.next());
        }
    }
}
