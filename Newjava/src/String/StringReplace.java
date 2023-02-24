package String;

public class StringReplace {
	public static void main(String[] args) {
    String org="Selenium is used for the UI testing";
	String search = "UI";
	String replace="API";
	String result;
	result=org;
	int i;
	
	do
	{
		System.out.println("original string :"+org);
		i=org.indexOf(search);
		if(i!=-1)
		{
			result=org.substring(0,i);
			result=result+replace;
			result=result+org.substring((i+search.length()));
			org=result;
			
		}
	}while (i!=-1);
	}

}
