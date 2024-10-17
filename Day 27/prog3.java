import java.util.Scanner;

class prog3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i=0;
    while (i>=0) {
      i = sc.nextInt();
    }
    System.out.println("Exiting with negative number "+i);
    sc.close();
  }
}