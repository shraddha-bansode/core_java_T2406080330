
public class Student {
	private int rollNo;
	private String name;
	
	public Student()
	{
		//this.(2,"dede");
		System.out.println("Default c");
		
	}
	public Student(int rollNo,String name) {
		this();
		System.out.println("p c");
		this.rollNo=rollNo;
		this.name=name;
		
	}
	public String toString() {
		return "Student[rollNo="+rollNo+",name="+name+"]";
	}
	public static void main(String args[]) {
		Student s=new Student(1,"reddr");
		System.out.println(s);
		//Student s1=new Student();
		//System.out.println(s1);
		
		
	}
	

}
