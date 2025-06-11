package sessionday12.java;

public interface OfficeRules {
	public static final int salary=20000;
	public final static int no_of_leaves=10;
	public abstract void work_8_hours();
	public abstract void wear_formal();
	public abstract void wear_Id();
	static void display() {
		System.out.println("welcome to office");
	}

}
