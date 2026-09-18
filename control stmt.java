// find the person can vote or not
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
  
    System.out.println("Enter age of the person:");
    int age=sc.nextInt();
    if(age>=18){
    System.out.println("Eligible for vote");
    }
    else if(age>=15 && age<=17){
    System.out.println("Teenager");
  }
    else
    System.out.println("Not Eligible for vote");
  }
}
