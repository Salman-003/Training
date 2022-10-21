
public class Statements {
	
	static void simpleIf()
	{
		if(true)
			System.out.println("condition is true");
		else
			System.out.println("Condition is false");
	}
	
	static void ifElseLadder() 
	{
		int a =10,b=20,c=30;
		// If else if statement;
		if((a>b)&&(a>c))
		{
			System.out.println("a is largest");
		}
		else if((b>c)&&(b>a))
		{
			System.out.println("b is the largest number");
		}
		else
		{
			System.out.println("c is the largest number");
		}
	}
	
	static void nestedIf()
	{
		int age= 18;
		boolean hasTicket=true;
		if(age>=18)
		{
			if(hasTicket)
			{
				System.out.println("You are allowed inside our party");
			}
		}
	}
	
	static void switchStatement()
	{
		String alarm ="6:00am";
		
		switch(alarm)
		{
			case "5:30am":
			System.out.println("snooze");
			break;
			
			case "5:45am":
			System.out.println("snooze");
			break;
			
			case "6:00am":
			System.out.println("Its 6:am wake up");
			break;
			
			default:
			System.out.println("snoozed");
			
			
		}
			
	}

	public static void main(String args[])
	{
		simpleIf();
		ifElseLadder();
		nestedIf();
		switchStatement();
		
	}
}
