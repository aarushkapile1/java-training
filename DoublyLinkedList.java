public class DoublyLinkedList {
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;

    }
}

    Node head;
    public DoublyLinkedList(){
        this.head=null;
    }

public void append(int data){
    Node newNode = new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node current = head;
    while(current.next!=null){
        current=current.next;
    }
    current.next=newNode;
    newNode.prev=current;

}
public void prepend(int data){
    Node newNode = new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    newNode.next=head;
    head.prev=newNode;
    head=newNode;

}
  public void displayForward() {
        Node current = head;
        StringBuilder elements = new StringBuilder();
        
        while (current != null) {
            elements.append(current.data);
            if (current.next != null) {
                elements.append(" <-> ");
            }
            current = current.next;
        }
        System.out.println(elements.toString());
    }

    
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(10);
        dll.append(20);
        dll.prepend(5);

        System.out.println("Doubly Linked List:");
        dll.displayForward();
}
    }