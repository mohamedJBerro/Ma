package com.Maberro.Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show(){
        Collection<String> collection= new ArrayList<>();
        Collections.addAll(collection,"wwwww","sdd","dsdd");
        collection.add("aaaaaaa");
        collection.add("sjsjsjsj");
        System.out.println(collection);
        for (var item : collection)
            System.out.println(item);
        var objectArray=collection.toArray();
        var stringArray=collection.toArray(new String [3]);
        System.out.println(stringArray[0]);
        System.out.println(objectArray[0]);

    }
}
