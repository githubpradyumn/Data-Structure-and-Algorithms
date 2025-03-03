public class Singly_Linked_List{
    private Node head;
    private Node tail;
    private int size;

    public Singly_Linked_List(){
        this.size = 0;
    }

    public void insertfirst(int value){
        Node newnode = new Node(value);
        newnode.next = head ;
        head = newnode;

        if(tail == null){
               tail = head;
        }

    }

    public void insertlast(int value){
        if ( tail == null ){
            insertfirst(value);
            return ;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node ;
        size ++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next ;
        }
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value , Node next ){
            this.value = value;
            this.next = next;
        }

    }
    public static void main(String[] args){
        Singly_Linked_List list = new Singly_Linked_List();
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(3);
        list.insertfirst(4);
        list.display();

    }

}
