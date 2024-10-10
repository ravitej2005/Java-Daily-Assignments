import java.util.Scanner;

class prog3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter hours : ");
    int a = sc.nextInt();
    System.out.println(a+" hrs. = "+(a*3600)+" seconds");
    sc.close();
  }
}
