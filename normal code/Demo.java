/*class SampleDemo implements Runnable{
	private Thread t;
	private String thredName;

	SampleDemo(String thredName){
		this.thredName = thredName;
	}
	public void run()
	{
		while(true){
			System.out.print(thredName);
		}
	}
	public void start()
	{
		if(t == null)
		{
			t = new Thread(this, thredName);
			t.start();
		}
	}
}

class TestThred{
	public static void main(String[] args) {
		SampleDemo A = new SampleDemo("A");
		SampleDemo B = new SampleDemo("B");

		B.start();
		A.start();
	}
}*/

//print all prime number
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int hi = sc.nextInt();

		int t=0;
		for(int i=low; i<=hi; i++)
		{
			
			int count=0;
			for(int j=1; j<=i; j++)
			{
				if(i%j == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.println(i);
				t++;
			}

		}
		System.out.println("Total Prime no - "+t);

	}
}*/

//Fibonacci Series
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		for(int i=0; i<=n; i++)
		{

			c=a+b;
			System.out.println(a+" + "+b+" = "+c);
			a=b;
			b=c;

		}
	}
}*/

//Practice
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] arr = new String[n];
		for(int i=0; i< arr.length; i++)
		{
			arr[i] = sc.next();
		}
		int x = Integer.parseInt(arr[1], 10)/1000000;
		int z = x%100;
		System.out.println(z);
	}
}*/

//Count Sort
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			max = Math.max(arr[i], max);
			min = Math.min(arr[i], min);
		}

		countSort(arr, min, max);
		printArr(arr);
	}

	public static void printArr(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void countSort(int[] arr, int min, int max)
	{
		int range = max - min + 1;
		int[] ans = new int[arr.length];
		int[] farr = new int[range];

		for(int i=0; i<arr.length; i++)
		{
			farr[arr[i] - min]++;
		}

		for(int i=1; i<farr.length; i++)
		{
			farr[i] = farr[i] + farr[i-1];
		}

		for(int i = arr.length-1; i>=0; i--)
		{
			int pos = farr[arr[i] - min] - 1;
			ans[pos] = arr[i];
			farr[arr[i] - min]--;
		}

		for(int i=0; i<arr.length; i++)
		{
			arr[i] = ans[i];
		}
	} 
}*/

//Reverse array
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("-----------------------------");
		System.out.println("---------------Original -------------------");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("--------------Reverse-----------------------");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
	}
}*/

//Java Substring Comparisons
/*import java.util.Scanner;
public class Solution {
public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
//         "Compare to" method doesn't turn just the equel case it also turns a value.
        for(int i=0; i<=s.length()-k; i++ ){
            String str = s.substring(i,k+i);
            if (smallest.compareTo(str)>0){
                smallest = str;
            }
            if(largest.compareTo(str)<0){
                largest=str;
            }
        }  
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}*/
//Fibonacci series
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0;
		int b=1;
		int c;
		for(int i=0; i<n; i++)
		{
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
			
		}
	}
}*/
//iNVERSE OF a number
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int inv = 0;
		int op=1;

		while(n != 0)
		{
			int od=n%10;
			int id = op;
			int ip=od;

			inv = inv + (id * (int)Math.pow(10, ip-1));

			n=n/10;
			op++;
		}
		System.out.println(inv);
	}
}*/
//Pentagon Triplet
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();

		int max=n1;
		if(n2 >= max)
		{
			max = n2;
		}else if(n3 >= max){
			max = n3;
		}
		//System.out.println(max);

		if(max == n1){
			boolean flag = ((n2*n2) + (n3*n3) == (n1*n1));
			System.out.println(flag);
		}else if(max == n2){
			boolean flag = ((n1*n1) * (n3*n3) == (n2*n2));
			System.out.println(flag);
		}else{
			boolean flag = ((n1*n1) + (n2*n2) == (n3*n3));
			System.out.println(flag);
		}
	}
}*/
//Prime Factorization
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int div=2; div<=n; div++)
		{
			while(n%div == 0){
				n = n/div;
				System.out.println(div);
			}
		}
		if(n != 1){
			System.out.println(n);
		}
	}
}*/
//Find LCM and GCD
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int temp1=n1;
		int temp2=n2;

		while(n1%n2 != 0)
		{
			int rem = n1%n2;
			n1=n2;
			n2 = rem;
		}
		int gcd = n2;
		int lcm = (temp1*temp2)/gcd;
		System.out.println(gcd);
		System.out.println(lcm);
	}
}*/
/*import java.util.*;
class  Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1; i*i<=n; i++)
		{
			System.out.println(i*i);
		}
	}
}*/
//Pattern - 1
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();

		for(int i=n; i>=1; i--)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("*");
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

		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
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

		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
