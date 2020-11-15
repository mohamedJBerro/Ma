package com.Maberro.Generic;

public class Utils {
    public static <T extends Comparable<T>> T max (T first,T second){
        return (first.compareTo(second)<0)? second:first;
    }
    public static void printUser(Userr user){
        System.out.println(user);
    }
    public static void printUsers (GenericList<? extends Userr> users){
        Object x= users.get(1);
        printUser((Userr)x);
//        for (var item : users.items)
//            System.out.println(item);
    }
}
