import java.util.Scanner;

class program1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int a = sc.nextInt();
		for(int i=10;i>=1;i--){
			System.out.println(a+"*"+i+" = "+a*i);
		}
	}
}