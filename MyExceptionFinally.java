package myException;

public class MyExceptionFinally {
	public static void main(String[]args) {
		int a=5;
		int b=2;
		int c=0;
		try {
			System.out.println(a/b);
			System.out.println(a);
			System.out.println(a/c);
			}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Try again later");
		}
	}

}
