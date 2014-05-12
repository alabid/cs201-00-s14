import java.util.Iterator;

public class LinkedListImplementation<T> implements List<T> {
    private Node<T> head;

    public LinkedListImplementation() {
        head = null;
    }

    public void add(T newItem) {
        Node<T> newNode = new Node<T>(newItem);
        if (head == null) {
            head = newNode;
        } else {
            // go to end of list
            Node<T> end = head;
            while (end.next != null) {
                end = end.next;
            }
            end.next = newNode;
        }        
    }

    public boolean add(int newPosition, T newItem) {
        int length = length();
        if (newPosition < 0 || newPosition > length-1) {
            return false;
        }
        if (length == 0) {
            add(newItem);
            return true;                
        } else if (length == 1) {
            Node<T> newNode = new Node<T>(newItem);
            newNode.next = head;
            head = newNode;
            return true;
        }

        Node<T> before, after, newNode;
        int count = 0;
        after = head;
        before = head;
        while (count != newPosition) {
            before = after;
            after = after.next;            
            count++;
        }
        newNode = new Node<T>(newItem);
        if (before == after) {
            newNode.next = head;
            head = newNode;
        } else {
            before.next = newNode;
            newNode.next = after;
        }
        return true;
    }

    public T remove(int position) {
        if (position < 0 || position > length()-1) {
            return null;
        }
        int count = 0;
        Node<T> before, current;
        before = head;
        current = head;
        while (count != position) {
            before = current;
            current = current.next;
            count++;
        }
        if (before == current) {
            head = current.next;
        } else {
            before.next = current.next;
        }
        current.next = null;
        return current.val;
    }
    
    public void clear() {
        Node<T> current = head, 
            toDelete;
        while (current != null) {
            toDelete = current;
            current = current.next;
            toDelete.next = null;
        }
    }
    
    public T at(int position) {
        if (position < 0 || position > length()-1) {
            return null;
        }
        int index = 0;
        Node<T> current = head;
        while (index != position) {
            current = current.next;
            index++;
        }
        return current.val;
    }
    
    public boolean replace(int position, T newItem) {
        if (position < 0 || position > length()-1) {
            return false;
        }
        int count = 0;
        Node<T> current = head;
        while (count != position) {
            current = current.next;
            count++;
        }
        current.val = newItem;
        return true;
    }
    
    public boolean contains(T targetItem) {
        Node<T> current = head;
        while (current != null) {
            if (current.val.equals(targetItem)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public int length() {
        Node<T> current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }    
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public Object[] toArray() {
        Object[] objects = new Object[length()];
        Node<T> current = head;
        int pos = 0;
        while (current != null) {
            objects[pos] = current.val;
            current = current.next;
            pos++;
        }
        return objects;
    }
    
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(head);
    }

    private class Node<T> {
        public T val;
        public Node<T> next;
        public Node(T value) {
            val = value;            
        }         
    }

    private class LinkedListIterator<T> implements Iterator<T>{
        public Node<T> current;
        public LinkedListIterator(Node<T> head) {
            current = head;
        }
        
        public boolean hasNext() {
            return current != null;
        }
        
        public T next() {
            T val = current.val;
            current = current.next;
            return val;
        }

        public void remove() {
            throw new UnsupportedOperationException(); 
        }
    }
}
