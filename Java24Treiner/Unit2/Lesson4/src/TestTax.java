
public class TestTax {

	public static void main(String[] args) {
		double grossIncome; // local variables
		String state;
		int dependents;
		
		grossIncome = 50000;
		dependents = 2;
		state = "NJ";
		
		Tax t = new Tax(grossIncome, state, dependents);
		
		double yourTax = t.calcTax(); // calculating tax
		//Printing the result
		System.out.println("Your tax is " + yourTax);
		Tax.convertToEuros(yourTax);
		//System.out.println("Your tax in Euros is " + yourTaxInEuro);
		
		//another Tax instance
		Tax t2 = new Tax(65000, "Tx", 4);
		double hisTax = t2.calcTax();
		System.out.println("his tax is " + hisTax);
		Tax.convertToEuros(hisTax);
		
	

	}

}
