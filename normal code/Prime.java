/*import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int t=scn.nextInt();
       
       for(int i=0;i<t;i++)
       {
           int n= scn.nextInt();
           int count=0;
           
           for(int div=1;div<=n;div++)
           {
               if(n%div==0)
               {
                   count++;
               }
           }
           if(count==2)
           {
               System.out.println("prime");
           }
           else{
               System.out.println("not prime");
           }
           
           int div=2;
           while(div*div<=n){
               if(n%div==0)
               {
                   break;
               }
               div++;
           }
           if(div*div>n){
               System.out.println("prime");
           }
           else{
               System.out.println("not prime");
           }
       }
  
   }
  }*/

/*import java.util.*;
class Main{
  public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);

    int low = sc.nextInt();
    int high = sc.nextInt();

    for (int i=low; i<=high; i++) {
      int count=0;
      for (int div=2; div*div<=i; div++) {
          if(i%div==0){
          count++;
          break;
        }
      }
      if (count==0) {
      System.out.println(i);
    }
    }
    
  }
}*/
//fibonacci series
/*
class Main{
  public static void main(String[] args) {
    int n=10;
    int a=0;
    int b=1;
    int c;

    for (int i=0; i<=n; i++) {
      System.out.println(a);
      c=a+b;
      a=b;
      b=c;
    }
  }
}*/
//Extract digit
/*import java.util.*;

class Main {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            int power = 1;
            int temp = n;

            while (temp >= 10) {
                temp /= 10;
                power *= 10;
            }
                temp = n;
            while(power != 0){
                int digit = temp / power;
                System.out.println(digit);
                temp = temp % power;
                power = power / 10;
            }
        }
    }*/

/*class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int d = scn.nextInt();
    int f = getDigitFrequency(n, d);
    System.out.println(f);
  }
  public static int getDigitFrequency(int n, int d) {
    int counter = 0;
    // initialize digit counter to 0
    while (n > 0)
    {
      int temp = n % 10; // Extract Digits
      n = n / 10; // Divide N by 10
      if (temp == d) // Logic Applied
        counter++;
    }
    return counter;
  }
}*/

//Reverse number
/*import java.util.*;
                                   
                                   public class Main {
                                   
                                       public static void main(String[] args) {
                                           Scanner scn = new Scanner(System.in);
                                           int n = scn.nextInt();
                                   
                                           while(n != 0){
                                               int digit = n % 10;
                                               n = n / 10;
                                   
                                               System.out.println(digit);
                                           }
                                       }
                                   }*/

/*import java.util.*;
class RotateNo{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int k=sc.nextInt();

    int temp=n;
    int nod=0;
    while(temp>0){
      temp=temp/10;
      nod++;
    }
    k=k%nod;
    if (k<0) {
      k=k+nod;
    }

    int div=1;
    int mult=1;
    for (int i=1; i<=nod; i++) {
      if (i<=k) {
        div=div*10;
      }else{
        mult=mult*10;
      }
    }
    int q=n/div;
    int r=n%div;

    int rot=r*mult+q;
    System.out.println(rot);
  }
}*/
/*class InverseNo
{
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();

    int inv=0;
    int op=1;

    while(n!=0){
      int od=n%10;
      int id=op;
      int ip=od;

      inv=inv+ id* (int)Math.pow(10, ip-1);

      n=n/10;
      op++;
    }
    System.out.println(inv);
  }
}*/

//Find  GCD and LCM 
/*import java.util.Scanner;
class PentagonTriplet{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int n3=sc.nextInt();

    int max=n1;
    if (n2>=max) {
      max=n2;
    }
    if (n3>=max) {
      max=n3;
    }

    if (max==n1) {
      boolean flag=((n2*n2)+(n3*n3)==(n1*n1));
      System.out.println(flag);
    }else if (max==n2) {
      boolean flag=((n1*n1)+(n3*n3)==(n2*n2));
      System.out.println(flag);
    }else {
      boolean flag=((n1*n1)+(n2*n2)==(n3*n3));
      System.out.println(flag);
    }
  }
}
*/
/*class PrimeFact{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    for (int div=2; div<=n; div++) {
      while(n%div==0){
        n=n/div;
        System.out.println(div);
      }
    }
    if (n!=1) {
      System.out.println(n);
    }
  }
}*/
/*class GcdLcm
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1=sc.nextInt();
    int n2= sc.nextInt();

    int temp1=n1;
    int temp2=n2;

    while(n1%n2 != 0)
    {
      int reminder=n1%n2;
      n1=n2;
      n2 = reminder;
    }
    int gcd=n2;
    int lcm=(temp1*temp2)/gcd;

    System.out.println(gcd);
    System.out.println(lcm);
  }
}*/

/*import java.util.*;
class TheCaseBenjaminBulb{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();

    for(int i=1;i*i<=n;i++)
    {
      System.out.println(i*i);
    }
  }
}*/
//Patteren - 1
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
            System.out.print("*\t");
          }
          System.out.println();
        }     
    }
}*/
//Pattern - 2
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
              System.out.print("*\t");
            }
            System.out.println();
        }
    }
}*/
//Patteren - 3
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
              System.out.print("\t");
            }
            for(int j=1; j<=i; j++)
            {
              System.out.print("*\t");
            }
            System.out.println();
        }
    }
}*/
//Patteren - 4
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp=0, st=n; //sp=space, st=star
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=sp; j++)
            {
              System.out.print("\t");
            }
            for(int j=1; j<=st; j++)
            {
              System.out.print("*\t");
            }
            sp++;
            st--;
            System.out.println();
        }
    }
}*/
//Patteren - 5
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
//Patteren - 6
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star=n/2+1, space=1;
        for(int i=1; i<=n; i++)
        {
          for(int j=1; j<=star; j++)
          {
            System.out.print("*\t");
          }
          for(int j=1; j<=space; j++)
          {
            System.out.print("\t");
          }
          for(int j=1; j<=star; j++)
          {
            System.out.print("*\t");
          }
          if(i <= n/2)
          {
            space = space+2;
            star--;
          }else{
            space = space-2;
            star++;
          }
          System.out.println();  
        }
        
    }
}*/
//Patteren - 7
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i == j)
                {
                  System.out.print("*\t");
                }    
                else{
                  System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}*/
//Patteren - 8
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
                if(i+j == n+1){
                    System.out.print("*\t");
                  }else{
                      System.out.print("\t");
                  }
            }
            System.out.println();
        }        
    }
}*/
//Patteren - 9
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
            if((i == j) || (i+j == n+1))
            {
              System.out.print("*\t");
            }
            else{
              System.out.print("\t");
            }
          }
          System.out.println();
        }
    } 
}*/
// Patteren - 10
/*import java.util.*;
class Main
{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();

      int os = n/2; //os =  outer space
      int is = -1;  //is = inner space
      for(int i=1; i<=n; i++)
      {
        for(int j=1; j<=os; j++)
        {
          System.out.print("\t");
        }
        System.out.print("*\t");
        for(int j=1; j<=is; j++)
        {
          System.out.print("\t");
        }

        if(i>1 && i<n)
        {
          System.out.print("*\t");
        }

        if(i <=n/2)
        {
          os--;
          is=is+2;
        }else{
          os++;
          is=is-2;
        }
        System.out.println();
      }
  }
}*/
//star Patteren
/*import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int st=n/2+1,sp=1;

    for(int i=1;i<=n;i++)
    {
      for (int j=1; j<=st; j++) {
      System.out.print("*\t");
      }
      for (int j=1; j<=sp; j++) {
        System.out.print("\t");
      }
      for (int j=1; j<=st; j++) {
        System.out.print("*\t");
      }
      if (i<=n/2) {
        st--;
        sp+=2;
      }
      else {
        st++;
        sp-=2;
      }
      System.out.println();
    }
  }
}*/

//star Patteren
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    for (int i=1; i<=n; i++) {
      for (int j=1; j<=n; j++) {
        if (i==j) {
          System.out.print("*\t");
        }
        else {
          System.out.print("\t");
        }
        
      }
      System.out.println();
    }
  }
}*/

//star Patteren
/*import java.util.*;
class Main
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int os=n/2;
    int is=-1;
    for (int i=1; i<=n; ) {
      for (int j=1; j<=os; j++) {
        System.out.print("\t");
      }

      System.out.print("*\t");

      for (int j=1; j<=is; j++) {
        System.out.print("\t");
      }
      if (i>1 && i<n) {
        System.out.print("*\t");

      }

      if (i<=n/2) {
        os--;
        is+=2;
      }
      else {
        os++;
        is-=2;
      }
      System.out.println();
    }
  }
}*/

//star patteren 16
/*import java.util.*;

class Main{

    public static void main(String[] args)

    {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int sp = 2*n-3;

        int st = 1;

        for(int i =1;i<=n;i++)

        {

            int val =1;     //since each row begins with 1

            for(int j=1;j<=st;j++)

            {

                System.out.print(val + "  ");

                val++;

            }

            for(int j =1;j<=sp;j++)

            {

                System.out.print("  ");

            }

            if( i == n)     //Last Row check

            {

                st--;       //removing extra star

                val--;      //reducing val by 1

            }

            for(int j=1;j<=st;j++)

            {

                val--;      //reducing value first then printing

                System.out.print(val + "  ");

             }

            st++;

            sp -= 2;

            System.out.println();

        }

    }

}*/

