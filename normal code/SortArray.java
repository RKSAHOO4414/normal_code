//Following is the code to sort an int Array in Java in decreasing order. That means the highest will appear first and the smallest will be in last.
import java.util.Scanner;

class ArraySorting {
	
        public static Scanner scanner= new Scanner(System.in);
	
        public static void main(String args[]){
        		int n;
                System.out.println("How many integer you can enter ...");
                n=scanner.nextInt();
                int[] myIntArray = getIntegers(n);
                System.out.println("The sorted array is : ");
                sortArray(myIntArray);

                printArray(myIntArray);
        }
	
        public static int[] getIntegers(int number){
                System.out.println("Please Enter "+number+" integer values");
                int intArray[] = new int[number];
                for(int i=0; i<number; i++){
                    intArray[i] = scanner.nextInt();
                }
                return intArray;
        }
	
        public static void printArray(int[] intArray){
               for(int i=0; i<intArray.length; i++){
                     System.out.println(intArray[i]);
               }
        }
	
        public static void sortArray(int[] intArray){
                boolean flag = true;
                while(flag){
                        flag= false;
                        for(int i=0; i< intArray.length-1; i++){
                               if(intArray[i] <= intArray[i+1]){
                                        int temp = intArray[i];
                                        intArray[i] = intArray[i+1];
                                        intArray[i+1] = temp;
                                        flag = true;
                                }
                        }
                 }
        }

}