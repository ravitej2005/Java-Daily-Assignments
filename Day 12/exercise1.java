import java.util.Scanner;

class exercise1{
  public static void main(String[] args){
    int a,b,add,sub;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    a = scanner.nextInt();
    b = scanner.nextInt();
    add = add(a,b);
    sub = sub(a,b);
    System.out.println("Addition is : "+add);
    System.out.println("Substraction is : "+sub);
    scanner.close();
  }

  static int add(int a, int b){
    return (a+b);
  }

  static int sub(int a, int b){
    if (a>=b) return (a-b);
    else return (b-a); 
  }
}