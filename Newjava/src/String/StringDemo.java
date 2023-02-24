package String;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //array of characters
		//enclosed in double quotes or single quotes
		//string are objects 
		//string are immutable
		char[] c = {'j','a','v','a'};
		String s1=new String(c);
		String s2=new String(s1);
		String s3="Java";
		System.out.println(c);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Length is:"+s2.length());//count of character in string
		System.out.println("character at index 1:"+s2.charAt(0));//character at a particular position in string
		System.out.println(s1.equals(s2));//Comparison between s1 and s2
		System.out.println(s1.equals(s3));//java is case sensitive
		System.out.println(s1.equalsIgnoreCase(s3));//not case sensitive
	}

}
