package ExceptionHandling;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int x=0;
		     int y=1/x;

      
      System.out.println("value of y:"+y);
		}
		catch(ArithmeticException e)
		{
		System.out.println("devided by zero");
		}
		System.out.println("After catch statement");
	}

}
