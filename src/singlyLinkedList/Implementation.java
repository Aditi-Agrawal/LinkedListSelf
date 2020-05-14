package singlyLinkedList;
import singlyLinkedList.ListNode;
import singlyLinkedList.MySinglyLinkedList;
public class Implementation {
    public static void main(String[] args) {
        MySinglyLinkedList sll=new MySinglyLinkedList();
        sll.insertLast(10);
        sll.insertLast(8);
        sll.insertLast(1);
        sll.insertLast(11);
        sll.insertLast(16);
        /*ListNode head=new ListNode(10);
        ListNode second=new ListNode(8);
        ListNode third=new ListNode(1);
        ListNode fourth=new ListNode(11);
        ListNode fifth=new ListNode(16);

        attach all together...
        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        */
        sll.display();
        System.out.println(sll.length());
        System.out.println(sll.findListNode(11));
        //ListNode reverseHead=sll.reverse(head);
        //sll.display(reverseHead);
        ListNode middleNode=sll.getMiddleNode();
        System.out.println(middleNode.getData());
    }
}
