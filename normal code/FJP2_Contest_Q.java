//Contest - 04
/*Q-1
1.Take an input N, the size of array.
2.Take N more inputs and store that in an array.

Write a function which returns true if the second array is inverse of first and
false otherwise. Print the value returned.

Example(To be used only for expected output):
Input:
4
1 2 3 0
3 0 1 2
Output:
true*/
//Ans - 
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

//Q-2
/*1.Take an input r, the size of row.
2.Take an input c, the size of column.
3.Take r*c more inputs and store that in an Matrix.
4.Take r*c more inputs and store that in an another Matrix.

Consider two matrix ANXM, BNXM. Both matrix A and matrix B contains equal
elements. The task is to find the trace of the matrix formed by addition of
A and B. Trace of matrix PNXM is defined as
P[0][0] + P[1][1] + P[2][2] +….. + P[min(n – 1, m – 1)][min(n – 1, m – 1)]
i.e addition of main diagonal.

Example(To be used only for expected output):

Input:
3 3
1 2 3
4 5 6
7 8 9
1 4 7
2 5 8
3 6 9

output
30

Explanation:
    1 2 3
A = 4 5 6
    7 8 9

     1 4 7
B =  2 5 8
     3 6 9

        2 6 10
A + B = 6 10 14
        10 14 18
Trace = 2 + 10 + 18 = 30*/

//Ans - 
/*import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        
        int[][] arr1 = new int[n][m];
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr1[0].length; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        
        int[][] arr2 = new int[n][m];
        for(int i=0; i<arr2.length; i++)
        {
            for(int j=0; j<arr2.length; j++)
            {
                arr2[i][j] = sc.nextInt();
            } 
        }
        
        int[][] add = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                add[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        int sum=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                  if(i==j)
                sum=sum+add[i][j];
            }
            
        }
        System.out.println(sum);
    }
}*/

//Q-3
/*1.Take an input r, the size of row.
2.Take an input c, the size of column.
2.Take r*c more inputs and store that in an array.


Write a function Wave print it row-wise and then column wise.

Example(To be used only for expected output):
Input:
3 3
1 2 3
4 5 6
7 8 9
Output:
1 2 3 6 5 4 7 8 9
1 4 7 8 5 2 3 6 9*/

//Ans -
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

//Q - 4
/*1.Take an input r, the size of row.
2.Take an input c, the size of column.
2.Take r*c more inputs and store that in an array.

Write a function Spiral print it clock wise and then anti-clock wise

Example(To be used only for expected output):
Input:
3 3
1 2 3
4 5 6
7 8 9
Output:
1 2 3 6 9 8 7 4 5
1 4 7 8 9 6 3 2 5*/

/*import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int frow = 0, lrow = n-1, fcol = 0, lcol = m-1;
        int counter = 0;
        
        while(counter < n*m)
        {
            
            // top wall
            for(int j=fcol; j<=lcol; j++)
            {
                int i = frow;
                System.out.print(arr[i][j] + " ");
                counter++;
                if(counter >= n*m) break;                
            }
            
            // Updation Condition? - for next shell
            frow++;

            // right wall
            for(int i = frow; i<=lrow; i++)
            {
                int j = lcol;
                System.out.print(arr[i][j] + " ");
                counter++;
                if(counter >= n*m) break;                
            }
            
            // Top - right Element -> Duplicate
            lcol--;

            // bottom wall
            for(int j=lcol; j>=fcol; j--)
            {
                int i = lrow;
                System.out.print(arr[i][j] + " ");
                counter++;
                if(counter >= n*m) break;
            }
            
            // Bottom - right Element -> Duplicate
            lrow--;
            
            // left wall
            for(int i = lrow; i >= frow; i--)
            {
                int j = fcol;
                System.out.print(arr[i][j] + " ");
                counter++;
                if(counter == n*m) break;
            }
            
            // Bottom - Left Element -> Duplicate
            fcol++;
            

        }
        
        System.out.println();
        frow = 0; fcol = 0; lrow = n-1; lcol = m-1;
        counter = 0;
        
        while(counter < n*m)
        {
            // left wall
            for(int i = frow; i <= lrow; i++)
            {
                int j = fcol;
                System.out.print(arr[i][j] + " ");
                counter++;
                if(counter == n*m) break;
            }
            
            // Bottom - Left Element -> Duplicate
            fcol++;
            
            // bottom wall
            for(int j=fcol; j<=lcol; j++)
            {
                int i = lrow;
                System.out.print(arr[i][j] + " ");
                counter++;
                if(counter >= n*m) break;
            }
            
            // Bottom - right Element -> Duplicate
            lrow--;
            
            // right wall
            for(int i = lrow; i>=frow; i--)
            {
                int j = lcol;
                System.out.print(arr[i][j] + " ");
                counter++;
                if(counter >= n*m) break;                
            }
            
            // Top - right Element -> Duplicate
            lcol--;
            
            // top wall
            for(int j=lcol; j>=fcol; j--)
            {
                int i = frow;
                System.out.print(arr[i][j] + " ");
                counter++;
                if(counter >= n*m) break;                
            }
            
            // Updation Condition? - for next shell
            frow++;
        }
    }
}*/

