import java.util.Scanner;

class prog1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    int tmp = num;
    int counter=0;
    while (tmp!=0) {
      int digit = tmp%10;
      if (digit==1) {
        counter++;
      }
      tmp/=10;
    }
    System.out.println("The number "+num+" Contains "+counter+" Ones.");
  }
}