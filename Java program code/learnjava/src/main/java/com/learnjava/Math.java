package com.learnjava;


public class Math {
    int R;
    int T;

    public Math(int Forth , int Third) {
        //System.out.println("Constructor called with values " + firstVariable + " and " + secondVariable );
        R = Third ; 
        T = Forth ;
    }

   public void addtion(){
       System.out.println("Printing value of first varible="+Constants.FIRST+"");
       System.out.println("Printing value of second varible="+Constants.SECOND+"");
       System.out.println(Constants.FIRST+"+"+Constants.SECOND+"="+(Constants.FIRST+Constants.SECOND));   
   }
public void subtraction(){
    System.out.println("Printing value of first varible="+Constants.FIRST+"");
       System.out.println("Printing value of second varible="+Constants.SECOND+"");
       System.out.println(Constants.FIRST+"-"+Constants.SECOND+"="+(Constants.FIRST-Constants.SECOND));
    }
public void multiplication(){
    System.out.println("Printing value of first varible="+Constants.FIRST+"");
       System.out.println("Printing value of second varible="+Constants.SECOND+"");
       System.out.println(Constants.FIRST+"*"+Constants.SECOND+"="+(Constants.FIRST*Constants.SECOND));  
}

    public void division(){
        System.out.println("Printing value of first varible ="+Constants.THIRD+"");
        System.out.println("Printing value of second varible="+Constants.FORTH+"");
        System.out.println(Constants.FORTH+"/"+Constants.THIRD+"="+(Constants.FORTH/Constants.THIRD));
     
    }

    public void addtion( int a, int b){
        System.out.println("Hello to my addition program");
        System.out.println("Adding a and b with values a("+a+") and b("+b+")="+(a+b));

    }

    public void subtraction( int a, int b){
        System.out.println("Hello to my subtraction program");
        System.out.println("Subtracting a and b with values a("+a+") and b("+b+")="+(a-b));

    }

    public void multiplication( int a, int b){
        System.out.println("Hello to my multiplication program");
        System.out.println("Multipling a and b with values a("+a+") and b("+b+")="+(a*b));
    }

    public void division( double a, double b){
        System.out.println("Hello to my division program");
        System.out.println("Dividing a and b with values a("+a+") and b("+b+")="+(a/b));
    }
    public void ADD(){
         System.out.println("Adding a and b with values a("+R+") and b("+T+")="+(R+T));

    }

    
    
    }
