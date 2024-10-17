import java.util.Scanner;

class prog2 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter octal number : ");
     int a = sc.nextInt();
     int decNum=0;
     int i=1;
     while (a!=0) {
      int tmp = a%10;
      decNum = decNum + (tmp*i);
      i*=8;
      a/=10;
     }
     int binaryNum=0;
     i=1;
     while (decNum!=0) {
      int bit = decNum&1;
      binaryNum = binaryNum + bit*i;
      i*=10;
      decNum=decNum>>1;
     }
     System.out.println("Binary Number : "+binaryNum);
     sc.close();
  }
}