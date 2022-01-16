//Write a Java program to find the duplicate values of an array of string values.
import java.util.Scanner;

class Exercise13 {
public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("How many element you want to enter :");
    	int n=sc.nextInt();
        String my_array[] = new String[n];
 		System.out.println("Enter "+n+" number element into an array");

 		for (int i=0; i<n; i++) {
 			my_array[i]=sc.next();
 		}
 		System.out.println("The array is :");
 		for (int i=0; i<my_array.length; i++) {
 			System.out.println(my_array[i]);
 		}

        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if( (my_array[i].equals(my_array[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+my_array[j]);
                }
            }
        }
    }    
}