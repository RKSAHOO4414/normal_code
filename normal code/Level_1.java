/*Data Type
-----------------------
int - 4 byte
char - 2 byte
float - 4 byte
double - 8 byte
long - 8 byte
byte - 1 byte
short - 2 byte
boolean - 1 bit
*/

//2D Array
//------------------------------------------------
//2D Array Demo
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				System.out.print(arr[i][j] + " ");
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
		int n1 = sc.nextInt();
		int m1 = sc.nextInt();
		int[][] arr1 = new int[n1][m1];
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[0].length; j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		int n2 = sc.nextInt();
		int m2 = sc.nextInt();
		int[][] arr2 = new int[n2][m2];
		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr2[0].length; j++)
			{
				arr2[i][j] = sc.nextInt();
			}
		}

		if(m1 != n2)
		{
			System.out.println("Invalid input");
			return;
		}

		int[][] prd = new int[n1][m2];
		for(int i=0; i<prd.length; i++)
		{
			for(int j=0; j<prd[0].length; j++)
			{
				int sum = 0;
				for(int k=0; k<m1; k++)
				{
					sum += arr1[i][k] * arr2[k][j];
				}
				prd[i][j] = sum;
			}
		}

		for(int i=0; i<prd.length; i++)
		{
			for(int j=0; j<prd[0].length; j++)
			{
				System.out.print(prd[i][j] + " ");
			}
			System.out.println();
		}
	}
}*/

//The State of Wakanda
//wave traversal
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		for(int j=0; j<arr[0].length; j++)
		{
			if(j%2 == 0){
				for(int i=0; i<arr.length; i++)
				{
					System.out.println(arr[i][j]);
				}
			}else{
				for(int i=arr.length-1; i>=0; i--)
				{
					System.out.println(arr[i][j]);
				}
			}
		}
	}
}*/

//Spiral Display
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		int minr = 0;
		int minc = 0;
		int maxr = arr.length-1;
		int maxc = arr[0].length-1;
		int tne = n*m;
		int count = 0;

		while(count < tne)
		{
			//left wall
			for(int i=minr, j= minc; i<=maxr && count < tne; i++)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			minc++;

			//buttom wall
			for(int i=maxr, j=minc; j<=maxc && count < tne; j++)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			maxr--;

			//right wall
			for(int i=maxr, j=maxc; i>=minr && count < tne; i--)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			maxc--;

			//top wall
			for(int i=minr, j=maxc; j>=minc && count < tne; j--)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			minr++;

		}

	}
}*/

//Exit Point of Matrix
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		//0 - e, 1 - s, 2 - w, 3 - n

		int dir = 0;
		int i=0;
		int j=0;

		while(true)
		{
			dir = (dir + arr[i][j]) % 4;

			if(dir == 0){
				j++;
			}else if(dir == 1){
				i++;
			}else if(dir == 2){
				j--;
			}else if(dir == 3){
				i--;
			}

			if(i < 0){
				i++;
				break;
			}else if(j < 0){
				j++;
				break;
			}else if(i == arr.length){
				i--;
				break;
			}else if(j == arr[0].length){
				j--;
				break;
			}
		}
		System.out.println(i);
		System.out.println(j);
	}
}
input - 4 4 0 0 1 0 1 0 0 0 0 0 0 0 1 0 1 0
*/

//Rotate by 90 degree
//Transpose a matrix - first row - last column
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
		System.out.println();
		display(arr);
		
		//Transpose matrix
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr[0].length; j++)
			{
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		System.out.println();
		System.out.println("Transpose Matrix");
		display(arr);

		for(int i=0; i<arr.length; i++)
		{
			int li = 0;
			int ri = arr[0].length -1;
			while(li < ri)
			{
				int temp = arr[i][li];
				arr[i][li] = arr[i][ri];
				arr[i][ri] = temp;

				li++;
				ri--;
			}
		}
		System.out.println();
		System.out.println("Rotate 90 degree");
		display(arr);

	}

	public static void display(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}*/

