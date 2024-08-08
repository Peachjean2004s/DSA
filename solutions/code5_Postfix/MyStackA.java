package solutions.code5_Postfix;

public class MyStackA {
    private int MAX_SIZE = 100;
    //private int top = 0 ;
    private int size = 0 ;
    private double[] data = new double[MAX_SIZE];

    /* your code */
    public void push(double i){
        data[size++] = i ;
    } 

    public double pop(){
        return data[--size]; 
    }

    public double top(){
        return data[size-1];
    }
    public boolean isFull(){
        return size - 1 == MAX_SIZE ;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public double peek (){
        return data[0];
    }
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("top->");
        for (int i = size - 1; i >= 0; i--) {
            sb.append("[");
            sb.append(data[i]);
            sb.append("]->");
        }
        sb.append("bottom");
        return new String(sb);
    }
}
