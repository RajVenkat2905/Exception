package myException;

public class AgeElgibilty {
	public static void main(String[]args) throws AgeException,Exception{
	int age=15;
	try {
		if(age>=18) {
			System.out.println("is elgible");
		}
		else {
			throw new AgeException("not Elgible to vote");
		}
	}
	catch(AgeException ae) {
		System.out.println(ae);
		ae.printStackTrace();
	}
	
	System.out.println("Continue the  code");
	}

}
