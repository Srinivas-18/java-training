package sessionday12.java;

public abstract class Demo {
	Demo(){
		System.out.println("i am from abstract Parent");
	}
	public static void main(String[]args) {
//		Demo p=new Demo();
//		p.work();
//		p.repayloans();
	}
	void work() {
		System.out.println("Working");
	}
	void getLoans() {
		System.out.println("got loans");
	}
	abstract void repayLoan();

}
