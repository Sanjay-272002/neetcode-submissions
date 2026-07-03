public class Node{
    int val;
    int key;
    Node prev;
    Node next;
    public Node(int key,int val){
        this.key=key;
        this.val=val;
        this.prev=null;
        this.next=null;
    }
}


class LRUCache {
    private int cap;
    private HashMap<Integer,Node> cache;
    private Node left;
    private Node right;
    public LRUCache(int capacity) {
         this.cap=capacity;
         this.cache=new HashMap<>();
         this.left=new Node(0,0);
         this.right=new Node(0,0);
         this.left.next=right;
         this.right.prev=left;
    }
    private void remove(Node node){
        Node prev=node.prev;
        Node next=node.next;
        prev.next=next;
        next.prev=prev;
    }
    private void insert(Node node){
        Node prev=this.right.prev;
        prev.next=node;
        node.prev=prev;
        node.next=this.right;
        this.right.prev=node;
    }
    public int get(int key) {
        if(cache.containsKey(key)){
            Node curr=cache.get(key);
            remove(curr);
            insert(curr);
            return curr.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }
        Node newnode=new Node(key,value);
        cache.put(key,newnode);
        insert(newnode);
        if(cache.size()>this.cap){
            Node remove=this.left.next;
            remove(remove);
            cache.remove(remove.key);
        }
    }
}
