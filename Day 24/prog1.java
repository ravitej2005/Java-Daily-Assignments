import java.util.Scanner;

class prog1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input : ");
    int a = sc.nextInt();
    fibonacci(a);
    sc.close();
  }

  static void fibonacci(int n){
    int a = 0;
    int b = 1;
    for (int i = 1; i <= n; i++) {
      System.out.print(a+" ");
      b = a+b;
      a = b-a;
    }
  }
}