import java.util.Scanner;

class prog1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input : ");
    int a = sc.nextInt();
    boolean isPrime = true;
    for (int i = 2; i < a; i++) {
      if (a%i==0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime==true) {
      System.out.println(a+" is a Prime Number");
    } else {
      System.out.println(a+" is not a Prime Number");
    }
    sc.close();
  }
}