import java.util.Scanner;

class program2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int factorial;
    System.out.println("Enter two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (b<a) {
      int temp=a;
      a = b;
      b = temp;
    }
    for (int i = a; i <= b; i++) {
      factorial = i;
      int j = 1;
      while (j!=i) {
        factorial = factorial * (i-j);
        j++;
      }
      System.out.println("Factorial of "+i+" = "+factorial);
    }
    sc.close();
  }
}
