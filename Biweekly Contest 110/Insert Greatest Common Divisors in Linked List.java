https://leetcode.com/contest/biweekly-contest-110/problems/insert-greatest-common-divisors-in-linked-list/
  
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next
 = next; }
 * }
 */



class Solution {
    public int findGCD(int x, int y)  
{  
int r=0, a, b;  
a = (x > y) ? x : y; // a is greater number  
b = (x < y) ? x : y; // b is smaller number  
r = b;  
while(a % b != 0)  
{  
r = a % b;  
a = b;  
b = r;  
}  
return r;  
}  
    
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        ListNode leftt=head;
        ListNode right=head.next
;
        
        while(right!=null){
            
            int lval=leftt.val;
            int rval=right.val;
            
            int gcd=findGCD(lval,rval);
            ListNode nli=new ListNode();
            nli.val=gcd;
            leftt.next=nli;
            nli.next=right;
            
            leftt=right;
            right=right.next
;
        }
        
        return head;
    }
}

//


class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        List<Integer> a = new ArrayList<>();
        while (head != null) {
            a.add(head.val);
            head = head.next;
        }
        
        List<Integer> b = new ArrayList<>();
        for (int i = 1; i < a.size(); i++) {
            b.add(gcd(a.get(i - 1), a.get(i)));
        }
        
        ListNode res = new ListNode(a.get(0));
        ListNode p = res;
        for (int i = 1; i < a.size(); i++) {
            p.next = new ListNode(b.get(i - 1));
            p = p.next;
            p.next = new ListNode(a.get(i));
            p = p.next;
        }
        return res;
    }
    
    private int gcd(int a, int b) {
        if (a < b) {
            int t = a; a = b; b = t;
        }

        while ((a % b) != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return b;
    }
}
