import java.util.Scanner;

class prog2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    int reverseNum = 0;
    while (num!=0) {
      int digit = num%10;
      reverseNum = reverseNum*10 + digit;
      num/=10;
    }
    System.out.println("Reversed number : "+reverseNum);
    sc.close();
  }
}