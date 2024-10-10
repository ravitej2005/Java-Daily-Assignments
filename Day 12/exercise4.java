import java.util.Scanner;

class exercise4 {
  public static void main(String[] args){
    int a,b;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number: ");
    a = scanner.nextInt();
    System.out.print("Enter second number: ");
    b = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter the sign of operation: ");
    char ch = scanner.nextLine().charAt(0);
    operation(a, b, ch);
    scanner.close();
  }

  static void operation(int a, int b, char ch){
    if(ch == '+') {
      System.out.println("Addition of "+a+" & "+b+" is "+(a+b));
    } 
    else if(ch == '-') {
      System.out.println("Substraction of "+a+" & "+b+" is "+(a-b));
    } 
    else if(ch == '*') {
      System.out.println("Multiplication of "+a+" & "+b+" is "+(a*b));
    } 
    else if(ch == '/') {
      System.out.println("Division of "+a+" & "+b+" is "+((double) a/(double) b));
    } 
    else {
      System.out.println("Enter valid operation");
    }
  }
}
