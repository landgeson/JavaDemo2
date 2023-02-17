package ExceptionHandling;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5,b=0;
  try {
   if(b==0) {
	   throw new ArithmeticException();
   }
	  
  }
  catch(ArithmeticException e)
  {
	  System.out.println("Exception occur:division by zero");  
  }
	}

}
