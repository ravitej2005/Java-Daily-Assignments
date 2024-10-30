import java.util.Scanner;

class prog2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter octal number : ");
    int octNum = sc.nextInt();
    int decNum = 0;
    int tmp = octNum;
    int i=1;
    while (tmp!=0) {
      int rem = tmp%10;
      decNum += rem*i;
      i *= 8;
      tmp /= 10;
    }
    System.out.println("Decimal Number : "+decNum);
    sc.close();
  }
}