package solutions.code3;
import java.util.Stack;

public class MyLinkedListTricky extends MyLinkedList {
    Node head = null;

    // @Override
    // public void add(int d) {
    // // TODO Auto-generated method stub
    // super.add(d);
    // }

    // @Override
    // public void add(int[] d) {
    // // TODO Auto-generated method stub
    // super.add(d);
    // }

    // @Override
    // public void insert(int d) {
    // // TODO Auto-generated method stub
    // super.insert(d);
    // }

    // @Override
    // public void insert(int[] d) {
    // // TODO Auto-generated method stub
    // super.insert(d);
    // }

    public void add(int d) {
        Node p = new Node(d);
        p.next = head;
        head = p;
    }

    public void add(int[] d) {
        for (int i = d.length - 1; i >= 0; i--) {
            add(d[i]);
        }
    }

    public void insert(int d) {
        Node p = new Node(d);
        Node q = head;
        if (head == null || head.data >= d) {
            p.next = head;
            head = p;
        } else {
            while (q.next != null && q.next.data < d) {
                q = q.next;
            }
            p.next = q.next;
            q.next = p;
        }
    }

    public void insert(int[] d) {
        for (int i : d) {
            insert(i);
        }
    }

    void insert(Node n) {
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void q1_rotate_counter_clockwise(int k) {
        int size = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
            size++;
        }
        if (k == 0 || k > size) {
            return;
        }
        current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head;
        current = head;

        for (int i = 0; i < k - 1; i++)
            current = current.next;

        head = current.next;
        current.next = null;
    }

    public void q2_reverse() {
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            temp.data = stack.pop();
            temp = temp.next;
        }
    }

    public void q3_remove_dup() {
        Node current = head;
        while (current != null) {
            Node pass = current;
            while (pass.next != null) {
                if (current.data == pass.next.data) {
                    pass.next = pass.next.next;
                } else {
                    pass = pass.next;
                }
            }
            current = current.next;
        }
    }

    public void q4_add_one() {
        Node lastNode = null;
        Node curr = head;
        int n = 1;

        while (curr.next != null) {
            if (curr.data < 9)
                lastNode = curr;

            curr = curr.next;
        }
        curr.data = curr.data + n;
        if (curr.data > 9) {
            curr.data = curr.data % 10;
            if (lastNode == null) {
                insert(new Node(1));
                lastNode = head.next;
            }
            while (lastNode != curr) {
                lastNode.data = (lastNode.data + 1) % 10;
                lastNode = lastNode.next;
            }
        }

    }

    public boolean q5_isPalindrome() {
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (stack.pop() == temp.data) {
                temp = temp.next;
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("head");
        Node current = head;
        while (current != null) {
            sb.append("->(");
            sb.append(current.data);
            sb.append(")");
            current = current.next;
        }
        sb.append("->null");
        return sb.toString();
    }
}