//Patteren 17
/*import java.util.*;
class Main{
      public static void main(String[] args)
      {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int sp = n/2;  //variable to store space count
          int st = 1;     //variable to store star count
          for(int i = 1;i<=n;i++)
          {
              for(int j =1; j<=sp ; j++)  //printing whitespaces
              {
                  if( i == n/2+1)         //checking middle row
                  {
                      System.out.print("* ");   
                  }
                  else
                      {
                          System.out.print("  ");
                      }
              }
              for(int j =1 ;j<=st;j++)    // printing the stars
              {
                   System.out.print("* ");   
              }
              if( i <= n/2)       //checking if less than or equal to middle row
              {
                  st++;       //increasing stars till middle row
              }
              else{
                  st--;       //decreasing stars post middle row
              }
              System.out.println(); //Changing the row
          }
      }
  }*/
//Patteren 18
/*  import java.util.Scanner;
class Main {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sp = 0; // there are 0 spaces in first row
    int st = n; // there are n stars in first row
    for (int i = 1; i <= n; i++)
    {
      for (int j = 1; j <= sp; j++) // for printing spaces
      {
        System.out.print("  ");

      }
      for (int j = 1; j <= st; j++)
      {
        if ( i > 1 && i <= n / 2 && j > 1 && j < st) //if the row is between middl e row and first row
        { //if the star is not the firs t or last of the row
          System.out.print("  ");
        }
        else
        {
          System.out.print("* ");
        }
      }
      if ( i <= n / 2)
      {
        st -= 2;
        sp++;
      }
      else
      {
        st += 2;
        sp--;
      }
      System.out.println();
    }
  }
}*/

//Patteren 19
/*import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    for (int i=1; i<=n; i++) {
      for (int j=1; j<=n; j++) {
        
        if (i==1) {
          if (j==n || j<=n/2+1) {

            System.out.print("*\t");
          }else {
            System.out.print("\t");
          }

        }else if (i<=n/2) {

          if (j==n || j==n/2+1) {
            System.out.print("*\t");
          }else {
            System.out.print("\t");  
          }

        }else if (i==n/2+1) {
          
          System.out.print("*\t");

        }else if (i<n) {
          if (j==1 || j==n/2+1) {
            System.out.print("*\t");
          }else {
            System.out.print("\t");
          }
        }else {
          if (j==1 || j>=n/2+1) {
            System.out.print("*\t");
          }else {
            System.out.print("\t");
          }
        }

      }
      System.out.println();
    }
  }
}*/

//Patteren 20
/*import java.util.*;

class Main {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for (int i = 1; i <= n; i++)
    {
      for (int j = 1; j <= n; j++)
      {
        if ( j == 1 || j == n) //if first or last column
        {
          System.out.print("* ");
        }
        else if (i > n / 2 && (i == j || i + j == n + 1)) // part of either diagonal below middle row
        {
          System.out.print("* ");
        }
        else
        {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}*/

//M patteren
/*import java.io.*;
import java.util.*;
class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
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

//Substracting two array
/*import java.io.*;
import java.util.*;

class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n1=sc.nextInt();
    int[] arr1=new int[n1];
    
    for(int i=0; i<n1; i++)
    {
        arr1[i]=sc.nextInt();
    }
    int n2 = sc.nextInt();
    int[] arr2=new int[n2];
    
    for(int i=0; i<n2; i++)
    {
        arr2[i]=sc.nextInt();
    }
    
    int[] diff = new int[n2];
    int c=0;
    int i=arr1.length-1;
    int j=arr2.length-1;
    int k= diff.length-1;
    
    while(k >= 0)
    {
        int d=0;
        int alv= i >= 0 ? arr1[i] : 0;
        
        if(arr2[j]+c >= alv)
        {
            d=arr2[j] + c - alv;
            c= 0;
        }else{
            d=arr2[j]+c+10-alv;
            c=-1;
        }
        diff[k]=d;
        
        i--;
        j--;
        k--;
        
    }
    int idx=0;
        while(idx < diff.length)
        {
            if(diff[idx]==0){
                idx++;
            }
            else
            {
                break;
            }
        }
        while(idx < diff.length)
        {
            System.out.println(diff[idx]);
            idx++;
        }
 }

}*/

//Rotate an Array
/*import java.io.*;

import java.util.*;

class Main {
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a, int li, int ri) {
    while (li < ri) {
      int temp = a[li];
      a[li] = a[ri];
      a[ri] = temp;

      li++;
      ri--;
    }
  }

  public static void rotate(int[] a, int k) {
    k = k % a.length;
    if (k < 0) {
      k += a.length;
    }

    reverse(a, 0, a.length - k - 1);
    reverse(a, a.length - k, a.length - 1);
    reverse(a, 0, a.length - 1);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
  }

}*/

//Binary Search
/*class BinarySearch{
  public static void main(String[] args) {
    int[] arr={10,20,30,40,50,60,70,80,90,100};
    int data = 81];
   int l=0;
   int h=arr.length-1;
   while(l<=h)
   {
    int m=(l+h)/2;
    if(data>arr[m])
    {
      l=m+1;
    }
    else if(data<arr[m]){
      h=m-1;
    }
    else
    {
      System.out.println(m);
      return;
    }
   }
   System.out.println(-1);
  }
}*/

//Ceil or Floor Solution
/*import java.util.*;
class CeilOrFloor
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int data=sc.nextInt();
        int l=0;
        int h=arr.length-1;
        int ceil=0;
        int floor=0;

        while(l <= h)
        {
            int mid=(l+h)/2;
            if(data < arr[mid])
            {
                h=mid-1;
                ceil = arr[mid];
            }else if (data > arr[mid]) {
              l=mid+1;
              floor = arr[mid];
            }else {
              ceil = arr[mid];
              floor = arr[mid];
              break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}*/

//First and Last Index
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<arr.length; i++)
        {
          arr[i]=sc.nextInt();
        }
        int data = sc.nextInt();
        int l=0;
        int h=arr.length-1;
        int first=-1;

        while(l <= h)
        {
            int mid=(l+h)/2;
            if(data > arr[mid])
            {
                l=mid+1;
            }else if (data < arr[mid]) {
              h=mid-1;
            }else {
              first = mid;
              h=mid-1;
            }
        }
        System.out.println(first);
        l=0;
        h=arr.length-1;
        int last=-1;

        while(l <= h)
        {
            int mid=(l+h)/2;
            if(data > arr[mid])
            {
                l=mid+1;
            }else if (data < arr[mid]) {
              h=mid-1;
            }else {
              last = mid;
              l=mid+1;
            }
        }
        System.out.println(last);
    }
}*/

//Subset of an Array
/*import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr=new int[n];

    for (int i=0; i<arr.length; i++) {
      arr[i]=sc.nextInt();
    }
    int limit = (int)Math.pow(2, arr.length);

    for (int i=0; i<limit; i++) {
      String  set = "";
      int temp=i;

      for (int j=arr.length-1; j>=0; j--) {
          int r=temp%2;
          temp=temp/2;

          if(r==0){
             set="-\t" + set;
          }else {
            set=arr[j] + "\t" +set;
          }
      }
      System.out.println(set);
    }
  }
}*/

//Wave Traversal
/*import java.util.*;
class Main
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] arr=new int[n][m];

    for (int i=0; i<n; i++) {
      for (int j=0; j<m; j++) {
        arr[i][j]=sc.nextInt();
      }
    }

    for (int j=0; j<arr[0].length; j++) {
      if (j%2 == 0) {
        for (int i=0; i<arr.length; i++) {
          System.out.println(arr[i][j]);
        }
      }else {
        for (int i=arr.length-1; i>=0; i--) {
          System.out.println(arr[i][j]);
        }
      }
    }
  }
}*/

//Spiral Traversal
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
        System.out.println(arr[i][j]);
        count++;
      }
      minc++;
      //bottom
      for (int i=maxr, j=minc; j<=maxc && count<tno; j++) {
        System.out.println(arr[i][j]);
        count++;
      }
      maxr--;
      //right
      for (int i=maxr, j=maxc; i>=minr && count<tno; i--) {
        System.out.println(arr[i][j]);
        count++;
      }
      maxc--;
      //top
      for (int i=minr, j=maxc; i<=maxc && count<tno; i++) {
        System.out.println(arr[i][j]);
        count++;
      }
      minr++;
    }
  }
}*/

//Spiral Traversal 2nd question
/*import java.io.*;

import java.util.*;

class stateofSpiral {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    int minrow = 0;
    int mincol = 0;
    int maxrow = arr.length - 1;
    int maxcol = arr[0].length - 1;


    int tne = n * m;     //total numbers of elements
    int count = 0;

    while (count < tne) {

      //left wall
      if (count < tne) {
        for (int i = minrow; i <= maxrow; i++) {
          System.out.println(arr[i][mincol]);
          count++;
        }
      }
      mincol++;

      //bottom wall
      if (count < tne) {
        for (int i = mincol; i <= maxcol; i++) {
          System.out.println(arr[maxrow][i]);
          count++;
        }
      }
      maxrow--;

      //right wall
      if (count < tne) {
        for (int i = maxrow; i >= minrow; i--) {
          System.out.println(arr[i][maxcol]);
          count++;
        }
      }
      maxcol--;

      //top wall
      if (count < tne) {
        for (int i = maxcol; i >= mincol; i--) {
          System.out.println(arr[minrow][i]);
          count++;
        }
      }
      minrow++;
    }
  }
}*/

