// datatypes -->

public class MyClass {
    public static void main(String args[]) {
    int a=123456789;
    long b=1;
    
    float c=1.0f;//directly considered this value as double. that is why 'f' is mandatory to define float values.
    double d=1.0;
    
    System.out.println(c);
    System.out.println(d);
    
    
    }
    } 

// sum, product, difference and name -->

public class maths {
    public static void main(String args[]) {
      int x=1;
      int y=10;
      int z=x+y;

      System.out.println(z);
      
      
      int a=1;
      int b=3;
      float c=4.0f;
      float product=a*b*c;
      
      System.out.println(product);
      
      int e=5;
      int f=3;
      int g=e-f;
      
      System.out.println(g);

      String j = "Shrey Kumar";
      
      System.out.println(j);
    }
}

// method calling -->

public class MyClass {
    public static void main(String args[]) {
    MyClass myObject = new MyClass();//creating an object
    int a=1;
    int b=2;
    int sum=myObject.Sample(a,b); //calling a method ---> myObject.Sample(1,2);---->sum=3
    System.out.println("Sum="+sum);
    }
    
    public int Sample(int a, int b){//a=1, b=2
    return (a+b);//(1+2)=3
    }
    } 

    Write a program to return the product of two numbers in method Sample and print it in main method
    - Create object of your class in main method
    - Define two variables a=10, b=20
    - call method Sample which takes two arguments a,b and store the result in int variable product
    - Create method Sample which takes two arguments a,b and returns the product of a*b
    - print the product returned by Sample in main method.
    */
    
    public class MyClass {
    public static void main(String args[]) {
    MyClass myObject = new MyClass();//creating an object
    int a=10;
    int b=20;
    int product=myObject.Sample(a,b); //calling a method ---> myObject.Sample(1,2);---->sum=3
    System.out.println("Product="+product);
    }
    
    public int Sample(int a, int b){//a=1, b=2
    return (a*b);//(10*20)=2
    }
    } 


    // overloading -->
    public class MyClass{
        public static void main(String args[]){
        MyClass myObject=new MyClass();
        double a=10;
        int b=3;
        myObject.Product(10.0,3);//method overloading ---> Product(double, int)
        }
        public void Product(double a, int b){
        System.out.println("Sum ="+(a+b));
        }
        
        public void Product(int a, int b){
        System.out.println("Difference :"+(a-b));
        }
        } 

/*
Different data type of arguments
Different number of arguments

*/

public class MyClass{
    public static void main(String args[]){
    MyClass myObject=new MyClass();
    
    myObject.areaOfShape(4,5);//method overloading ---> Product(double, int)
    }
    public void areaOfShape(int side){//datatype is same, number of argument is different
    System.out.println("Square ="+(side*side));
    }
    
    public void areaOfShape(int l, int b){
    System.out.println("Rectangle :"+(l*b));
    }
    } 