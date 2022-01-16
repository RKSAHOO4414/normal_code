//16/11/2021
/*import java.util.*;
class Main
{
	public static void weveTraversal(int[][] mat)
	{
		/*for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[0].length; j++)
			{
				System.out.println(mat[i][j]);
			}
		}

		//column by column print
		for(int j=0; j<mat[0].length; j++)
		{
			if(j%2 == 0)
			{
				for(int i=0; i<mat.length; i++)
				{
					System.out.println(mat[i][j]);
				}
			}else{
				for(int i=mat.length-1; i>=0; i--)
				{
					System.out.println(mat[i][j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();

		int[][] mat=new int[n][m];

		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		weveTraversal(mat);
	}
}*/

/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		int[][] mat = new int[n][n];

		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		//Print diagonaly
		for(int gap=0; gap<mat[0].length; gap++)
		{
			for(int i=0, j=gap; j<mat[0].length; i++, j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}*/

/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] mat = new int[n][m];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}

		int frow=0, lrow=n-1, fcol=0, lcol=m-1;
		int count=0;

		while(count < n*m)
		{
			//left wall top to buttom
			for(int i=frow; i<=lrow; i++)
			{
				System.out.println(mat[i][fcol]);
				count++;
				if(count == n*m){
					return;
				}
			}
			fcol++;
			//buttom wall left to right
			for(int j=fcol; j<=lcol; j++)
			{
				System.out.println(mat[lrow][j]);
				count++;
				if(count == n*m){
					return;
				}
			}
			lrow--;
			//right wall buttom to top
			for(int i=lrow; i>=frow; i--)
			{
				System.out.println(mat[i][lcol]);
				count++;
				if(count == n*m){
					return;
				}
			}
			lcol--;
			//top wall right to left
			for(int j=lcol; j>=fcol; j--)
			{
				System.out.println(mat[frow][j]);
				count++;
				if(count == n*m){
					return;
				}
			}
			frow++;
		}
	}
}*/

//17/11/2021
//Exit Point
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m= sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		//directions
		//rigth -> 0, down -> 1, left -> 2, top -> 3
		int direction = 0, Currrow = 0, Currcol = 0;
		int previousrow = 0, previouscol = 0;

		//left wall se exit, top wall se exit, buttom wall se exit, right wall se exit
		while(Currrow >= 0 && Currrow < n && Currcol >= 0 && Currcol < m)
		{
			if(arr[Currrow][Currcol] == 1)
			{
				direction = (direction + 1) % 4;
			}

			previousrow=Currrow;
			previouscol=Currcol;

			if(direction == 0){
				//right
				Currcol++;
			}else if(direction == 1){
				//down
				Currrow++;
			}else if(direction == 2){
				//left
				Currcol--;
			}else{
				//top
				Currrow--;
			}
		}

		System.out.println(previousrow);
		System.out.println(previouscol);
	}
}*/

//Rotate by 90 degree
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		display(arr);
		System.out.println();
		transpose(arr);
		display(arr);
		System.out.println();
		swapcolumn(arr);
		display(arr);
	}

	public static void swap(int[][] arr, int i, int j)
	{
		int temp=arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=temp;
	}

	public static void transpose(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr[0].length; j++)
			{
				swap(arr, i, j);
			}
		}
	}

	public static void swap(int[][] arr, int i, int leftcolmn, int rightcolumn)
	{
		int temp=arr[i][leftcolmn];
		arr[i][leftcolmn] = arr[i][rightcolumn];
		arr[i][rightcolumn] = temp;
	}

	public static void swapcolumn(int[][] arr)
	{
		int leftcolmn=0, rightcolumn=arr[0].length-1;
		for(int i=0; i<arr[0].length; i++)
		{
			swap(arr, i, leftcolmn, rightcolumn);
		}
	}

	public static void display(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}*/

//Matrix Multiplication
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();

		System.out.println("Enter 1st mat : ");
		int[][] arr = new int[n][m];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter 2nd mat : ");
		int n1=sc.nextInt();
		int m1=sc.nextInt();
		int[][] arr1=new int[n1][m1];
		for(int i=0; i<n1; i++)
		{
			for(int j=0; j<m1; j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}

		if(m != n1)
		{
			System.out.println("Invalid input");
			return;
		}

		int[][] res=new int[n][m1];

		for(int i=0; i<res.length; i++)
		{
			for(int j=0; j<res[0].length; j++)
			{
				for(int k=0; k<m; k++) //m == n1
				{
					res[i][j] = res[i][j]+ (arr[i][k] * arr1[k][j]);
				}
			}
		}

		for(int i=0; i<res.length; i++)
		{
			for(int j=0; j<res[0].length; j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}*/

//Saddel price
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int[][] arr = new int[n][n];
		for(int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		boolean isSaddelAchived = false;
		for(int i=0; i<arr.length; i++)
		{
			//Minimum of Row i
			int min=Integer.MAX_VALUE, col=0;
			for(int j=0; j<arr[0].length; j++)
			{
				if(arr[i][j] < min)
				{
					min=arr[i][j];
					col=j;
				}
			}

			//Maximum of column j
			int max = Integer.MIN_VALUE;
			for(int k=0; k<arr[0].length; k++)
			{
				if(arr[k][col] > max)
				{
					max = arr[k][col];
				}
			}

			if(min == max)
			{
				System.out.println("Saddel Point : "+min);
				isSaddelAchived = true;
				break;
			}
		}

		if(isSaddelAchived == false)
			System.out.println("Invalid Input");
	}
}*/

//2nd approach
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] arr = new int[n][n];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		for(int i=0; i<arr.length; i++)
		{
			//finding minimum of ith row
			int minCol=0;
			for(int j=0; j<arr[0].length; j++)
			{
				if(arr[i][j] < arr[i][minCol])
				{
					minCol=j;
				}
			}

			//Finding maximum of jth column
			int maxRow =0;
			for(int k=0; k<arr[0].length; k++)
			{
				if(arr[k][minCol] > arr[maxRow][minCol])
				{
					maxRow=k;
				}
			}

			if(maxRow == i)
			{
				System.out.println("Saddel price : "+arr[maxRow][minCol]);
				return;
			}
		}

		System.out.println("Invalis Input ");
	}
}*/

