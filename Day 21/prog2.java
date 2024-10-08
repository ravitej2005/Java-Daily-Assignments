import java.util.Scanner;

class prog2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int binaryNum = sc.nextInt();
    int temp = binaryNum;
    int decimalNum = 0;
    int i=1;
    while (binaryNum!=0) {
      int bit = binaryNum%10;
      decimalNum = decimalNum + bit * i;
      i*=2;
      binaryNum /= 10;
    }

    StringBuffer hexaNum = new StringBuffer();
    while (decimalNum!=0) {
      int rem = decimalNum%16;
      switch (rem) {
        case 10:
          hexaNum.append("A");
          break;
        case 11:
          hexaNum.append("B");
          break;
        case 12:
          hexaNum.append("C");
          break;
        case 13:
          hexaNum.append("D");
          break;
        case 14:
          hexaNum.append("E");
          break;
        case 15:
          hexaNum.append("F");
          break;
      
        default:
          hexaNum.append(rem);
          break;
      }
      decimalNum/=16;
    }
    
    System.out.println(temp+" to hexaDecimal is "+hexaNum.reverse());
    
  }
}
