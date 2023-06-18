class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
        next=null;
    }
         
};
public class SumLinkedList {

    public static void printList(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static ListNode addTwoNumbers(ListNode  l1, ListNode l2) {
        ListNode head;
        ListNode current=new ListNode(0);
        head=current;
        int sum=0;
        while( (l1!=null) || (l2!=null) || (sum>0)){
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }

            int rem=sum%10;
            current.next=new ListNode(rem);
            current=current.next;
            sum=sum/10;
        }
        return head.next;
    }
    public static void main(String[] args) {
        
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        System.out.println("First List: ");
        printList(l1);

        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        System.out.println("Second List");
        printList(l2);

        ListNode l3=addTwoNumbers(l1, l2);
        System.out.println("Sum of two List: ");
        printList(l3);

    }
}
