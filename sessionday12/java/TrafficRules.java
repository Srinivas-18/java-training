package sessionday12.java;

public interface  TrafficRules {
		public final static int fine=10000;
		public abstract void go_slow();
		public abstract void keep_left();
		default void display() {
			System.out.println("welcome to office");
		}
}