/*input - 4 11 12 13 14 21 22 23 24 31 32 33 34 41 42 43 44*/

//Ring Rotate
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		int s = sc.nextInt();
		int r = sc.nextInt();

		shellRotate(arr, s, r);
		display(arr);
	}

	public static void shellRotate(int[][] arr, int s, int r)
	{
		int[] oned = fillOnedFromShell(arr, s);
		rotate(oned, r);
		fillShellFromOned(arr, s, oned);
	}

	public static int[] fillOnedFromShell(int[][] arr, int s)
	{
		int minr = s - 1;
		int minc = s-1;
		int maxr = arr.length - s;
		int maxc = arr.length - s;

		int sz = 2 * (maxr - minr + maxc - minc);
		int[] oned = new int[sz];
		int idx = 0;
		//lw
		for(int i=minr, j=minc; i<=maxr; i++)
		{
			oned[idx]=arr[i][j];
			idx++;
		}

		//bw
		for(int i=maxr, j=minc+1; j<=maxc; j++)
		{
			oned[idx]=arr[i][j];
			idx++;
		}

		//rw
		for(int i=maxr-1, j=maxc; i>=minr; i--)
		{
			oned[idx]=arr[i][j];
			idx++;
		}

		//tw
		for(int i=minr, j=maxc-1; j>=minc+1; j--)
		{
			oned[idx]=arr[i][j];
			idx++;
		}

		return oned;
	}

	public static void fillShellFromOned(int[][] arr, int s, int[] oned)
	{
		int minr = s - 1;
		int minc = s-1;
		int maxr = arr.length - s;
		int maxc = arr.length - s;

		int idx = 0;
		//lw
		for(int i=minr, j=minc; i<=maxr; i++)
		{
			arr[i][j] = oned[idx];
			idx++;
		}

		//bw
		for(int i=maxr, j=minc+1; j<=maxc; j++)
		{
			arr[i][j] = oned[idx];
			idx++;
		}

		//rw
		for(int i=maxr-1, j=maxc; i>=minr; i--)
		{
			arr[i][j] = oned[idx];
			idx++;
		}

		//tw
		for(int i=minr, j=maxc-1; j>=minc+1; j--)
		{
			arr[i][j] = oned[idx];
			idx++;
		}		
	}

	public static void rotate(int[] oned, int r)
	{
		r = r % oned.length;
		if(r < 0)
		{
			r = r + oned.length;
		}

		reverse(oned, 0, oned.length - r - 1);
		reverse(oned, oned.length - r, oned.length - 1);
		reverse(oned, 0, oned.length - 1);
	}

	public static void reverse(int[] oned, int li, int ri)
	{
		while(li < ri)
		{
			int temp = oned[li];
			oned[li] = oned[ri];
			oned[ri] = temp;

			li++;
			ri--;
		}
	}

	public static void display(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}*/

/*5 7 11 12 13 14 15 16 17 21 22 23 24 25 26 27 31 32 33 34 35 36 37 41 42 43 44 45 46 47 51 52 53 54 55 56 57 2 3*/

//Diagonal Traversal
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
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int g =0; g<arr.length; g++)
		{
			for(int i=0, j=g; j<arr.length; i++, j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
}*/

//saddle point
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
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			int svj=0; //svj - small value of j
			for(int j=1; j<arr[0].length; j++)
			{
				if(arr[i][j] < arr[i][svj])
				{
					j = svj;
				}
			}

			boolean flag = true;
			for(int k =0; k<arr.length; k++)
			{
				if(arr[k][svj] > arr[i][svj]){
					flag=false;
					break;
				}
			}

			if(flag == true)
			{
				System.out.println(arr[i][svj]);
				return;
			}
		}
		System.out.println("Invalid Input");
	}
}*/
/* input -
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44*/

//Search in a 2D sorted Array
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

		int x = sc.nextInt();
		boolean flag = false;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				if(arr[i][j] == x){
					flag=true;
					System.out.println(i+" "+j);
					break;
				}
			}
		}
		if(flag == false)
		{
			System.out.println("Not Found");
		}
	}
}*/