//Q - 5
/*Given a 2D matrix, print all elements of the given matrix in diagonal order. For example, consider the following 5 X 4 input matrix.

input:
5 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20
   
output:
1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20*/

//Ans - 
/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m =sc.nextInt();

		int[][] arr = new int[n][m];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		for(int sum=0; sum <= (n-1)+(m-1); sum++)
		{
			int i=0, j=0;
			if(sum <= (n - 1 + m - 1) / 2){
				j=0;
				i=sum-j;
			}else {
				i=n - 1;
				j=sum - i;
			}
			for(; i>=00 && j<m; i--, j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}*/

//28/11/2021
//FJP2- Contest-5
/*Q - 1
Pangrams
A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.

Example
s = 'The quick brown fox jumps over the lazy dog'
The string contains all letters in the English alphabet, so return pangram.

Function Description

Complete the function pangrams in the editor below. It should return the string pangram if the input string is a pangram. Otherwise, it should return not pangram.

pangrams has the following parameter(s):

string s: a string to test
Returns

string: either pangram or not pangram
*/
/*
import java.io.*;
import java.util.*;

class Result {
    
    public static String pangrams(String s) {
    // Write your code here
    	int[] freq = new int[26];

    	//Fill Frequency Array
    	for(int i=0; i<s.length(); i++)
    	{
    		if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
    			freq[s.charAt(i) - 'A']++;
    		}else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
    			freq[s.charAt(i) - 'a']++;
    		}
    	}

    	//check if string is pangram or not
    	for(int i=0; i<26; i++)
    	{
    		if(freq[i] == 0)
    		{
    			return "not Pangram";
    		}
    	}
    	return "Pangram";
    }
}

class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = Result.pangrams(s);

        System.out.println(result);
    }
}*/

/*Q - 2
Maximum Frequency Character
1.Take as input String.

Write a function that print the character with maximum frequency. Note that the repeated characters need not be adjacent. But, it is guaranteed that all characters are lowercase english alphabets.

Example(To be used only for expected output):

Input:
aabbbccccccc

output
c*/

/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int[] freq = new int[26];

		for(int i=0; i<s.length(); i++)
		{
			freq[s.charAt(i) - 'a']++;
		}

		int maxFreq = 0;
		char maxFreqChar = 'a';
		for(int i=0; i<26; i++)
		{
			if(freq[i] > maxFreq){
				maxFreqChar = (char)('a' + i);
				maxFreq = freq[i];
			}
		}

		System.out.println(maxFreqChar);
	}
}*/

/*Q - 3
Funny String
In this challenge, you will determine whether a string is funny or not. To determine whether a string is funny, create a copy of the string in reverse e.g. abc -> cba. Iterating through each string, compare the absolute difference in the ascii values of the characters at positions 0 and 1, 1 and 2 and so on to the end. If the list of absolute differences is the same for both strings, they are funny.

Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny.

Example
s = 'lmnop'

The ordinal values of the charcters are [108, 109, 110, 111, 112]. S(reverse) = 'ponml' and the ordinals are [112, 111, 110, 109, 108]. The absolute differences of the adjacent elements for both strings are [1, 1, 1, 1], so the answer is Funny.*/

