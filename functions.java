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

