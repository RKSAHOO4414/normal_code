//Write a Java program to insert an element (specific position) into an array.

import java.util.Arrays; 
import java.util.Scanner;

class Exercise9 {
 
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("How many element enter in array");
	int n=sc.nextInt();
	System.out.println("enter "+n+" number of element :");
   int my_array[] = new int[n];
   for (int i=0; i<n; i++) {
   	my_array[i]=sc.nextInt();
   }
   System.out.println("Thsi Array is :");
   for (int i=0; i<n; i++) {
   	System.out.println(my_array[i]);
   }

    // Insert an element in 3rd position of the array (index->2, value->5)
   
   System.out.println("Enter the index you want to enter :");
   int Index_position = sc.nextInt();
   System.out.println("Enter the new value you want to enter :");
   int newValue    = sc.nextInt();

  System.out.println("Original Array : "+Arrays.toString(my_array));     
   
  for(int i=my_array.length-1; i > Index_position; i--){
    my_array[i] = my_array[i-1];
   }
   my_array[Index_position] = newValue;
   System.out.println("New Array: "+Arrays.toString(my_array));
 }
 }