//21/11/2021
//String - Array of character 
//65 - A, 90 - Z | 97 - a, 122 - z | 48 - 0, 57 - 9

//1st Programe
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		//String str = "hello";
		//System.out.println(str);
		//System.out.println(str.length());

		//for(int i=0; i<str.length(); i++)
		//{
		//	System.out.println(str.charAt(i));
		//}
		//concatination
		//String str1 = "raj";
		//String str2 = "kumar";
		//String str3;
		//str3 = str1 + " " + str2;
		//System.out.println(str1+10+20);
		//System.out.println(10+20+str1);

		int a=5;
		long b=a;
		System.out.println(b);
		int c = (int)b;
		System.out.println(c);
	}
}*/

//Upper case and Lower Case Convertion

/*class Main
{
	public static void main(String[] args) {
		String str = "pepCODinG";

		StringBuffer newstr = new StringBuffer(str);

		for(int i=0; i<str.length(); i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				newstr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}else if(Character.isUpperCase(str.charAt(i))) {
				newstr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println(newstr);
	}
}*/

//Toggel Case
/*import java.util.*;
class Main
{
	public static String toggelCase(String str)
	{
		String res = " ";

		for (int i=0; i<str.length();i++ ) {
			char ch = str.charAt(i);

			if(ch >= 'a' && ch <= 'z')		//is LowerCase
			{
				//appen UpperCase Character
				res = res + (char)(ch-32);
			}else {
				//append LowerCase Character
				res = res + (char)(ch+32);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String str = sc.next();
		String str = sc.nextLine();
		System.out.println(toggelCase(str));
	}
}*/

/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = "";

		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z')
			{
				res = res + (char)(ch-32);
			}else{
				res = res + (char)(ch+32);
			}
		}
		System.out.println(res);
	}
}*/

//Print All Palendromic substring
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i; j<str.length(); j++)
			{
				String substr = str.substring(i, j+1);
				if(isPalindrome(substr))
				{
					System.out.println(substr);
				}
			}
		}
	}

	public static boolean isPalindrome(String str)
	{
		int left=0, right=str.length()-1;

		while(left < right)
		{
			if(str.charAt(left) != str.charAt(right))
			{
				return false;
			}
			left++; right--;
		}
		return true;
	}
}*/

//23/11/2021
//-----------------------------------------------------------------
//String Interning
//String str = "Pepcoder"
//String str = new String("Hello");
//Advantage - Memory Westageing 
/*class Main
{
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");
		String str3 = "hello";
		String str4 = new String("hello");
		String str5 = "hello";

		System.out.println(str2 == str3);	// == Operator compare through address
		System.out.println(str3 == str5);
		System.out.println(str2 == str4);

		System.out.println(str2.equals(str3));	// equals() operator compare through content
		System.out.println(str3.equals(str5));
		System.out.println(str2.equals(str4));

		System.out.println(str1 == str3);
		System.out.println(str2.equals(str3));

	}
}*/

//String Array are immutable
//String Compression
/*class Main
{
	public static void main(String[] args) {
		String str = "wwwwaaaadexxxx";
		int count = 0;
		String res = "";

		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(i == 0  || ch != str.charAt(i-1))
			{
				res = res + ch;
			}
		}
		System.out.println(res);

		String ans = "";
		for(int i=0; i<str.length(); i++)
		{
			if(i==0 || str.charAt(i) != str.charAt(i-1))
			{
				if(i > 0 && count > 1){
					ans = ans+count;
				}
				ans = ans+str.charAt(i);
				count =0;
			}
			count++;
		}
		if(count > 1){
			ans = ans+count;
			
		}

		System.out.println(ans);
	}
}*/

/*class Main
{
	public static void main(String[] args) {
		String s= "0";
		for(int i =0; i<=10; i++)
		{
			s=s+i;
		}
		System.out.println(s);
		System.out.println(s.length());
	}
}*/

//Difference of two consicutive String
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans = "";

		for(int i=1; i<str.length(); i++)
		{
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);
			//System.out.println(curr);
			//System.out.println(prev);
			int gap = curr - prev;
			//System.out.println(gap);

			ans = ans + curr + gap;
		}
		System.out.println(ans);

	}
}*/

//String Builder
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		StringBuilder strb = new StringBuilder("hello");
		//System.out.println(strb);
		//System.out.println(strb.length());

		for(int i=0; i<strb.length(); i++)
		{
			System.out.print(strb.charAt(i)+" ");
		}

		//update
		strb.setCharAt(3,'d');
		System.out.println(strb);

		//delete
		strb.deleteCharAt(1);
		System.out.println(strb);

		//Insert
		strb.insert(0, 'h');
		System.out.println(strb);

		//append
		strb.append('1');
		System.out.println(strb);
	}
}*/

//String with difference of every two consicutive character
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		StringBuilder res = new StringBuilder("");

		for(int i=0; i<str.length() - 1; i++)
		{
			res.append(str.charAt(i));
			res.append(str.charAt(i+1) - str.charAt(i));
		}
		res.append(str.charAt(str.length() - 1));

		System.out.println(res);
	}
}*/

//ArrayList
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();

		int[] arr = {10, 20, 30, 40};
		for(int val : arr)
		{
			System.out.println(val);
		}

		ArrayList<Integer> arr = new ArrayList<>();
		//ArrayList<Integer> arr = new ArrayList<Integer>();

		//input
		for(int i=0; i<n; i++)
		{
			int x = sc.nextInt();
			arr.add(x);
		}

		//Update
		arr.set(3, 100);

		//delete
		arr.remove(1);

		//Traversal
		for(int i=0; i<arr.size(); i++)
		{
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
		//tostring()
		String str = arr.toString();
		System.out.println(str);
		System.out.println(arr);

		System.out.println();
		for(int val : arr)
		{
			System.out.println(val);
		}
	}
}*/

//Remove Primes
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			int x = sc.nextInt();
			arr.add(x);
		}

		for(int i=0; i<arr.size(); i++)
		{
			int p = arr.get(i);
			if(isPrime(p) == true)
			{
				arr.remove(i);
				i--;
			}else{
				System.out.print(p + " ");
			}
		}
	}
	public static boolean isPrime(int a)
		{
			for(int i=2; i*i <= a; i++)
			{
				if(a%i == 0)
				{
					return false;
				}
			}
			return true;
		}
}*/

