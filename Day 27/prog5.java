import java.util.Scanner;

class prog5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input : ");
    int a = sc.nextInt();
    int temp = a;
    int count = 0;
    while (temp!=0) {
      temp/=10;
      count++;
    }
    System.out.println("The number "+a+" has "+count+" digits");
  }
}