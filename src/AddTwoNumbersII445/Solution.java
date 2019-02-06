package AddTwoNumbersII445;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public static void main(String[] arg0){
        ListNode head1 = new ListNode(7);
        ListNode next = new ListNode(2);
        head1.next = next;
        next.next = new ListNode(4);
        next = next.next;
        next.next = new ListNode(3);

        ListNode head2 = new ListNode(5);
        next = new ListNode(6);
        head2.next = next;
        next.next = new ListNode(4);

        System.out.println(addTwoNumbers(head1,head2).val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        LinkedList<Integer> stack1 = new LinkedList<>();
        LinkedList<Integer> stack2 = new LinkedList<>();
        ListNode helperl1 = l1;
        ListNode helperl2 = l2;
        ListNode result = null;
        ListNode temp = null;

        while(helperl1!=null){
            stack1.push(helperl1.val);
            helperl1 =helperl1.next;
        }
        while(helperl2!=null){
            stack2.push(helperl2.val);
            helperl2 =helperl2.next;
        }
        int carry = 0;
        while((!stack1.isEmpty())&&(!stack2.isEmpty())){
            int num = carry+ stack1.pop()+stack2.pop();
            if(num%10>0){
                carry = num/10;
                num %=10;
            }
            result = new ListNode(num);
            result.next = temp;
            temp = result;

        }

        while(!stack1.isEmpty()){
            int num = carry+ stack1.pop();
            if(num%10>0){
                carry = num/10;
                num %=10;
            }
            result = new ListNode(num);
            result.next = temp;
            temp = result;

        }

        while(!stack2.isEmpty()){
            int num = carry+ stack2.pop();
            if(num%10>0){
                carry = num/10;
                num %=10;
            }
            result = new ListNode(num);
            result.next = temp;
            temp = result;

        }

        if(carry>0){
            result = new ListNode(carry);
            result.next = temp;
            temp = result;
        }
        return result;
    }
}