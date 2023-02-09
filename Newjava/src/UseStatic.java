
public class UseStatic {
	
	//some times it is required to define a class member,which is independat of object
	
 // both mrethods and variables can be static
	static int a =2;
	static int b =4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method01 (5);
		
	}
  static void method01(int x)
  {
	  System.out.println("Value of x:" + x);
	  System.out.println("Value of a:" + a);
	  System.out.println("Value of b:" + b);
  }
  //static keyword is used for memory management
  //static member of class belongs to class itself instead of class objects
  //constructor cannot be static
  //static method can be invoked without creating an objects
  //static method can access static data members(static variable)
  //and change its values
  /*static {
	   b=a*2;
  } */
}
