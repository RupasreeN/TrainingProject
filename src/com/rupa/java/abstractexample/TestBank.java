package  com.rupa.java.abstractexample;

public class TestBank {

	public static void main(String args[]) {
		Bank b;
		b = new SBI();
		Bank.display();
		System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
		b = new AndhraBank();
		System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
	}

}
