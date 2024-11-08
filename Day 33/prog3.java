import java.util.Scanner;

class prog3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    int product = 1;
    while (num!=0) {
      int digit = num%10;
      if (digit%2==0) {
        product *= digit;
      }
      num/=10;
    }
    System.out.println("The multiplication of all even digits from number is : "+product);
    sc.close();
  }
}