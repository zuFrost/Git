import java.util.*;

public class TestVariousCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		HashSet sss = new HashSet();
		sss.add("Mary");
		sss.add("Mary");
			
		ArrayList aaa = new ArrayList();
		
		aaa.add("Mary");
		aaa.add("Mary");
		
		Vector bbb = new Vector();
		
		Map hm=new HashMap();
		hm.put("customer", new Customer("John", "Smith")); 
		hm.put("order", new Order());
	}

}
