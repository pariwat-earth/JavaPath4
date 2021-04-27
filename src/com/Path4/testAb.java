package com.Path4;

abstract class Abstract {
    public void sayHello(){
        System.out.println( "Hello World" );
    }   
    abstract void sayYes();
}
 
class Sample extends Abstract  {
    public void sayYes(){
        System.out.println("yes men");
    }
}
 
public class testAb {
	 public static void main(String args[]){
	        Sample s = new Sample();
	        s.sayHello();
	        s.sayYes();
	    }   
}
