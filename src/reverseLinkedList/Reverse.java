package reverseLinkedList;

/*
input:1->2->3->4->5->null
output:5->4->3->2->1->null

 */
public class Reverse {

    public static void main(String [] arg0){

    }

    public static void reverse(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        while(temp != head){
            temp.next = head;
            head = head.next;
        }
    }
}
