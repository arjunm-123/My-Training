package ExceptionSample;

public class ThrowException 
{
public static void testthrow(int age) 
{

	if(age<18)
{
	//System.out.println("not eligible for vote");
	throw new ArithmeticException("not eligible for vote");
	}else
{
	System.out.println("eligible for vote");
}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThrowException.testthrow(6);
	}


}
