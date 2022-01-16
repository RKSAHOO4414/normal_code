//Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.
import java.util.*; 
class Exercise28 {
 public static void main(String[] args)
 {
 	Scanner sc = new Scanner(System.in);
 	System.out.println("Enter the number you want create array :");
 	int n=sc.nextInt();
    int array_nums[] = new int[n];
    System.out.println("Enter "+n+" number of element :");
    for (int i=0; i<n; i++) {
    	array_nums[i]=sc.nextInt();
    }
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 

	
	int max_val = array_nums[0];
	int min = array_nums[0];
	for(int i = 1; i < array_nums.length; i++)
	{
		if(array_nums[i] > max_val)
			max_val = array_nums[i];
		else if(array_nums[i] < min)
			min = array_nums[i];
	}
	System.out.println("Difference between the largest and smallest values of the said array: "+(max_val-min));	
 }
}