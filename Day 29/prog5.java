import java.util.Scanner;

class prog5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    int temp = num;
    int count=0;
    while (temp!=0) {
      int rem = temp%10;
      if (rem%2==1) {
        count++;
      }
      temp/=10;
    }
    System.out.println("The number "+num+" has "+count+" odd digits.");
    sc.close();
  }
}