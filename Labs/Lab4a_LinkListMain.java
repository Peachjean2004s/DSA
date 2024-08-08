package Labs;
import solutions.code3.*;;

public class Lab4a_LinkListMain {

    public static void main(String[] args) {
        demo1();
        System.out.println("---------------------");
        demo2();
    }

    static void demo1() {
        MyLinkedList list = new MyLinkedList();
        list.add(5);
        list.add(1);
        list.insert(4);
        list.insert(3);
        System.out.println(list);
        list.delete(2);
        System.out.println("5 is at " + list.find(5));
        System.out.println(list);
    }
    static void demo2() {
        int [] arr = {50,40,30,20,10};
        MyLinkedList mList = new MyLinkedList();
        mList.insert(arr);
        System.out.println(mList);
        }
}
