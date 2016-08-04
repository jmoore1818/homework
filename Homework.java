package com.homework;

public class Homework {

	public static void main (String[] args) {

		for (int i = 1; i <= 180; i++){
			if (((i % 2) == 0) && ((i % 4) == 0) && ((i % 5) == 0)){
				System.out.println("FizzBuzzBang");
	      
	      } else {
	    	  System.out.println(i);
	      }
	}     
	}
}