package eightversion;


interface InnerTesting <T,R> {
abstract R show(T t1,T t2);
    
}
public class Testing {

    public static void main(String[] args) {
        InnerTesting<Integer,Boolean> mul = (i1,i2)-> i1>i2;
        
        System.out.println(mul.show(3, 5));
        
    }
}
