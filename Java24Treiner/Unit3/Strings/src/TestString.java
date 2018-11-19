
public class TestString {

	public static void main(String[] args) {
		String bestFriend = "Mary";
		bestFriend = bestFriend + " Smith";
		String greeting = "Hello " + bestFriend;
		System.out.println(greeting);
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("Mary");
		sbf.append(" Smith");
		
		String fullName = sbf.toString(); // Convert back to String
		System.out.println(fullName);
		
		StringBuilder sbld = new StringBuilder(50);
		sbld.append("Mary");
		sbld.append(" Smith");
		
		fullName = sbld.toString(); // Convert back to String
		System.out.println(fullName);

	}

}