//29/11/2021
//Recursion
//Princeple of Mathmatical Induction(PMI)
//Follow Notes

//Print Increaseing
/*import java.util.*;
class Main
{
	public static void printIncriseing(int n)
	{
		if(n == 0)
		{
			return;
		}

		printIncriseing(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printIncriseing(n);
	}
}*/

//Print Decreaseing
/*import java.util.*;
class Main
{
	public static void printDecreseing(int n)
	{
		if(n == 0)
			return;	

		System.out.println(n);
		printDecreseing(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printDecreseing(n);
	}
}*/

//print Increaseing Decreseing
/*import java.util.*;
class Main
{
	public static void printIncreseDecrese(int n)
	{
		if(n == 0)
			return;

		System.out.println(n);
		printIncreseDecrese(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printIncreseDecrese(n);
	}
}*/

//Factorial
/*import java.util.*;
class Main
{
	public static int factno(int n)
	{
		if(n == 0)
			return 1;
		int factnum = factno(n-1);

		return factnum*n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = factno(n);
		System.out.println(ans);
	}
}*/

//Power Linear
/*import java.util.*;
class Main
{
	public static int powerLinear(int x, int n)
	{
		if(n == 0)
			return 1;

		int pxnm1 = powerLinear(x, n-1);

		return pxnm1*x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();

		int ans = powerLinear(x, n);
		System.out.println(ans);
	}
}*/
//another method 2nd
/*import java.util.*;
class Main
{
	public static int power(int x, int n)
	{
		if(n == 0)
			return 1;

		int pxnby2 = power(x, n/2);

		if(n % 2 == 1)
			return x*pxnby2*pxnby2;
		else
			return pxnby2*pxnby2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();

		int ans = power(x, n);
		System.out.println(ans);
	}
}*/

//3rd method
/*import java.util.*;
class Main
{
	public static int power(int x, int n)
	{
		if(n == 0)
			return 1;

		if(n%2 == 1)
			return x * power(x, n/2) * power(x, n/2);
		else
			return power(x, n/2) * power(x, n/2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();

		int ans = power(x, n);
		System.out.println(ans);
	}
}*/

//or
/*import java.util.*;
class Main
{
	public static int power(int x, int n)
	{
		if(n == 0){
			return 1;
		}

		int xpn = power(x, n/2) * power(x, n/2);

		if(n%2 == 1){
			xpn = xpn * x;
		}

		return xpn;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();

		int ans = power(x, n);
		System.out.println(ans);
	}
}*/

//	30/11/2021
//Print ZigZag
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pzz(n);
	}

	public static void pzz(int n)
	{
		if(n == 0)
			return;

		System.out.println(n);
		pzz(n-1);
		System.out.println(n);
		pzz(n-1);
		System.out.println(n);
	}
}*/

//Tower of Hanoi
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}

		displayArr(arr, 0);
	}

	public static void displayArr(int[] arr, int idx)
	{
		if(idx == arr.length)
			return;

		//preorder -> Meeting Expactation
		System.out.println(arr[idx]);

		//Faith
		displayArr(arr, idx+1);
	}
}*/

//Array in Reverse
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

		reverseArr(arr, 0);
	}

	public static void reverseArr(int[] arr, int idx)
	{
		if(idx == arr.length)
			return;

		reverseArr(arr, idx+1);
		System.out.println(arr[idx]);
	}
}*/

//Maximum in an Array
/*import java.util.*;
class Main
{
	public static int maximumElement(int[] arr, int idx)
	{
		if(idx == arr.length)
			return Integer.MIN_VALUE;

		int maxTemp = maximumElement(arr, idx+1);

		return Math.max(maxTemp, arr[idx]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

		int max = maximumElement(arr, 0);
		System.out.println(max);
	}
}*/

//First index of a target element
/*import java.util.*;
class Main
{
	public static int firstIndex(int[] arr, int idx, int x)
	{
		if(idx == arr.length)
			return -1;

		if(arr[idx] == x)
			return idx;
		else
			return firstIndex(arr, idx+1, x);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

		int target = sc.nextInt();

		int firstidx = firstIndex(arr, 0, target);
		System.out.println(arr[firstidx]);
	}
}*/

//Last Index of an array target element
/*import java.util.*;
class Main
{
	public static int lastIndex(int[] arr, int idx, int x)
	{
		if(idx == arr.length)
			return -1;

		if(arr[idx] == x)
			return idx;
		else
			return lastIndex(arr, idx-1, x);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();

		System.out.println(lastIndex(arr, arr.length-1, target));
	}
}*/

//Tower of Hanoi
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int srcTower = sc.nextInt();
		int destTower = sc.nextInt();
		int auxTower = sc.nextInt();

		towerOfHanoi(n, srcTower, destTower, auxTower);
	}

	public static void towerOfHanoi(int n, int srcTower, int destTower, int auxTower)
	{
		if(n == 0)
			return;

		towerOfHanoi(n-1, srcTower, auxTower, destTower);	//2.1 
		System.out.println(n + "[" + srcTower + " -> " + destTower + "]");	//move nth disk from source to destination
		towerOfHanoi(n-1, auxTower, destTower, srcTower);	//
	}
}*/

//Display All Indices of an target element
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();

		int[] iarr = allIndices(arr, x, 0, 0);

		if(iarr.length == 0){
			System.out.println();
			return;
		}

		for(int i=0; i<iarr.length; i++)
		{
			System.out.println(iarr[i]);
		}
	}

	public static int[] allIndices(int[] arr, int target, int curridx, int count){
		if(curridx == arr.length){
			int[] base = new int[count];
			return base;
		}

		if(arr[curridx] == target)
		{
			int[] res = allIndices(arr, target, curridx+1, count+1);
			res[count] = curridx;
			return res;
		}else{
			int[] res = allIndices(arr, target, curridx+1, count+1);
			return res;
		}
	}
}*/

//05/12/2021
//Lecture - 2
//leetcode 69. Sqrt(x)

/*class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        
        long left = 1L, right = x;
        long floorSqrt = 1L;
        
        while(left <= right){
            long mid = left + (right - left) / 2L;
            long square = mid * mid;
            
            if(square == x){
                return (int)mid;
            }else if(square < x){
                floorSqrt = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return (int)floorSqrt;
    }
}*/

