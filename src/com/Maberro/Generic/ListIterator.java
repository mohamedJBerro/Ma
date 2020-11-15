package com.Maberro.Generic;

import java.util.Iterator;

public class ListIterator<T> implements Iterator<T>{
    private GenericList<T> list;
    private int index;

    public ListIterator(GenericList<T> list) {
        this.list = list;
    }
    @Override
    public boolean hasNext(){
        return (index<list.count);
    }
    @Override
    public T next(){
        return list.items[index++];
}
}
