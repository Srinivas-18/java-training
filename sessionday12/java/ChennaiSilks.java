package sessionday12.java;

public class ChennaiSilks {
	ChennaiSilks(){
		System.out.println("welcome to chennai silks");
	}
	ChennaiSilks(int amount,int discount){
		this();
		System.out.println("amount is " +(amount-discount));
	}
	ChennaiSilks(int amount) {
		this(amount,5);
		System.out.println("LORD PHOTO");
	}
}
