package homework_26;

public class NumericPair<T extends Number> extends Pair<T>{

    public NumericPair(T obj1, T obj2){
        super(obj1, obj2);
    }
    public double sum(){
        return obj1.doubleValue() + obj2.doubleValue();
    }
}
