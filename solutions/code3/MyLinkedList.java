package solutions.code3;

public class MyLinkedList {

    Node head = null;
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int d) {
        Node p = new Node(d);
        p.next = head;
        head = p;
    }

    public void add(int [] d){
        for (int i = d.length - 1; i >= 0; i--) {
            add(d[i]);
        }
    }

    public void insert(int d) {
        Node p = new Node(d);
        Node q = head ;
        if (head == null || head.data >= d) {
           p.next = head;
           head = p; 
        }
        else {
            while (q.next != null && q.next.data < d) {
                q = q.next ;
        }
        p.next = q.next ;
        q.next = p;
        }
    }

    public void insert(int [] d){
       for (int i : d) {
        insert(i);
       }
    }

    public int find(int d) {
        Node p = head ;
        int i = 1 ;
        while (p != null) {
            if (p.data == d){
                return i ;
            }
            i++;
            p = p.next;
            
        }
        return -1;
    }


    public void delete(int d) {
        Node p = head;
        p.next = p.next.next;
    }

    public int size(){
        Node p = head ;
        int s = 1 ;
        while (p != null) {
            s++;
            p = p.next;
        }
        return s ;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("head");
        Node p = head;
        while (p != null) {
            sb.append("->(");
            sb.append(p.data);
            sb.append(")");
            p = p.next;
        }
        sb.append("->null");
        return new String(sb);
    }

}
