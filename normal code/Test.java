/*class sample{
	public int func(int k, int y)
	{
		return k+y;
	}
	public int fun1(int t, float z)
	{
		return (t+(int)z);
	}
}
class program{
	static void main(String[] args) {
		sample s = new sample();
		int i;
		int b=90;
		int c=100;
		int d=12;
		float m=14.78f;
		i=s.func(b, c);
		Console.WriteLine(i);
		int j=(s.func1(d, m));
		Console.WriteLine(j);
		Console.ReadLine();
	}
}*/

/*----------------------------------------------------------------------------------------*/

/*class Main
{
	public static void main(String[] args) {
		int n=45;
		for(int i=0; i<)
	}
}*/

/*import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       int rv = 0;
  
       int c = 0;
       int p = 1;
       while(n1 > 0 || n2 > 0 || c > 0){
          int d1 = n1 % 10;
          int d2 = n2 % 10;
          n1 = n1 / 10;
          n2 = n2 / 10;
  
          int d = d1 + d2 + c;
          c = d / b;
          d = d % b;
  
          rv += d * p;
          p = p * 10;
       }
  
       return rv;
   }
  }*/

/*import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b1 = scn.nextInt();
    int b2 = scn.nextInt();

    int d = getValue(n, b1, b2);
    System.out.println(d);
 }

 public static int getValue(int n, int b1, int b2){
     int d1 = getValueIndecimal(n, b1);
     int d2 = getValueInBase(d1, b2);
     return d2;
 }

 public static int getValueIndecimal(int n, int b){
    int rv = 0;

   int p = 1;
   while(n > 0){
       int d = n % 10;
       n = n / 10;
       rv += p * d;
       p = p * b;
   }

    return rv;
}

 public static int getValueInBase(int n, int b){
    int rv = 0;

   int p = 1;
   while(n > 0){
       int d = n % b;
       n = n / b;
       rv += p * d;
       p = p * 10;
   }

    return rv;
}
}*/
/*import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			if(i%2 ==1)
			{
				System.out.println(i);
			}
		}
	}
}*/                       

//Sadel price
/*import java.util.*;
class Main{
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
            int svj=0;  //smallest value of j
            for(int j=0; j<arr[0].length; j++)
            {
                if(arr[i][j] < arr[i][svj])
                {
                    j=svj;
                }
            } 

            boolean flag=true;
            for(int k=0; k<arr.length; k++)
            {
                if(arr[k][svj] > arr[i][svj])
                {
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

//inverse a array

/*import java.util.*;
class Main {

  public static int[] inverse(int[] a) {
    int[] inv = new int[a.length];

    for (int i = 0; i < a.length; i++) {
      int val = a[i];
      inv[val] = i;
    }

    return inv;
  }

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int[] b = new int[n];
    for(int i=0; i<n; i++)
    {
      b[i] = sc.nextInt();
    }

    int[] inv = inverse(a);

        if(Arrays.equals(b, inv))
        {
          System.out.println(true);
        }else {
          System.out.println(false);
        }
  }

}*/                       