//leetcode Question no - 704		Binary Search
/*class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while(left <= right){
            int mid = (left+right)/2;
            
            if(nums[mid] == target){
                return mid;     //search successfull
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;       //unsuccessfull search
    }
}*/

//Find Trasition Point
//https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1
/*import java.util.*;

class Sorted_Array{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
			}
			GFG obj = new GFG();
			System.out.println(obj.transitionPoint(arr, n));
			t--;
		}
	}
}

class GFG{
	int transitionPoint(int[] arr, int n){
		int left =0, right = n-1;
    	int ans = -1;
    
    	while(left <= right){
        	int mid = (left+right)/2;
        	if(arr[mid] == 0){
            	left = mid + 1;
        	}else {
            	ans = mid;
            	right = mid - 1;
        	}
    	}
    	return ans;
	}
}*/

//leetcode Question no - 278	First Bad Version
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/*public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n, ans = -1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            
            if(isBadVersion(mid) == false){
                left = mid+1;
            }else {
                ans = mid;
                right = mid - 1;
            }
        }
        return ans;
    }
}*/

//leetcode Question no - 374	Guess Number Higher or Lower
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */
/*
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left =1, right = n;
        while(left <= right){
            int mid = left + (right - left)/2;
            
            int ans = guess(mid);
            if(ans == 0)
                return mid;
            else if(ans == -1)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
    
}*/

//https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/ceil-floor-official/ojquestion
//Floor & Ceil 		name in pepcodeing - Broken Economy
/*import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(ceil(arr, target));
		System.out.println(floor(arr, target));
	}
	public static int floor(int[] arr, int target){
		int left = 0, right = arr.length-1;
		while(left <= right){
			int mid = left + (right - left)/2;

			if(arr[mid] >= target){
				right = mid - 1;
			}else{
				left = mid + 1;
			}
		}
		return arr[right];
	}
	public static int ceil(int[] arr, int target){
		int left = 0, right = arr.length-1;
		while(left <= right){
			int mid = left + (right - left)/2;

			if(arr[mid] <= target){
				left = mid + 1;
			}else{
				right = mid - 1;
			}
		}
		return arr[left];
	}
}*/

//leetcode Question no - 34
//Find First and Last Position of Element in Sorted Array
/*class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        if(nums.length == 0) return ans;
        
        ans[0] = floor(nums, target);
        ans[1] = ceil(nums, target);
        
        return ans;
        //total occerance
        //total = arr[1] - arr[0];
    }
    public static int floor(int[] arr, int target){
        int left = 0, right = arr.length-1;
        int ans = -1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            
            if(arr[mid] == target){
                ans = mid;
                right = mid - 1;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
    public static int ceil(int[] arr, int target){
        int left = 0, right = arr.length-1;
        int ans = - 1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
                
            if(arr[mid] == target){
                ans = mid;
                left = left+1;
            }else if(arr[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
}*/

//Search Insert Position
//leetcode Question no - 35
/*class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left = 0, right = nums.length-1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }
 
}*/

//06/12/2021
//Lower Bound Upper Bound
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

		int target = sc.nextInt();
		System.out.println(upperBound(arr, target));
		System.out.println(lowerBound(arr, target));
	}

	public static int upperBound(int[] arr, int target){
		int left = 0, right = arr.length-1;
		int ans = arr.length;

		while(left <= right){
			int mid = left + (right - left)/2;

			if(arr[mid] >= target){
				ans = mid;
				right= mid-1;
			}else {
				left = mid+1;
			}
		}
		return ans;
	}

	public static int lowerBound(int[] arr, int target){
		int left = 0, right = arr.length - 1;

		while(left <= right){
			int mid = left + (right - left)/2;

			if(arr[mid] <= target){
				left = mid+1;
			}else{
				right = mid-1;
			}
		}
		return left;
	}
}*/

//Closest Element
//leet code Question no - 658
/*class Solution {
    public static int lowerBound(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        int ans = arr.length;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            
            if(arr[mid] >= target){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
    
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int second = lowerBound(arr, x);
        int first = second - 1;
        
        List<Integer> res = new ArrayList<>();
        
        while(first >= 0 && second < arr.length && k-- > 0){
            
            if(Math.abs(arr[first] - x) <= Math.abs(x - arr[second])){
                res.add(arr[first]);
                first--;
            }else{
                res.add(arr[second]);
                second++;
            }
        }
        
        while(first >= 0 && k-- > 0){
            res.add(arr[first]);
            first--;
        }
        
        while(second < arr.length && k-- > 0){
            res.add(arr[second]);
            second++;
        }
        
        Collections.sort(res);
        return res;
    }
}*/

//leetcode Question no - 475.	 Heaters
/*class Solution {
    public static int lowerBound(int[] arr, int target){
        int left = 0, right = arr.length-1;
        int ans = arr.length;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            
            if(arr[mid] >= target){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
    
    public static int closes(int[] arr, int target){
        int lb = lowerBound(arr, target);   //lb - lower bound
        
        if(lb == arr.length)    return arr[arr.length - 1];     //ceil doesnot exist
        else if(lb == 0)    return arr[0];      //floor does not exist
        
        else if(Math.abs(target - arr[lb]) < Math.abs(target - arr[lb - 1]))
            return arr[lb];
        
        else return arr[lb - 1];
    }
    
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<houses.length; i++){
            int closeHeater = closes(heaters, houses[i]);
            max = Math.max(max, Math.abs(closeHeater - houses[i]));
            
        }
        return max;
    }
}*/

//leetcode Question no - 367		Valid Perfect Square
/*class Solution {
    public static int mySqrt(int x){
        if(x == 0)
            return 0;
        
        long left = 1L, right = x;
        long floorSqrt = 1L;
        while(left <= right){
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            
            if(square == x){
                return (int)mid;
            }else if(square < x){
                floorSqrt = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return (int)floorSqrt;
    }
    
    public boolean isPerfectSquare(int num) {
        int floorSrt = mySqrt(num);
        if(floorSrt * floorSrt == num)
            return true;
        return false;
    }
}*/


