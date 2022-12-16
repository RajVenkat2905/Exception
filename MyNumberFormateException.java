package myException;

public class MyNumberFormateException {
	public static void main(String[]args) {
		try {
		int b=Integer.parseInt(args[0]);
		System.out.println(b);
		}
		catch(NumberFormatException nf) {
			System.out.println("String cannot to int");
		}
		
	}

}
