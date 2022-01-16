//Although there are inbuilt method in the commons.lang library using which we can remove the element in array with just a single statement , we will first approach this using a custom method to see how this is done internally.
//1. Removing array element with custom method.
import java.util.Arrays;
import java.util.Scanner;

class ArrayRemove {
	public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
    	int n;
    	System.out.println("how many number you enter : ");
    	n=sc.nextInt();
        int myIntArray[] = new int[n];
        System.out.println("Enter "+n+" elemnt into array");
        for (int i=0; i<n; i++) {
        	myIntArray[i]=sc.nextInt();
        }
        System.out.println("The Element are : ");
        for (int i=0; i<myIntArray.length; i++) {
        	System.out.println(myIntArray[i]);
        }
        System.out.println("Original Array " + Arrays.toString(myIntArray));
        System.out.println("Enter the element you want to remove : ");
        int n1=sc.nextInt();
        int index = findIndexOf(myIntArray, n1);
        int[] newIntArray = removeElement(myIntArray, index);
        System.out.println("New Array " + Arrays.toString(newIntArray));
    }

    public static int[] removeElement(int[] intArray, int index) {
        int[] myNewArray = new int[intArray.length - 1];
        for (int i = 0; i < index; i++) {
            myNewArray[i] = intArray[i];
        }
        for (int i = index + 1; i < intArray.length; i++) {
            myNewArray[i - 1] = intArray[i];
        }
        return myNewArray;
    }

    public static int findIndexOf(int[] intArray, int element) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == element)
                return i;
        }
        return -1;
    }

}
/*2. Using Commons lang utility method.
We can solve this using ArrayUtils API provided under apache commons lang package.
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class ArrayRemove1 {
    
    public static void main(String args[]){
        int[] myIntArray = { 12, 13, 14, 15, 16 };
        System.out.println("Original Array " + Arrays.toString(myIntArray));
        int[] newArray = ArrayUtils.removeElement(myIntArray, 14);
        System.out.println("New Array " + Arrays.toString(newArray));
    }
}*/