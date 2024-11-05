import java.util.Scanner;

class prog2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String hexaNum = new String();
    System.out.print("Enter hexadecimal number : ");
    hexaNum = sc.nextLine();
    long decNum = 0;
    long counter = 1;
    for (int i = hexaNum.length() - 1; i >= 0; i--) {
      switch (hexaNum.charAt(i)) {
        case 'a':
        case 'A':
          decNum += counter*10;
          counter*=16;
          break;

        case 'b':
        case 'B':
          decNum += counter*11;
          counter*=16;
          break;

        case 'c':
        case 'C':
          decNum += counter*12;
          counter*=16;
          break;

        case 'd':
        case 'D':
          decNum += counter*13;
          counter*=16;
          break;

        case 'e':
        case 'E':
          decNum += counter*14;
          counter*=16;
          break;

        case 'f':
        case 'F':
          decNum += counter*15;
          counter*=16;
          break;

        default:
          int digit = hexaNum.charAt(i) - '0';
          decNum += counter*digit;
          counter*=16; 
          break;
      }
    }
    System.out.println("Decimal Number : "+decNum);
    sc.close();
  }
}