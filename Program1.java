package com.assistedproject;

class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using default access specifier"); 
     } 
} 

public class Program1 {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 

	}
}