*/
//patterm -2
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/
//patteren 3
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/
//patteren 5            
/*import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nspaces = n / 2;
        int nstars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nspaces; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= nstars; j++) {
                System.out.print("*\t");
            }

            if (i <= n / 2) {
                nspaces--;
                nstars += 2;
            } else {
                nspaces++;
                nstars -= 2;
            }

            System.out.println();
        }

    }
}*/
//import java.util.*;
//class Main
//{
//	public static void main(String[] args) {
		/*double a = 25.64;
		int b=25;
		a=a%10;
		b=b%10;
		System.out.println(a+" "+b);*/
		/*String a = new String("ALPHA");
		String b="ALPHA";
		System.out.println(a == b);*/

		/*Set values = new TreeSet<>();
		values.add(42);
		values.add(37);
		values.add(51);

		Iterator iterator = values.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			System.out.println(", ");
		}*/
		/*int a=1;
		int b=12;
		System.out.println(a = b);*/
		/*int x=10;
		if(++x <10 && (x/0 >10))
{
		System.out.println("Succ");
}
else {
	System.out.println("fail");
}*/
/*
		String a = new String("ALPHA");
		String b="ALPHA";
		System.out.println(a.equals(b));
*/
		/*int j=0;
		do{
			for (int i=0; i++<1;) {
				System.out.println(i);
			}
		}while(j++<2);*/
		/*Object obj = new Object();
		System.out.println(obj.getclass());*/

		/*double a,b;
		a=3.0;
		b=4.0;
		double d= Math.sqrt(a*a + b*b);
		System.out.println(d);*/

		/*Set s1 = new HashSet<>();
		s1.add("sch");
		s1.add("vir");
		s1.add("dho");
		s1.add("goi");
		Set hash_tree = new TreeSet(s1);
		System.out.println(hash_tree);*/

		/*Map h1 = new HashMap<>();
		h1.put("1", "phy");
		h1.put("3", "c++");
		h1.put("2", "java");
		Map t1 = convertToTreeMap(h1);
		System.out.println(t1);*/

		/*int[] arr = {5, 3, 2, 1, 3, 4};
		for(int i=0; i<arr.length; i++)
		{
			if(check(arr[i])){
				int temp = arr[0];
				arr[0] = arr[i];
				arr[i] = temp;
			}
		}
		for(int t=0; t<arr.length; t++)
		{
			System.out.println((arr[t])+" ");
		}*/

		/*LinkedList l2 = new LinkedList();
		l2.add('s');
		l2.add('m');
		l2.add('p');
		l2.add('t');
		while(!l2.isEmpty()){
			System.out.print(l2.poll()+" --> ");
		}*/
//	}
	/*public static Map convertToTreeMap(Map h1)
	{
		Map t1 = new TreeMap<>();
		t1.putAll(h1);
		return t1;
	}*/
	/*private static boolean check(int n)
	{
		for(int i=2; i<n; i++)
		{
			if(n%1 == 0)
				return false;
		}
		return true;
	}*/

//}

