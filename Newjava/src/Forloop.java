
public class Forloop { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*
		for(Initilization, condition, iteration)
    {
    	<<Statemen>>
    }*/
		/* int num;
		for (num=10; num<0 ;num--)
		{
		System.out.println("Welcome to java programming:"+ num);
		}
		System.out.println("statement outside for loop");
	*/
		//1,2,3,5,7,11,13----Prime number(devided itself and one)
		//4,6,12,14---Non prime number
	/*	
		int num;
		boolean isPrime;
		num=13 ;
		if(num<2)
		isPrime=false;
		else 
	   isPrime=true;
			
		for(int i=2; i<=num/i;i++ )
		{
			if ((num%i == 0))
			{
				isPrime=false;
				break;
				
				}
		
		}
		if(isPrime)
		{
			System.out.println("number is prime number");
		}
		else
		
			System.out.println("number is not prime number");
			
		
  */
		
		
		
		/*
		int num = 17;
		boolean isPrime = true;
		if (num < 2) {
		  isPrime = false;
		} else {
		  for (int i = 2; i <= num / 2; i++) {
		    if (num % i == 0) {
		      isPrime = false;
		      break;
		    }
		  }
		}

		if (isPrime) {
		  System.out.println("number is prime number");
		} else {
		  System.out.println("number is not prime number");
		}
		
		*/
		
		 int a,b;
		
		for (a=1,b=4;a<b;a++,b--)
		{
			
			if (a==1)
				
			 
			{
				continue;	
			}
		}
	   
		 System.out.println("Value of a:"+ a);
		  System.out.println("Value of b:"+ b);
		
		}

}
