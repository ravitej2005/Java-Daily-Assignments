import java.util.Scanner;

class prog5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements : ");
    int min = Integer.MIN_VALUE;
    for (int i = 1; i <= 5; i++) {
      int a = sc.nextInt();
      if (a<min) {
        System.out.println("Loop is exited with input "+a);
        break;
      }
      min = a;
    }
    sc.close();
  }
}