//07/12/2021
//Get subsequency
/*import java.util.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> subsets = gss(0, str);
		System.out.println(subsets);
	}

	public static ArrayList<String> gss(int idx, String str){
		if(idx == str.length()){
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

		//Faith
		ArrayList<String> smallAns = gss(idx+1, str);
		ArrayList<String> ans = new ArrayList<>();

		//No
		for(String smallSubSet : smallAns){
			ans.add(smallSubSet);
		}

		//Yes
		for(String smallSubSet : smallAns){
			ans.add(str.charAt(idx) + smallSubSet);
		}
		return ans;
	}
}*/

//Get KPC(Get Keypad Combination)
/*import java.util.*;

class Main
{
	static String[] digitToChar = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> res = getKPC(0, str);
		System.out.println(res);
	}

	public static ArrayList<String> getKPC(int idx , String str)
	{
		//base case
		if(idx == str.length()){
			ArrayList<String> base = new ArrayList<String>();
			base.add("");
			return base;
		}

		//Faith
		ArrayList<String> smallAns = getKPC(idx+1, str);

		ArrayList<String> ans = new ArrayList<>();
		for(Character letter : digitToChar[str.charAt(idx) - '0'].toCharArray()){
		//digitToChar[str.charAt(idx) - '0']		//'6' - '0' = 6
			for(String smallStr : smallAns){
				ans.add(letter + smallStr);
			}
		}
		return ans;
	}
}*/

//Climb Stair Path
/*import java.util.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> res = getStairPath(n);
		System.out.println(res);
	}

	public static ArrayList<String> getStairPath(int n){
		//base case
		if(n == 0){
			//Positive base case -> 1 size
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}else if(n < 0){
			//negative base case -> 0 size
			ArrayList<String> base = new ArrayList<>();
			return base;
		}
		ArrayList<String> ans = new ArrayList<>();

		if(n-1 >= 0){
			ArrayList<String> smallAns1 = getStairPath(n-1);
			for(String str : smallAns1){
				ans.add(1 + str);
			}
		}
		if(n-2 >= 0){
			ArrayList<String> smallAns2 = getStairPath(n-2);
			for(String str : smallAns2){
				ans.add(2 + str);
			}
		}
		if(n-3 >= 0){
			ArrayList<String> smallAns3 = getStairPath(n-3);
			for(String str : smallAns3){
				ans.add(3 + str);
			}
		}

		return ans;
	}
}*/

//Get Mage Path
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		ArrayList<String> res = getMazePath(0, 0, row-1, col-1);
		System.out.println(res);
	}
	
	//sr - source row
	//sc - source column
	//dr - destination row
	//dc - destination column
	public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc){
		if(sr > dr || sc > dc){
				//Negetive Base case
				ArrayList<String> base = new ArrayList<>();
				return base;
		}

		if(sr == dr && sc == dc){
			//Positive Base case
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;	
		}

		ArrayList<String> res = new ArrayList<>();

		ArrayList<String> rightPath = getMazePath(sr, sc+1, dr, dc);
		for(String str : rightPath){
			res.add('h'+str);
		}

		ArrayList<String> downPath = getMazePath(sr+1, sc, dr, dc);
		for(String str : downPath){
			res.add('v'+str);
		}
		return res;
	}
}*/

//Get Maze Path with Jump 	//next time
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		ArrayList<String> res = getMazePathJump(0, 0, row-1, col-1);
		System.out.println(res);
	}

	public static ArrayList<String> getMazePathJump(int sr, int sc, int dr, int dc){
		if(sr == dr && sc == dc){
			//Positive Base case
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;	
		}

		ArrayList<String> ans = new ArrayList<>();

		//Horizontal Path
		for(int jump = 1; sc+jump <= dc; jump++){
			ArrayList<String> rightPath = getMazePathJump(sr, sc + jump, dr, dc);
			for(String str : rightPath){
				ans.add("h"+jump+str);
			}
		}
		//vertical path
		int jump = 1;
		while(sr + jump <= dr){
			ArrayList<String> downPath = getMazePathJump(sr+jump, sc, dr, dc);
			for(String str : downPath){
				ans.add("v"+jump+str);
			}
			jump++;
		}
		//diagonal path
		jump = 1;
		while(sr+jump <= dr && sc+jump <= dc){
			ArrayList<String> diagonalPath = getMazePathJump(sr+jump, sc + jump, dr, dc);
			for(String str : diagonalPath){
				ans.add("d"+jump+str);
			}
			jump++;
		}
		return ans;
	}
}*/

//Print Subsequences
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		printSS(0, input, "");
	}	

	public static void printSS(int idx, String input, String output){
		if(idx == input.length()){
			System.out.println(output);
			return;
		}

		char ch = input.charAt(idx);

		//Yes
		printSS(idx+1, input, output+ch);

		//No
		printSS(idx+1, input, output);
	}
}*/

//Print Keypad Combination
/*import java.util.*;
class Main
{
	static String[] digitToChar = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	static ArrayList<String> res = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printKPC(0, str, "");
		System.out.println(res);
	}

	public static void printKPC(int idx, String str, String output){
		if(idx == str.length()){
			//System.out.println(output);
			res.add(output);
			return;
		}

		for(Character letter : digitToChar[str.charAt(idx) - '0'].toCharArray()){
			printKPC(idx+1, str, output+letter);
		}
	}
}*/

//Print Permutations
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printPermutation(str, "");
	}

	public static void printPermutation(String input, String output){
		if(input.length() == 0){
			System.out.println(output);
			return;
		}

		for(int i=0; i<input.length(); i++){
			String newInput = input.substring(0, i)+input.substring(i+1);
			printPermutation(newInput, output+input.charAt(i));
		}
	}
}*/

