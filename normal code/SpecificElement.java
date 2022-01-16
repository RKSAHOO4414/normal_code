//Following is the Java code to check if your array contains any specific element.
import java.util.Scanner;
class ArrayContains {
		public static Scanner sc=new Scanner(System.in);
      public static void main(String args[]){
      			int no;
      			System.out.println("how many integer you can enter in an array ...");
      			no=sc.nextInt();
      			System.out.println("Enter "+no+" Integer value");
                int myIntArray[] = new int[no];
                for (int i=0; i<no; i++) {
                	myIntArray[i]=sc.nextInt();
                }
                System.out.println("The Element are : ");
                for (int i=0; i<myIntArray.length; i++) {
                	System.out.println(myIntArray[i]);
                }
                System.out.println("enter the number you can find in array ...");
                int number = sc.nextInt();
                if(contains(myIntArray,number)){
                     System.out.println("Number "+number+" is present in array.");
                }else{
                     System.out.println("Number "+number+" not found in array.");
                }
       }
	
       public static boolean contains(int[] intArray, int number){
               for(int i = 0; i < intArray.length; i++){
                   if(intArray[i] == number){
                      return true;
                    }
                }
            return false;
      }
}
/*Method contains returns true if the element is found and returns false if the element is not found. The above code does not use library method to find the element.
Using java.util.Arrays package
There is another fast approach to solve this using binarySearch method that is available in java.util.Arrays package
import java.util.Arrays;

public class ArrayContains {
	
        public static void main(String args[]){
             int[] myIntArray = {43,32,53,23,12,34,3,12,43,32};
             int number = 362;
             Arrays.sort(myIntArray);
             if(Arrays.binarySearch(myIntArray, number) >= 0){
                 System.out.println("Number "+number+" is present in array.");
             }else{
                 System.out.println("Number "+number+" not found in array.");
             }
        }
}*/