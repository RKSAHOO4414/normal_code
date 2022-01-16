import java.util.Scanner;

class Exercise2 
{
	public static void main(String[] args) {      
		Scanner sc= new Scanner(System.in);
		System.out.println("How many number you can enter in array");
		int n=sc.nextInt();
		int my_array[] =new int[n] ;
		System.out.println("Enter "+n+" element into array");
		for (int i=0; i<n; i++) {
			
			my_array[i]=sc.nextInt();
		}
		System.out.println("The array is :");
		for (int i=0; i<my_array.length; i++) {
			System.out.println(my_array[i]);
		}
		int sum = 0;

		for (int i : my_array)
	    sum += i;
		System.out.println("The sum is " + sum);
	}
}