import java.util.Scanner;

class exercise2{
	public static void main(String[] args){
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		product(a,b);
		division(a,b);
	}

	static void product(int a, int b){	
		System.out.println("Product : "+(a*b));
	}

	static void division(int a, int b){	
		if(a>=b) System.out.println("Division : "+(a/b));
		else System.out.println("Division : "+(b/a));
	}		

}