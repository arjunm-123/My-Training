package inheritans;

public class Child extends Parent
{
public void sub()
{
	int d=a-b;
	System.out.println(d);
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.sub();
		obj.display();
	}

}
