
public class TestString {

	public static void main(String[] args) {
		
		//String
		String bestFriend = "Mary";
		bestFriend = bestFriend + " Smith";
		String greeting = "Hello " + bestFriend;
		System.out.println(greeting);
		
		//StringBuffer
		StringBuffer sbf = new StringBuffer();
		sbf.append("Mary");
		sbf.append(" Smith");
		
		String fullName = sbf.toString(); // Convert back to String
		System.out.println(fullName);
		
		//StringBuilder
		StringBuilder sbld = new StringBuilder(50);
		sbld.append("Mary");
		sbld.append(" Smith");
		
		fullName = sbld.toString(); // Convert back to String
		System.out.println(fullName);
		
		
		// String new
		String friend1=new String("Mary");
		String friend2=new String("Joe");
		String friend3=new String("Mary");
		
		System.out.println(friend1);
		System.out.println(friend2);
		System.out.println(friend3);
		
		//Test comparing Strings
		System.out.println("Is friend1 == friend3? " + (friend1 == friend3));

	}

}
