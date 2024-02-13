
public class Demo {
	
	  /*  
	     public float add(float a, float b)
	    {
	      float f = a+b;
	      return f;
	}

	public int add (int a, int b,int c)
	{
	   return (a+b+c);
	}*/
	public int add(int... a)
	{ 
	  int sum = 0;
	  int len =a.length;
	 System.out.println("Length = "+ len);
	 for(int i=0;i<len;i++)
	 {
	   
	  sum = sum+a[i];
	 }
	
	return sum;
	}
	public static void main (String[]args) {
		Demo a = new  Demo();
		System.out.println("Sum ="+a.add(1,2,3,4,5,6,7));
	}
}
