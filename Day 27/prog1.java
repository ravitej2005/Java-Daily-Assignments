import java.util.Scanner;

class prog1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input : ");
    int a = sc.nextInt();
    for (int i = 1; i <= a; i++) {
      int sum = 0;
      for (int j = 1; j < i; j++) {
        if (i%j==0) {
          sum+=j;
        }
      }
      if (sum>i) {
        System.out.print(i+" ");
      } 
    }
    sc.close();
  }
}