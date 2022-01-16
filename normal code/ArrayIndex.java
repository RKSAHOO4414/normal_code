//Write a Java program to find the index of an array element.
import java.util.Scanner;

class Exercise6 {
       public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("How many ineger you want to enter :");
      int n=sc.nextInt();
      int my_array[] = new int[n];
      System.out.println("Enter "+n+" number of integer :");
      for (int i=0; i<n; i++) {
        my_array[i]=sc.nextInt();
      }
      System.out.println("This Array is : ");
      for (int i=0; i<my_array.length; i++) {
        System.out.println(my_array[i]);
      }
      System.out.println("Enter Number to find Index :");
      int k=sc.nextInt();

      System.out.println("Index position of "+k+" is: " + findIndex(my_array, k));
       }
}
