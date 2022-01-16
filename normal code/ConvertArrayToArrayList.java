//Write a Java program to convert an array to ArrayList.
import java.util.ArrayList;
  import java.util.Arrays;
  import java.util.Scanner;

class Exercise20 {
  public static void  main(String[] args) 
  {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many string you want to enter :");
		int n=sc.nextInt();
  		String  my_array[] = new String[n];
  		System.out.println("Enter "+n+" String in the array");
  		for (int i=0; i<n; i++) {
  			my_array[i]=sc.next();
  		}
  		System.out.println("The Array is :");
  		for (int i=0; i<my_array.length; i++) {
  			System.out.println(my_array[i]);
  		}
  		ArrayList<String>  list = new ArrayList<String>(Arrays.asList(my_array));
  
  		System.out.println(list);
  }
}