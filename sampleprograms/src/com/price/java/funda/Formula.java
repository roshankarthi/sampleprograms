package com.price.java.funda;

import java.util.Scanner;

public class Formula {
	int x1;
	int x2;
	int y1,y2;
	double d;
	float m;
	
	void getinput() {
		Scanner fes = new Scanner(System.in);
		System.out.println("enter the number of x1");
		 x1= fes.nextInt();
		 System.out.println("enter the number of x2");
		 x2 = fes.nextInt();
		 System.out.println("enter the number of y1");
		 y1 = fes.nextInt();
		 System.out.println("enter the number of y2");
		 y2 = fes.nextInt();
		
	}
    void formula() {
    	d = Math.sqrt((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
    	System.out.println(d);
    	m= ((y2-y1)/(x2-x1));
    	System.out.println(m);
    	
    	
    	
    }
}
