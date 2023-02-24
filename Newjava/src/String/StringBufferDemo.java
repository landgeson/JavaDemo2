package String;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("Welcom");
		str.append("Java");//now original string is changed
		System.out.println(str);
		str.insert(2,"selenium");
		System.out.println(str);
	}

}
