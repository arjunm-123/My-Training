package InterfaceSample;

public class SampleClass implements Sample1
{
	public void display()
	{
		System.out.println("display");
	}
public void add()
{
	int c=a+b;
	System.out.println(c);
}
public void print()
{
	System.out.println("method in the class");
}
public static void main(String[] args) {
		// TODO Auto-generated method stub

	//SampleClass obj=new SampleClass();
	Sample1 obj =new SampleClass(); // object of interface
	obj.display();
	obj.add();
	//obj.print();
	System.out.println(obj.a);
	System.out.println(obj.b);
	}

}
