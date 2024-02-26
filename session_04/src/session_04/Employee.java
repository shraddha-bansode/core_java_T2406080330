package session_04;

public class Employee {
	private int dd,mm,yy;
	private final float PI;
	
	public Employee()
	{
		PI=3.14f;
	}
	
	public Employee(int dd,int mm,int yy) {
		this.PI = 0;
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	
	public String toString(){
		return "Employee[dd=" + dd + ",mm="+mm+","+"yy="+yy+"]";
		
	}
	public static void main(String args[]) {
	 Employee d=new Employee(12,3,4);
		System.out.println(d);
		d=new Employee(14,6,6);
		System.out.println(d);
		
	}

}
//do this program in Date class