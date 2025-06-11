package sessionday12.java;

public class SoftwareEngineer extends Parent3 implements TrafficRules, OfficeRules {
	SoftwareEngineer(){
		System.out.println("i am from software class");
	}
	public static void main(String[]args) {
		TrafficRules t=new SoftwareEngineer();
		t.go_slow();
		t.display();
		t.keep_left();
//		t.wear_formal();
	}
	@Override
	public void work_8_hours() {
		System.out.println("Working 8 hours");
		
	}
	@Override
	public void wear_formal() {
		System.out.println("wear formals");
	}
	@Override
	public void wear_Id() {
		System.out.println("wear id");
	}
	@Override
	public void go_slow() {
		System.out.println("G");
	}
	@Override
	public void keep_left() {
		System.out.println("keep left");
	}


}