//Exit point of a Matrix
/*import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] arr=new int[n][m];

    for (int i=0; i<n; i++) {
      for (int j=0; j<m; j++) {
        arr[i][j]=sc.nextInt();
      }
    }
    int dir=0;
    int i=0;
    int j=0;

    while(true)
    {
        dir=(dir + arr[i][j]) % 4;
        if (dir==0) { //east
          j++;
        }else if (dir==1) { //south
          i++;
        }else if (dir == 2) { //west
          j--;
        }else if (dir == 3) { //north
          i--;
        }

        if (i<0) {
          i++;
          break;
        }else if (j<0) {
          j++;
          break;
        }else if (i == arr.length) {
          i--;
          break;
        }else if (j == arr[0].length) {
          j--;
          break;
        }
    }
    System.out.println(i);
    System.out.println(j);
  }
}*/

//Transpose of a matrix
/*import java.util.*;
class Main{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int[][] arr=new int[n][n];

      for (int i=0; i<arr.length; i++) {
        for (int j=0; j<arr[0].length; j++) {
            arr[i][j]=sc.nextInt();
        }
      }
      for (int i=0; i<arr.length; i++) {
        for (int j=0; j<arr[0].length; j++) {
          System.out.print(arr[i][j]);
        }
        System.out.println();
      }
      for (int i=0; i<arr.length; i++) {
        for (int j=i; j<arr[0].length; j++) {
          int temp=arr[i][j];
          arr[i][j]=arr[j][i];
          arr[j][i]=temp;
        }
      }
      for (int i=0; i<arr.length; i++) {
        for (int j=0; j<arr[0].length; j++) {
          System.out.print(arr[i][j]);
        }
        System.out.println();
        
      }
  }
}*/

//Shell Rotate
/*import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();

    int[][] arr=new int[n][m];
    for (int i=0; i<arr.length; i++) {
      for (int j=0; j<arr[0].length; j++) {
        arr[i][j]=sc.nextInt();
      }
    }

    int s = sc.nextInt();
    int r = sc.nextInt();

    rotateShell(arr, s, r);
    display(arr);
  }

  public static void rotateShell(int[][] arr, s, r)
  {
    int[] oned=fillOnedFromShell(arr, s);
    rotate(oned, r);
    fillShellFromOned(arr, s, oned);
  }
  public static int[] fillOnedFromShell(int[][] arr,int s)
  {
    int minr=s-1;
    int minc=s-1;
    int maxr=arr.length-s;
    int maxc=arr[0].length-s;
    int sz=2 * (maxr - minr + maxr - minc);

    int[] oned=new int[sz];

    //lw
    int idx=0;
    for (int i=minr, j=minc; i<=maxr; i++) {
      oned[idx] = arr[i][j];
      idx++;
    }
    //bw
    for (int i=minr, j=minc; j<=maxc; j++) {
      oned[idx] = arr[i][j];
      idx++;
    }
    //rw
    for (int i=maxr - 1, j=maxc; i>=minr; i--) {
      oned[idx] = arr[i][j];
      idx++;
    }
    //tw
    for (int i=minr, j=maxc-1; j>=minc+1; j--) {
      oned[idx] = arr[i][j];
      idx++;
    }
    return oned;
  }
  public static void fillShellFromOned(int[][] arr,int s, int[] oned){
    int minr=s-1;
    int minc=s-1;
    int maxr=arr.length-s;
    int maxc=arr[0].length-s;

    //lw
    int idx=0;
    for (int i=minr, j=minc; i<=maxr; i++) {
      arr[i][j]=oned[idx];
      idx++;
    }
    //bw
    for (int i=minr, j=minc; j<=maxc; j++) {
      arr[i][j]=oned[idx];
      idx++;
    }
    //rw
    for (int i=maxr - 1, j=maxc; i>=minr; i--) {
      arr[i][j]=oned[idx];
      idx++;
    }
    //tw
    for (int i=minr, j=maxc-1; j>=minc+1; j--) {
      arr[i][j]=oned[idx];
      idx++;
    }
  }

  public static void rotate(int[] oned, int r)
  {
    r=r%oned.length;
    if (r<0) {
      r=r+oned.length;
    }

    reverse(oned, 0, oned.length-r-1);
    reverse(oned, oned.length-r, oned.length-1);
    reverse(oned, 0, oned.length-1);
  }

  public static void reverse(int[] oned, int li, int ri){
    while(li<ri){
      int temp=oned[li];
      oned[li]=oned[ri];
      oned[ri]=temp;

      li++;
      ri--;
    }
  }

  public static void display(int[][] arr)
  {
    for (int i=0; i<arr.length; i++) {
      for (int j=0; j<arr.length; j++) {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}*/

//Ring Rotate Array
/*import java.io.*;
import java.util.*;

class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int m = Integer.parseInt(br.readLine());
      int[][] arr = new int[n][m];

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            arr[i][j] = Integer.parseInt(br.readLine());
         }
      }

      int s = Integer.parseInt(br.readLine());
      int r = Integer.parseInt(br.readLine());
      shellrotate(arr, s, r);
      display(arr);
   }

   public static void shellrotate(int[][] arr, int s, int r) {
      int[] larr = fillLinear(arr, s);
      rotate(larr, r);
      fill2d(arr, larr, s);
   }

   public static int[] fillLinear(int[][] arr, int s) {
      int r2d = arr.length;
      int c2d = arr[0].length;
      int rshell = r2d - 2 * (s - 1);
      int cshell = c2d - 2 * (s - 1);
      int szshell = 2 * (rshell + cshell) - 4;

      int[] larr = new int[szshell];

      int rmin = s - 1;
      int cmin = s - 1;
      int rmax = arr.length - 1 - (s - 1);
      int cmax = arr[0].length - 1 - (s - 1);

      // left wall
      int idx = 0;
      for (int i = rmin; i <= rmax; i++) {
         larr[idx] = arr[i][cmin];
         idx++;
      }

      // bottom wall
      for (int j = cmin + 1; j <= cmax; j++) {
         larr[idx] = arr[rmax][j];
         idx++;
      }

      // right wall
      for (int i = rmax - 1; i >= rmin; i--) {
         larr[idx] = arr[i][cmax];
         idx++;
      }

      // top wall
      for (int j = cmax - 1; j >= cmin + 1; j--) {
         larr[idx] = arr[rmin][j];
         idx++;
      }

      return larr;
   }

   public static void fill2d(int[][] arr, int[] larr, int s) {
      int rmin = s - 1;
      int cmin = s - 1;
      int rmax = arr.length - 1 - (s - 1);
      int cmax = arr[0].length - 1 - (s - 1);

      // left wall
      int idx = 0;
      for (int i = rmin; i <= rmax; i++) {
         arr[i][cmin] = larr[idx];
         idx++;
      }

      // bottom wall
      for (int j = cmin + 1; j <= cmax; j++) {
         arr[rmax][j] = larr[idx];
         idx++;
      }

      // right wall
      for (int i = rmax - 1; i >= rmin; i--) {
         arr[i][cmax] = larr[idx];
         idx++;
      }

      // top wall
      for (int j = cmax - 1; j >= cmin + 1; j--) {
         arr[rmin][j] = larr[idx];
         idx++;
      }
   }

   public static void rotate(int[] larr, int r) {
      r = r % larr.length;
      if (r < 0) {
         r += larr.length;
      }

      reverse(larr, 0, larr.length - 1 - r);
      reverse(larr, larr.length - r, larr.length - 1);
      reverse(larr, 0, larr.length - 1);
   }

   public static void reverse(int[] arr, int i1, int i2) {
      int li = i1;
      int ri = i2;
      while (li < ri) {
         int temp = arr[li];
         arr[li] = arr[ri];
         arr[ri] = temp;

         li++;
         ri--;
      }
   }

   public static void display(int[][] arr) {
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[0].length; j++) {
            System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      }
   }

}*/
//Diagonal Traversal
/*import java.util.*;
class Main
{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int[][] arr=new int[n][n];

    for (int i=0; i<arr.length; i++) {
      for (int j=0; j<arr[0].length; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    for (int g=0; g<arr.length; g++) {
      for (int i=0, j=g; j<arr.length; i++, j++) {
        System.out.println(arr[i][j]);
      }
      //System.out.println();
    }
  }
}*/

//Saddel Point
/*import java.util.*;
class Main
{ 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];

        for(int i=0; i<arr.length;i++)
        {
          for(int j=0; j<arr[0].length; j++)
          {
              arr[i][j] = sc.nextInt();
          }
        }
        

        for(int g=0; g<arr.length; g++)
        {
          int svj=0;
          for(int h=1; h<arr[0].length; h++)
          {
            svj=h;
          }
        

          boolean flag=true;
          for(int k=0; k<arr.length; k++)
          {
            if(arr[k][svj] > arr[g][svj]){
              flag=false;
              break;
            }
          }
          if(flag==true)
          {
            System.out.println(arr[g][svj]);
            return;
          }
        }
        System.out.println("Invalid input");
    }
}*/

