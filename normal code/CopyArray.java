//Java Code to Copy Array into Another Array

import java.util.Arrays;
import java.util.Scanner;

class ArrayCopy {
	public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
    	System.out.println("How many string you want to enter : ");
    	int n=sc.nextInt();
    	System.out.println("Enter "+n+" number of String to copy");
    	String myStringArray[] = new String[n];
    	for (int i=0; i<n; i++) {
    		myStringArray[i]=sc.nextLine();
    	}
    	System.out.println("The String are : ");
    	for (int i=0; i<myStringArray.length; i++) {
    		System.out.println(myStringArray[i]);
    	}

        System.out.println("Array " + Arrays.toString(myStringArray));
        String[] newStringArray = copyArray(myStringArray);
        System.out.println("Copied Array " + Arrays.toString(newStringArray));
    }

     public static String[] copyArray(String[] stringArray) {
        String[] newStringArray = new String[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
             newStringArray[i] = stringArray[i];
        }
        return newStringArray;
     }

}

/*2. Using copyOf method in java.util.Arrays package.
 
public class ArrayCopy {

    public static void main(String args[]) {
        String[] myStringArray = { "Alice", "Bob", "Tim", "John", "Denice" };
        System.out.println("Array " + Arrays.toString(myStringArray));
        String[] newStringArray = Arrays.copyOf(myStringArray, myStringArray.length);
        System.out.println("Copied Array " + Arrays.toString(newStringArray));
    }

}*/