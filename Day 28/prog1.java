import java.util.Scanner;

class prog1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input : ");
    int a = sc.nextInt();
    int sum = 0;
    for (int i = 1; i < a; i++) {
      if (a%i==0) {
        sum+=i;
      }
    }
    if (sum<a) {
      System.out.println(a+" is Deficient Number");
    } else {
      System.out.println(a+" is not Deficient Number");
    }
    sc.close();
  }
}