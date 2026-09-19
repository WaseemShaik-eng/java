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

// calculator using switch

import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
  
    System.out.println("Enter a and b values:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Enter your choice:");
    int choice=sc.nextInt();
    switch(choice){
       
    case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
            break;
            case 4:System.out.println(a/b);
            break;
            case 5:System.out.println(a%b);
            break;
            default:
                  System.out.println("Invaild");
            }
    }
  }


// Even or odd number
import java.util.Scanner;
class Main{

  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter a number:");
    int a=sc.nextInt();

    if(a%2==0)
    System.out.println("Even Number");
    else
    System.out.println("Odd Number");
  }
}


// Prime number or not
import java.util.Scanner;
class Main{

  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter a number:");
    int a=sc.nextInt();

    if(a%2!=0)
    System.out.println("Prime Number");
    else
    System.out.println("Not a prime Number");
  }
}
