package ExceptionHandling;

public class ThrowsDemo {
	static void throwmethodone() throws IllegalAccessException
	{
		System.out.println("throw method one");
		throw new IllegalAccessException();
	}
  // if a method is capable of causing exception,but it dose not handle it
	//so caller of the method should handle exception using catch boxg
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
    	throwmethodone();
    }
    catch(IllegalAccessException e)
    {
    	System.out.println("exception has been caught:"+e);
    }
    finally
    {
    	System.out.println("End of try catch blocks");
    }
	}

}
