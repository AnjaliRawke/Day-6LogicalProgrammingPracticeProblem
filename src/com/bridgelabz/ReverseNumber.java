package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
	public void ReverseNum()  
	{  
	int number, reverse = 0;  
	 Scanner Input = new Scanner(System.in);
     System.out.print("Enter a Number: ");
     number = Input.nextInt();
	while(number != 0)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
	  
public static void main(String[] args) {
	ReverseNumber Obj=new ReverseNumber();
	Obj.ReverseNum();
}
}
	
