package Super;

public class SuperChild extends SuperParent
{
public void display()
{
	super.print();
	System.out.println("superchild");
	System.out.println(super.a);
	System.out.println(super.b);
	
}
	public static void main(String[] args) 
	{
		SuperChild obj=new SuperChild();
		obj.display();
		//super.print();    
		//SuperParent obj=new SuperParent();
		// TODO Auto-generated method stub

	}

}