//String StringBuilder
//------------------------------
//introduction to string
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//String s1 = "hello";
		//String s1 = sc.nextLine();
		//String s2 = sc.nextLine();
		//System.out.println(s1);
		//System.out.println(s2);

		//String s = sc.nextLine();
		//System.out.println(s);
		//System.out.println(s.length());

		//char ch = s.charAt(0);
		//System.out.println(ch);

		//for(int i=0; i < s.length(); i++){
		//	char ch = s.charAt(i);
		//	System.out.println(ch);
		//}

		//String s = "abcd";
		//for(int i=0; i<s.length(); i++){
		//	for(int j=i+1; j<=s.length(); j++){
		//		System.out.println(s.substring(i, j));
		//	}
		//}
		//System.out.println(s.substring(0, 1));
		//System.out.println(s.substring(1));

		//String s1 = "hello";
		//s1 += ' ';
		//s1 += 'w';
		//s1 += 'o';
		//s1 += 10;
		//String s2 = "world";
		//String s3 = s1 + " " + s2;
		//System.out.println(s1);
		//System.out.println("hello" + 10 + 20);
		//System.out.println(10 + 20 + "hello");

		String s = "abc def ghi jkl";
		String[] parts = s.split(" ");
		for(int i=0; i<parts.length; i++){
			System.out.println(parts[i]);
		}
	}
}*/

//print all palendromic
/*import java.util.*;
class Main
{
	public static boolean isPalendromic(String s){
		int i=0;
    	int j=s.length() - 1;
    	while(i <= j){
      		char ch1 = s.charAt(i);
      		char ch2 = s.charAt(j);
      
      		if(ch1 != ch2){
        		return false;
      		}else{
        		i++;
        		j--;
      		}
    	}
    	return true;
	}

	public static void solution(String str){
		
		for(int i=0; i<str.length(); i++){
			for(int j=i+1; j<=str.length(); j++){
				String ss = str.substring(i, j);
				if(isPalendromic(ss) == true)
				{
					System.out.println(ss);
				}
			}
		}	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		solution(str);
	}
}*/

//String Compression
/*import java.util.*;
class Main
{
	public static String stringCompresion(String str)
	{
		String s = str.charAt(0) + "";
		int count = 1;
		for(int i=1; i<str.length(); i++)
		{
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);

			if(curr == prev){
				count++;
			}else{
				if(count > 1)
				{
					s=s+count;
					count=1;
				}
				s=s+curr;
			}
		}

		if(count > 1){
			s=s+count;
			count=1;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(stringCompresion(str));
	}
}*/

//StringBuilder
/*import java.util.*;
class Main{
	public static void main(String[] args) {
		//StringBuilder sb = new StringBuilder("Hello");
		//System.out.println(sb);

		//char ch = sb.charAt(0); 	//get
		//System.out.println(ch);

		//sb.setCharAt(0, 'd'); 	//update
		//System.out.println(sb);

		//sb.insert(2, 'y');		//insert
		//System.out.println(sb);

		//sb.deleteCharAt(2);		//delete character
		//System.out.println(sb);

		//sb.append('g');		//append
		//System.out.println(sb);

		//System.out.println(sb.length());

		int n= 10000;

		long start = System.currentTimeMillis();
		//String s= "";
		//for(int i=0; i<n; i++){
		//	s+=i;
		//}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++){
			sb.append(i);
		}

		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println(duration);
		//System.out.println(s);
	}
}*/

//Toggle case
/*import java.util.*;
class Main
{
	public static String printToggleCase(String str){
		StringBuilder sb = new StringBuilder(str);

		for(int i=0; i<sb.length(); i++)
		{
			char ch = sb.charAt(i);
			if(ch >= 'a' && ch <= 'z'){
				char upch = (char)('A' + ch - 'a');
				sb.setCharAt(i, upch);
			}else if(ch >= 'A' && ch <= 'Z'){
				char lwch = (char)('a' + ch - 'A');
				sb.setCharAt(i, lwch);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(printToggleCase(str));		
	}	
}*/

