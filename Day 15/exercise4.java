import java.util.Scanner;

class exercise4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    int a = sc.nextInt();
    int count=1;
    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print((count*count++)+" ");
      }
      System.out.println();
    }

  }  
}
