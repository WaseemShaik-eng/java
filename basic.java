class Hello{
  public static void main(String[] args){
  System.out.println("Hello World");
     System.out.println("Hello Github");
       System.out.println("Hello ai");
      }
  }

// all arithematic operators

import java.util.Scanner;
class Main{
  public static void main(String[] args){
      Scanner sc= new Scanner(System.in);

      System.out.println("Enter a and b values:");
      int a=sc.nextInt();
      int b=sc.nextInt();

      System.out.println("Addition:" + (a+b));
      System.out.println("Subtraction:" + (a-b));

      System.out.println("multiplication:"+ (a*b));
      
      System.out.println("division:"+ (a/b));
      System.out.println("modulus:"+ (a%b));
      
  }
}

// find area of circle
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter area of the circle");
    int a=sc.nextInt();
    System.out.println(3.14*a*a);
  }
}
    
// area of rectangle
import java.util.*;
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter length and breadth of rectangle: ");
  int len=sc.nextInt();
  int bre=sc.nextInt();
  int area=len*bre;
System.out.println("Aera of rectangle is:"+area);
}

// convert celsius into fahrenheit
import java.util.*;
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter celsius:");
  int c=sc.nextInt();
  System.out.println("Celsius is:"+c);
  int f=(9/5)*c+32;
  System.out.println("Fahrenheit is:"+f);
}
