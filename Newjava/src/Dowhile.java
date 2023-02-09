import java.io.IOException;

public class Dowhile {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  // when condition of expression is false
		//then body of loop is not executed
		//But some times it is required to executed
	//body of loop at least once 
		//even if  the condition is false
	/*	
	do
	{
		<<Statements>
	} while condition
		*/
		
    /*int num=-1;
		
		do   //eval (condition)==true)
    	
    {
    	//if condition is ture,statement inside while loop is executed
  System.out.println("Welcome to java programming:"+ num);
     num--; 
    } while (num>0);*/
     char choice;
	do
	{
		System.out.println("1. Condition statement");
		System.out.println("2.Loops");
		System.out.println ("3.Push code to remote repository");
		System.out.println("Choose one:");
		 choice =(char)System.in.read();
		
		System.out.println("value of chice:"+ choice);
	
	} while (choice <'1' || choice >'3');
	System.out.println("\n");
	switch (choice)
	{
	case '1':
		System.out.println("Today we have learned condition statement");
		break;
	case '2':
		System.out.println("Today we have learned Loop statement");
		break;
	case '3':
		System.out.println("Today we have learned Push code to remote repository");
		break;
		
	}
	}
	

}
