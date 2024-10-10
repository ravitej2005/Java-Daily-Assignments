import java.util.Scanner;

class prog5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array : ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter elements of array...");
    for (int i = 0; i < arr.length; i++) {
      System.out.print("arr["+i+"] = ");
      arr[i] = sc.nextInt();
    }
    System.out.print("Elements of array are : ");
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
      sum += arr[i];
    }

    System.out.println("\nSum of array elements is : "+sum);
    sc.close();
  }
}
