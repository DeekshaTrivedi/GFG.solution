/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public Node reverseKGroup(Node head, int k) {
        if(head==null) return null;
        Node curr=head;
        Node next=null;
        Node prev = null;
        int count =0;
        while(curr!=null && count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            Node resthead=reverseKGroup(next,k);
            head.next=resthead;
        }
        return prev;
        
    }
}