//11/12/2021
//Binary Search
//Book allocation
/*import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int a[] = new int[n];

			for(int i=0; i<n; i++){
				a[i]=sc.nextInt();
			}
			int m=sc.nextInt();
			Main1 ob = new Main1();
			System.out.println(ob.findPages(a, n, m));
		}
	}
}
class Main1{
	public  static boolean isPossible(int[] pages, int books, int mid, int student){
		int currStd = 1, currPage = 0;

		for(int i=0; currStd<=student && i<books; i++){
			if(currPage + pages[i] <= mid){
				currPage += pages[i];
			}else{
				currStd++;
				currPage = pages[i];
			}
		}

		if(currStd > student)	return false;
		return true;
	}

	public static int maxOfArray(int[] pages, int books){
		int max = 0;
		for(int i=0; i<books; i++){
			max = Math.max(max, pages[i]);
		}
		return max;
	}

	public static int sumOfArray(int[] pages, int books){
		int sum=0;
		for(int i=0; i<books; i++){
			sum = sum + pages[i];
		}
		return sum;
	}

	public static int findPages(int[] pages, int books, int student){
		int low = maxOfArray(pages, books);
		int high = sumOfArray(pages, books);
		int ans = high;
		while(low <= high){
			int mid = low + (high - low)/2;

			if(isPossible(pages, books, mid, student) == true){
				ans = mid;
				high = mid - 1;
			}else{
				low = mid + 1;
			}
		}
		return ans;
	}
};*/

//13/12/2021
//Print Maze Path
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m = sc.nextInt();

		printMzePath(0, 0, n-1, m-1, "");
	}

	//sr - source row
	//sc - source column
	//dr - destination row
	//dc - destination column
	//psf - path so far
	public static void printMzePath(int sr, int sc, int dr, int dc, String psf)
	{
		if(sr > dr || sc > dc){
			//negative base case
			return;
		}
		if(sr == dr && sc == dc){
			//positive base case
			System.out.println(output);
			return;
		}

		printMzePath(sr, sc+1, dr, dc, output + "h");
		printMzePath(sr+1, sc, dr, dc, output + "v");
	}
}*/

//print Stair Path
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		printStairPath(n, "");
	}

	public static void printStairPath(int n, String path)
	{
		if(n == 0){
			System.out.println(path);
			return;
		}
		if(n < 0){
			return;
		}

		printStairPath(n-1, path + "1");
		printStairPath(n-2, path + "2");
		printStairPath(n-3, path + "3");
	}
}*/

//Print Encodeing
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printEncodeing(0, str, "");
	}

	public static void printEncodeing(int idx, String input, String output)
	{
		if(idx == input.length())
		{
			//positive base case
			System.out.println(output);
			return;
		}

		//corner case
		int ch1 = input.charAt(idx) - '0';
		if(ch1 >= 1 && ch1 <= 9){
			printEncodeing(idx+1, input, output+(char)('a' + ch1 - 1));		
		}

		if(idx+1 < input.length()){
			int ch2 = (input.charAt(idx) - '0')*10 + (input.charAt(idx+1) - '0');

			if(ch2 >= 10 && ch2 <= 26){
				printEncodeing(idx + 2, input, output + (char)('a' + ch2 - 1));
			}
		}
	}
}*/

//Target Sum Subset
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		int target = sc.nextInt();
		printTargetSumSubset(arr, 0, "", target);
	}

	public static void printTargetSumSubset(int[] arr, int idx, String set, int remtarget){
		if(idx == arr.length){
			if(remtarget == 0){
				System.out.println(set + ",");
			}
			return;
		}

		if(remtarget < 0){
			//pruning
			return;

		}

		printTargetSumSubset(arr, idx+1, set + arr[idx] + ", ", remtarget - arr[idx]);	//yes
		printTargetSumSubset(arr, idx+1, set, remtarget);		//no
	}
}*/

//Flood Fill
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		boolean[][] vis = new boolean[n][m];
		floodFill(arr, 0, 0, "", vis);
	}

	public static void floodFill(int[][] maze, int sr, int sc, String psf, boolean[][] vis)
	{
		int dr = maze.length-1;
		int dc = maze[0].length-1;
		if(sr > dr || sc > dc || sr<0 || sc<0 || maze[sr][sc] == 1 || vis[sr][sc] == true)
		{
			//negative base case
			return;
		}
		//if(maze[sr][sc] == 1){
		//	return;
		//}

		if(sr == dr && sc == dc)
		{
			//positive base case
			System.out.println(psf);
			return;
		}

		vis[sr][sc] = true;
		floodFill(maze, sr-1, sc, psf+"t", vis);	//top
		floodFill(maze, sr, sc-1, psf+"l", vis);	//left
		floodFill(maze, sr+1, sc, psf+"d", vis);	//down
		floodFill(maze, sr, sc+1, psf+"r", vis);	//right
		vis[sr][sc] = false;
	}
}*/

//N - Queen Problem
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] chess = new boolean[n][n];

		printNQueens(chess, "", 0);
	}
	public static boolean isQueenSafe(boolean[][] chess, int row, int col)
	{
		//upward column
		for(int i=0; i<row; i++)
		{
			if(chess[i][col] == true){
				return false;
			}
		}
		//upward left diagonal
		int i=row, j=col;
		while(i >= 0 && j >= 0)
		{
			if(chess[i][j] == true){
				return false;
			}
			i--; j--;
		}
		//upward right diagonal
		i=row; j=col;
		while(i >= 0 && j < chess.length){
			if(chess[i][j] == true){
				return false;
			}
			i--; j++;
		}
		return true;
	}

	public static void printNQueens(boolean[][] chess, String qsf, int row)
	{
		if(row == chess.length){
			System.out.println(qsf);
			return;
		}

		for(int col=0; col<chess.length; col++){
			if(isQueenSafe(chess, row, col) == true)
			{
				chess[row][col] = true;		//edge pre
				printNQueens(chess, qsf + row + "-" + col + ",", row + 1); 	//call
				chess[row][col] = false;	//edge post
			}
		}
	}
}*/

//Knight's Tour
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new SCanner(System.in);
		int n = sc.nextInt();
		int row = sc.nextInt();
		int col = sc.nextInt();

		int[][] arr = new int[n][n];
		printKnightsTour(arr, row, col, 1);
	}
	public static void printKnightsTour(int[][] arr, int row, int col, int mid)
	{
		
	}
}*/

//18/12/2021
//shell sort
//leet code Question no - 88 merge sorted array
/*class Solution
{
	public void merge(int[] nums1)
}*/

//leet code Question no - 912 


//19/12/2021
//Extra class Archit bhiya
//Minimum swap to sort




//count sort


/*---------------xxxxxxxxxxx DSA xxxxxxxxxxxxx---------------------*/
//03/01/2022 
//Time and Space complexity

