import java.util.Scanner;

class prog1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input : ");
    int a = sc.nextInt();
    int sum = 0;
    for (int i = 1; i < a; i++) {
      if (a%i==0) {
        sum+=i;
      }
    }
    if (sum>a) {
      System.out.println("Sum of perfect divisors is "+sum+"\nHence "+a+" is abundant number");
    } else {
      System.out.println("Sum of perfect divisors is "+sum+"\nHence "+a+" is not abundant number");
    }
    sc.close();
  }
}