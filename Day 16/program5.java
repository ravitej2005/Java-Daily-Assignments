import java.util.Scanner;

class program5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int min;
    if (a <= b && a <= c) {
      min = a;
    } else if (b <= a && b <= c) {
      min = b;
    } else {
      min = c;
    }
    System.out.println("The minimum number amongs " + a + " " + b + " & " + c + " is " + min);
    sc.close();
  }
}
