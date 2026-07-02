/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        Node l1=head;
        while(l1!=null){
            Node l2=new Node(l1.val);
            l2.next=l1.next;
            l1.next=l2;
            l1=l2.next;
        }

        Node result=head.next;
        Node trav=head;
        while(trav!=null){
            if(trav.random!=null){
                trav.next.random=trav.random.next;
            }
            trav=trav.next.next;
        }
        l1=head;
        while(l1!=null){
            Node l2=l1.next;
            l1.next=l2.next;
            if (l2.next != null) {
                l2.next = l2.next.next;
            }
            l1 = l1.next;
        }
        return result;
    }
}
