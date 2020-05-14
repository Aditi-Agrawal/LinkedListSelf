package singlyLinkedList;
import singlyLinkedList.ListNode;

public class MySinglyLinkedList {
    private ListNode head;

    public MySinglyLinkedList(){
        head=null;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public ListNode getHead() {
        return head;
    }


//how to insert listnode at last in sinhly linked list...
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(getHead() == null){
            head=newNode;
        }
        ListNode current=head;
        while(current.getNext() != null){
            current=current.getNext();
        }
        current.setNext(newNode);
    }
//how to insert listnode in the beginning in singly linked list...
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.setNext(getHead());
        setHead(newNode);
    }
//how to print element in singly linked list...
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.getData() + "-->");
            current=current.getNext();
        }
        System.out.println("null");
    }
//how to find length in singly linked list...
    public int length(){
        if(getHead() == null){
            return 0;
        }
        ListNode current = head;
        int count=0;
        while(current != null){
            count++;
            current=current.getNext();
        }
        return count;
    }
//how to search an element in sll...
    public boolean findListNode(int searchKey){
        if(head==null){
            return false;
        }
        ListNode current = head;
        while(current != null){
            if(current.getData() == searchKey){
                return true;
            }
            current=current.getNext();
        }
        return false;
    }
//how to reverse a sll...
    public ListNode reverse(ListNode head){ //here we return head
        if(head==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while(current != null){
            next=current .getNext();
            current.setNext(previous);
            previous=current;
            current=next;
        }
        return previous;
    }
//how to find middle node in sll...
    //wrong output
    public ListNode getMiddleNode(){
        if(head == null){
            return null;
        }
        ListNode fastPtr=head;
        ListNode slowPtr=head;
        while(fastPtr != null && fastPtr.getNext() != null){
            fastPtr.setNext(fastPtr.getNext().getNext());
            slowPtr.setNext(slowPtr.getNext());
        }
        return slowPtr;
    }
}
