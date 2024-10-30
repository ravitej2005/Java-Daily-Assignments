import java.util.Scanner;

class prog3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input : ");
    int a = sc.nextInt();
    for (int i = a; i >= 0; i--) {
      if ((i&1)==0) {
        System.out.print(i+" ");
      }
    }
    sc.close();
  }
}