//wave Traversal
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

    for(int i=0; i<arr.length; i++)
    {
      if(i%2 == 0){
        for(int j=0; j<arr[0].length; j++){
          System.out.print(arr[i][j]+" ");
        }
      }else{
        for(int j=arr[0].length-1; j>=0; j--)
        {
          System.out.print(arr[i][j]+" ");
        }
      }
    }
  System.out.println();
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
 
 //spiral traversal
 /*import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] arr = new int[n][m];

    for (int i=0; i<n; i++) {
      for (int j=0; j<m; j++) {
        arr[i][j] = sc.nextInt();
      }
      
    }

    int minr=0;
    int minc=0;
    int maxr=arr.length-1;
    int maxc=arr[0].length-1;
    int tno=n*m;
    int count=0;

    while(count < tno){
      //left
      for (int i=minr, j=minc; i<=maxr && count<tno; i++) {
        System.out.print(arr[i][j]+" ");
        count++;
      }
      minc++;
      //bottom
      for (int i=maxr, j=minc; j<=maxc && count<tno; j++) {
        System.out.print(arr[i][j]+" ");
        count++;
      }
      maxr--;
      //right
      for (int i=maxr, j=maxc; i>=minr && count<tno; i--) {
        System.out.print(arr[i][j]+" ");
        count++;
      }
      maxc--;
      //top
      for (int i=minr, j=maxc; i<=maxc && count<tno; i++) {
        System.out.print(arr[i][j]+" ");
        count++;
      }
      minr++;
    }
    System.out.println();
    while(count < tno){
      //top
      for (int i=minr, j=minc; j<=maxc && count<tno; j++) {
        System.out.print(arr[i][j]+" ");
        count++;
      }
      minr++;
      //right
      for (int i=minr, j=maxc; i<=maxr && count<tno; i++) {
        System.out.print(arr[i][j]+" ");
        count++;
      }
      maxc--;
      //buttom
      for (int i=maxr, j=maxc; j>=minc && count<tno; j--) {
        System.out.print(arr[i][j]+" ");
        count++;
      }
      maxr--;
      //left
      for (int i=maxr, j=minc; i>=minr && count<tno; i--) {
        System.out.print(arr[i][j]+" ");
        count++;
      }
      minc++;
    }
  }
}*/

/*class Main {
   public static void main(String[] args) {
      String str = "The quick brown fox jumps over the lazy dog";
      boolean[] alphaList = new boolean[26];
      int index = 0;
      int flag = 1;
      for (int i = 0; i < str.length(); i++) {
         if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
            index = str.charAt(i) - 'A';
         }else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
            index = str.charAt(i) - 'a';
      }
      alphaList[index] = true;
   }
   for (int i = 0; i <= 25; i++) {
      if (alphaList[i] == false)
      flag = 0;
   }
   System.out.print("String: " + str);
   if (flag == 1)
      System.out.print("\nThe above string is a pangram.");
   else
      System.out.print("\nThe above string is not a pangram.");
   }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     

    public static String pangrams(String s) {
    // Write your code here
        boolean[] alphabate = new boolean[26];
        int idx = 0;
        int flag = 1;
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
            {
                idx = s.charAt(i) - 'A';
            }else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                idx = s.charAt(i) - 'a';
            }
            alphabate[idx] = true;
        }
        
        for(int i=0; i<=25; i++)
        {
            if(alphabate[i] == false)
                flag = 0;
        }
        if(flag == 1)
            return "pangram";
        else
            return "not pangram";
        
    }
   
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}*/           


/*public class GFG
{
    static final int ASCII_SIZE = 256;
    static char getMaxOccuringChar(String str)
    {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[ASCII_SIZE];
      
        // Construct character count array from the input
        // string.
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
      
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
      
        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
      
        return result;
    }
     
    // Driver Method
    public static void main(String[] args)
    {
        String str = "sample string";
        System.out.println("Max occurring character is " +
                            getMaxOccuringChar(str));
    }
}*/

/*import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         //Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        
        Map<Character, Integer> letters = new HashMap<>();
        for(char c : s.toCharArray())
        {
            if(letters.containsKey(c))
                letters.put(c, letters.get(c) + 1);
            else
                letters.put(c, 1);
        }
        
        int odd = 0;
        int even = 0;
        for(Integer frequency : letters.values())
        {
            if(frequency % 2 == 1)
            {
                odd++;
                continue;
            }
                
            if(frequency % 2 == 0)
                even++;
        }
        
        if(odd > 1) 
            System.out.println("NO");
        else
            System.out.println("YES");
        
    }
}*/

//print encodeing
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      printEncodeing(0, input, "");
    }

    public static void printEncodeing(int idx, String input, String output){
      //base case
      if(idx == input.length()){
        System.out.println(output);
        return;
      }
      //corner case
      int ch1 = input.charAt(idx) - '0';
      if(ch1 >= 1 && ch1 <= 9){
        printEncodeing(idx+1, input, output + (char)('a' + ch1 - 1));
      }

      if(idx+1 < input.length())
      {
        int ch2 = (input.charAt(idx) - '0') * 10 + (input.charAt(idx+1) - '0');

        if(ch2 >= 10 && ch2 <= 26){
          printEncodeing(idx+2, input, output + (char)('a' + ch2 - 1));
        }
      }
    }
}*/

