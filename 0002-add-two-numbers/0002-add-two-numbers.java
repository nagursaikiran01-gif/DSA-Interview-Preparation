/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*int a=0;
        int temp=1;
        int b;
        ListNode te=null;
        ListNode head=null;
        while(l1!=null)
        {
            a=l1.val*temp+a;
            temp=temp*10;
            l1=l1.next;
        }
        int c=0;
        while(l2!=null )
        {
            c=l2.val*temp+c;
            temp=temp*10;
            l2=l2.next;
        }
        b=a+c;
        
        while(b>0)
        {
            ListNode node=new ListNode();
            node.val=b%10;
            b=b/10;
            if(te==null)
            {
                te=node=head;
            }
            else
            {
                te.next=node;
                te=te.next;
            }
        
            
        
        }*/
        ListNode head=null;
        int dami=0;
        int temp1=0;
        ListNode temp=null;
        while(l1!=null && l2!=null)
        {
            
            dami=l1.val+l2.val+temp1;
            temp1=dami/10;
            dami=dami%10;    
            ListNode node=new ListNode(dami,null);
            if(head==null)
            {
                head=temp=node;
            } 
            else
            {
                temp.next=node;
                temp=node;
            } 
            
            l1=l1.next;
            l2=l2.next;
        }
            while(l1!=null)
            {
                dami=l1.val+temp1;
                temp1=dami/10;
                dami=dami%10;
                ListNode node=new ListNode(dami,null);
                temp.next=node;
                temp=node;
                l1=l1.next;       
            }
            while(l2!=null)
            {
                dami=l2.val+temp1;
                temp1=dami/10;
                dami=dami%10;
                ListNode node=new ListNode(dami,null);
                temp.next=node;
                temp=node;
                l2=l2.next;       
            }
        if(temp1>0)
        {
            ListNode node=new ListNode(temp1,null);
            temp.next=node;
            temp=node;
        }
        return head;
        
    }
}