import java.util.*;

class exercise4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input : ");
    int a = sc.nextInt();
    int factorial = a;
    int i = 1;
    while (i != a) {
      if (a == 0) {
        factorial = 1;
        break;
      }
      factorial = factorial * (a - i);
      i++;
    }
    System.out.println("Factorial of " + a + " is: " + factorial);
    sc.close();
  }
}