//Target sum subset
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

    public static void printTargetSumSubset(int[] arr, int idx, String set, int remTarget)
    {
        //base case
        if(idx == arr.length){
          if(remTarget == 0){
            System.out.println(set + ",");
          }
          return;
        }

        if(remTarget < 0)
        {
          return;
        }

        printTargetSumSubset(arr, idx+1, set + arr[idx] + ", ", remTarget - arr[idx]); //yes
        printTargetSumSubset(arr, idx+1, set, remTarget);   //no
    }
}*/

//Print Paladremic String
/*import java.util.*;
class Main
{
  public static boolean isPalendremic(String s){
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

  public static void printPalendromic(String str){
    for(int i=0; i<str.length(); i++){
      for(int j=i+1; j<str.length(); j++){
        String ss = str.substring(i, j);
        if(isPalendremic(ss) == true){
          System.out.println(ss);
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    printPalendromic(str);
  }
}*/

//String Comparision
/*import java.util.*;
class Main{
  public static String stringComparision1(String str){
    String s = str.charAt(0) + "";

    for(int i=1; i<str.length(); i++){
      char curr = str.charAt(i);
      char prev = str.charAt(i-1);

      if(curr != prev){
        s = s+curr;
      }
    }
    return s;
  }

  public static String stringComparision2(String str){
    String s = str.charAt(0) + "";
    int count = 1;
    for(int i=1; i<str.length(); i++){
      char curr = str.charAt(i);
      char prev = str.charAt(i - 1);
      
      if(curr == prev){
        count++;
      }else{
        if(count > 1)
        {
          s = s + count;
          count=1;
        }
        s=s+curr;
      }
    }

    if(count > 1)
    {
      s=s+count;
      count=1;
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

/*import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    String ans = "" + str.charAt(0);
    
    for(int i = 1; i < str.length() - 1; i++){
        char ch1 = str.charAt(i-1);
        char ch2 = str.charAt(i+1);
        
        if(((ch1 == 'S' || ch1 == 's') && (ch2 == 'R' || ch2 == 'r')) == false){
            ans += str.charAt(i);
        }
    }
    
    ans += str.charAt(str.length()-1);
    System.out.println(ans);
  }
}*/

//factorial
/*import java.util.*;
class Main
{
  public static int Factorial(int n)
  {
    int ans = 1;
    for(int i=1; i<=n; i++)
    {
      ans = ans*i;
    }
    return ans;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(Factorial(n));
  }
}*/

//rotate 90 degree
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

    display(arr);
    System.out.println();
    //Transpose Matrix
    for(int i=0; i<arr.length; i++)
    {
      for(int j=i; j<arr[0].length; j++)
      {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }

    display(arr);
    System.out.println();
    //rotate 90 degree
    for(int i=0; i<arr.length; i++)
    {
      int li=0;
      int ri=arr[0].length-1;
      while(li < ri)
      {
        int temp = arr[i][li];
        arr[i][li] = arr[i][ri];
        arr[i][ri] = temp;

        li++;
        ri--;
      }
    }

    display(arr);

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

//practice
/*class Main
{
  public static void main(String[] args) {
    for(int i=0; i<10; i++)
    {
      for(int j=0; j<8; j*=2){
        System.out.println("infinity");
      }
    }
  }
}*/

//Ring rotate or Shell Rotate
import java.util.*;
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
    int minc = s - 1;
    int maxr = arr.length - s;
    int maxc = arr.length - s;

    int sz = 2 * (maxr - minr + maxc - minc);
    int[] oned = new int[sz];
    int idx = 0;
    //lw
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

  public static void fillShellFromOned(int[][] arr, int s, int[] oned)
  {
    int minr = s - 1;
    int minc = s - 1;
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
}


















