package exercise1;

import java.util.*;


public class Part{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		//part 1
		System.out.println("Enter your First name: ");
		String first = scanner.nextLine();
		System.out.println("Enter your middle  name: ");
		String middle = scanner.nextLine();
		System.out.println("Enter your last  name: ");
		String last = scanner.nextLine();
		sb.append(last);
		sb.append(" ");
		sb.append(first);
		sb.append(" ");
		sb.append(middle);
		String fullName = sb.toString();
		System.out.println(fullName);

		//part2
		System.out.println("Print another full name: ");
		String name2 = scanner.nextLine();
		if(fullName.equalsIgnoreCase(name2)){
			System.out.println("Names are same");
		}
		else{
			 System.out.println("Names are different");

		}

		//part 3
		String modified = fullName.replace("a","@");
		modified = modified.replace("e","3");
		modified = modified.toUpperCase();
		System.out.println(modified);

		//part 4
		String[] split = fullName.split("\\s+");
		
		for(String part : split){
			System.out.println(part);
		}

		//part 5
		System.out.println("Enter a string with leading and trailing spaces: ");
		String phrase = scanner.nextLine();
		String trimmed = phrase.trim();
		System.out.println("Trimmed string: "+trimmed);




	}
}
