import java.util.Scanner;

class prog1{  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    int tmp = num;
    int sum=0;
    while (tmp!=0) {
      int digit = tmp%10;
      int factorial = 1;
      for (int i = 1; i <= digit; i++) {
        factorial = factorial*i;
      }
      sum+=factorial;
      tmp/=10;
    }
    if (sum==num) {
      System.out.println(num+" is a Strong number");
    } else {
      System.out.println(num+" is not a Strong number");
    }
    sc.close();
  }
}