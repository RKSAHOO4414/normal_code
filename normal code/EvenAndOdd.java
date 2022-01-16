//Write a Java program to find the number of even and odd integers in a given array of integers.
import java.util.*; 
 class Exercise27 {
 public static void main(String[] args)
 {
 	Scanner sc= new Scanner(System.in);
 	System.out.println("Enter the number you want to create array :");
 	int n= sc.nextInt();
 	System.out.println("Enter "+n+" number of element into an array :");

    int array_nums[] = new int[n];
    for (int i=0; i<n; i++) {
 		array_nums[i]=sc.nextInt();
 	}
 	
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int ctr = 0;
	for(int i = 0; i < array_nums.length; i++)
	{
		if(array_nums[i] % 2 == 0)
			ctr++;
	}
	System.out.println("Number of even numbers : "+ctr);
	System.out.println("Number of odd numbers  : "+(array_nums.length-ctr));
 }
}