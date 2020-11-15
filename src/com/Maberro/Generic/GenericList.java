package com.Maberro.Generic;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    public T[] items=(T[]) new Object[10];
    public int count;
    public void add (T item){
        items[count++]=item;
    }
    public T get(int index){
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>(this);
    }
}
