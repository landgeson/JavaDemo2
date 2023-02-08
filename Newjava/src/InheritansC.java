
public class InheritansC extends InheritanceA {
	int i;  //data member
	//i and j and showij are also available in this class
	
	public InheritansC (int a,int b)
	{
		super.i=a; //parenti
		 i=b;  //child i
	}
	
	void show() //method
	{
		System.out.println("Value of i in parent ;"+super.i );
		System.out.println("Value of i in child ;"+i );
	}
}
