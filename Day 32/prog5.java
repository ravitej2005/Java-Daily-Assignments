import java.util.Scanner;

class prog5{  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    int tmp = num;
    while (tmp!=0) {
      int digit = tmp%10;
      int factorial = 1;
      for (int i = 1; i <= digit; i++) {
        factorial = factorial*i;
      }
      System.out.println("The factorial of "+digit+" is "+factorial);
      tmp/=10;
    }
    sc.close();
  }
}