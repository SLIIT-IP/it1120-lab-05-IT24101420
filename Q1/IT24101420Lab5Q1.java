import java.util.Scanner;
 public class IT24101420Lab5Q1 {
    public static void main (String[]args) {
      Scanner input = new Scanner(System.in);
    
       int int1,int2,int3,smallest_num,largest_num;
      
		System.out.print("Enter the first integer: ");
		int1 = input.nextInt();
	
		System.out.print("Enter the second integer: ");
		int2 = input.nextInt();

		System.out.print("Enter the third integer: ");
		int3 = input.nextInt();


		smallest_num = int1;
                if (int2<smallest_num) { smallest_num = int2; }
		if (int3<smallest_num) { smallest_num = int3; }

                largest_num = int1;
		if (int2>largest_num) { largest_num = int2; }
		if (int3>largest_num) { largest_num = int3; }
     
		System.out.println("User entered numbers are: " + int1 + " " + int2 + " " + int3 );
          
                System.out.println("The Smallest number is: " + snum );
                System.out.println("The largest number is: " + lnum );

   }
} 
		