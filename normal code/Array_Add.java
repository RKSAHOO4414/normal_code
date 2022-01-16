import java.util.Scanner;
class ArrayAdd
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n=sc.nextInt();
		
		String Arr[]=new String[n];
		System.out.println("Enter "+n+" number of string");
		for (int count=0; count<n; count++) {
			//System.out.println("Enter the number"+(count+1));
			Arr[n]=sc.next();
		}
		sc.close();
		System.out.println("Enter the number are : ");
		for (int count=0; count<n; count++) {
			System.out.println(Arr[n]);
		}
	}
}