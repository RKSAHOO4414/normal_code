//Java program to find duplicate elements in an String array.
import java.util.Scanner;

class findDuplicate {
	public static Scanner sc=new Scanner(System.in);
    public static void main(String args[]) {
    	System.out.println("how many string you want to enter : ");
    	int n=sc.nextInt();
    	System.out.println("Enter "+n+" number of string");
        String myStringArray[] = new String[n];
        for (int i=0; i<n; i++) {
    		myStringArray[i]=sc.next();	
    	}
    	System.out.println("The Strings Are : ");
    	for (int i=0; i<myStringArray.length; i++) {
    		System.out.println(myStringArray[i]);
    	}
        for (int i = 0; i < myStringArray.length; i++) {
            String toCompare = myStringArray[i];
            for (int j = i + 1; j < myStringArray.length; j++) {
                if (toCompare.equals(myStringArray[j])) {
                    System.out.println("Duplicate Name " + toCompare);
                }
            }
        }
    }
}