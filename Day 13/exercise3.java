import java.util.*;

class exercise3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input : ");
    int a = sc.nextInt();
    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
