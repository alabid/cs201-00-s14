public class BST {
    Node root;

    public BST() {
	root = null;
    }

    public void preorder(Node node) {
	if (node == null) {
	    return;
	}
	System.out.println(node.val);
	preorder(node.left);
	preorder(node.right);
    }

    public void inorder(Node node) {
	if (node == null) {
	    return;
	}
	inorder(node.left);
	System.out.println(node.val);
	inorder(node.right);
    }

    public void print() {
	// preorder(root);
	inorder(root);
    }    

    public Node add(Node node, int val) {
	if (node == null) {
	    return new Node(val);
	}
	if (node.val == val) {
	    return null;
	}
	else if (node.val < val) {
	    node.right = add(node.right, val);
	}
	else {
	    node.left = add(node.left, val);
	}
	return node;
    }

    public void add(int val) {
	root = add(root, val);
    }

    public boolean search(Node node, int val) {
	if (node == null) {
	    return false;
	}
	if (node.val == val) {
	    return true;
	}
	else if (node.val < val) {
	    return search(node.right, val);
	}
	else {
	    return search(node.left, val);
	}
    }

    public boolean search(int val) {
	return search(root, val);
    }

    public int minValue(Node node) {
	if (node.left == null) {
	    return node.val;
	}
	return minValue(node.left);
    }

    public int minValue() {
	return minValue(root);
    }

    public int maxValue(Node node) {
	if (node.right == null) {
	    return node.val;
	}
	return maxValue(node.right);
    }

    public int maxValue() {
	return maxValue(root);
    }

    private class Node {
	public Node left;
	public Node right;
	public int val;
	public Node(int value) {
	    val = value;
	}
    }

    public static void main(String[] args) {
	BST t = new BST();
	t.add(4);
	t.add(1);
	t.add(8);
	t.add(5);
	t.add(9);
	t.add(0);
	t.add(2);	    
	t.add(6);	    
	t.add(7);
	t.print();

	System.out.println("Searching for 10? " + t.search(10));
	System.out.println("Searching for 5? " + t.search(5));

	System.out.println("The minimum value in the tree is: " + 
			   t.minValue());

	System.out.println("The maximum value in the tree is: " + 
			   t.maxValue());
    }
}