//Search in a sorted array
/*import java.util.*;
class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[][] arr=new int[n][n];
    for(int i=0; i<arr.length; i++)
    {
      for(int j=0; j<arr[0].length; j++)
      {
        arr[i][j] = sc.nextInt();
      }
    }

    int data=sc.nextInt();

    int i=0;
    int j=arr[0].length-1;

    while(i<arr.length && j>=0)
    {
      if (data == arr[i][j]) {
        System.out.println(i);
        System.out.println(j);
        return;
      }else if (data < arr[i][j]) {
        j--;
      }else {
        i++;
      }
    }
    System.out.println("Not Found");
  }
}*/

//String String Builder and ArrayList

//Print All Palindrome SubString
/*import java.util.*;

class Main{

  public static boolean isPalindrome(String s){
    int i=0;
    int j=s.length()-1;

    while(i < j){
      char ch1=s.charAt(i);
      char ch2=s.charAt(j);

      if(ch1 != ch2){
        return false;
      }else {
        i++;
        j--;
      }
    }
    return true;
  }

  public static void Solution(String str){
    for(int i=0; i<str.length(); i++)
    {
      for(int j=i+1; j<=str.length(); j++)
      {
        String ss=str.substring(i,j);
        if(isPalindrome(ss) == true)
        {
          System.out.println(ss);
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str=sc.next();
    Solution(str);
  }
}*/

//String Compresson
/*import java.util.*;
class Main{

  public static String compression1(String str){
    String s= str.charAt(0)+"";
    for(int i=1; i<str.length(); i++)
    {
      char curr = str.charAt(i);
      char prev = str.charAt(i-1);

      if (curr != prev) {
        s=s+curr;
      }
    }
    return s;
  }

  public static String compression2(String str){
    String s= str.charAt(0)+"";
    int count=1;
    for(int i=1; i<str.length(); i++)
    {
      char curr = str.charAt(i);
      char prev = str.charAt(i-1);

      if (curr == prev) {
        count++;
      }else {
        if(count > 1){
          s=s+count;
          count = 1;
        }
        s=s+curr;
      }
    }
    if(count > 1){
          s=s+count;
          count = 1;
        }

    return s;
  }

  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    String str=sc.next();
    System.out.println(compression1(str));
    System.out.println(compression2(str));
  }
}*/

//StringBuilder Example
/*class Main
{
  public static void main(String[] args) {
    StringBuilder sb= new StringBuilder("hello");
    System.out.println(sb);

    char ch=sb.charAt(0);   //get
    System.out.println(ch);

    sb.setCharAt(0,'d');    //update
    System.out.println(sb);

    sb.insert(2, 'y');    //insert
    System.out.println(sb);

    sb.deleteCharAt(2);   //remove
    System.out.println(sb);

    sb.append('g');   //append
    System.out.println(sb);

    System.out.println(sb.length());

    int n=10000000;

    long start = System.currentTimeMillis();

    String s="";
    for(int i=0; i<n; i++)
    {
      s=s+i;
    }

    for(int i=0; i<n; i++)
    {
      sb.append(i);
    }
    long end=System.currentTimeMillis();
    long duration = end-start;
    System.out.println(duration);
  }
}*/



//Toggle Case
/*import java.util.*;
class Main
{
  public static String toggleCase(String str){
    StringBuilder sb=new StringBuilder(str);

    for(int i=0; i<sb.length(); i++)
    {
      char ch = sb.charAt(i);

      if (ch >= 'a' && ch <= 'z') {
        char upch=(char)('A' + ch - 'a');
        sb.setCharAt(i, upch);
      }else if (ch >= 'A' && ch <= 'Z') {
        char lwch=(char)('a' +  ch - 'A');
        sb.setCharAt(i, lwch);
      }
    }
    return sb.toString();
  }
  public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     String str=sc.next();
     System.out.println(toggleCase(str)); 
  }
}*/

//Append consucutive number
/*import java.util.*;

class Main {

  public static String solution(String str){
    // write your code here
    StringBuilder sb = new StringBuilder();
    sb.append(str.charAt(0));
    
    for(int i=1; i<str.length();i++)
    {
        char curr = str.charAt(i);
        char prev = str.charAt(i-1);
        int diff = curr - prev;
        
        sb.append(diff);
        sb.append(curr);
    }

    return sb.toString();
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(solution(str));
  }

}*/

//Permutation of a String
/*import java.util.*;

class Main
{

  public static void PermutationString(String str){
    int n=str.length();
    int fact = Factorial(n);

    for(int i=0; i<fact; i++)
    {
        StringBuilder sb = new StringBuilder(str);
        int temp = i;
        for (int div=n; div>=1; div--) {
          int q= temp/div;
          int r=temp%div;

          System.out.print(sb.charAt(r));
          sb.deleteCharAt(r);

          temp=q;
        }
        System.out.println();
    }


  }
  public static int Factorial(int n)
  {
    int val =1;
    for(int i=1; i<=n; i++)
    {
      val = val*i;

    }
    return val;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    PermutationString(str);
  }
}*/

//ArrayList in java
/*import java.util.*;
class Main
{
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    System.out.println(list +" -> " + list.size());

    list.add(10);
    list.add(20);
    list.add(30);
    System.out.println(list+" -> "+list.size());

    list.add(1, 1000);
    System.out.println(list +" -> "+list.size());

    int val = list.get(1);   //not list[1]
    System.out.println(val);

    list.set(1,2000);   //not list[1] = 2000
    System.out.println(list+" -> "+list.size());

    list.remove(1);
    System.out.println(list+" -> "+list.size());

    ArrayList<String> l2=new ArrayList<>();
    l2.add("hello");
    l2.add("Hi");
    l2.add("Bye");
    System.out.println(l2+ " -> " +l2.size());

    /*for (int i=0; i<list.size(); i++) {
      int val1 = list.get(i);
      System.out.println(val1);
    }*/

    /*for(int val1 : list)
    {
      System.out.println(val1);
    }

    System.out.println(list);
  }
}*/

//Remove all Primes in a list
/*import java.util.*;
class Main
{

  public static boolean isPrime(int n)
  {
    for(int div=2; div*div <= n; div++)
    {
      if(n%div == 0){
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
      if(isPrime(val) == true){
        list.remove(i);
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();

    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0; i<n; i++)
    {
      list.add(sc.nextInt());
    }
    solution(list);
    System.out.println(list);
  }
}*/

//Increseing Decriseing Recursion
/*import java.util.*;
class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    pdi(n);
  }
  public static void pdi(int n)
  {
    if(n==0)
    {
      return;
    }
    System.out.println(n);
    pdi(n-1);
    System.out.println(n);
  }
}*/

//Factorial of a Number
/*import java.util.*;
class Fact
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int f = Factorial(n);
    System.out.println(f);
  }
  public static int Factorial(int n)
  {
    if(n==1)
    {
      return 1;
    }

    int fn1 = Factorial(n-1);
    int fn = n*fn1;
    return fn;
  }
}*/

//Calculate Power useing recursion
/*import java.util.*;
class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    int xn = Power(x, n);
    System.out.println(xn);
  }
  public static int Power(int x, int n)
  {
    if (n == 0) {
      return 1;
    }
    int xn1 = Power(x, n-1);
    int xn2 = x * xn1;
    return xn2;
  }
}*/

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
    {
      return;
    }
      System.out.println("pre " +n);
      pzz(n-1);
      System.out.println("Intial "+n);
      pzz(n-1);
      System.out.println("post "+n);
  }
}*/

//Tower of Hanoi Question
/*import java.util.*;
class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int t1d = sc.nextInt();
    int t2d = sc.nextInt();
    int t3d = sc.nextInt();

    toh(n, t1d, t2d, t3d);
  }

  public static void toh(int n, int t1d, int t2d, int t3d)
  {
      if(n == 0)
      {
        return;
      }
      toh(n-1, t1d, t3d, t2d);
      System.out.println(n + "[" + t1d + "->" + t2d + "]");
      toh(n-1, t3d, t2d, t1d);   
  }
}*/

//Print Array using Recursion
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

      display(arr, 0);
    }
    
    public static void display(int[] arr, int idx)
    {
      if(idx == arr.length)
      {
        return;
      }
      System.out.println(arr[idx]);
      display(arr, idx+1);
    }
}*/

//Reverse an Array using Array
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int n= sc.nextInt();

      int[] arr = new int[n];
      for(int i=0; i<n; i++)
      {
        arr[i] = sc.nextInt();
      }

      ReverseArray(arr, 0);
    }
    public static void ReverseArray(int[] arr, int idx)
    {
        if(idx == arr.length)
        {
          return;
        }
        ReverseArray(arr, idx+1);
        System.out.println(arr[idx]);
    }
}*/

//Find Maxmum using recursion
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

      int max = MaxElementInArray(arr, 0);
      System.out.println(max);
    }
    public static int MaxElementInArray(int[] arr, int idx)
    {
        if(idx == arr.length-1)
        {
          return arr[idx];
        }

        int max1 = MaxElementInArray(arr, idx+1);
        if(max1 > arr[idx])
        {
          return max1;
        }
        else {
          return arr[idx];
        }
    }
}*/

//First Index of an element in an Array
/*import java.util.*;
class Manin
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
      int fidx = FindFirstIndex(arr, 0, x);
      System.out.println(fidx);
    }
    public static int FindFirstIndex(int[] arr, int idx, int x)
    {
        if(idx == arr.length)
        {
          return -1;
        }
        /*if(arr[idx] == x)
        {
          return idx;
        }else {
          int fidx1 = FindFirstIndex(arr, idx+1, x);
          return fidx1;
        //}

        int fidx1 = FindFirstIndex(arr, idx+1, x);
        if(arr[idx] == x)
        {
          return idx;
        }else {
          
          return fidx1;
        }
    }
}*/

