// taking input from user -->

import java.util.*;
public class MyClass {
public static void main(String args[]) {
Scanner a=new Scanner(System.in);
// System.out.println("Enter the value of x =");
int y=a.nextInt();
// System.out.println("Enter the value of y =");
int x=a.nextInt();
System.out.println("Value of x = " + x);
System.out.println("Value of y = " + y);

System.out.println("Sum of x+y = " + (x+y));
}




}

// taking string input -->

import java.util.*;
public class MyClass {
public static void main(String args[]) {
Scanner a=new Scanner(System.in);
String name=a.nextLine();
System.out.println("Hello "+name);
}




} 

// taking string and parsing into integer -->

import java.util.*;
public class MyClass {
public static void main(String args[]) {
Scanner a=new Scanner(System.in);
String temp=a.nextLine();
int x=Integer.parseInt(temp);
System.out.println("Value of x = "+x);
}

} 

// Switch case -->

import java.util.*;
//WAP to take two numbers from the user as an input and then print the product
public class MyClass{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String name=sc.nextLine();

System.out.println("Entered Name = "+ name);
switch (name){
case "Dimple":
System.out.println("Hello = "+ name);
break;

case "Anu":
System.out.println("Hello = "+ name);
break;

default:
System.out.println("No person matched to say Hello");
}
}
} 

//OOPS - Concepts
1.Inheritance - parent -child relationship - extends keyword is used
Parent Class
---Child Class
public class Child_Class_Name extends Parent_Class_Name
2. Abstraction - hiding the details 
- abstract classes and interface
public abstract class MyClass{

}
public interface MyInterface{

}

3. Encapsulation - wrapping up of data
public class Employee{
String employeeName;(Simmi)
int salary;(10)
}
4. Polymorphism - many forms
-Method Overloading - compile time polymorphism - static binding
= same method signature with different method arguments
public void Sample(int a, int b)
public void Sample(int a)
-Method overriding - runtime polymorphism - dynamic binding
= exact method signature with no change in definition
public void display() --- in class A
public void display() --- in class B
5.Class - done
6.Object - done 

// array --.

public class Main
{
public static void main(String[] args) {
int a[]=new int[3];//data_type variable_name[]= new data_type[size];
int value=1;
System.out.println("Length of array ="+a.length);
for(int j=0; j<a.length;j++){
a[j]=value;
System.out.println("Array at index : "+j+" = "+a[j]);

}
}
} 

public class Main
{
public static void main(String[] args) {
int a[]=new int[15];//data_type variable_name[]= new data_type[size];
Scanner sc=new Scanner(System.in);
int a[] ={1,2,3};
System.out.println("Length of array ="+a.length);
for(int j=0; j<a.length;j++){
int value=sc.nextInt();
a[j]=value;
}
}
}

// binary operators -->

public class Main
{
public static void main(String[] args) {
int a=9; //Binary 1001
int b=8; //binary 1000
//--------------------------
// & 1000 =8
// | 1001 =9
//a=9 1001 ----> 0110

System.out.println(" a&b "+(a&b));
System.out.println(" a|b "+(a|b));
System.out.println(" ~a "+(~a));
}
} 

public class Main
{
public static void main(String[] args) {
int a=9; //Binary 1001
int b=8; //binary 1000
//--------------------------
// & 1000 =8
// | 1001 =9
// ^ 0001 =1
//a=9 1001 ----> 0110
// 
System.out.println(" a&b "+(a&b));
System.out.println(" a|b "+(a|b));
System.out.println(" ~a "+(~a));
System.out.println(" a^b "+(a^b));

}
} 