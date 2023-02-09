
public class Operatersdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		/*
		 
		 + operator in java has 2 different behaviours
		 it is used for addition of numaric values
		 It is used for contatination of stringe
		 */
		contatination();
		increment_ops();
		
		relational_ops();
		
		logical_ops();
		
	}
		
		public static void contatination()
		{
		
		System.out.println(10+20);
		System.out.println(10+"20");
		System.out.println("10"+"20");
		
		System.out.println(20-10);
		
		System.out.println(20/10);
		
		System.out.println(20*10);
		
		
		}
		
	

	 public static void increment_ops()
	 {
		//Pre increment
			
			int a=5;
			
			System.out.println(++a);
			
			//Post increment
			
			int b=8;
					
		System.out.println(b++);
		 int c =b;
		 
		 System.out.println(c);
		 
		 
		 
	 }
	 
	 public static void relational_ops()
	 {
		 int a= 10;
		 int b=20;
		 //< > <= >=
		 System.out.println(a<b);
		 System.out.println(a>b);
		 System.out.println(a<=b);
		 System.out.println(a>=b);
		 
		 
	 }
	 
	 public static void logical_ops()
	 // && ||
	 {
		 System.out.println(true && true);
		 System.out.println(true && false);
		 System.out.println(true || true);
		 System.out.println(false || false); 
		 
	 }
}
