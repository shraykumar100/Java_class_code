// arithmetic operators

public class MyClass {
    public static void main(String args[]) {
    int a=1;//a=1----assigning value 1 to variable a
    double b=2.0;
    
    System.out.println("Multiply : "+(a*b));
    System.out.println("Mod : "+(a%b));
    System.out.println("Divide : "+(a/b));
    
    System.out.println("Sum=" +calculateSum(a,b));
    }
    
    public static double calculateSum(int a,double b){//calculateSum(1,2)
    //Write your JAVA code here
    return (a+b);//(1+2)
    } 
    } 


// conditional operators


public class MyClass {
public static void main(String args[]) {
System.out.println("2 > 3 ="+(2>3));//false
System.out.println("2 < 3 ="+(2<3));//true
System.out.println("2 == 3 ="+(2==3));//false
System.out.println("2 != 3 ="+(2!=3));//true

System.out.println("2 >= 3 ="+(2>=3));//false

System.out.println("2 <= 3 ="+(2<=3));//true


}

// if else with Logical operators -->

//Case 1 - when both are true AND 
if((1<2) && (2<3)){//both conditions are true
    System.out.println("AND : Both are true");
    }else{//both are not true
    System.out.println("AND : Both not true");
    }
    
    
    //Case 2 - when both are not true AND 
    if((1>2) && (2<3)){//both conditions are true
    System.out.println("AND : Both are true");
    }else{//both are not true
    System.out.println("AND : One of them is false that is why printing else");
    }
//Case 1 - when both are true OR 
if((1<2) || (2<3)){//both conditions are true
    System.out.println("OR: Both are true");
    }else{//both are not true
    System.out.println("OR: Both not true");
    }
    
    //Case 2 - when one of them is true OR 
    if((1>2) || (2<3)){//both conditions are true
    System.out.println("OR: One of them is true");
    }else{//both are not true
    System.out.println("OR: Both not true");
    }
    
    //Case 3 - when both are not true OR 
    if((1>2) || (2>3)){//both conditions are true
    System.out.println("OR: Both are true");
    }else{//both are not true
    System.out.println("OR: Both not true");
    }     

    //NOT
    int a=10;
    if(!true){//---> (true) ---> !(true)===> false
    System.out.println("true");
    }else{
    System.out.println("true converted to false by NOT");
    
    }
    } 
    System.out.println(!true);//false
System.out.println(true);//true
System.out.println(!false);//true
System.out.println(false);//false

//else if -->

if((1>2)){//false
    //execute if condition1 is true
    System.out.println("First if executed");
    }else if((1>2)) {//false
    //execute if condition1 is false but condition2 is true
    System.out.println("Else if executed");
    
    }else{
    //execute if both are false 
    System.out.println("Else executed");
    
    }
    } 

    public class MyClass {
        public static void main(String args[]) {
        if((1>2)){//false
        //execute if condition1 is true
        System.out.println("First if executed");
        }else if((1>2)) {//false
        //execute if condition1 is false but condition2 is true
        System.out.println("Else if executed");
        
        }else{
        //execute if both are false 
        System.out.println("Else executed");
        
        }
        }
        
        } 

//dry run-
//iteration 1 : when i is initialised to 0
//it checks for iteration 1 that i<5 , i.e., 0<5 ---> true
//that means print the value of i=0

//iteration 2: i=i+1 is executed---> 0=0+1 ---> now i=1
//it checks for iteration 2 that i<5, i.e. , 1<5 ----> true
//that means print the value of i=1

//iteration 3: i=i+1 is executed---> 1=1+1 ---> now i=2
//it checks for iteration 3 that i<5, i.e. , 2<5 ----> true
//that means print the value of i=2

//iteration 4: i=i+1 is executed---> 2=2+1 ---> now i=3
//it checks for iteration 3 that i<5, i.e. , 3<5 ----> true
//that means print the value of i=3

//iteration 5: i=i+1 is executed---> 3=3+1 ---> now i=4
//it checks for iteration 4 that i<5, i.e. , 4<5 ----> true
//that means print the value of i=4


//iteration 6: i=i+1 is executed---> 4=4+1 ---> now i=5
//it checks for iteration 5 that i<5, i.e. ,

// for loop --.

package com.practice;

public class MyClass {
    public static void main(String[] args){
        for(int i = 0; i <5; i++){
            System.out.println(("Value of i = "+i));
        }
}
}

// while loop -->

public class MyClass{
    public static void main(String[] a){
    int j=1;
    while(j<5){
    System.out.println("Value of j = "+j);
    j=j+1;
    }
    }
    } 


// while and do while looop -->

    public class MyClass{
        public static void main(String[] a){
        int j=1;
        do{
        System.out.println("Value of j = "+j);
        j=j+1;//1--->2--->3-->4-->5
        }while(j<1);
        
        int k=1;
        while(k<5){
        //k=k+1;
        System.out.println("Value of k = "+k);
        k=k+1;//1--->2--->3-->4-->5
        }
        }
        } 


// Z pattern -->

public class MyClass{
    public static void main(String[] a){
    int n=6;
    for(int r=0;r<n;r++){
    for(int c=0; c<n;c++){
    if(r==0 || r==n-1 || c==n-1-r){
    System.out.print("*");
    }else{
    System.out.print(" ");
    }
    }
    System.out.println();
    }
    }
    } 