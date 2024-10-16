import java.util.Scanner;

class prog2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input : ");
    int decNum = sc.nextInt();
    int temp = decNum;
    StringBuffer hexNum = new StringBuffer();
    while (temp!=0) {
      int rem = temp%16;
      switch (rem) {
        case 15:
          hexNum.append("F");
          break;
        case 14:
          hexNum.append("E");
          break;
        case 13:
          hexNum.append("D");
          break;
        case 12:
          hexNum.append("C");
          break;
        case 11:
          hexNum.append("B");
          break;
        case 10:
          hexNum.append("A");
          break;
        default:
          hexNum.append(rem);
          break;
      }
      temp /= 16;
    }
    System.out.println("Hexadecimal number: "+hexNum.reverse());
    sc.close();
  }
}