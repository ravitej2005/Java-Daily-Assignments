import java.util.Scanner;

class program3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input dividend: ");
    int a = sc.nextInt();
    System.out.print("Input divisor: ");
    int b = sc.nextInt();
    System.out.println("Quotient:"+a/b);
    System.out.println("Reminder:"+a%b);
  }
}
