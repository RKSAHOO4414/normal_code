//Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
import java.util.*;
class Exercise26 {
     public static void main(String[] args) throws Exception {
     	Scanner sc=new Scanner(System.in);
     	System.out.println("Enter the number you want to create array : ");
     	int no=sc.nextInt();
        //int[] array_nums = {0,0,1,0,3,0,5,0,6};
        int array_nums[]=new int[no];
        System.out.println("Enter "+no+" number of element 0 and other number");
        for (int i=0; i<no; i++) {
        	array_nums[i]=sc.nextInt();
        }
         int i = 0;
		System.out.println("Original array: "+Arrays.toString(array_nums));
		/*for (int n : array_nums)
            System.out.print(n+"  ");*/
		
        for(int j = 0, l = array_nums.length; j < l;) {
            if(array_nums[j] == 0)
                j++;
            else {
                int temp = array_nums[i];
                array_nums[i] = array_nums[j];
                array_nums[j] = temp;
                i ++;
                j ++;
            }
        }
        while (i < array_nums.length)
            array_nums[i++] = 0;
		System.out.print("\nAfter moving 0's to the end of the array: \n");
        for (int n : array_nums)
            System.out.print(n+"  ");
			System.out.print("\n");
    }
}