//String of every Consicutive Character
/*import java.util.*;
class Main
{
	public static String printConsicuteCharacter(String str){
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		//String s = sb.charAt(0) + "";
		//int diff=0;
		for(int i=1; i<str.length(); i++)
		{
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			int diff = curr - prev;
			//s = s + diff + curr;
			sb.append(diff);
			sb.append(curr);
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(printConsicuteCharacter(str));
	}
}*/

//Print All Permutation
/*import java.util.*;
class Main
{
	public static void printAllPermutation(String str)
	{
		int n = str.length();
		int f = factorial(n);

		for(int i=0; i<f; i++)
		{
			StringBuilder sb = new StringBuilder(str);
			int temp=i;
			for(int div=n; div>=1; div--)
			{
				int q = temp/div;
				int r = temp%div;

				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);

				temp=q;
			}
			System.out.println();
		}
	}

	public static int factorial(int n)
	{
		int ans = 1;
		for(int i=1; i<=n; i++)
		{
			ans *= i;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printAllPermutation(str);
	}
}*/

//ArrayList
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list + " -> " + list.size());

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list + " -> " + list.size());

		list.add(1, 1000);
		System.out.println(list + " -> " + list.size());						

		int val = list.get(1);		//not list(1);
		System.out.println(val);

		list.set(1, 2000);		//not list[1] = 2000
		System.out.println(list + " -> " + list.size());

		list.remove(1);
		System.out.println(list + " -> " + list.size());

		ArrayList<String> l2 = new ArrayList<>();
		l2.add("Hello");
		l2.add("Bello");
		l2.add("sello");
		System.out.println(l2 + " -> " + l2.size());

		//for(int i=0; i<list.size(); i++)
		//{
		//	int val1 = list.get(i);
		//	System.out.println(val1);
		//}

		for(int val1 : list)
		{
			System.out.println(val1);
		}
		System.out.println(list);
	}
}*/

//remove primes in a ArrayList
/*import java.util.*;
class Main
{
	public static boolean isPrime(int n)
	{
		for(int div = 2; div*div <= n; div++)
		{
			if(n%div == 0)
			{
				return false;
			}
		}
		return true;
	}

	public static void solution(ArrayList<Integer> list)
	{
		for(int i=list.size()-1; i>=0; i--)
		{
			int val = list.get(i);
			if(isPrime(val) == true)
			{
				list.remove(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println();
		solution(list);
		for(int i=0; i<list.size(); i++)
		{
			int val = list.get(i);
			System.out.print(val + " ");
		}
	}
}*/

//Recursion and Backtracking
/*-----------------------------------------------------------------*/
//print Dereaseing
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printDecreaseing(n);
	}

	public static void printDecreaseing(int n)
	{
		if(n==0)
			return;

		System.out.println(n);
		printDecreaseing(n-1);
	}
}*/

//print Increaseing
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printIncreaseing(n);
	}

	public static void printIncreaseing(int n)
	{
		if(n==0)
			return;

		printIncreaseing(n-1);
		System.out.println(n);
	}
}*/

//print Increaseing Decreaseing
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("-----------------------------------------");
		printIncreaseing(n);
		System.out.println();
		printDecreaseing(n);
	}

	public static void printIncreaseing(int n)
	{
		if(n==0)
			return;

		printIncreaseing(n-1);
		System.out.println(n);
	}

	public static void printDecreaseing(int n)
	{
		if(n==0)
			return;

		System.out.println(n);
		printDecreaseing(n-1);
	}
}*/

//Factorial
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int op = factorial(n);
		System.out.println(op);
	}

	public static int factorial(int n)
	{
		if(n == 1)
			return 1;

		int fn1 = factorial(n-1);
		int product = n * fn1;

		return product;
	}
}*/

//Power Function - Power Linear
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int op = powerFunction(x, n);
		System.out.println(op);
	}

	public static int powerFunction(int x, int n)
	{
		if(n==0)
			return 1;

		int xpn1 = powerFunction(x, n-1);
		int xpn = x * xpn1;

		return xpn;
	}
}*/

