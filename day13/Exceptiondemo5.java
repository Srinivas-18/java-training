package day13;

public class Exceptiondemo5 {
	public static void main(String[]args) {
		LowettendanceException lae = new LowettendanceException();
		try {
			lae.check(30);
		} catch(LowattendanceException la) {
			System.out.println("attendence is low");
		}
	}
}

class LowettendanceException extends RuntimeException{
	public void check(int percentage) {
		if(percentage>=60) {
			System.out.println("eligible to write exam");
		}
		
	}
}
