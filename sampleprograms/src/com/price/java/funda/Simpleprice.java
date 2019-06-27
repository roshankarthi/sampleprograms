package com.price.java.funda;
import java.util.Scanner;

public class Simpleprice {
	int productprice;
	int discountrate;
	float discountamount;
	float saleprice;
	
	
	void getInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the productprice");
		productprice = scan.nextInt();
		System.out.println("enter the discountrate");
		discountrate = scan.nextInt();
		
		
		
	}
	void display() {
		discountamount=(productprice*discountrate/100);
		
		System.out.println(discountamount);
		saleprice = productprice-discountamount;
		System.out.println(saleprice);
		
		
	}

}