//04/01/2022
//Bubble Sort
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		bubbleSort(arr);
		printArr(arr);
	}

	public static void bubbleSort(int[] arr){
		for(int iter=1; iter<arr.length; iter++){
			for(int j=0; j<arr.length-iter; j++){
				if(isCompareSmall(arr, j+1, j) == true){
					swap(arr, j+1, j);
				}
			}
		}
	}

	public static boolean isCompareSmall(int[] arr, int i, int j){
		if(arr[i] < arr[j]){
			return true;
		}else{
			return false;
		}
	}

	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArr(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}*/

//Selection Sort
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		selectionSort(arr);
		printArr(arr);
	}

	public static void selectionSort(int[] arr){
		for(int i=0; i<arr.length; i++){
			int minidx = i;
			for(int j=i+1; j<arr.length; j++){
				if(isSmaller(arr, j, minidx) == true){
					minidx = j;
				}
			}
			swap(arr, i, minidx);
		}
	}

	public static boolean isSmaller(int[] arr, int i, int j){
		if(arr[i] < arr[j]){
			return true;
		}else{
			return false;
		}
	}

	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArr(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}*/

//Insertion Sort
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		insertionSort(arr);
		printArr(arr);
	}

	public static void insertionSort(int[] arr){
		for(int i=1; i<arr.length; i++){
			for(int j=i-1; j>=0; j--){
				if(isGreater(arr, j, j+1) == true){
					swap(arr, j, j+1);
				}else{
					break;
				}
			}
		}
	}

	public static boolean isGreater(int[] arr, int i, int j){
		if(arr[i] > arr[j]){
			return true;
		}else{
			return false;
		}
	}

	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArr(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}*/

//07/01/2022
//Merge Two sorted Array 	//Two Pointer Technique
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0; i<arr1.length; i++){
			arr1[i] = sc.nextInt();
		}

		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for(int i=0; i<arr2.length; i++){
			arr2[i] = sc.nextInt();
		}

		int[] ans = mergeTwoSortedArray(arr1, arr2);
		for(int i=0; i<ans.length; i++){
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] mergeTwoSortedArray(int[] a, int[] b){
		int[] res = new int[a.length + b.length];

        int i=0;
        int j=0;
        int k=0;

        while(i < a.length && j < b.length)
        {
            if(a[i] <= b[j])
            {
                res[k++] = a[i++];		//post increment
            }else{
              res[k++] = b[j++];
            }
        }

        while(i < a.length)
        {
            res[k++] = a[i++];
        }
        while(j < b.length)
        {
            res[k++] = b[j++];
        }
        return res;
	}
}*/

//inplace sorting
/*bubble Sort
selection Sort
insertion Sort*/

//Merge Sort
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		int[] ans = mergeSort(arr, 0, arr.length-1);
		for(int i=0; i<ans.length; i++){
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] mergeSort(int[] arr,int left, int right){
		if(left == right){
			int[] base = new int[1];
			base[0] = arr[left];
			return base;
		}

		int mid = (left+right)/2;

		int[] leftSorted = mergeSort(arr, left, mid);
		int[] rightSorted = mergeSort(arr, mid+1, right);

		int[] sorted = mergeTwoSortedArray(leftSorted, rightSorted);
		return sorted;
	}

	public static int[] mergeTwoSortedArray(int[] leftSorted, int[] rightSorted){
		int l1 = leftSorted.length;
		int l2 = rightSorted.length;

		int[] res = new int[l1+l2];
		int i=0;
		int j=0;
		int k=0;

		while(i < l1 && j < l2){
			if(leftSorted[i] < rightSorted[j]){
				res[k++] = leftSorted[i++];
			}else{
				res[k++] = rightSorted[j++];
			}
		}

		while(i < l1){
			res[k++] = leftSorted[i++];
		}

		while(j < l2){
			res[k++] = rightSorted[j++];
		}

		return res;
	}
}*/

//recurence relation - T(n) = 2*T(n/2) + O(n)
/*T(n) = 2T(n/2) + O(n) } * 2^0
T(n/2) = 2T(n/4) + O(n/2) } * 2^1
T(n/4) = 2T(n/8) + O(n/4) } * 2^2
T(n/8) = 2T(n/16) + O(n/8) } * 2^3
.
.
.
t(1) = 2t(0) + o(n) } * 2^x
T(n) = (2^0 * n) + (2^1 * n/2) + (2^2 * n/4) + ... + (2^x * n/2^x) + (2^x * T(0))
	=n*x + 2^xk
	=nlog2n + 2^ log2n k
	=O(nlogn) + n*/
//calls^height + (pre + post)*height
//2log n + {k + n}*log n
//x + nlogn - O(n log n)

//Target Sum Pair 				//leet code - 167
/*import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		int target = sc.nextInt();
		int[] ans = twoSum(arr, target);
		for(int i=0; i<ans.length; i++){
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] twoSum(int[] arr, int target){
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] + arr[j] == target){
					return new int[]{i, j};
				}
			}
		}
		return null;
	}
}*/

//10/01/2022
//Partition an Array
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		int p = sc.nextInt();
		partitionAnArray(arr, p);
		printArr(arr);
	}

	public static void partitionAnArray(int[] arr, int pivot){
		int left = 0, right = 0;

		while(right < arr.length){
			if(arr[right] > pivot){
				right++;
			}else{
				swap(arr, right, left);
				left++;
				right++;
			}
		}
	}

	public static void swap(int[] arr, int right, int left){
		int temp = arr[right];
		arr[right] = arr[left];
		arr[left] = temp;
	}

	public static void printArr(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}*/

//sort 01 [Binary Array]
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		sort01(arr);
		printArray(arr);
	}

	public static void sort01(int[] arr){
		int left = 0;
		int right = 0;

		while(right < arr.length){
			if(arr[right] == 1){
				right++;
			}else{
				swap(arr, right, left);
				right++;
				left++;
			}
		}
	}

	public static void swap(int[] arr, int right, int left){
		int temp = arr[right];
		arr[right] = arr[left];
		arr[left] = temp;
	}

	public static void printArray(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}*/

/*i. Partition
	1. < =x, >xpn
	2. <x, >=x

ii. Sort 01
	1. 0's 1's
	2. R's R's
	3. -ve's +ve's
	4. 0's, Non Beard
	5. odd's & even's
*/

