import java.util.Scanner;

class prog2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String binaryNum = sc.next();
    String temp = binaryNum;
    int decimalNum = 0;
    int i=1;

    for (int j = (binaryNum.length()-1); j >= 0; j--) {
      if (binaryNum.charAt(j)=='1') {
        decimalNum = decimalNum + i;
      }
      i*=2;
    }

    StringBuffer octaNum = new StringBuffer();
    while (decimalNum!=0) { 
      int rem = decimalNum%8;
      octaNum.append(rem);
      decimalNum/=8;
    }
    
    System.out.println(temp+" to Octa Decimal is "+octaNum.reverse());
    sc.close();
    }
    
  }
