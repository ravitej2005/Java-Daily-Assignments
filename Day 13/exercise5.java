import java.util.*;

class exercise5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array length : ");
    int len = sc.nextInt();
    int[] arr = new int[len];
    
    System.out.println("Enter the array elements : ");
    for (int i = 0; i < len; i++) {
      arr[i] = sc.nextInt();
    }
    
    System.out.println("Array elements are :  ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+"\t");
    }
    sc.close();
  }
}
