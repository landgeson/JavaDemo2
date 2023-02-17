package ExceptionHandling;

public class UserDefineException extends Exception {
    
	private int detail ;
	UserDefineException (int a)
	{
		detail=a;
	}
   public String toStoring()
   {
	return "My Exception["+detail+"]";
	   
   }
}
