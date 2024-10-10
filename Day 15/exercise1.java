import java.util.Scanner;

class exercise1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Min Of Series : ");
    int min = sc.nextInt();
    System.out.print("Enter Max Of Series : ");
    int max = sc.nextInt();
    System.out.println("Series of Even numbers ranging between "+min+" & "+max+" is : ");
    for (int i = min; i <= max; i++) {
      if (i%2==0) {
        System.out.print(i+", ");
      }
    }
    sc.close();
  }
}
