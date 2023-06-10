package Polymorfisam;

public class Childc1 extends Parentp1
{
	final int z=20;
	@Override
public void display()
{
		//z=20;  final keyword in variable
	super.display();
System.out.println("child class");
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
 Childc1 obj=new Childc1();
 obj.display();
//Parentp1 ob =new Parentp1();
//ob.display();
	}
	

}
