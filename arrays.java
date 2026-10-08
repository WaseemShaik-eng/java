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

class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}