//Find Last Index of an array
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
        int lidx = LastindexOfAnArray(arr, 0, x);
        System.out.println(lidx);
    }
    public static int LastindexOfAnArray(int[] arr, int idx, int x)
    {
        if(idx == arr.length)
        {
           return -1;
        }

        int lidx1 = LastindexOfAnArray(arr, idx+1, x);
        if(lidx1 == -1)
        {
            if(x == arr[idx])
            {
              return idx;
            }
            else {
              return -1;
            }
        }else {
          return lidx1;
        }
    }
}*/

//Print All Index of an Array
/*import java.util.*;
class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr = new int[n];

    for(int i=0; i<n; i++)
    {
      arr[i] = sc.nextInt();
    }
    int x = sc.nextInt();

    int[] allidx = AllIndexces(arr, x, 0, 0);

    if(allidx.length == 0)
    {
        System.out.println();
        return;
    }

    for(int i=0; i<allidx.length; i++)
    {
      System.out.println(allidx[i]);
    }
  }
  public static int[] AllIndexces(int[] arr, int x, int idx, int fsf)
  {
      if(idx == arr.length)
      {
          return new int[fsf];
      }

      if(arr[idx] == x)
      {
        int[] allidx = AllIndexces(arr, x, idx+1, fsf+1);
        allidx[fsf] = idx;
        return allidx;
      }else {
        int[] allidx = AllIndexces(arr, x, idx+1, fsf);
        return allidx;
      }
  }
}*/

//String and StringBuilder
/*
import java.util.*;
class Main
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);*/
      /*String s = "Hello";*/

      //String s1 = sc.next();
      //String s2 = sc.nextLine();
      //System.out.println(s1);
      //System.out.println(s1.length());
      //System.out.println(s2);
      //System.out.println(s2.length());

      /*char val = s1.charAt(1);
      System.out.println(val);*/
      /*for(int i=0; i<s1.length(); i++)
      {
          char val = s1.charAt(i);
          System.out.println(val);
      }*/

      /*String s = "abcd";
      for(int i=0; i<s.length(); i++)
      {
          for(int j=i+1; j<=s.length(); j++)
          {
            System.out.println(s.substring(i, j));
          }
        }*/

        /*String s1="abcd";
        s1 +=' ';
        s1 +='e';
        s1 +='f';
        s1+=10;*/
        /*String s2 = "cdef";
        String s3 = s1 +" "+s2;*/
        //System.out.println(s1);

        /*System.out.println("Hello"+10+20);
        System.out.println(10+20+"hello");*/

        /*String s = "abc def ghi jkl";
        String[] parts = s.split(" ");*/
        /*String s = "abc,def,ghi,jkl";
        String[] parts = s.split(",");
        for(int i=0; i<parts.length; i++)
        {
          System.out.println(parts[i]);
        }
    }
}*/

//Get Subsequence in recursion
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      ArrayList<String> res = GetSubSequence(str);
      System.out.println(res);
    }
    public static ArrayList<String> GetSubSequence(String str){
        if(str.length() == 0){
          ArrayList<String> baser = new ArrayList<>();
          baser.add("");
          return baser;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = GetSubSequence(ros);

        ArrayList<String> mres = new ArrayList<>();
        for(String rstr : rres)
        {
          mres.add(""+rstr);
        }
        for(String rstr : rres){
          mres.add(ch + rstr);
        }
        return mres;
    }
}*/


/*Ascii code - 
a - 97
0 - 48
1 - 49*/

//GetKeyPad Solution
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = GetKPC(str);
        System.out.println(words);
    }

    static String[] codes = {",;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> GetKPC(String str)
    {
        if(str.length() == 0){
          ArrayList<String> base = new ArrayList<>();
          base.add("");
          return base;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = GetKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        String codeforch = codes[ch - '0'];
        for(int i=0; i<codeforch.length(); i++)
        {
            char chcode = codeforch.charAt(i);
            for(String rstr : rres)
            {
              mres.add(chcode + rstr);
            }
        }
        return mres;
    }
}*/

//Get Stair Path
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      ArrayList<String> paths = getStairsPaths(n);
      System.out.println(paths);
    }
    public static ArrayList<String> getStairsPaths(int n)
    {
        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n < 0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> paths1 = getStairsPaths(n-1);
        ArrayList<String> paths2 = getStairsPaths(n-2);
        ArrayList<String> paths3 = getStairsPaths(n-3);
        ArrayList<String> paths = new ArrayList<>();

        for(String path : paths1)
        {
            paths.add(1+path);
        }
        for(String path : paths2)
        {
          paths.add(2+path);
        }
        for(String path : paths3)
        {
          paths.add(3+path);
        }
        return paths;
    }
}*/

//Get Mez Path Solution
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      ArrayList<String> paths = GetMezPath(1, 1, n, m);
      System.out.println(paths);
    }

    //sr = source row
    //sc = source column
    //dr = destination row
    //dc = destination column
    public static ArrayList<String> GetMezPath(int sr, int sc, int dr, int dc)
    {
        if(sr == dr && sc == dc)
        {
          ArrayList<String> baser = new ArrayList<>();
          baser.add("");
          return baser;
        }


        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if(sc < dc)
        {
            hpaths = GetMezPath(sr, sc+1, dr, dc);
        }
        if(sr < dr)
        {
            vpaths = GetMezPath(sr+1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();
        for(String hpath : hpaths)
        {
          paths.add("h"+hpath);
        }
        for(String hpath : vpaths)
        {
          paths.add("v"+hpath);
        }

        return paths;
    }
}*/

//Get Mez Path Jump
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> paths = getMezPathJump(1, 1, n, m);
        System.out.println(paths);
    }
    public static ArrayList<String> getMezPathJump(int sr, int sc, int dr, int dc)
    {
        if(sr == dr && sc == dc)
        {
          ArrayList<String> baser = new ArrayList<>();
          baser.add("");
          return baser;
        }

        ArrayList<String> paths = new ArrayList<>();

        //horizontal moves
        for(int ms = 1; ms <= dc-sc; ms++)
        {
           ArrayList<String> hpaths = getMezPathJump(sr, sc+ms, dr, dc);
           
           for(String path : hpaths)
           {
              paths.add("h"+ms+path);
           }
        }

        //vertical moves
        for(int ms=1; ms <= dr-sr; ms++)
        {
            ArrayList<String> vpaths = getMezPathJump(sr+ms, sc, dr, dc);
            for(String vpath : vpaths)
            {
              paths.add("v"+ms+vpath);
            }
        }

        //Diagonal moves
        for(int ms=1; ms <= dr-sr && ms <= dc-sc; ms++)
        {
            ArrayList<String> dpaths = getMezPathJump(sr+ms, sc+ms, dr, dc);
            for(String dpath : dpaths)
            {
              paths.add("d"+ms+dpath);
            }
        }
        return paths;
    }
}*/

//Print Sub Sequence
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printss(str, "");     
    }
    public static void printss(String ques, String ans)
    {
        if(ques.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        printss(roq, ans+ch);
        printss(roq, ans+"");
    }
}*/

//Print KPC
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printKPC(str, "");
    }

    public static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printKPC(String str, String ans)
    {
        if(str.length() == 0)
        {
          System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String roq = str.substring(1);

        String codesforch = codes[ch - '0'];
        for(int i=0; i<codesforch.length(); i++)
        {
            char cho = codesforch.charAt(i);
            printKPC(roq, ans+cho);
        }
    }
}*/

//Print Stair paths
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
        if(n < 0)
        {
              return;
        }
        if(n == 0)
        {
            System.out.println(path);
            return;
        }

        printStairPath(n-1, path + "1");
        printStairPath(n-2, path + "2");
        printStairPath(n-3, path + "3");
    }
}*/

//Print Maze path
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMezPath(1, 1, n, m, "");
    }
    //sr - source row
    //sc - source column
    //dr - destination row
    //dc - destination column
    public static void printMezPath(int sr, int sc, int dr, int dc, String psf)
    {
        if(sr > dr || sc > dc)
        {
          return;
        }
        if(sr == dr && sc == dc)
        {
            System.out.println(psf);
            return;
        }

        printMezPath(sr, sc+1, dr, dc, psf+"h");
        printMezPath(sr+1, sc, dr, dc, psf+"v");
    }
}*/

//Get Maze path with jump
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMezPathJump(1, 1, n, m, "");
    }
    //sr - source row
    //dr - destination row
    //sc -  source column
    //dc - destination column
    public static void printMezPathJump(int sr, int sc, int dr, int dc, String psr)
    {
        if(sr == dr && sc== dc)
        {
            System.out.println(psr);
            return;
        }

        for(int ms=1; ms<=dc-sc; ms++)
        {
            printMezPathJump(sr, sc+ms, dr, dc, psr+"h"+ms);
        }
        for(int ms=1; ms<=dr-sr; ms++)
        {
            printMezPathJump(sr+ms, sc, dr, dc, psr+"v"+ms);
        }
        for(int ms=1; ms<=dc-sc && ms<=dr-sr; ms++)
        {
            printMezPathJump(sr+ms, sc+ms, dr, dc, psr+"d"+ms);
        }
    }
}*/

