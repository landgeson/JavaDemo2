
public class Box {
	
	//used class keyword to declare a class
	
	double width; //instance variables
	double height;//instance variables
	double depth;//instance variables
	
	Box (double width,double height,double depth)
	{ //width,height,depth--local variables
		//since my local variable and instance variable are using same name
		//by local variable is hiding data of instance variable
		
		System.out.println(" Constructing a box1");
		
		this.width = width;
		this.height =height;
		this.depth = depth;
		 
		 //purpose of this is to refer current object
	}

	
	
	 
	 
	 double volume()
		{
			
			 
			 return width*height*depth;
		}	 
	 
}

    
    
	