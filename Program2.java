package com.assistedproject;

class accessspecifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class Program2 {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		accessspecifier  obj = new accessspecifier(); 
        //trying to access private method of another class 
        //obj.display();

	}
}


