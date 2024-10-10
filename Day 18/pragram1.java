import java.util.Scanner;

class pragram1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Before swap: a="+a+" & b="+b);
    b = a+b;
    a = b-a;
    b = b-a;
    System.out.println("After swap: a="+a+" & b="+b);
    sc.close();
  }
}
