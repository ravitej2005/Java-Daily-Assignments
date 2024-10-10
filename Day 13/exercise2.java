import java.util.*;

class exercise2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input : ");
    int a = sc.nextInt();
    int count = 1;
    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print((count++)+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
