package sessionday12.java;

public class TCS_Madurai extends ChennaiSilks {
	TCS_Madurai(int amount){
		super(amount);
		System.out.println("SCOOTY WON I COUPON");
	}
	int a;
	public static void main(String[]args) {
		TCS_Madurai shirt=new TCS_Madurai(2000);
		shirt .a=20;
		shirt.display();
	}
	void display() {
		System.out.println(this.a);
	}
}
