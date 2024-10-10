import java.util.Scanner;

class program3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input length & breadth of rectangle: ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Area of rectangle = "+(l*b));
		sc.close();
	}
}