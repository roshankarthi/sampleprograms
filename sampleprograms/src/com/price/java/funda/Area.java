package com.price.java.funda;

import java.util.Scanner;

public class Area {
	int breath;
	int height;
	float Areatriangle;
	
	
	void getinput() {
		Scanner sec =new Scanner(System.in);
		System.out.println("enter the breath");
		breath = sec.nextInt();
		System.out.println("enter the height");
		height = sec.nextInt();
		
	}
	void Areatriangle() {
		Areatriangle = (float) ((0.5)*breath*height);
		System.out.println(Areatriangle);
		
		
		
	}

}