//Print all Permutation
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        
        printPermutation(str, "");
    }
    public static void printPermutation(String str, String psf)
    {
        if(str.length() == 0)
        {
            System.out.println(psf);
            return;
        }

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            String lpart = str.substring(0,i);
            String rpart = str.substring(i+1);
            String roq = lpart+rpart;
            printPermutation(roq, psf+ch);
        }
    }
}*/

//Print Encodeings
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncodeings(str, "");

    }
    public static void printEncodeings(String ques, String asf)
    {
        if(ques.length() == 0)
        {
            System.out.println(asf);
            return;
        }else if(ques.length() == 1){
            char ch = ques.charAt(0);
            if(ch == '0')
            {
                return;
            }else{
                int chv = ch - '0';
                char code = (char)('a' + chv - 1);
                System.out.println(asf + code);
            }

        }else{
            char ch = ques.charAt(0);
            String roq = ques.substring(1);

            if(ch == 0)
            {
                return;
            }else{
                int chv = ch - '0';
                char code = (char)('a' + chv - 1);
                printEncodeings(roq, asf+code);
            }

            String ch12 = ques.substring(0, 2);
            String roq12 = ques.substring(2);

            int ch12v = Integer.parseInt(ch12);
            if(ch12v <= 26){
              char code = (char) ('a' + ch12v -1);
              printEncodeings(roq12, asf+code);
            }
        }
    }
}*/

//Print ASCII value
/*import java.util.*;
class Main
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);
        int a = ch;

        //int a = 'a';
        //int b = 'b';*
        System.out.println(a);
        //System.out.println(b);
    }
}*/

//practice
/*class Main
{
  public static void main(String[] args) {
    //PriorityAueue<integer> queue = new PriorityAueue<>();
    //queue.add(4);
    //queue.add(2);
    

    //System.out.println("apple".compareTo("banana"));
    //String[] arr = {"abc", "2", "10","0"};
    String msg = "Hello World!";
    String nmsg = msg.substring(6, 12) + msg.substring(12, 6);
    System.out.println(nmsg);
  }
}*/

//Flood Fill Data structure and Algorithem
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

        boolean[][] visited = new boolean[n][m];
        floodFill(arr, 0, 0, "", visited);
    }
    public static void floodFill(int[][] arr, int row, int col, String psf, boolean[][] visited)
    {
        if(row<0 || col<0 || row == arr.length || col == arr[0].length || arr[row][col] == 1 || visited[row][col] == true)
        {
            return;
        }

        if(row == arr.length-1 && col == arr[0].length-1)
        {
            System.out.println(psf);
            return;
        }

         visited[row][col] = true;
         floodFill(arr, row-1, col, psf+"t", visited);
         floodFill(arr, row, col-1, psf+"l", visited);
         floodFill(arr, row+1, col, psf+"d", visited);
         floodFill(arr, row, col+1, psf+"r", visited);
         visited[row][col] = false;  
    }
}*/

//Target SUM subset
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

        int tar = sc.nextInt();
        printTargetSum(arr, 0, "", 0, tar);
    }
    public static void printTargetSum(int[] arr, int idx, String set, int sos, int tar)
    {
        if(sos > tar)
        {
          return;
        }

        if(idx == arr.length){
          if(sos == tar)
          {
              System.out.println(set+" ");
              
          }
          return;
        }

        printTargetSum(arr, idx+1, set+arr[idx]+",", sos+arr[idx],tar);
        printTargetSum(arr, idx+1, set, sos, tar);
    }
}*/

//N queen Problem
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        printNqueens(arr, "", 0);
    }

    public static void printNqueens(int[][] arr, String qsf, int row)
    {
        if(row == arr.length)
        {
            System.out.println(qsf);
            return;
        }

        for(int col=0; col<arr.length; col++)
        {
            if(isCheckSafeOrNot(arr, row, col) == true){
                arr[row][col] = 1;
                printNqueens(arr, qsf+row+"-"+col+", ",row+1);
                arr[row][col] = 0;       
            }
        }
    }

    public static boolean isCheckSafeOrNot(int[][] chess, int row, int col)
    {
        for(int i=row-1, j=col; i>=0; i--)
        {
            if(chess[i][j] == 1)
            {
              return false;
            }
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--)
        {
            if(chess[i][j] == 1)
            {
              return false;
            }
        }
        for(int i=row-1, j=col+1; i>=0 && j<chess.length; i--, j++)
        {
            if(chess[i][j] == 1)
            {
              return false;
            }
        }
        return true;
    }
}*/

//Knights Tour 
import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[n][n];
        printKnightsTour(arr, row, col, 1);

    }
    public static void printKnightsTour(int[][] chess, int r, int c, int m)
    {
        if(r<0 || c<0 || r>=chess.length || c>=chess.length || chess[r][c]>0)
        {
            return;
        }else if(m == chess.length*chess.length){
            chess[r][c] = m;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }

        chess[r][c] = m;
        printKnightsTour(chess, r-2, c+1, m+1);
        printKnightsTour(chess, r-1, c+2, m+1);
        printKnightsTour(chess, r+1, c+2, m+1);
        printKnightsTour(chess, r+2, c+1, m+1);
        printKnightsTour(chess, r+2, c-1, m+1);
        printKnightsTour(chess, r+1, c-2, m+1);
        printKnightsTour(chess, r-1, c-2, m+1);
        printKnightsTour(chess, r-2, c-1, m+1);
        chess[r][c] = 0;

    }
    public static void displayBoard(int[][] chess)
    {
        for(int i=0; i<chess.length; i++)
        {
            for(int j=0; j<chess[0].length; j++)
            {
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
    }

}

//Bubble Sort
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

        bubbleSort(arr);
        System.out.println();
        printArr(arr);
    }

    public static void bubbleSort(int[] arr)
    {
        for(int itr=1; itr<=arr.length-1; itr++)
        {
            for(int j=0; j<arr.length-itr; j++)
            {
                if(isCompare(arr, j+1, j) == true)
                {
                    swap(arr, j+1, j);
                }
            }
        }
    }

    public static boolean isCompare(int[] arr, int i, int j)
    {
      System.out.println();
        System.out.println("Compareing "+arr[i]+" with "+arr[j]);
        if(arr[i]<arr[j])
        {
            return true;
        }else {
          return false;
        }
    }

    public static void swap(int[] arr, int i, int j)
    {
        
        System.out.println("Swap "+arr[i]+" with "+arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArr(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            
            System.out.println(arr[i]);
        }
    }
}*/

//Selection Sort Algorithem
/*import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);
        printArr(arr);
    }
    public static void selectionSort(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
          int minidx = i;
          for(int j = i + 1;j < n; j++){
              if(isCompareSmall(arr, j, minidx)){
              minidx = j;
            }
        }
        swap(arr, i, minidx);
    }
        
    }
    public static boolean isCompareSmall(int[] arr, int i, int j)
    {
        if(arr[i] < arr[j])
        {
          return true;
        }else {
          return false;
        }
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArr(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
*/
    /*public static void selectionSort(int[] arr) {
    int n = arr.length;
    for(int i = 0; i < n - 1; i++){
      int minidx = i;
      for(int j = i + 1;j < n; j++){
          if(isSmaller(arr, j, minidx)){
            minidx = j;
          }
      }
      swap(arr, i, minidx);
    }
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    //System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // return true if ith element is smaller than jth element
  public static boolean isSmaller(int[] arr, int i, int j) {
    //System.out.println("Comparing " + arr[i] + " and " + arr[j]);
    if (arr[i] < arr[j]) {
      return true;
    } else {
      return false;
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    selectionSort(arr);
    print(arr);
  }*/
//}

//Insertation sort
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        insertationSort(arr);
        printArr(arr);
    }

    public static void insertationSort(int[] arr)
    {
        for(int i=1; i<arr.length; i++)
        {
            for(int j=i-1; j>=0; j--)
            {
                if(isGrater(arr, j, j+1) == true)
                {
                    swap(arr, j, j+1);
                }else {
                  break;
                }
            }
        }
    }

    public static boolean isGrater(int[] arr, int i, int j)
    {
        if(arr[i] < arr[j])
        {
            return true;
        }else {
          return false;
        }
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArr(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
          System.out.println(arr[i]);
        }
    }
}*/

