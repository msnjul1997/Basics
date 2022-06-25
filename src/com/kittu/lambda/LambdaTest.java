package com.kittu.lambda;

public class LambdaTest {
	public static void main(String[] args) {
		
		 // Lambda expression without return keyword. 
		    Addable ad1=(a,b)->(a+b);  
	        System.out.println(ad1.add(1,2));  
	          
	        // Lambda expression with return keyword.    
	       Addable ad2=(int a, int b)->{
	    	   return(a+b);
	       };
	       System.out.println(ad2.add(11, 22));
	 }  
}


