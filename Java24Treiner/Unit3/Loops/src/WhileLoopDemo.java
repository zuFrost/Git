
public class WhileLoopDemo {

	public static void main(String[] args) {
		String[] friends = new String[20];

		friends[0] ="Masha";
		friends[1] ="Matilda";
		friends[2] ="Rosa";
		friends[18] ="Hillary";
		friends[19] ="Natasha";
		
		int totalElements = friends.length;
		int i = 0;
		
		while (i < totalElements) {
			if (friends[i] == null) {
				i++;
				//Go back to check the while expression
				continue;
			}
			
			if (friends[i] == "Matilda") {
				//I find Matilda, now print and exit from loop
				/* 3.	Change	the	code	to	exit	the	loop	as		
				soon	as	the	program	finds	and	prints	the	name		
				MaElda.	Use	the	 break	keyword	for	this.
				*/
				System.out.println("I love " + friends[i]);
				break;
			}
			
			System.out.println("I love " + friends[i]);
			i++;
		}
		
		System.out.println("The iteration is over");

	}

}
