import java.util.Scanner;

class prog5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number : ");
    int a = sc.nextInt();
    int temp = a;
    int count = 0;
    while (temp!=0) {
      int rem = temp%10;
      if (rem%2==0) {
        count++;
      }
      temp /= 10;
    }
    System.out.println("The number "+a+" has "+count+" even digits");
    sc.close();
  }
}
