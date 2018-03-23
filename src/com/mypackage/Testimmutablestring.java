package com.mypackage;
class Testimmutablestring{  
 public static void main(String args[]){  
   String s="Sachin";  
   String z = s.concat(" Tendulkar");//concat() method appends the string at the end  
   System.out.println(s);//will print Sachin because strings are immutable objects 
   System.out.println(z);
 }  
}  