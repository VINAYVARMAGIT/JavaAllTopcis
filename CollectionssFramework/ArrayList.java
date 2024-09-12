package collectionssframework;

import java.util.Arrays;

public class ArrayList<T> {

    private Object[] array ;
    private int size=0;
    private int capaticyOfArray=10;

    public ArrayList(){
        array= new Object[capaticyOfArray];
    }
    public void add(T element){
        if (size==array.length) {
            resize();
        }
        array[size++]= element;
    }

    public T get(int index){
        if (index<0 || index>= array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) array[index];
    }
    public int size(){
        return size;
    }
    public void remove(int index){
        if (index<0 || index>= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = index; i < size; i++) {
            array[i]= array[i+1];
        }
        array[--size]=null;
    }
    public void resize(){
        int newCapacity = array.length*2;
        array = Arrays.copyOf(array, newCapacity);
    }
}
