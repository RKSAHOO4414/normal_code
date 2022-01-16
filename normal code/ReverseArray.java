//Following is the Java code to reverse the elements of an array by writing a self custom method.
import java.util.Arrays;
import java.util.Scanner;

class ArrayReverse {
	public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
    	int n;
    	System.out.println("How many integer you can enter : ");
    	n=sc.nextInt();
        int myIntArray[] = new int[n];
        System.out.println("Enter "+n+" Element in an array");
        for (int i=0; i<n; i++) {
        	myIntArray[i]=sc.nextInt();
        }
        System.out.println("The element are : ");
        for (int i=0; i<myIntArray.length; i++) {
        	System.out.println(myIntArray[i]);
        }
        System.out.println("Original Array " + Arrays.toString(myIntArray));
        // Reverse Array
        int temp;
        int ArraySize = myIntArray.length;
        for (int i = 0; i < (ArraySize / 2); i++) {
            temp = myIntArray[i];
            myIntArray[i] = myIntArray[ArraySize - (i + 1)];
            myIntArray[ArraySize - (i + 1)] = temp;
        }
        System.out.println("Reversed Array " + Arrays.toString(myIntArray));
    }

}

/*2. Using reverse Method from Commons.lang
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayReverse {

    public static void main(String args[]) {
        int[] myIntArray = { 43, 32, 53, 23, 12, 34, 3, 12, 43, 32 };
        System.out.println("Original Array " + Arrays.toString(myIntArray));
        // Reverse Array
        ArrayUtils.reverse(myIntArray);
        System.out.println("Reversed Array " + Arrays.toString(myIntArray));
    }

}*/