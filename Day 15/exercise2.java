import java.util.Scanner;

class exercise2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int min=0;
   if (a<b) {
      min = a;
   } else if (b<a) {
      min = b;
   } 

   if (min == 0) {
    System.out.println("Both are equal");
   } else {
    System.out.println("The minimum number amongst "+a+" & "+b+" is "+min);
   }
   sc.close();
  }
}
