import java.util.Scanner;

class exercise3{
	public static void main(String[] args){
		int a,b;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		addCubes(a,b);
		subSquares(a,b);
		scanner.close();
	}

	static int addCubes(int a, int b){
		int x = a*a*a;
		int y = b*b*b;
		System.out.println("Addition of "+ x +" & "+ y +" is "+ (x+y));
		return 0;
	}

	static int subSquares(int a, int b){
		int x = a*a;
		int y = b*b;
		System.out.println("Substraction of "+ x +" & "+ y +" is "+ (x-y));
		return 0;
	}
}