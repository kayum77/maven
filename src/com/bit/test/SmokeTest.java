package com.bit.test;

public class SmokeTest {
	
public static void main(String[] args) {
	
	Calculator cl = new Calculator();
	cl.addition();
	cl.division();
	cl.something();
	
	
	
	//nested loop
	for(int i=0; i<4; i++) {
	System.out.println("value of I is :"+i);	
		
	for(int j =0; j<=2; j++) {
	System.out.println("value of j :"+j);	
		
	}
	
	
	}
	
}
	

}
