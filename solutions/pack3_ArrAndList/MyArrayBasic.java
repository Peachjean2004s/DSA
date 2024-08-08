package solutions.pack3_ArrAndList;

public class MyArrayBasic {
    protected int MAX_SIZE = 5 ;
    protected int [] data = new int[MAX_SIZE];
    protected int size = 0 ;

    public int getAt(int i) {
        if(i < size){
            return -1 ;
        }
        return data[i];
    }
    public void setAt(int d, int i){
        if(i > size - 1){
            data[i] = d ;
        }

    }
    public int find(int d){
        int i = 0 ;
        while(i < size){
            if(data[i] == d){
                return i ;
            }
        i++;
        }
        return - 1 ;
    }
    public void add(int d){
        data[size++] = d ;
    }
    public void insert (int d ,int idx){
        for (int j = size ; j > idx; j--) {
            data[j] = data[ j - 1];
        }
        data[idx] = d ;
        size++ ;
    }

    public int binarySearch(int d){
        int left = 0 ; int right = size - 1 ;
        while(left <= right){
            int mid = (left + right) / 2 ;
            //int m = left + (right - left)/2 ;
            if(data[mid] == d){
                return data[mid];
            }
            if(d < data[mid]){
                right = mid - 1 ;
            }
            else {
                left = mid + 1 ;
            }
        }
        return - 1 ;
    }
    public void delete(int i){
        for (int j = i ; j < size - 1; j++) {
            data[j]= data[j+1];

        }
        size--;
    }
    public MyArrayBasic(){
        data = new int [MAX_SIZE];
    }

    public MyArrayBasic(int ... Arr){
        //data = new int[MAX_SIZE];
        for (int i = 0; i < MAX_SIZE; i++) {
            data[i] = Arr[i];
        }
        if (Arr.length < MAX_SIZE) {
            size = Arr.length ;
        }
        else{
            size = MAX_SIZE ;
        }
    }
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < size - 1 ; i++) {
            sb.append(data[i]);
            sb.append(",");
        }
        if(size > 0)sb.append(data[size-1]);
        sb.append("]");
        return sb.toString();
    }

}
