import java.util.*;
class Main{
    public static void main(String[] args){
      int a[] = {10, 20, 30, 40, 50};
      System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}


//Even or odd

class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 7, 5, 8, 12, 3};

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }
}


//Sum of arrays

import java.util.*;
class Main{
  public static void main(String[] args){
    int sum=0;
    int[] a={1,2,3,4,5,6,7};
    for(int i=0;i<a.length;i++)
      sum=sum+a[i];
    System.out.println(sum);
  }

}

// reverse array
import java.util.*;
class Main{
  public static void main(String[] args){
    int[] a={7,5,4,3,2,8};
    for(int i=a.length-1; i>=0;i--){
      
    System.out.println(a[i]);
    }
}
}

//find the missing number in array
import java.util.*;
class Main{
  public static void main(String[] args){
    int[] a={1,5,4,3,2,7};
         int n = 7;

        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        int missing = total - sum;

        System.out.println("Missing number: " + missing);
    }
}

// find x num using 2D array
import java.util.*;
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no of rows:");
      int rows=sc.nextInt();
      System.out.println("Enter no of columns:");
      int cols=sc.nextInt();
      int number[][]=new int[rows][cols];
      for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
         number[i][j]=sc.nextInt();
        }
      }
    

  System.out.println("Enter X value:");
 int x=sc.nextInt();
 for(int i=0;i<rows;i++){
  for(int j=0;j<cols;j++){
    if(number[i][j]==x){
    System.out.println("x found in location:" + i + "," + j);
    
  }
 }
        }
      }



public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 25, 8, 40, 30, 40};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n < largest) {
                second = n;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest distinct element");
        } else {
            System.out.println("Second largest: " + second);
        }
    }
}

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 2, 7, 5, 8};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int n : arr) {
            if (!seen.add(n)) {
                duplicates.add(n);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}
