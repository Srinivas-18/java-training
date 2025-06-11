package sessionday12.java;

public class Teacher {
	public static void main(String[]args) {
		School teacher=new School();
		teacher.conduct_exams();
		teacher.publish_results();
		System.out.println(School.school_name);
	}
	
}
