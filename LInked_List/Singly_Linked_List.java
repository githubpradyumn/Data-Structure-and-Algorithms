public class Singly_Linked_List {
    private Node head;
    private Node tail;
    private int size;

    public Singly_Linked_List() {
        this.size = 0;
    }

    public void insertfirst(int value) {
        Node newnode = new Node(value);
        newnode.next = head;
        head = newnode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertlast(int value) {
        if (tail == null) {
            insertfirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertat(int value, int index) {
        if (index == 0) {
            insertfirst(value);
            return;
        }
        if (index == size) {
            insertlast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public int deletefirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deletelast() {
        if (size <= 1) {
            return deletefirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }

    public int delete(int index){
        Node prev = get(index-1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        return value;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Singly_Linked_List list = new Singly_Linked_List();
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(3);
        list.insertfirst(4);
        list.insertfirst(5);
        list.insertfirst(6);
        list.insertfirst(7);
        list.insertfirst(8);
        list.insertfirst(9);
        list.insertfirst(10);
        list.display();

        list.insertlast(0);
        list.display();

        list.insertat(11, 2);
        list.display();

        System.out.println("Deleted First: " + list.deletefirst());
        list.display();

        System.out.println("Deleted Last: " + list.deletelast());
        list.display();

        int index = 3;
        System.out.println("Deleted at index: " + index + " value : " + list.delete(index));
        list.display();
    }
}
