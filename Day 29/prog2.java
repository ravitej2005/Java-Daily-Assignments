import java.util.Scanner;

class prog2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Octal Number : ");
    int octNum = sc.nextInt();   
    int decNum = 0;
    int i=1;
    while (octNum!=0) {
      int rem = octNum%10;
      decNum = decNum + rem*i;
      i*=8;
      octNum/=10;
    }
    StringBuffer hexaNum = new StringBuffer();
    while(decNum!=0) {
      int rem = decNum%16;
      switch (rem) {
        case 10:
          hexaNum.append('A');
          break;
        case 11:
          hexaNum.append('B');
          break;
        case 12:
          hexaNum.append('C');
          break;
        case 13:
          hexaNum.append('D');
          break;
        case 14:
          hexaNum.append('E');
          break;
        case 15:
          hexaNum.append('F');
          break;
        default:
          hexaNum.append(rem);
          break;
      }
      decNum/=16;
    }
    System.out.println("HexaDecimal Number : " + hexaNum.reverse());
    sc.close();
  }  
}
