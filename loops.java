// find factorial of n numbers
import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the n value:");
    int n=sc.nextInt();
   
    int i;
    int fact =1;
    
    for(i=1;i<=n;i++){
      fact=fact*i;
    }
    System.out.println(fact);
  }
}


import java.util.*;
 
 class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter n value:");
    int n =sc.nextInt();

    for(int i=0;i<=n;i++){
       for(int j=1;j<=i;j++){

         System.out.print(j+" ");
       }

         System.out.println();
    }
          System.out.println();
    
    
  }
 }



//fibonacci series
import java.util.*;
 
 class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter n value:");
    int n =sc.nextInt();
    int a=0,b=1;
        int next;

    for(int i=1;i<=n;i++){
      System.out.print(a+" ");

       next=a+b;
          a=b;
        b=next;
    }
     
}
 }
