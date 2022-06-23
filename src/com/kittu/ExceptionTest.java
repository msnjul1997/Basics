package com.kittu;

public class ExceptionTest {
	 public static void main(String[] args) {  
	        try  
	        {  
	        int data=50/0; //may throw exception   
	        }  
	            //handling the exception  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("rest of the code");  
	    }  
	/*
	 * Arithmatic Exception
	 * public static void main(String args[]){ try{ //code that may raise exception
	 * int data=100/0; }catch(ArithmeticException e){System.out.println(e);} //rest
	 * code of the program System.out.println("rest of the code..."); }
	 */
	//NullpointerException
	/*
	 * public static void main(String[] args) { String str=null;
	 * System.out.println(str.charAt(10)); }
	 */
	/*
	 * StringOutOfBoundIndex exc.
	 * public static void main1(String[] args) { String str="Niha";
	 * System.out.println(str.charAt(10)); }
	 */

}
