package homework_26;

public class Pair<T> {
    T obj1;
    T obj2;
    public Pair(T obj1, T obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

   public T getFirst(){
        return obj1;
   }
    public T getSecond(){
        return obj2;
    }

    public void setFirst(T value){
        obj1=value;
    }

    public void setSecond(T value){
        obj2=value;
    }

    public void swap() {
        T swap = obj1;
        obj1 = obj2;
        obj2 = swap;
    }
}
