import java.util.Scanner;

class exercise5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int a = sc.nextInt();
    int b = sc.nextInt();

    String result = a>b ? a+" is greater" : (b>a ? b+" is greater" : "Both numbers are equal");
    System.out.println(result);
    sc.close();
  }
}
