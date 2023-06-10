package AbstractEg;

public class NormalClass extends AbstractClass
{
public void print()  // Defenition of abstract method
{
	System.out.println("abstarct method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
NormalClass obj=new NormalClass();
obj.print();
obj.display();
/*AbstractClass ob =new AbstarctClass();
ob.print();
ob.display();*/
	}

}
