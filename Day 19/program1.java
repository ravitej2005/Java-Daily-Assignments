import java.util.Scanner;

class program1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    int a = sc.nextInt();
    int num=1;
    for (int i = 0; i < 10; i++) {
      System.out.print(num+" ");
      num+=a;
    }
    sc.close();
  }
}   