//Power function - Power Logarithem
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int op = powerFunction(x, n);
		System.out.println(op);
	}

	public static int` powerFunction(int x, int n)
	{
		if(n == 0)
			return 1;

		//1. Faith : x ^ n/2
		int xpnb2 = powerFunction(x, n/2);

		//2. x^n = x^n/2 * x^n/2
		int xpn = xpnb2 * xpnb2;

		//if n is odd
		if(n % 2 == 1)
			xpn = xpn * x;

		//4. return
		return xpn;
	}
}*/

//Print zigzag
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

		System.out.print(n + " ");
		pzz(n-1);
		System.out.print(n + " ");
		pzz(n-1);
		System.out.print(n + " ");
	}
}*/

//Tower of Hanoi
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t1d = sc.nextInt();
		int t2d = sc.nextInt();
		int t3d = sc.nextInt();

		towerOfHanoi(n, t1d, t2d, t3d);
	}

	public static void towerOfHanoi(int n, int t1d, int t2d, int t3d)
	{
		if(n==0)
			return;

		towerOfHanoi(n-1, t1d, t3d, t2d);
		System.out.println(n + "[" + t1d + " -> " + t2d + "]");
		towerOfHanoi(n-1, t3d, t2d, t1d);
	}
}*/

//Recursion Display in Array
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		displayArr(arr, 0);
	}

	public static void displayArr(int[] arr, int idx)
	{
		if(idx == arr.length)
			return;

		System.out.println(arr[idx]);
		displayArr(arr, idx+1);
	}
}*/

//Display Array Reverse
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println();
		displayArr(arr, 0);
	}

	public static void displayArr(int[] arr, int idx)
	{
		if(idx == arr.length)
			return;

		displayArr(arr, idx+1);
		System.out.println(arr[idx]);
	}
}*/

//Max Of An Array
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

		int max = findMaxInArray(arr, 0);
		System.out.println(max);
	}

	public static int findMaxInArray(int[] arr, int idx){
		if(idx == arr.length-1){
			return arr[idx];
		}

		int max1 = findMaxInArray(arr, idx+1);
		if(max1 > arr[idx]){
			return max1;
		}else{
			return arr[idx];
		}
	}
}*/

//Find First Index
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

		int x = sc.nextInt();
		int idx = findFirstIndex(arr, 0, x);
		System.out.println(idx);
	}

	public static int findFirstIndex(int[] arr, int idx, int x)
	{
		if(idx == arr.length){
			return -1;
		}

		if(arr[idx] == x){
			return idx;
		}else{
			int ridx = findFirstIndex(arr, idx+1, x);
			return ridx;
		}
	}
}*/

//find last index using recursion
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

		int x = sc.nextInt();
		int idx = findLastIndex(arr, 0, x);
		System.out.println(idx);
	}

	public static int findLastIndex(int[] arr, int idx, int x){
		if(idx == arr.length){
			return -1;
		}

		int lidx = findLastIndex(arr, idx+1, x);
		if(lidx == -1){
			if(x == arr[idx]){
				return  idx;
			}else{
				return -1;
			}
		}else{
			return lidx;
		}
	}
}*/

//All Indices of Array
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

		int x = sc.nextInt();
		int[] allidx = printAllIndices(arr, x, 0, 0);

		if(allidx.length == 0){
			System.out.println();
			return;
		}

		for(int i=0; i<allidx.length; i++){
			System.out.print(allidx[i] + " ");
		}
	}

	public static int[] printAllIndices(int[] arr, int x, int idx, int fsf){
		if(idx == arr.length){
			return new int[fsf];
		}

		if(arr[idx] == x){
			int[] allidx = printAllIndices(arr, x, idx+1, fsf+1);
			allidx[fsf] = idx;
			return allidx;
		}else{
			int[] allidx = printAllIndices(arr, x, idx+1, fsf);
			return allidx;
		}
	}
}

























