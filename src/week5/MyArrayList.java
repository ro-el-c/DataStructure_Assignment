package week5;

public class MyArrayList {
    private Object[] myArrayList;
    private int size;
    private int index;

    public MyArrayList(int size){
        this.myArrayList = new Object[size];
        this.size = size;
        this.index = 0;
    }

    public int size(){
        return this.index;
    }

    public boolean isEmpty(){
        return this.index == 0;
    }

    public Object get(int idx) throws Exception {
        if(idx > this.index){
            throw new Exception("Out of bound.");
        }
        else if(this.isEmpty()){
            throw new Exception("ArrayList is Empty.");
        }
        else
            return this.myArrayList[idx];
    }

    public Object set(int idx, Object obj) throws Exception{
        if(idx > this.index)
            throw new Exception("Out of bound.");
        else{
            Object tmp_return  = this.myArrayList[idx];
            this.myArrayList[idx] = obj;
            return tmp_return;
        }
    }

    public void add(int idx, Object obj) throws Exception{
        if(idx > this.index)
            throw new Exception("Out of bound.");
        else if (this.index == this.myArrayList.length){
            Object[] old = this.myArrayList;
            int newSize = this.size*2;
            this.myArrayList = new Object[newSize];
            this.size = newSize;

            for(int i=0; i<this.index; i++)
                this.myArrayList[i] = old[i];
        }

        for(int i=this.index; i>idx; i--)
            this.myArrayList[i] = this.myArrayList[i-1];

        this.myArrayList[idx] = obj;
        this.index++;
    }

    public Object remove(int idx) throws Exception{
        if(idx > this.index)
            throw new Exception("Out of bound.");
        else{
            Object tmp_return = this.myArrayList[idx];
            for(int i=idx; i<index-1; i++)
                this.myArrayList[i] = this.myArrayList[i+1];
            this.index--;
            return tmp_return;
        }
    }
}
