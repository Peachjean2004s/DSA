package solutions.code5_Postfix;

import java.util.ArrayList;
import java.util.Iterator;

public class MyQueueExtendsLinkedList<T> implements Iterable<T> {
    private ArrayList<T> items = new ArrayList<>();
    private int count;

    public void enqueue(T item) {
        items.add(item);
        count++;
        // System.out.println(count);
    }

    public T peek() {
        return items.get(0);
    }

    public T top() {
        return this.peek();
    }

    public T dequeue() {
        T tmp = items.get(0);
        items.remove(0);
        count--;
        return tmp;
    }

    public T getLast() {
        return items.get(count - 1);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("top->");
        for (int i = count - 1; i >= 0; i--) {
            sb.append("[");
            sb.append(items.get(i));
            sb.append("]->");
        }
        sb.append("bottom");
        return new String(sb);
    }

    @Override
    public Iterator<T> iterator() {
        return new AnyItemsIterator(this);
    }

    private class AnyItemsIterator implements Iterator<T> {
        private MyQueueExtendsLinkedList<T> lis;
        private int idx;

        public AnyItemsIterator(MyQueueExtendsLinkedList<T> arg) {
            this.lis = arg;
        }

        @Override
        public boolean hasNext() {
            return (idx < lis.count);
        }

        @Override
        public T next() {
            return lis.items.get(idx++);
        }
    }

    public String dumpToString() {
        // TODO Auto-generated method stub
        StringBuilder sb = new StringBuilder();
        for(T i : items){
            sb.append(i + " ");
        }
        return sb.toString();
    }
}