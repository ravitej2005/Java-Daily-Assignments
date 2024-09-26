import java.util.*;

class exercise4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter max level of pyramid :");
    int a = sc.nextInt();
    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= i; j++) {
        if (i%2==0) System.out.print("A ");
        else System.out.print("a ");
      }
      System.out.println();
    }
  }
}
