
public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int x;  // it is known to code within main method
		x=10;
		if (x==10)
		{
			int y=20; //it is known to this block
			System.out.println("value of y :"+y);
		}
		
		//y=30 // it is not known here
		System.out.println("value of x :"+x);
		
		//Scope of vriable is inside the block,where it is declear,			
	//variables are created when scope is entered and destroyed
		//when scope is left
		//Variable not hold the value ,once it is out of scope
	
	}
	
	

}