//Merge Two Sorted Array
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for(int j=0; j<b.length; j++)
        {
            b[j] = sc.nextInt();
        }

        int[] ans = mergeTwoSortArray(a, b);
        for(int i=0; i<ans.length; i++)
        {
          System.out.println(ans[i]);
        }
    }

    public static int[] mergeTwoSortArray(int[] a, int[] b)
    {
        int[] res = new int[a.length + b.length];

        int i=0;
        int j=0;
        int k=0;

        while(i < a.length && j < b.length)
        {
            if(a[i] < b[j])
            {
                res[k] = a[i];
                i++;
                k++;
            }else{
              res[k] = b[j];
              j++;
              k++;
            }
        }

        while(i < a.length)
        {
            res[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length)
        {
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }
}*/

//Merge Sort Solution
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
        int le = arr.length-1;
        int[] sa = mergeSort(arr, 0, le);
        System.out.println("\nSorted Array is : \n");
        print(sa);
    }

    public static void print(int[] sa)
    {
        for(int i=0; i<sa.length; i++)
        {
            System.out.println(sa[i] + " ");
        }
    }

    public static int[] mergeSort(int[] arr, int low, int high)
    {
        if(low == high)
        {
            int[] ba = new int[1];
            ba[0] = arr[low];
            return ba;
        }

        int mid = (low+high)/2;
        int[] fsh = mergeSort(arr, low, mid);
        int[] ssh = mergeSort(arr, mid+1, high);
        int[] fsa = mergeTwoArray(fsh, ssh);
        return fsa;
    }

    public static int[] mergeTwoArray(int[] a, int[] b)
    {
        System.out.println("Mergeing These Two Array : ");
        System.out.println("Left Array -> ");
        print(a);
        System.out.println("Right Array -> ");
        print(b);

        int i=0, j=0, k=0;
        int[] res = new int[a.length+b.length];
        while(i < a.length && j < b.length)
        {
            if(a[i] <= b[j])
            {
                res[k] = a[i];
                i++;
                k++;
            }else{
              res[k] = b[j];
              j++;
              k++;
            }
        }

        while(i < a.length)
        {
            res[k] = a[i];
            k++;
            i++;
        }
        while(j < b.length)
        {
            res[k] = b[j];
            k++;
            j++;
        }
        return res;
    }
}*/

//Partitioning Array
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

        int pivot = sc.nextInt();
        partitionArray(arr, pivot);
        System.out.println("Ans -> ");
        prinrt(arr);
    }
    public static void partitionArray(int[] arr, int pivot)
    {
        int i=0;
        int j=0;
        while(i < arr.length)
        {
            if(arr[i] > pivot)
            {
                i++;
            }else if(arr[i] <= pivot){
              swap(arr, i, j);
              i++;
              j++;
            }
        }
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void prinrt(int[] arr)
    {
      for(int i=0; i<arr.length; i++)
      {
        System.out.println(arr[i]);
      }
    }
}*/

//Quick Sort Algorith
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

        QuickSort(arr, 0, arr.length-1);
        print(arr);
    }
    public static void QuickSort(int[] arr, int lo, int hi)
    {
        if(lo >= hi)
        {
          return;
        }

        int pivot = arr[hi];
        int pi = partitionArray(arr, pivot, lo, hi);
        QuickSort(arr, lo, pi-1);
        QuickSort(arr, pi+1, hi);
    }
    public static int partitionArray(int[] arr, int pivot, int lo, int hi)
    {
        int i=lo, j=lo;
        while(i<=hi)
        {
            if(arr[i] <= pivot)
            {
                swap(arr, i, j);
                i++;
                j++;
            }else {
              i++;
            }
        }
        return (j-1);
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}*/

//Quick Select 
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
          arr[i] = sc.nextInt();

        }
        
        int k = sc.nextInt();
        System.out.println(quickSelect(arr, 0, arr.length-1, k-1));
        System.out.println();
        printArr(arr);
    }

    public static int quickSelect(int[] arr, int lo, int hi, int k)
    {
        int pivot = arr[hi];
        int pi=partitionArr(arr, pivot, lo, hi);
        
        if(k > pi)
        {
          return quickSelect(arr, pi+1, hi, k);
        }else if(k < pi){
          return quickSelect(arr, lo, pi-1, k);
        }else{
          return arr[pi];
        }
    }

    public static int partitionArr(int[] arr, int pivot, int lo, int hi)
    {
        int i=lo, j=lo;
        while(i<=hi)
        {
            if(arr[i] <= pivot)
            {
                swap(arr, i, j);
                i++;
                j++;
            }else{
              i++;
            }
            
        }

        return (j-1);
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArr(int[] arr)
    {
      for(int i=0; i<arr.length; i++)
      {
        System.out.println(arr[i]);
      }
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
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        countSort(arr, min, max);
        System.out.println();
        print(arr);
    }
    
    public static void print(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void countSort(int[] arr, int min, int max)
    {*/
        /*int range = max - min+1;
        int[] farr = new int[range];

        for(int i=0; i<arr.length; i++)
        {
            int idx = arr[i] - min;
            farr[idx]++;
            System.out.println(farr[idx]);
        }

        for(int i=1; i<farr.length; i++)
        {
            farr[i] = farr[i] + farr[i-1];
        }

        int[] ans = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--)
        {
            int val = arr[i];
            int pos = farr[val-min];
            int idx = pos-1;
            ans[idx] = val;
            farr[val - min]--;
        }

        for(int i=0; i<arr.length; i++)
        {
          arr[i] = ans[i];
        }*/

        /*int range = max - min + 1;
    int[] ans = new int[arr.length];
    //make frequency arr
    int[] farr = new int[range];
    for(int i = 0 ; i < arr.length; i++){
      farr[arr[i] - min]++;
    }
    //convert it into prefix sum array
    for(int i = 1 ; i < farr.length; i++){
      farr[i] += farr[i - 1];
    }
    //stable sorting(filling ans array)
    for(int i = arr.length - 1; i >= 0; i--){
      int pos = farr[arr[i] - min] - 1;
      ans[pos] = arr[i];
      farr[arr[i] - min]--;
    }
    //filling original array with the help of ans array
    for(int i = 0 ; i < arr.length; i++){
      arr[i] = ans[i];
    }
    }
}*/

//Radix Sort Algorithem
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

        radixSort(arr);
        System.out.println();
        printArr(arr);
    }
    public static void radixSort(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int val : arr)
        {
            if(val > max)
            {
                max = val;
            }
        }

        int exp = 1;
        while(exp <= max)
        {
          countSort(arr, exp);
          exp = exp*10;
        }
    }

    public static void countSort(int[] arr, int exp)
    {
        int[] ans = new int[arr.length];
        int[] farr = new int[10];

        for(int i=0; i<arr.length; i++)
        {
            farr[arr[i] / exp % 10]++;
        }

        for(int i=1; i<farr.length; i++)
        {
            farr[i] = farr[i] + farr[i - 1];
        }

        for(int i=arr.length-1; i>=0; i--)
        {
            int pos=farr[arr[i] / exp % 10] -1;
            ans[pos] = arr[i];
            farr[arr[i] / exp % 10]--;
        }

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = ans[i];
        }

        System.out.println("After sorting on "+ exp + " place -> ");
        printArr(arr);
    }

    public static void printArr(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}*/

//Sort Dates
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.next();
        }
        dateSort(arr);
        printArr(arr);
    }
    public static void dateSort(String[] arr)
    {
        countSort(arr, 1000000, 100, 32); //days
        countSort(arr, 10000, 100, 13); //months
        countSort(arr, 1, 10000, 2501); //year
    }
    public static void countSort(String[] arr, int div, int mod, int range)
    {
        String[] ans = new String[arr.length];

        int[] farr = new int[range];

        for(int i=0; i<arr.length; i++)
        {
            farr[Integer.parseInt(arr[i], 10) / div % mod]++;
        }

        for(int i=1; i<farr.length; i++)
        {
            farr[i] = farr[i] + farr[i-1];
        }

        for(int i=arr.length-1; i>=0; i--)
        {
          int pos = farr[Integer.parseInt(arr[i], 10) / div % mod] - 1;
          ans[pos] = arr[i];
          farr[Integer.parseInt(arr[i], 10) / div % mod]--;
        }

        for(int i=0; i<arr.length; i++)
        {
            arr[i]=ans[i];
        }
    }
    public static void printArr(String[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}*/

//Sort 01
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        sort01(arr);
        System.out.println();
        printArr(arr);
    }
    public static void printArr(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
           System.out.println(arr[i]);
        }
    }
    public static void sort01(int[] arr)
    {
        int i=0;
        int j =0;
        while(i < arr.length)
        {
            if(arr[i] == 1)
            {
              i++;
            }else {
              swap(arr, i, j);
              i++;
              j++;
            }
        }
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}*/

//Sort 012
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
        sort012(arr);
        System.out.println();
        printArr(arr);
    }
    public static void printArr(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void sort012(int[] arr)
    {
        int i=0;
        int j=0;
        int k=arr.length-1;
        while(i <= k)
        {
            if(arr[i] == 0)
            {
                swap(arr, i, j);
                i++;
                j++;
            }else if(arr[i] == 1){
              i++;
            }else if(arr[i] == 2){
              swap(arr, i, k);
              k--;
            }

        }
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}*/
//Target Sum Pair
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

        int target = sc.nextInt();
        targetSumPair(arr, target);
    }

    public static void targetSumPair(int[] arr, int target)
    {
        Arrays.sort(arr);

        int li=0;
        int ri=arr.length-1;

        while(li < ri)
        {
            if(arr[li] + arr[ri] < target)
            {
                li++;
            }else if(arr[li] + arr[ri] > target){
                ri--;
            }else{
              System.out.println(arr[li]+", "+arr[ri]);
              li++;
              ri--;
            }
        }
    }
}*/
//Pivot of sorted rotated array
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

        int pivot = findPivot(arr);
        System.out.println(pivot);
    }

    public static int findPivot(int[] arr)
    {
        int lo=0;
        int hi=arr.length-1;

        while(lo < hi)
        {
            int mid = (lo + hi) / 2;
            if(arr[mid] < arr[hi])
            {
                hi = mid;
            }else{
              lo=mid+1;
            }
        }
        return arr[hi];
    }
}*/

