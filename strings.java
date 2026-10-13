// print anything
import java.util.*;
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter anything:");
  String name=sc.nextLine();
  System.out.println(name);

}
//charAT
import java.util.*;
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter anything:");
  String name=sc.nextLine();
  System.out.println(name.charAt(1));

}
//length
import java.util.*;
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter anything:");
  String name=sc.nextLine();
  System.out.println(name.length());

}

// reverse string
import java.util.*;

public class Main {
    public static void main(String[] args) {
      StringBuilder sb=new StringBuilder("hello");
      for(int i=0;i<sb.length()/2;i++){
        int front=i;
        int back=sb.length()-1-i;
        char frontChar=sb.charAt(front);
         char backChar=sb.charAt(back);

         sb.setCharAt(front, backChar);
         sb.setCharAt(back, frontChar);
      }
      System.out.println(sb);
    }
}
