package AccessModifier;

public class ClassB 
{
public static void main (String args[])
{
ClassA obj=new ClassA();
obj.display();
//System.out.println(obj.a);  pvt
System.out.println(obj.b);
System.out.println(obj.c);
}
}
