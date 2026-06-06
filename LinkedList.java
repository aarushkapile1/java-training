public class LinkedList {
public static void main(String[] args) {
    class Node{
        int val;
        Node next;
        Node (int val) {
            this.val=val;//this=current object reference
            this.next=null;

        }   

    }
    Node head = new Node(100);
    head.next = new Node(200);
    head.next.next = new Node(300);
   
    Node current = head;
    while(current!=null){
        System.out.println(current.val);
        current=current.next;

 }

}
}
