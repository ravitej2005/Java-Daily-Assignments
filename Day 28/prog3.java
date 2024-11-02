import java.util.Scanner;

class prog3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input : ");
    int a = sc.nextInt();
    while (a!=0) {
      if ((a&1)==0) {
        System.out.print(a+" ");
      }
      a--;
    }
    sc.close();
  }
}
