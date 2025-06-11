package Assignment3;

public class Kid {
	String name = "Suman";

	public static void main(String[] args) {
		Kid ki = new Kid();
		
		ki.study();
	}

	public void work() {
		System.out.println("working in kid");
		

	}

	public void study() {
		System.out.println("study in kid");
		work();
	}

}
