package ExceptionHandling;

public class ExceptionDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		try {
		int a=args.length;
				System.out.println("Value of a;"+a);
			int b=1/a;
			int c[]= {1,2};
			c[10]=15;
		
		}
		
		catch(ArithmeticException e)
		{
		System.out.println("devided by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Index is out of bound ");
		}
		System.out.println("After try to catch blocks");
	}

}
