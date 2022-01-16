//Write a Java program to convert an ArrayList to an array.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Exercise21 {
  public static void  main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
  ArrayList<String> list = new ArrayList<String>();
  System.out.println("How many number of list you want to create :");
  int n=sc.nextInt();
  for (int i=0; i<n; i++) {
    System.out.println("Enter "+i+" element into the list");
    list.add(sc.next());
  }
  /*list.add("Python");
 
  list.add("Java");
 
  list.add("PHP");
  
  list.add("C#");
 
  list.add("C++");
  
  list.add("Perl");*/
 
  String[]  my_array = new String[list.size()];
  
  list.toArray(my_array);
  
  System.out.println("The array is :");

  for (String  string : my_array)
  {
  System.out.println(string);
  }
  }
  }