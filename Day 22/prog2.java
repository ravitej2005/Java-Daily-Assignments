import java.util.Scanner;

class prog2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter binary number : ");
    int a = sc.nextInt();
    int ans = 0;
    int pow = 1;
    while (a!=0) {
      int bit = a%10;
      ans = ans+bit*pow;
      pow *= 2;
      a = a/10;
    }
    System.out.println("Decimal Number: "+ans);
    sc.close();
  }
}