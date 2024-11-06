import java.util.Scanner;

class prog3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    int tmp = 0;
    while (num!=0) {
      int digit = num%10;
      tmp = tmp*10 + digit;
      num/=10;
    }
    while (tmp!=0) {
      int digit = tmp%10;
      System.out.println("Square of "+digit+" is "+(digit*digit));
      tmp/=10;
    }
    sc.close();
  }
}