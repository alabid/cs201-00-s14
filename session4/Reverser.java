import java.util.*;

public class Reverser {

    public static String reverse(String toReverse) {
	Stack<String> s = new Stack<String>();
	for (int i = 0; i < toReverse.length();i++) {
	    s.push("" + toReverse.charAt(i));
	}
	String empty = "";
	while (!s.empty()) {
	    empty += s.pop();
	}
	return empty;
    }

    public static boolean checkParens(String toCheck) {
	Stack<String> s = new Stack<String>();
	for (int i = 0; i < toCheck.length(); i++) {
	    char c =  toCheck.charAt(i);
	    if (c == '(') {
		s.push("" + toCheck.charAt(i));
	    } else {
		if (s.empty()) {
		    return false;
		} else {
		    s.pop();
		}
	    }
	}
	return s.empty();
    }

    public static void reverseStack(Stack<String> s) {
	LinkedList<String> q = new LinkedList<String>();
	while (!s.empty()) {
	    q.addLast(s.pop());
	}
	while (!q.isEmpty()) {
	    s.push(q.removeFirst());
	}
    }

    public static void printStack(Stack<String> s) {
	Stack<String> temp = new Stack<String>();
	String string;
	while (!s.empty()) {
	    string = s.pop();
	    temp.push(string);
	    System.out.println(string);
	}
	while (!temp.empty()) {
	    string = temp.pop();
	    s.push(string);
	}
    }

    public static void main(String[] args) {
	String simple = "abcdefghijklmnopq";
	
	System.out.println("Before reverse: " + simple);	

	System.out.println("After reverse: " + reverse(simple));

	String testParens1 = "()(((()())))";
	String testParens2 = "(((((()()))";
	String testParens3 = "())))";
	System.out.println(testParens1);
	System.out.println(checkParens(testParens1));// true

	System.out.println(testParens2);
	System.out.println(checkParens(testParens2));// false

	System.out.println(testParens3);
	System.out.println(checkParens(testParens3)); // false

	Stack<String> s  = new Stack<String>();
	s.push("john");
	s.push("catie");
	s.push("risako");
	s.push("josh");
	printStack(s);
	reverseStack(s);
	printStack(s);
	
    }
}
