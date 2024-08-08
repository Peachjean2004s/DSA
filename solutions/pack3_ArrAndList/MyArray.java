package solutions.pack3_ArrAndList;

public class MyArray extends MyArrayBasic {
    
    protected int MAX_SIZE ;

    public MyArray(){
        this.MAX_SIZE = 1000_000 ;
        data = new int[MAX_SIZE];
        size = 0 ;
    }
    public MyArray(int max){
        this.MAX_SIZE = max ;
        data = new int[MAX_SIZE];
        size = 0 ;
        
    }
    
    @Override
    public void add(int d) {
        if (isFull()) {
            expand();
        }
        super.add(d);
    
        
    }
    public boolean isFull(){
        return size == MAX_SIZE ;
    }


    public boolean isEmpty(){
        return size == 0 ;
    }

    public void delete(int i){
        if(isFull()){
            super.delete(i);
        }
    }
    public void expandBy(int k){
        MAX_SIZE = k * MAX_SIZE ;
        int newData [] = new int [MAX_SIZE];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }
    public void expand(){
        expandBy(2);
    }
    

}
