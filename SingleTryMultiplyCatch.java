package myException;

public class SingleTryMultiplyCatch {
	public static void main(String[]args) {
		int a=5;
		int b=2;
		int c=0;
		try {
			System.out.println(a/b);
			System.out.println(a/c);
		}
		catch(NullPointerException np) {
			System.out.println("don't divided the number by zero");
		}
		catch(StringIndexOutOfBoundsException so) {
			System.out.println("don't divided the number by zero");
		}
		catch(NumberFormatException nf) {
			System.out.println("don't divided the number by zero");
		}
		catch(ArithmeticException ae) {
			System.out.println("don't divided the number by zero");
		}
	}

}
