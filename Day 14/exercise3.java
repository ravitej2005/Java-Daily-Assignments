import java.util.Scanner;

class exercise3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    int a = sc.nextInt();
    for (int i = 1; i <= a; i++) {
      if (i%2==0) {
        int cube = i*i*i;
        int squr = i*i;
        System.out.println("Cube of "+i+": "+cube+"  and Square of "+i+": "+squr);
      }
    }
    sc.close();
  }
}
