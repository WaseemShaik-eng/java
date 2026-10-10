// sum of two numbers
import java.util.*;
public class Function{
  public static int printSum(int a,int b){
  int Sum=a+b;
  return Sum;
  }
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a and b values:");
  int a=sc.nextInt();
  int b=sc.nextInt();
int Sum=a+b;
System.out.println("Sum is: " + Sum);
}
}


//print average of three numbers

import java.util.*;
class Main{
public static int Average(int a, int b, int c){
  int Average=(a + b + c) / 3;
  return Average;
}
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a , b and c values:");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  int Average=(a + b + c) / 3;
  System.out.println("Average is :"+ Average);

  }
}

//sum of odd numbers

import java.util.*;

class Main {

    public static int sum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n value:");
        int n = sc.nextInt();

        int result = sum(n);

        System.out.println("Sum of odd nums: " + result);

    }
}

// factorial of n numbers
import java.util.*;
class Main {
public static int fact(int n){
    int fact=1;
    for(int i=1;i<=n;i++){
      fact=fact*i;
}
        return fact;
     }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
    System.out.println("Factorial is:" + fact(n));
    }
}
