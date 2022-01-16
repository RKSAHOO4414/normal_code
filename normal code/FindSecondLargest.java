//Java program to find second largest number in an array
import java.util.Arrays;
import java.util.Scanner;

class ArraySecondHighest {
	public static Scanner sc=new Scanner(System.in);
    public static void main(String args[]) {
    	System.out.println("How many number you can enter : ");
    	int n=sc.nextInt();
        int myIntArray[] = new int[n];
        System.out.println("Enter "+n+" elemnt into an array");
        for (int i=0; i<n; i++) {
        	myIntArray[i]=sc.nextInt();
        }
        System.out.println("The Element are : ");
        for (int i=0; i<myIntArray.length; i++) {
        	System.out.println(myIntArray[i]);
        }
        Arrays.sort(myIntArray);
        System.out.println("Second Highest "
                + myIntArray[myIntArray.length - 2]);
    }

}
//The logic is very simple. First sort the Array using sort method available in java.util.Arrays package. The second highest element is not located at index [arrayLength - 2]