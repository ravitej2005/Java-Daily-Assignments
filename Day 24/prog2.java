import java.util.Scanner;

class prog2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter decimal number : ");
    int a = sc.nextInt();
    int temp = a;
    int ans = 0;
    int i = 1;
    while (temp!=0) {
      int bit = temp&1;
      ans = ans + (bit*i);
      i *= 10;
      temp=temp>>1;
    }
    System.out.println(a+" converted to binary : "+ans);
    sc.close();
  }
}
