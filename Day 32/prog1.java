import java.util.Scanner;

class prog1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    int tmp = num;
    System.out.print("The prime digits are  ");
    while (tmp!=0) {
      boolean isprime = true;
      int digit = tmp%10;
      for (int i = 2; i < digit; i++) {
        if (digit%i==0) {
          isprime = false;
        }
      }
      if (isprime) {
        System.out.print(digit+" ");
      }
      tmp/=10;
    }
    sc.close();
  }
}