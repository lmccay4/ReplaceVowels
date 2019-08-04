package vowelReplace;

import java.util.Scanner;

public class VowelReplace {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		do 
		{
		
		System.out.println("Please enter a string: ");
		
		String string = sc.nextLine();
		StringBuilder sBuilder = new StringBuilder(string);
		
		int vowelCount = 0;
		
		for (int i = 0; i < string.length(); i++)
		{
			char c = string.charAt(i);
			
			if (    (c == 'A') || (c == 'a') ||
				    (c == 'E') || (c == 'e') ||
					(c == 'I') || (c == 'i') ||
					(c == 'O') || (c == 'o') ||
					(c == 'U') || (c == 'u') ||
					(c == 'Y') || (c == 'y')  )
			{
				sBuilder.setCharAt(i, '~');
				vowelCount++;
				
			}
				
			
		}
		System.out.println();
		System.out.println(string);
		System.out.println(sBuilder.toString());
		System.out.println("# of vowels replaced: " + vowelCount);
		
		} while (another());
	}
	
	public static boolean another() 
	{
		System.out.println();
		System.out.println("Another? (Y or N) ");
		
		String reply = sc.nextLine();
		
		if (reply.equalsIgnoreCase("Y"))
		{
			return true;
		}
		
		return false;
	}
	
	
}
