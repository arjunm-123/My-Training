package ExceptionSample;

public class ExceptionClass
{
public void display()
{
	int a=20;
	int b=a/0;
	System.out.println(b);
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
ExceptionClass obj =new ExceptionClass();
System.out.println("before exception");
obj.display();
System.out.println("after exception");
	}

}
