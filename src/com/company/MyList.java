package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<T> {
    private int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void add(T t){
        if (size == elements.length){
            int newCapacity = this.elements.length*2;
            this.elements = Arrays.copyOf(this.elements,newCapacity);
        }
        this.elements[this.size]=t;
        this.size++;
    }
    public  int size(){
        return this.size;
    }
    public T get(int index){
        if (index < 0 || index >= this.size){
            throw new ArrayIndexOutOfBoundsException(" Index" + index + "size"+ this.size);
        }
        return  (T) this.elements[index];
    }
}