//Patteren 6
/*	import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        
        for(int i=1; i <= ((n/2) + 1); i++){
            
            // type 1
            for(int j=1; j<=((n/2) + 1 - (i-1)); j++){
                System.out.print("*\t");
            }
            
            // type 2
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("\t");    
            }
            
            // type 3
            for(int j=1; j<=((n/2) + 1 - (i-1)); j++){
                System.out.print("*\t");    
            }
            
            System.out.println();
        }
        
        
        
//lower half
        int inc_counter=2;
        int dec_counter=n-2;
        for(int i=1; i <= (n/2); i++){
            
            // type 1
            for(int j=1; j<=inc_counter; j++){
                System.out.print("*\t");
            }
            
            // type 2
            for(int j=1; j<=dec_counter; j++){
                System.out.print("\t");    
            }
            
            // type 3
            for(int j=1; j<=inc_counter; j++){
                System.out.print("*\t");    
            }
            
            inc_counter++;
            //dec_counter-=2;
            dec_counter=dec_counter-2;
            
            System.out.println();
        }

    }
}*/
//Patteren 7
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i == j){
					System.out.print("*\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}*/
//patteren 8
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i+j == n+1)
				{
					System.out.print("*\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}*/
//patteren 9
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i == j || i+j == n+1)
				{
					System.out.print("*\t");
				}else{
					System.out.print("\t");
				}
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
        int space= n/2, star=1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=space; j++)
            {
              System.out.print("\t");
            }
            for(int j=1; j<=star; j++)
            {
              System.out.print("*\t");
            }
            if(i <= n/2){
              space--;
              star=star+2;
            }else{
              space++;
              star=star-2;
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
		int[] vals = new int[n];
		int[] wets = new int[n];

		for(int i=0; i<vals.length; i++)
		{
			vals[i] = sc.nextInt();
		}
		for(int j=0; j<wets.length; j++)
		{
			wets[j] = sc.nextInt();
		}

		int caps = sc.nextInt();
		int[][] dp = new int[n+1][caps+1];

		for(int i=1; i<dp.length; i++)
		{
			for(int j=1; j<dp[0].length; j++)
			{
				if(j >= wets[i-1])
				{
					int rcap = j - wets[i-1];

					if(dp[i-1][rcap]+vals[i-1] > dp[i-1][j])
					{
						dp[i][j]=dp[i-1][rcap]+vals[i-1];
					}else{
						dp[i][j]=dp[i-1][j];
					}
				}else{
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		System.out.println(dp[n][caps]);
	}
}*/

/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val=1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(val+"\t");
				val++;
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
		int n =sc.nextInt();
		int a=0;
		int b=1;
		int c;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(a+"\t");
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println();
		}
	}
}*/
//Patteren - 18
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();

		int st=n;
		int sp=0;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=sp; j++)
			{
				System.out.print("\t");
			}

			for(int j=1; j<=st; j++)
			{
				if(i > 1 && i<=n/2 && j>1 && j<st)
				{
					System.out.print("\t");
				}
				else{
					System.out.print("*\t");
				}
			}
			if(i <= n / 2){
            	st =st- 2;
            	sp++;
        	} else {
            	st =st+ 2;
            	sp--;
        	}
        	System.out.println();
		}
	}
}*/

/*import java.io.*;
import java.util.*;
class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(j==1 || j==n){
                System.out.print("*\t");
            }else if(i<=n/2+1 && (i == j || i + j == n + 1)){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
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

		double d;
		for(int i=0; i<=n; i++)
		{
			for(int j=0; j<=n; j++){

				d=Math.sqrt(((i-n)*(i-n))+((j-n)*(j-n)));

				if(d > n-0.5 && d < n+0.5)
				{
					System.out.print("2 ");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}*/

/*import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int st = 2*n-1, sp = 0 ;
        int a = n;

        for(int i = 1; i<= 2*n-1; i++)
        {  int b = n;

            for(int j=1; j <= sp; j++)
            {
                if(b%2==0) {
                    System.out.print(b + "\t");

                }
                else
                    System.out.print("#\t");
                b--;
            }
            for(int j = 1; j<= st; j++) {
                   if(a%2==0)
                System.out.print(a + "\t");
                   else
                       System.out.print("#\t");
            }
            for(int j=1; j <= sp; j++)
            {   if((b+1)%2==0) {
                System.out.print(b + 1 + "\t");

            }
            else
                System.out.print("#\t");
            b++;
            }
            if(i <= n-1)
            {
                sp++;
                st -=2;
                a--;
            }
            else
            {
                sp--;
                a++;
                st += 2;
            }
            System.out.println();
        }
    }
}
*/
//Binary to Decimal
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		int sol=0, mul=1;

		while(n > 0)
		{
			int rem = n%b;
			n = n/b;

			sol = sol + rem * mul;
			mul = mul*10;
		}
		System.out.println(sol);
	}
}*/
//lenear serarch
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

		int ele = sc.nextInt();

		for(int i=0; i<n; i++)
		{
			if(arr[i] == ele)
			{
				System.out.println(i);
			}
		}
	}
}*/

//nCr question
/*import java.util.*;
class Main
{
	public static int fact(int n)
	{
		int sol=1;
		for(int i=1; i<=n; i++)
		{
			sol=sol*i;
		}
		return sol;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();

		int nmr=n-r;
		int ncr = fact(n)/fact(r)*fact(nmr);
		System.out.println(fact(n));
		System.out.println(fact(r));
		System.out.println(fact(nmr));

		System.out.println(ncr);

	}
}*/

