
public class OverloadingDemo {
 void hello()
 {
	 System.out.println("hello with no parameter");
	 
 }
 void hello (int a)
 {
	 System.out.println("hello with 1 parameter of type integer:"+a);
 }
 void hello (int a,int b)
 {
	 System.out.println("hello with 2 parameter of type integer:"+a+","+b); 
 }
}
 
