import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Value : ");
		int num=scanner.nextInt();
		while(num<=50) {
			if (num%2==0) {
				System.out.println(num + "this is even number");
			}
			else {
			System.out.println(num + "this is Odd number ");
		}
			num++;
		}
	}

}