//digit frequence
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();

		int friquencydigit = FrequencyDigitNo(n, d);
		System.out.println(friquencydigit);
	}
	public static int FrequencyDigitNo(int n, int d)
	{
		int fn=0;
		while(n > 0)
		{
			int digit=n%10;

			if(d == digit){
				fn++;
			}
			n=n/10;
		}
		return fn;
	}
}*/

//Decimal to anybase
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the destination Base : ");
		int b=sc.nextInt();
		int count=1;
		int ans=0;
		while(n > 0)
		{
			int rem=n%b;

			ans = ans+rem*count;
			count = count*10;
			n=n/b;
		}
		System.out.println(ans);
	}
}*/

//Anybase to Decimal
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b=sc.nextInt();
		int ans=0;
		int multiplier=1;
		while(n > 0)
		{
			int rem=n%10;

			ans=ans+rem*multiplier;
			multiplier = multiplier*b;
			n=n/10;
		}
		System.out.println(ans);
	}
}*/

//Any base to any base
/*import java.util.*;
class  Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sb = sc.nextInt();
		int db = sc.nextInt();

		int anytodec = AnyToDecimal(n, sb);
		System.out.println("\n Decimal : "+anytodec+"\n");
		int dectoany = DecimalToAny(anytodec, db);
		System.out.println(dectoany);
	}
	public static int AnyToDecimal(int n, int sb)
	{
		int ans=0;
		int multiplier=1;
		while(n > 0)
		{
			int rem = n%10;

			ans=ans+rem*multiplier;
			multiplier=multiplier*sb;
			n=n/10;
		}
		return ans;
	}
	public static int DecimalToAny(int n, int db)
	{
		int ans=0;
		int multiplier=1;
		while(n > 0)
		{
			int rem=n%db;

			ans= ans+rem*multiplier;
			multiplier=multiplier*10;
			n=n/db;
		}
		return ans;
	}
}*/

//Sadel Price
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		boolean isSadelPoint = false;
		for(int i=0; i<arr.length; i++)	
		{
			//min value of row i
			int min = Integer.MAX_VALUE, col=0;
			for(int j=0; j<arr[0].length; j++)
			{
				if(arr[i][j] < min)
				{
					min = arr[i][j];
					col=j;
				}
			}
			System.out.println(min);

			//max value of column j
			int max = Integer.MIN_VALUE;
			for(int k=0; k<arr.length; k++)
			{
				if(arr[k][col] > max)
				{
					max = arr[k][col];
				}
			}
			System.out.println(max);

			if(min == max)
			{
				System.out.println("Sadel Point is : "+min);
				isSadelPoint = true;
				break;
			}
		}

		if(isSadelPoint == false)
			System.out.println("There is no sadel point");
	}
}*/

// Ring Rotate
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

		int s=sc.nextInt();
		int r=sc.nextInt();

		rotateShell(arr, s, r);
		display(arr);
	}

	public static void rotateShell(int[][] arr, int s, int r)
	{
		int[] oned = fillOnedFromShell(arr, s);
		rotate(oned, r);
		fillShellFromOned(arr, s, oned);
	}

	public static void fillShellFromOned(int[][] arr, int s, int[] oned)
	{
		int minr=s-1;
		int minc=s-1;
		int maxr=arr.length-s;
		int maxc=arr[0].length-s;

		//lw
		int idx=0;
		for(int i=minr, j=minc; i<=maxr; i++)
		{
			arr[i][j]=oned[idx];
			idx++;
		}
		//bw
		for(int i=maxr, j=minc+1; j<=maxc; j++)
		{
			arr[i][j]=oned[idx];
			idx++;
		}
		//rw
		for(int i=maxr-1, j=maxc; i>=minr; i--)
		{
			arr[i][j]=oned[idx];
			idx++;
		}
		//tw
		for(int i=minr, j=maxc-1; j>=minc+1; j--)
		{
			arr[i][j]=oned[idx];
			idx++;
		}

	}

	public static int[] fillOnedFromShell(int[][] arr, int s)
	{
		int minr = s-1;
		int minc = s-1;
		int maxr = arr.length-s;
		int maxc = arr[0].length-s;

		int sz = 2 * ((maxr - minr) + (maxc - minc)); 
		System.out.println("\n"+sz+"\n");
		// | 2*maxr-2*minr + 2*maxc-2*minc | 2(maxr-minr+1) + 2(maxc-minc+1) - 4 | 2*lw + 2*bw - 4 |lw + bw + rw + tw -4
		int[] oned = new int[sz];

		//lw
		int idx=0;
		for(int i=minr, j=minc; i<=maxr; i++)
		{
			oned[idx] = arr[i][j];
			idx++;
		}
		//bw
		for(int i=maxr, j=minc+1; j<=maxc; j++)
		{
			oned[idx] = arr[i][j];
			idx++;
		}
		//rw
		for(int i=maxr-1, j=maxc; i>=minr; i--)
		{
			oned[idx] = arr[i][j];
			idx++;
		}
		//tw
		for(int i=minr, j=maxc-1; j>=minc+1; j--)
		{
			oned[idx] = arr[i][j];
			idx++;
		}
		return oned;
	}

	

	public static void rotate(int[] oned, int r)
	{
		r= r % oned.length;
		if(r < 0)
		{
			r=r+oned.length;
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
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
}*/

//reverse an array
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		reverseArray(arr);
		System.out.println();
		displayArray(arr);
	}
	public static void reverseArray(int[] arr)
	{
		int i=0;
		int j=arr.length-1;
		while(i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}
	}
	public static void displayArray(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}*/