//Dynamic Programming And Greedy
//Memorization db
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fibn = fibMemorized(n, new int[n+1]);
        System.out.println(fibn);
    }
    public static int fibi(int n)
    {
        if(n==0 || n==1)
        {
          return n;
        }
        System.out.println("heloo "+n);
        int fbn1 = fibi(n-1);
        int fbn2 = fibi(n-2);
        int fbn3 = fbn1 + fbn2;

        return fbn3;
    }
    public static int fibMemorized(int n, int[] qb)
    {
        if(n==0 || n==1)
        {
            return n;
        }

        if(qb[n] != 0)
        {
          return qb[n];
        }

        int fbn1 = fibMemorized(n-1, qb);
        int fbn2 = fibMemorized(n-2, qb);
        int fbn3 = fbn1 + fbn2;

        qb[n] = fbn3;
        return fbn3;
    }
}*/
//Climbing Stair useing Tabulation
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cp = countPathTab(n);
        System.out.println(cp);
    }
    public static int countStairPath(int n, int[] qb)
    {
        //Memorization Method
        if(n == 0)
        {
          return 1;
        }else if(n < 0){
          return 0;
        }
        if(qb[n] > 0)
        {
            return qb[n];
        }
        //System.out.println("hello" + n);
        int cp1 = countStairPath(n-1, qb);
        int cp2 = countStairPath(n-2, qb);
        int cp3 = countStairPath(n-3, qb);
        int cp4 = cp1 + cp2 + cp3;

        qb[n] = cp4;
        return cp4;
    }
    public static int countPathTab(int n)
    {
        //Tabulation method
        int[] qb = new int[n+1];

        qb[0] = 1;
        for(int i=1; i<=n; i++)
        {
          
            if(i == 1)
            {
                qb[i] = qb[i-1];
            }else if(i == 2){
                qb[i] = qb[i-1] + qb[i-2];
            }else {
                qb[i] = qb[i-1] + qb[i-2] + qb[i-3];
            }

        }

        return qb[n];
    }
}*/
//Climbing Stair with jumps using dynamic programming
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

        int[] dp = new int[n+1];
        dp[n] = 1;

        for(int i=n-1; i>=0; i--)
        {
            for(int j=1; j <= arr[i] && i + j < dp.length; j++)
            {
                dp[i] = dp[i] + dp[i + j];
            }
        }

        System.out.println(dp[0]);
    }
}*/
//Climbing stair with minimum moves
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

        Integer[] dp = new Integer[n+1];
        dp[n] = 0;

        for(int i=n-1; i>=0; i--)
        {
            if(arr[i] > 0){
                int min = Integer.MAX_VALUE;

                for(int j=1; j <= arr[i] && i+j < dp.length; j++)
                {
                    if(dp[i+j] != null){
                      min = Math.min(min, dp[i+j]);
                    }
                }
                if(min != Integer.MAX_VALUE){
                    dp[i] = min+1;
                }
            }
        }
        System.out.println(dp[0]);
    }
}*/
//Minimum Cost Path Dynamic Programming
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

        int[][] dp = new int[n][m];

        for(int i=dp.length-1; i>=0; i--)
        {
            for(int j=dp[0].length-1; j>=0; j--)
            {
                if(i==dp.length-1 && j==dp[0].length-1)
                {
                    dp[i][j] = arr[i][j];
                }else if(i == dp.length-1){
                    dp[i][j] = dp[i][j+1] + arr[i][j];
                }else if(j == dp[0].length-1){
                    dp[i][j] = dp[i+1][j] + arr[i][j];
                }else{
                    dp[i][j] = Math.min(dp[i+1][j], dp[i][j+1]) + arr[i][j];
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}*/
//Path with Maxmimum gold
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

        int[][] dp = new int[n][m];
        for(int j=arr[0].length - 1; j>=0; j--)
        {
            for(int i=arr.length-1; i>=0; i--)
            {
                if(j == arr[0].length - 1){
                    dp[i][j] = arr[i][j];
                }else if(i == 0){
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
                }else if(i == arr.length-1){
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
                }else {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i + 1][j + 1], dp[i - 1][j + 1]));
                }
            }
        }

        int max = dp[0][0];
        for(int i=1; i<dp.length; i++)
        {
            if(dp[i][0] > max){
              max = dp[i][0];
            }
        }
        System.out.println(max);
    }
}*/
//Target sum subsets Dynamic programming
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

        int tar = sc.nextInt();
        boolean[][] dp = new boolean[n+1][tar+1];
        for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
                if(i == 0 && j == 0)
                {
                    dp[i][j] = true;
                }else if(i == 0){
                  dp[i][j]=false;
                }else if(j == 0){
                  dp[i][j] = true;
                }else {
                    if(dp[i-1][j] == true){
                      dp[i][j]=true;
                    }else{
                    int val = arr[i - 1];
                    if(j >= val){
                      if(dp[i - 1][j - val] == true){
                        dp[i][j] = true;
                      }
                    }
                  } 
                }
            }
        }
        System.out.println(dp[arr.length][tar]);
    }
}*/
//Coin change combination
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

        int amt = sc.nextInt();
        int[] dp = new int[amt+1];
        dp[0] = 1;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=arr[i]; j<dp.length; j++){
                dp[j] = dp[j] + dp[j - arr[i]];
            }
        }
        System.out.println(dp[amt]);
    }
}*/
//Coin Change Permutation
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] coins = new int[n];
        for(int i=0; i<coins.length; i++){
            coins[i] = sc.nextInt();
        }

        int tar = sc.nextInt();
        int[] dp = new int[tar+1];
        dp[0] = 1;
        for(int amt=1; amt <= tar; amt++)
        {
            for(int coin : coins)
            {
              //System.out.println(coin);
              if(coin <= amt){
                int ramt = amt - coin;
                //System.out.println(ramt);
                dp[amt] = dp[amt] + dp[ramt];
              }
            }
        }
        System.out.println(dp[tar]);
    }
}*/
//0-1 Knapsack Problem
/*import java.util.*;
class Main
{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int[] run=new int[n];
      int[] ball=new int[n];
      for(int i=0; i<run.length; i++)
      {
          run[i]=sc.nextInt();
      }
      for(int i=0; i<ball.length; i++)
      {
          ball[i] = sc.nextInt();
      }

      int cap = sc.nextInt();
      int[][] dp=new int[n+1][cap+1];
      for(int i=1; i<dp.length; i++)
      {
          for(int j=1; j<dp[0].length; j++)
          {
              if(j >= ball[i-1])
              {
                  int rcap = j-ball[i-1];
                  if(dp[i-1][rcap] + run[i-1] > dp[i-1][j])
                  {
                      dp[i][j]=dp[i-1][rcap] + run[i-1];
                  }else{
                    dp[i][j] = dp[i-1][j];
                  }
              }
              else
              {
                  dp[i][j]=dp[i-1][j];
              }
          }
      }
      System.out.println(dp[n][cap]);
  }
}*/

//Unbounded Knapsack using dynamic programming
/*import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] vals = new int[n];
        for(int i=0; i<n; i++)
        {
          vals[i]=sc.nextInt();
        }

        int[] wets = new int[n];
        for(int i=0; i<n; i++)
        {
          wets[i] = sc.nextInt();
        }

        int cap = sc.nextInt();
        int[] dp=new int[cap + 1];
        dp[0] = 0;
        
        for(int bagc=1; bagc<=cap; bagc++)
        {
            int max=0;
            for(int i=0; i<n; i++)
            {
                if(wets[i] <= bagc)
                {
                  int rbagc = bagc - wets[i];
                  int rbagv = dp[rbagc];
                  int tbagv = rbagv + vals[i];

                  if(tbagv > max)
                  {
                    max = tbagv;
                  }
                }
            }
            dp[bagc] = max;
        }
        System.out.println(dp[cap]);
    }
}*/

//Fractional Knapsack
/*import java.util.*;
class Main
{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      //values
      int[] vals = new int[n];
      for(int i=0; i<vals.length; i++)
      {
          vals[i] = sc.nextInt();
      }

      //weights
      int[] wets = new int[n];
      for(int i=0; i<wets.length; i++)
      {
          wets[i] = sc.nextInt();
      }
      //capacity
      int cap = sc.nextInt();

      Item[] items = new Item[n];

      for(int i=0; i<n; i++)
      {
          double r = (vals[i] * 1.0) / wets[i];
          Item item = new Item(vals[i], wets[i], r);
          items[i] = item;
      }

      //Ascending order sort on basis of radius -> r
      Arrays.sort(items);

      double vib = 0;
      int rc = cap;

      //main traversal
      for(int i=n-1; i>=0; i--)
      {
          if(rc == 0)
          {
            break;
          }
          if(items[i].wt <= rc)
          {
            vib = vib + items[i].val;
            rc = rc - items[i].wt;
          }else{
            vib = vib + items[i].val * ((double)rc / items[i].wt);
            rc = 0;
            break;
          }
      }
      System.out.println(vib);
  }

   public static class Item implements Comparable<Item>
  {
      int val;
      int wt;
      double r;

      Item(int val, int wt, double r){
        this.val = val;
        this.wt = wt;
        this.r = r;
      }

      public int compareTo(Item o){
        if(this.r > o.r)
        {
          return 1;
        }
        else if(this.r < o.r){
          return -1;
        }else{
          return 0;
        }
      }
  }
}*/

//input
/*10
33 14 50 9 8 11 6 40 2 15 
7 2 5 9 3 2 1 10 3 3 
5*/
 












