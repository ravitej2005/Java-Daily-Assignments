import java.util.Scanner;

class prog3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    int tmp = num;
    int sum = 0;
    while (tmp!=0) {
      int digit = tmp%10;
      sum += digit;
      tmp/=10;
    }
    System.out.println("Sum of digits from number "+num+" is "+sum);
    sc.close();
  }
}