//Quick Sort
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		quickSort(arr, 0, arr.length-1);
		printArr(arr);
	}

	public static void quickSort(int[] arr, int lo, int hi){
		if(lo > hi){
			//no element -> base case -> already return
			return;
		}

		int pivotidx = partition(arr, arr[hi], lo, hi);
		//partition around last element -> last element is at current index

		quickSort(arr, lo, pivotidx-1);
		quickSort(arr, pivotidx+1, hi);
	}

	public static int partition(int[] arr, int pivot, int lo, int hi){
		System.out.println("pivot -> "+pivot);
		int i=lo;
		int j=lo;

		while(i <= hi){
			if(arr[lo] <= pivot){
				swap(arr, i, j);
				i++;
				j++;
			}else{
				i++;
			}
		}
		System.out.println("pivot index -> "+ (j-1));
		return (j-1);
	}

	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArr(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}*/

//12/01/2022
//Quick Select
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		int k = sc.nextInt();
		int ans =quickSelect(arr, 0, arr.length-1, k-1);
		System.out.println(ans);
	}

	public static int quickSelect(int[] arr, int lo, int hi, int k){
		if(lo == hi){
			return arr[lo];
		}

		int pivotIdx = partition(arr, arr[hi], lo, hi);
		if(pivotIdx == k){
			return arr[pivotIdx];
		}

		if(pivotIdx < k){
			return quickSelect(arr, pivotIdx+1, hi, k);
		}

		return quickSelect(arr, lo, pivotIdx-1, k);
	}

	public static int partition(int[] arr, int pivot, int lo, int hi){
		System.out.println("pivot -> "+pivot);

		int i=lo;
		int j=lo;
		while(i<=hi){
			if(arr[i] <= pivot){
				swap(arr, i, j);
				i++;
				j++;
			}else{
				i++;
			}
		}

		System.out.println("pivot index -> " + (j-1));
		return (j-1);
	}

	public static void swap(int[] arr, int i, int j){
		System.out.println("Swapping "+arr[i]+" and "+arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArr(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}*/

/*input -
5
7 
-2 
4 
1 
3
3*/

//Sort 012	(Dutch National Flag Algorithem){DNF Sort}		//leetcode - 75
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		sort012(arr);
		printArr(arr);
	}

	public static void sort012(int[] arr){
		int i=0, j=0, k=arr.length-1;

		while(j <= k){
			if(arr[j] == 0){
				swap(arr, i, j);
				i++;
				j++;
			}else if(arr[j] == 1){
				j++;
			}else{
				swap(arr, j, k);
				k--;
			}
		}
	}

	public static void swap(int[] arr, int i, int j){
		System.out.println("Swapping index -> "+i+" and index -> "+j);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArr(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}*/

/*012 variation
1. sort 0s, 1s, 2s
2. sort R, G, B
3. sort %3==0, %3==1, %3==2
4. dual pivot partitioning
5. Three way partitioning
*/
//count sort
/*import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		countSort(arr);
		printArr(arr);
	}

	public static void countSort(int[] arr){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++){
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}

		System.out.println(min);
		System.out.println(max);

		int[] freq = new int[max - min + 1];
		for(int i=0; i<arr.length; i++){
			int idx = arr[i] - min;
			freq[idx]++;
		}
		System.out.println(Arrays.toString(freq));
		int count = 0;
		for(int i=0; i<freq.length; i++){
			for(int j=0; j<freq[i]; j++){
				int val = i + min;
				arr[count] = val;
				count++;
			}
		}
	}

	public static void printArr(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}*/

//14/01/2022
//count sort with stability
/*import java.io.*;
import java.util.*;

class Main {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
   int[] freq = new int[max - min + 1];
		for(int i=0; i<arr.length; i++){
			int idx = arr[i] - min;
			freq[idx]++;
		}

		int[] prefSum = new int[max - min + 1];
		prefSum[0] = freq[0];
		
		for(int i=1; i<freq.length; i++){
			prefSum[i] = prefSum[i - 1] + freq[i];
		}

		int[] res = new int[arr.length];
		for(int i=arr.length-1; i>=0; i--){
			prefSum[arr[i] - min]--;
			int idx = prefSum[arr[i] - min];
			res[idx] = arr[i];
		}
		for(int i=0; i<arr.length; i++){
			arr[i] = res[i];
		}
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}*/

//Radix sort
import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		radixSort(arr);
		System.out.println();
		printArr(arr);
	}

	public static void radixSort(int[] arr){
		int max = Integer.MIN_VALUE;
		for(int val : arr) max = Math.max(max, val);

		int digits = (int)Math.log10(max) + 1;
		int maxPlaceValue = (int)Math.pow(10, digits - 1);

		for(int i=1; i<=maxPlaceValue; i*=10){
			System.out.println();
			countSort(arr, i);
		}
	}

	public static void countSort(int[] arr, int exp){
		System.out.print("After sorting on " + exp + " place -> ");

		int[] freq = new int[10];
		for(int i=0; i<arr.length; i++){
			int idx = (arr[i] / exp) % 10;
			freq[idx]++;
		}

		int[] prefSum = new int[10];
		prefSum[0] = freq[0];
		for(int i=1; i<freq.length; i++){
			prefSum[i] = prefSum[i - 1] + freq[i];
		}
		int[] res = new int[arr.length];
		for(int i=arr.length-1; i>=0; i--){
			prefSum[(arr[i] / exp) % 10]--;
			int idx = prefSum[(arr[i] / exp) % 10];
			res[idx] = arr[i];
		}

		for(int i=0; i<arr.length; i++){
			arr[i] = res[i];
		}

		printArr(arr);
	}

	public static void printArr(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}

//time complexity - O(n * log10max)

//Sort Dates	(HW)



//Binary Search
/*Array sorted - monotonic function - monotonic increaseing - strictly increaseing
														  - increaseing
								  - monotonic decreaseing - strictly decreaseing
								  						  - decreaseing
								  - Binary - 0s->1s
								  		   - 1s->0s*/
//linear search time complexity - O(N)
/*variation - Rotated Sorted Array
		  -	Bitonic Array 
		  -	Infinite/unbounded sorted array 
		  -	nearly sorted array*/
worst case - if half of search space is rejected
	T(n) = T(n/2) + O(1) => O(log2N)




















