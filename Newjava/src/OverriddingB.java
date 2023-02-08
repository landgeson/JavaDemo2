
public class OverriddingB extends OverriddingA {
	OverriddingB (int a,int b,int c)
	{
		super (a,b);
		k =c;
	}
	int k;
	void show()
	  { super.show();
	 	 System.out.println("Value of k:"+k);
	  }
  
}
