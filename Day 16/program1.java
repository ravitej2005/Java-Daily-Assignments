import java.util.Scanner;

class program1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum=0;
    System.out.println("Enter number: ");
    int num = sc.nextInt();
    while (num<=0) {
      System.out.println("Inalid input\nEnter positive integer");
      num = sc.nextInt();
    }

    for (int i = 1; i < num; i++) {
      if (num%i==0) {
        sum += i;
      }
    }

    if (sum==num) {
      System.out.println(num+" is perfect number");
    } else {
      System.out.println(num+" is not perfect number");
    }
  }
}