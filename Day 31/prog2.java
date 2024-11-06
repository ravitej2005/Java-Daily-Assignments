import java.util.Scanner;

class prog2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter Hexadecimal Number : ");
    String hexaNum = sc.next();
    int counter = 1;
    int decNum = 0;
    long binaryNum = 0;
    for (int i = hexaNum.length()-1; i >= 0; i--) {
      switch (hexaNum.charAt(i)) {
        case 'A':
        case 'a':
          decNum += 10*counter;
          counter*=16;
          break;
      
        case 'B':
        case 'b':
          decNum += 11*counter;
          counter*=16;
          break;
      
        case 'C':
        case 'c':
          decNum += 12*counter;
          counter*=16;
          break;
      
        case 'D':
        case 'd':
          decNum += 13*counter;
          counter*=16;
          break;
      
        case 'E':
        case 'e':
          decNum += 14*counter;
          counter*=16;
          break;
      
        case 'F':
        case 'f':
          decNum += 15*counter;
          counter*=16;
          break;
      
        default:
          int digit = hexaNum.charAt(i) - '0';
          decNum += digit*counter;
          counter*=16; 
          break;
      }
    }
    long i = 1;
    while (decNum!=0) {
      int bit = decNum & 1;
      binaryNum += bit*i;
      i *= 10;
      decNum = decNum >> 1;     
    }

    System.out.println("Binary Number : "+binaryNum);
    sc.close();
  }
}