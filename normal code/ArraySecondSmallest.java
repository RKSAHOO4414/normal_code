//Write a Java program to find the second smallest element in an array.import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

class Exercise18 {
  public static void main(String[] args) {
  	Scanner sc=new Scanner(System.in);
  	System.out.println("How many integer you want to enter in an array :");
  	int n=sc.nextInt();
    int my_array[] = new int[n];
    System.out.println("Enter "+n+" number of element into an array :");
    for (int i=0; i<n; i++) {
    	my_array[i]=sc.nextInt();
    }
    System.out.println("The array is :");
    for (int i=0; i<n; i++) {
    	System.out.println(my_array[i]);
    }

    System.out.println("Original numeric array : "+Arrays.toString(my_array));
    int min = Integer.MAX_VALUE;
    int second_min = Integer.MAX_VALUE;
    for (int i = 0; i < my_array.length; i++) {
        if(my_array[i]==min){
          second_min=min;
        } else if (my_array[i] < min) {
            second_min = min;
            min = my_array[i];
        } else if (my_array[i] < second_min) {
            second_min = my_array[i];
        }

    }
    System.out.println("Second lowest number is : " + second_min);
    }
}