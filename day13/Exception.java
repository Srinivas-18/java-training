package day13;
import java.util.Scanner;
public class Exception {
	public static void main(String[]args) {
//		1.try()
//		2.
		divide();
	}
	public static void divide() {
		Scanner sc=new Scanner(System.in);
		try {
			int a =sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			int arr[]=new int[c];
			for(int i=0;i<10;i++) {
				System.out.println(arr[i]+" " );
			}
		}catch(ArthimeticException ae) {
			System.out.pr intln("check b value");
		}
		catch(ArrayIndexOutBoundsException aib) {
			System.out.println("check the size of array");
		}
	}
	
}