/*import java.util.Scanner;
class Result {

    public static String funnyString(String s) {
    // Write your code here
    	StringBuilder rev = new StringBuilder(s);
    	rev.reverse();

    	for(int i=0; i<s.length()-1; i++)
    	{
    		int val1 = Math.abs(s.charAt(i + 1) - s.charAt(i));
    		int val2 = Math.abs(rev.charAt(i + 1) - rev.charAt(i));

    		if(val1 != val2){
    			return "Not Funny";
    		}
    	}
    	return "Funny";
    }

}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int q = sc.nextInt();

        String s = sc.nextLine();

        String result = Result.funnyString(s);

        System.out.println(result);
    }
}*/

/*Q - 4
Remove Consecutive Duplicates
1.Take as input String.

Write a function that removes all consecutive duplicates and then print desired
String.

Example(To be used only for expected output):

Input:
aabbbccccccc

output
abc*/

/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println(rcd(str));
	}

	//rcd - remove consicutive duplicates
	public static String rcd(String s)
	{
		if(s.length() <= 1)
		{
			return s;
		}else if(s.charAt(0) == s.charAt(1)){
			return rcd(s.substring(1));
		}else{
			return s.charAt(0) + rcd(s.substring(1));
		}
	}
}*/

/*Q - 5
CamelCase
There is a sequence of words in CamelCase as a string of letters, , having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given , determine the number of words in .

Example
s = oneTwoThree

There are  words in the string: 'one', 'Two', 'Three'.*/

/*import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int count = 0;

		for(int i=0; i<str.length(); i++)
		{
			if(i == 0 || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')){
				count++;
			}
		}
		System.out.println(count);
	}
}*/

/*Q - 6
Gemstones
There is a collection of rocks where each rock has various minerals embeded in it. Each type of mineral is designated by a lowercase letter in the range ascii[a - z]. There may be multiple occurrences of a mineral in a rock. A mineral is called a gemstone if it occurs at least once in each of the rocks in the collection.

Given a list of minerals embedded in each of the rocks, display the number of types of gemstones in the collection.

Example
arr = ['abc', 'abc', 'bc']

The minerals b and c appear in each rock, so there are 2 gemstones.*/

//Game Stone
/*import java.io.*;
import java.util.*;

class Result {    
    public static int gemstones(List<String> arr) {
    // Write your code here
    	//Frequency Array Of Minerals
    	int[] freq = new int[26];

    	for(int i=0; i<arr.size(); i++){
    		//Loop on Character of String
    		int[] tempFreq = new int[26];
    		for(int j=0; j<arr.size(); j++){
    			char ch = arr.get(i).charAt(j);
    			tempFreq[ch - 'a']++;
    		}

    		for(int j=0; j<26; j++){
    			if(tempFreq[j] > 0)
    			{
    				freq[j]++;
    			}
    		}
    	}
    	int countOfGemStone = 0;
    	for(int i=0; i<26; i++)
    	{
    		//Is mineral Present all the string 
    		if(freq[i] == arr.size())
    		{
    			countOfGemStone++;
    		}
    	}
    	return countOfGemStone;
    }

}

class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int result = Result.gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}*/

/*Q - 7
Dothraki are planning an attack to usurp King Robert throne. King Robert learns of this conspiracy from Raven and plans to lock the single door through which the enemy can enter his kingdom.

door

But, to lock the door he needs a key that is an anagram of a palindrome. He starts to go through his box of strings, checking to see if they can be rearranged into a palindrome. Given a string, determine if it can be rearranged into a palindrome. Return the string YES or NO.

Example
s = 'aabbccdd'
One way this can be arranged into a palindrome is . Return YES.*/
//Game of Thrones
import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int[] freq = new int[26];
		for(char ch : s.toCharArray()){
			freq[ch - 'a']++;
		}

		int oddCount = 0;
		for(int i=0; i<26; i++)
		{
			if(freq[i] % 2 == 1)
			{
				oddCount++;
			}
		}

		if(oddCount <= 1)	
			System.out.println("Yes");
		else 	
			System.out.println("No");	
	}
	
}

