import java.util.Scanner;

class program2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int a = sc.nextInt();
		System.out.println("Second Predecessor: "+(a-2));
		System.out.println("Second Successor: "+(a+2));
		sc.close();
	}
}