//diagonal traversal Wakanda
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
				arr[i][j]=sc.nextInt();
			}
		}

		for(int gap=0; gap<arr.length; gap++)
		{
			for(int i=0, j=gap; j<arr.length; i++, j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
	}
}*/

//wave traversal Wakanda
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m =sc.nextInt();
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
				for(int i=0; i<arr.length; i++){
					System.out.print(arr[i][j]+" ");
				}
			}else{
				for(int i=arr.length-1; i>=0; i--)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
}*/

//sadel price
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
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
			int svj=0;	//smallest value j
			for(int j=0; j<arr[0].length; j++)
			{
				if(arr[i][j] < arr[i][svj])
				{
					svj=j;
				}
			}

			boolean flag =true;
			for(int k=0; k<arr.length; k++)
			{
				if(arr[k][svj] > arr[i][svj])
				{
					flag = false;
					break;
				}
			}

			if(flag == true)
			{
				System.out.println(arr[i][svj]);
				return;
			}
		}
		System.out.println("Invalid Input ..");
	}
}*/

//Unbounded knapsack
/*5
15 14 10 45 30
2 5 1 3 4
7*/

//String cal
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String res = "";
	int count =0;

	for(int i=0; i<str.length(); i++)
	{
		if(i == 0 || str.charAt(i) != str.charAt(i-1))
		{
			if(i > 0 && count > 1){
				res = res+count;
			}
			res = res+str.charAt(i);
			count=0;
		}
		count++;
	}
	if(count > 1)
	{
		res = res + count;
	}
	System.out.println(res);
}
}*/

//All Paledramic string
/*import java.util.*;
class Main
{
	public static boolean isPalendrome(String s){
		int i=0; 
		int j=s.length()-1;
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

	public static void printAllSubstring(String str){
		
		for(int i=0; i<str.length(); i++){
			for(int j=i + 1; j <= str.length(); j++){
				String ss = str.substring(i, j);
				if(isPalendrome(ss) == true){
					System.out.println(ss);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printAllSubstring(str);
	}
}*/

//String Comparision
/*import java.util.*;
class Main{
	public static String stringComparision1(String str){
		String s = str.substring(0, 1);
		//String s = str.charAt(0) + "";

		for(int i=1; i<str.length(); i++){
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);

			if(curr != prev){
				s = s + curr;
			}
		}
		return s;
	}

	public static String stringComparision2(String str){
		String s = str.charAt(0) + "";
		int count=1;
		for(int i=1; i<str.length(); i++){
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);

			if(curr == prev){
				count++;
			}else{
				if(count > 1){
					s = s+count;
					count = 1;
				}
				s= s+curr;
			}
		}

		if(count > 1){
			s = s + count;
			count = 1;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(stringComparision1(str));
		System.out.println(stringComparision2(str));
	}
}*/

//Toogle case
import java.util.*;
class Main
{
	public static String stringToggleCase(String str){
		String s = "";

		for(int i=0; i<str.length(); i++)
		{
			char ch1 = str.charAt(i);
			if(ch1 >= 'a' && ch1 <= 'z'){
				char uch = (char)('A' + ch1 - 'a');
				s=s+uch;
			}else if(ch1 >= 'A' && ch1 <= 'Z'){
				char lch = (char)('a' + ch1 - 'A');
				s=s+lch;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(stringToggleCase(str));
	}
}

























