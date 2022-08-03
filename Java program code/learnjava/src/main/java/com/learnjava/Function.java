package com.learnjava;

public class Function {
    int Y;
    int G;

    public Function(int Third,int Forth) {
        G =Third;
        Y =Forth;
        System.out.println("Constructor called with values " + Third + " and " + Forth );

    }

    public Function() {
        System.out.println("Constructor called without parameters");
    }
    
    public void addnumbers(){
        System.out.println("Print the first value ="+G+"");

    }
   

}



