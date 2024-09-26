import java.util.Scanner;

class exercise2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Before swap : "+a+" "+b);
    b = a + b;
    a = b - a;
    b = b - a;
    System.out.println("After swap : "+a+" "+b);
  }
}