//FJP -2 Contest - 06
//Diagonal Maze Path
//Git Hub Copy one time or
import java.io.*;
import java.util.*;

public class Main {
    static int count = 0;
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            count++;
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }else if(sr>dr || sc>dc){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        
        ArrayList<String> rightPaths = getMazePaths(sr, sc+1, dr, dc);
        for(String s:rightPaths)
            ans.add("H" + s);
        ArrayList<String> downPaths = getMazePaths(sr+1, sc, dr, dc);
        for(String s:downPaths)
            ans.add("V" + s);
        ArrayList<String> diagonalPaths = getMazePaths(sr+1, sc+1, dr, dc);
        for(String s:diagonalPaths)
            ans.add("D" + s);
        return ans;
    }
    
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        if(sc<dc)   printMazePaths(sr, sc+1, dr, dc, psf + "H");
        if(sr<dr)   printMazePaths(sr+1, sc, dr, dc, psf + "V");
        if(sr<dr && sc<dc)  printMazePaths(sr+1, sc+1, dr, dc, psf + "D");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        ArrayList<String> ans = getMazePaths(0, 0, m, n);
        System.out.println(count);
        System.out.println(ans);
        printMazePaths(0, 0, m, n, "");
    }

}

//Hi without Hit
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int countHi(String s){
        if(s.length() <= 2)
            return (s.charAt(0)=='h' && s.charAt(1)=='i')?1:0;
        if(s.charAt(0)=='h' && s.charAt(1)=='i' && s.charAt(2)!='t')
            return 1 + countHi(s.substring(2));
        return countHi(s.substring(1));
    }
    
    public static String removeHi(String s){
        if(s.length() <= 2)
            return (s.charAt(0)=='h' && s.charAt(1)=='i')?"":s;
        if(s.charAt(0)=='h' && s.charAt(1)=='i' && s.charAt(2)!='t'){
            String smallAns = removeHi(s.substring(2));
            return smallAns+"";
        }
        String smallAns = removeHi(s.substring(1));
        return smallAns+s.charAt(0);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        System.out.println(countHi(s));
        String ans = removeHi(s);
        String res = "";
        for(int i=0; i<ans.length(); i++)
            res = ans.charAt(i) + res;
        System.out.println(res.charAt(n));
        System.out.println(res);
    }
}

//Non Repetable Permutation
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String str = in.next();
        ArrayList<String> dup2 = new ArrayList<>();
        int ans = count(str,"",dup2);
        System.out.println(ans);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String st = "";
        for(int i=0;i<arr.length;i++){
            st += arr[i];
        }
        //System.out.println(st);
        ArrayList<String> dup = new ArrayList<>();
        printPerm(st,"",dup);
    }
    
    public static int count(String inp, String op, ArrayList<String> dup){
        if(dup.contains(op)){
            return 0;
        }
        
        if(inp.length()==0){
            dup.add(op);
            return 1; 
        }
        
        int ans = 0;
        
        for(int i=0;i<inp.length();i++){
            String inpN = inp.substring(0,i) + inp.substring(i+1);
            String opN = op + inp.charAt(i);
            ans += count(inpN, opN,dup);
        }
        
        return ans;
    }
    
    public static void printPerm(String inp, String op, ArrayList<String> dup){
        if(dup.contains(op)){
            return;
        }
        
        if(inp.length()==0){
            System.out.println(op); 
            dup.add(op);
        }
        
        for(int i=0;i<inp.length();i++){
            String inpN = inp.substring(0,i) + inp.substring(i+1);
            String opN = op + inp.charAt(i);
            printPerm(inpN, opN, dup);
        }
        
    }
}

//Odd and Even Printing
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void print(int n){
    if(n<=0)    return;
    if(n%2) cout<<n<<endl;
    print(n-1);
    if(n%2==0)  cout<<n<<endl;
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n;
    cin>>n;
    print(n);
    return 0;
}


















