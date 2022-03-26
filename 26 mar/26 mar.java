/*Memory allocation in JAVA
-Heap - contains objects - myObject
-stack - method, local variables - Sample()
-code - contains the bytecode - MyClass.class ---> bytecodes
-static - conatins static data/methods

How we are storing String values
Inside memory these are areas present in JVM:
Heap-- -s1(reference variable), s2(new object), s3( new object)
String constant Pool-- space inside heap memory(inside heap)*/
public class Main
{
	public static void main(String[] args) {
	    String s1 = "World"; //String constant pool
	    String s2 = new String("World");  //create another object even if the value is same
	    String s3 = "World";
	    String s4 = new String("World");
	    
	    System.out.println("Comparing = with new: "+(s1==s2));  
		System.out.println("Comparing = with =: "+(s1==s3));  //Both s1 and s2 treated as one object hence true
		System.out.println("equals(): "+s1.equals(s2));
		
		System.out.println("Length of s1: "+s1.length());
		System.out.println(s1.charAt(0));
		
		String s = "Simmi";
		System.out.println("s= "+s);  //Simmi
		s.concat("Goel");       //adds to existing string --> should be Simmi Goel
		System.out.println("s= "+s);  //Simmi Goel
		//String is immutable(cannot change) in java
	}
}


//class- template
//object- real world entity
//method - function/behaviour
//variables - properties
//data types
/*  if(condition1){
        
    }else if(condition2){
        
    }else{
        
    }
    
    
    if(condition){
        
    }else{
        
    }
switch(expression){
    case value1:
        ...
    break;
    case value2:
        ..
		break;
    default:
        ...
}

int a=10;
int b=20;
obj.Sample(a,b);//call non static method --obj.Sample(10,20)
Sample2();//call static method
static int a=10;
for(int i=0; i<5; i++){
	for(int j=0; j<5; j++){
		//pay this toll
    }
}
int a[] = new int[5];
//assign values using for loop
int a[]={1,2,3,4};
        
int a[][]= new int[5][5];
//use for loop to assign values
a[0][0]=1;....and so on
while, do-while
*/
        
    
//Method overloading
public class Main{
    public static void main(String[] args){
      Main obj=new Main();
      System.out.println("Sum of 2 numbers = "+obj.sum(10,20));
      System.out.println("Sum of 3 numbers = "+obj.sum(10,20, 30));
    }
    //Method overloading
    public int sum(int a, int b){//taking two numbers
        return (a+b);
    }
    public int sum(int a, int b, int c){//taking three numbers
        return (a+b+c);
    }
}


//Factorial of number
//4! = 4*3*2*1 = 24 factorial of 4
//2! = 2*1 = 2 factorial of 2
//3! = 3*2*1 = 6 factorial of 3
public class Main{
    public static void main(String[] args){
        int f = 1;  
        int n=5;//It is the number to calculate factorial    
        for(int i=1;i<=n;i++){    
            f=f*i;    
        }    
        System.out.println("Factorial of number is: "+f);    
    } 
}

//Find missing number from an array of n 1 to 6 present in sorted order.
//Given array is {1,2,3,5,6}
public class MyClass{
    public static void main(String[] args){
     int a[] = {1,2,3,5,6};//array starts from 1
     //original length= 6
     //current = 5
     //1+2+3+4+5+6=21 => n*(n+1)/2 => 6*(6+1)/2=>21
     //1+2+3+5+6=17
     //21-17=4
     //missing number ? =4
      int n=a.length+1;
      int sum=n*(n+1)/2;
      int temp=0;
      for(int i=0; i<a.length; i++){
          temp=temp+a[i];
      }
      System.out.println(sum-temp);
    }
}



/*
You are given Integer n, You have to convert it into string.
Please complete the partially completed code in the editor
If your code succesfully converts into a string then code will print "Good job"
Otherwise it will print "Wrong answer"
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        String s = Integer.toString(n);
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    } 
}

//Bitwise left and right shift
public class Main{
    public static void main(String[] args){
        int a = 12;  //10001(12 binary) --->11000 
        //<<- right shift
        //>>- left shift --- a<<1 --> move 1 bit to the left
        System.out.println("a<<1= "+(a<<1));
    } 
}