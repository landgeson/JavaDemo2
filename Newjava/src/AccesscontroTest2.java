
public class AccesscontroTest2 {

	/*private static String setc;
	private static String b;
	private static String a;*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccesscontrolDEmo obj = new AccesscontrolDEmo ();
		
		obj.a=10;
		obj.b=20;
		obj.setc(30);
		
		System.out.println("Value of a:" + obj.a);
		
		System.out.println("Value of b:" + obj. b);
		
		System.out.println("Value of setc:" +obj. getc());
		//When a member of class is public then it is access by other class
		//if private then it cannot be access in other classes or subclasses
		//it can be access only members of its class
		//protected applies only when inheritance is involve
		//defaulter is same as public it is accessible in with in class our out of class
		
	}

}
