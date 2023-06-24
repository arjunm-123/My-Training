package OverRiding;

public class SampleP extends SampleQ
{
	@Override
public void display()
{
	super.display();
	System.out.println("g2");
}
public static void main (String args[])
{
	SampleP obj =new SampleP();
	obj.display();
}
}
