package Assignment3;

public class Mother extends Grandma{
	String name="Stella";
	public void work(){
		System.out.println(""+name);
		System.out.println(""+ super.name);
		super.work();
	}

}
