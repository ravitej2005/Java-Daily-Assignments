import java.util.Scanner;

class exercise5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int max;
    if (a>=b&&a>=c) {
      max = a; 
    } else if (b>=a&&b>=c) {
      max = b;
    } else {
      max = c;
    }

    
      System.out.println("The maximum number amongs "+a+" "+b+" & "+c+" is "+max);
    
  }
}
