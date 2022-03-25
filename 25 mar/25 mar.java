//WAP to print even numbers in an array
public class Main{
	public static void main(String[] args) {
	    int[] array = {0,2,4,6,7,9,10};
	    
	    System.out.println("even numbers in array");
	    for(int i=0; i<array.length; i++){
	        //Iterating an array
	        if(array[i]%2==0){
		        System.out.println(array[i]);
	        }
	    }
	}
}


//nesting condition- one loop inside another loop
public class Main{
	public static void main(String[] args) {
	    for(int i=0; i<3; i++){
	        //i loop starts here
	        System.out.println("Inside i loop: "+i);
	        
	        //j loop inside i loop  
    	    for(int j=0; j<3; j++){
    	            //j loop starts here
    		      System.out.println("Inside j loop: "+j);
    		      //j loop ends here
    	    }
    	    
		    //i loop ends here 
	    }
	}
}



/*
Hello
World
World
Hello
World
World
*/
public class Main{
	public static void main(String[] args) {
	    for(int i=0; i<2; i++){
	        System.out.println("Hello"); 
    	    for(int j=0; j<2; j++){
    		      System.out.println("World");
    	    } 
	    }
	}
}



//Left sided Patterns
/*
 1 2 3 4     row column    
1*           i= 1   j= 1
2* *         i= 2   j= 1       2(i) 2(j)
3* * *       i= 3   j= 1       3(i) 2(j)   3(i) 3(j)  
4* * * *     i= 4   j= 1 (j)   4(i) 2(j)   4(i) 3(j)   4(i) 4(j) 

j<=i
*/
public class Main{
	public static void main(String[] args) {
	    for(int i=1; i<=4; i++){
    	    for(int j=1; j<=i; j++){
    		      System.out.print("*");
    	    }
    	    System.out.println();
	    }
	}
}


/*
*
**
***
****
*****
*/
public class Main{
	public static void main(String[] args) {
	    for(int i=1; i<=5; i++){
    	    for(int j=1; j<=i; j++){
    		      System.out.print("*");
    	    }
    	    System.out.println();
	    }
	}
}


/*
  1 2 3 4 5    row column    
1 1           i= 1   j= 1
2 1 2         i= 2   j= 1       2(i) 2(j)
3 1 2 3       i= 3   j= 1       3(i) 2(j)   3(i) 3(j)  
4 1 2 3 4     i= 4   j= 1 (j)   4(i) 2(j)   4(i) 3(j)   4(i) 4(j) 
5 1 2 3 4 5   i= 5   j= 1 (j)   5(i) 2(j)   5(i) 3(j)   5(i) 4(j) 5(i) 5(j)
*/
public class Main{
	public static void main(String[] args) {
	    for(int i=1; i<=5; i++){
    	    for(int j=1; j<=i; j++){
    		      System.out.print(j);
    	    }
    	    System.out.println();
	    }
	}
}




//2D array
/*
0 	i j    	1 i j
0 	2(0,0) 	2(0,1)
1 	2(1,0) 	2(1,1)
*/
public class Main{
	public static void main(String[] args) {
	    int a[][] = new int[2][2];  //a[i][j] --> a[2][2]
	    for(int i=0; i<=1; i++){  //row
    	    for(int j=0; j<=1; j++){  //column
    	        a[i][j] = 2;  //a[0][0]--> a[0][1]--> a[1][0]--> a[1][1]
    		    System.out.print(a[i][j]+" ");
    	    }
    	    System.out.println();
	    }
	}
}


/*
A A A A A 
A A A A A 
A A A A A 
A A A A A 
A A A A A 
*/
public class Main{
	public static void main(String[] args){
        char a[][]=new char[5][5];
        for(int i=0; i<5 ; i++){//row
            for(int j=0; j<5 ; j++){//column
                a[i][j]='A';
            }
        }
        
        for(int i=0; i<5 ; i++){//row
            for(int j=0; j<5 ; j++){//column
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}



/*Palindrome-
123 -->reverse -->321 --> 123==321 -->false
121 -->reverse -->121 --> 121==121 -->true
Original number == reversed number if returns true then it is palindrome

Algorithm = Steps to solve problem
1. Create a variable to assign num=123
2. Create a temporary variable and store the value of num
3. Think and write logic to reverse number, i.e 321
4. Compare num==temporary variable
5. if step 4 returns true --> print "Palindrome"
6. if step 4 returns false --> print "Not Palindrome"

hint: mod operator
*/
public class Main{
	public static void main(String[] args){
        int number = 121;
        int temporary = number;
        int reverse = 0;
        while(number>0){
            int remainder = number%10;
            reverse = reverse*10+remainder;
            number= number/10;
        }
        if(temporary==reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
	}
}

public class Main{
	public static void main(String[] args){
        String num = "123";
        String reverseNum = "";
        for(int i=num.length()-1; i>=0; i--){
            reverseNum=reverseNum+num.charAt(i);
        }
        if(num.equals(reverseNum)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
	}
}



