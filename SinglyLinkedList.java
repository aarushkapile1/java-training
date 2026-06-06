public class SinglyLinkedList {
    public static class SLL {
        private Node head;

    private static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
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

    }
    public void display() {
        Node current =head;
        System.out.println(" Linked List:");
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public void insertAtFirst(int val){
        Node newNode = new Node(val);
        newNode.next=head;
        head =newNode;
    }
    public static void main(String[] args) {
        SinglyLinkedList.SLL list = new SinglyLinkedList.SLL();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.display();
        list.insertAtFirst(5);
        list.insertAtLast(50);
        list.insertAtMid(25, 4);
        list.deleteAtFirst();
        list.deleteAtLast();
        list.deleteAtMid();
        list.display();
    }
    public void insertAtLast(int val){
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public void insertAtMid(int val){
        if(head==null){
            head = new Node(val);
            return;
        }
        int length = 0;
        Node current = head;
        while(current != null){
            length++;
            current = current.next;
        }
        int pos = (length / 2) + 1;
        insertAtMid(val, pos);
    }
    public void insertAtMid(int val, int pos){
        Node newNode = new Node(val);
        if(pos==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node current = head;
        for(int i=1;i<pos-1;i++){
            if(current==null){
                System.out.println("Position out of bounds");
                return;
            }
            current=current.next;
        }
        if(current==null){
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next=current.next;
        current.next=newNode;
}
public void deleteAtFirst(){
   if (head != null) {
    head = head.next;
}

}
public void deleteAtLast(){
    Node cur = head;
while (cur.next.next != null) {
    cur = cur.next;
}
cur.next = null;
}
public void deleteAtMid(){
    if(head==null){
        return;
    }
    int length = 0;
    Node current = head;
    while(current != null){
        length++;
        current = current.next;
    }
    int pos = (length / 2) + 1;
    deleteAtMid(pos);
}
    
public void deleteAtMid(int pos){
    if(head == null || pos <= 0) return;
    if(pos == 1){
        head = head.next;
        return;
    }
    Node current = head;
    for(int i = 1; i < pos-1; i++){
        if(current == null) return;
        current = current.next;
    }
    if(current == null || current.next == null) return;
    current.next = current.next.next;
}
}
}