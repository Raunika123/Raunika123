package com.learnjava;

import com.learnjava.Constants;
import com.learnjava.Math;
import com.learnjava.Function;
import com.learnjava.Meals;



public final class App {
    int cA;
    int cB;

    private App(int firstVariable , int secondVariable) {
        //System.out.println("Constructor called with values " + firstVariable + " and " + secondVariable );
        cA = firstVariable ; 
        cB = secondVariable ;
    }

    public void mathOperations() {
        
        System.out.println("Subtracting b from a with values a("+cA+") and b("+cB+")="+ (cA-cB));
        
        
        System.out.println("Adding a and b with values a("+cA+") and b("+cB+")="+(cA+cB));
        
        
        System.out.println("Multiplying a and b with values a("+cA+") and b("+cB+")="+(cA*cB));
        
        double c = 19.0;
        double d = 10.0;
        System.out.println("Dividing c by d with values c(19) and d(10)="+(c/d));
           
    }

    public void addNumbers() {
        System.out.println("Adding a and b with values a("+cA+") and b("+cB+")="+(cA+cB));
        }
    
    public void subtractNumbers() {
        System.out.println("Subtracting b from a with values a("+cA+") and b("+cB+")="+ (cA-cB));
        }

        public void divideNumbers() {
           
        System.out.println("Dividing c by d with values c("+cA+") and d("+cB+")="+(cA/cB));
        }

        public void multiplyNumbers() {
            System.out.println("Multiplying a and b with values a("+cA+") and b("+cB+")="+(cA*cB));
        }

     public void addNumbers(int a , int b) {
         System.out.println("Adding a and b with values a("+a+") and b("+b+")="+(a+b));
     }

     public void multiplyNumbers(int a , int b) { 
       System.out.println("Multiplying a and b with values a("+a+") and b("+b+")="+(a*b));  
     }

     public void divideNumbers(double a , double b) {
        System.out.println("Dividing a by b with values c("+a+") and d("+b+")="+(a/b));
     }

     public void subtractNumbers(int a, int b) {
        System.out.println("Subtracting b from a with values a("+a+") and b("+b+")="+ (a-b));
        }

    /**
     * Says hello to the world.
     * @param <Meals>
     * @param args The arguments of the program.
     * @param b 
     * @param a 
     */
    public static void main(String[] args) {
    
        System.out.println("Hello to my maths Program");
        
       // App obj = new App(19,10);  
        // obj.multiplyNumbers();
       // obj.mathOperations(); 


        System.out.println("");

        App obj1 = new App(15,6); 
        //obj1.addNumbers();
        /*System.out.println("");
        obj1.addNumbers(9, 3);
        obj1.divideNumbers(2, 9);
        obj1.multiplyNumbers(8, 7); 
        obj1.subtractNumbers(5, 9);*/
        //obj1.addNumbers(100, 5); 
       // obj1.mathOperations(); 

      // App obj2=new App(90,30);
       //obj2.divideNumbers();

       //Constants con = new Constants();
       //int a = con.getfirst();
      //System.out.println("Recevied value from getfirst function = "+(a));
       //System.out.println("Using value of variable directly = "+con.FIRST);
       //System.out.println("Using value of variable directly using class = "+Constants.SECOND);

       //Constants.staticFunction();

       //Math math = new Math();
       //math.addtion();
       //math.subtraction();
       //math.divition();
       //math.multiplication();
      //math.addtion(5, 8);
      //math.division(5, 9);
      //math.multiplication(7, 8);
      //math.subtraction(7, 9);

      //math.addtion(0, 8);
      //math.division(5, 6);
      //math.multiplication(88, 8);
     // math.subtraction(77, 9);

     //Math math = new Math(1,2);
     //math.ADD();
    
     //Function function=new Function(6,7);
     //function.addnumbers();
    
     Meals meals = new Meals();
    meals.Monday();
    meals.Tuesday();
    meals.Wednesday();
    meals.Thursday();
    meals.Friday();
    meals.Saturday();
    meals.Sunday();
     }
}
