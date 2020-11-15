package com.Maberro.Generic;

public class LambdasDemo {
    public LambdasDemo(String message){
    }
public  void print (String message){
    System.out.println(message+"ss");
}
public static void show(){
//greet(new ConsolePrinter());
    greet(message-> System.out.println(message));
    greet(System.out::println);
    //var demo=new LambdasDemo();
    //greet(LambdasDemo::print);
    //greet(demo::print);
    greet(message->new LambdasDemo(message));
    greet(LambdasDemo::new);
}
public static void greet(Printer printer){
    printer.print("Hello Wolrd");
}
}
