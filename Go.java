//Packages
package program;

//Imports
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;

//Go
public class Go 
{
	public static Boolean running = true;
	public static void main(String[] args) 
	{
		while(running)
		{
		System.out.println("for selections, input name of function you wish to execute");
		Lab1 lab1 = new Lab1();
		Lab2 lab2 = new Lab2();
		Lab3 lab3 = new Lab3();
		Exit exit = new Exit();
		Hashtable<String, runable> mainobjects = new Hashtable<String, runable>();
		mainobjects.put("lab1", lab1);
		mainobjects.put("lab2", lab2);
		mainobjects.put("lab3", lab3);
		mainobjects.put("exit", exit);
		jakeutil.Menu.go(mainobjects,"Main menu");
		}//end of loop
	}// end main
}// end Go

class Exit extends runable
{
	public Exit()
	{
		
	}
	public void go()
	{
		Go.running = false;
	}
}

class jakeutil
{
	/* 
	 * function for print:
	 * System.out.println("");
	 */
	class Menu
	{
		public static void go(Hashtable<String, runable> MenuObjects, String title) 
		{
			int menuloopint = 0;
			for (Enumeration<String> keys=MenuObjects.keys(); keys.hasMoreElements();)
			{
				menuloopint++;
				System.out.println(menuloopint+". "+keys.nextElement());
			}
			Scanner menuscanner = new Scanner(System.in);
			String menuselect = menuscanner.nextLine();
			runable runobject = MenuObjects.get(menuselect);
			runobject.go();
		}// End go
	}//End Menu
	class yescheck
	{
		static boolean go(String input)
		{
			System.out.println(input);
			if (input.equals("yes") || input.equals("y") || input.equals("Yes") || input.equals("YES") || input.equals("Y") || input.equals("Ye") || input.equals("ye"))
			{
				return true;		
			}//end if
			else
			{
				return false;
			}//end else
		}//end go
	}//end yescheck
	class continueyn
	{
		/*
		 * directly attach this to a direct running indicator for a loop
		 */
		static boolean go()
		{
			System.out.println("Continue? Y/N:");
			Scanner confirmin = new Scanner(System.in);
			String confirm = confirmin.nextLine();
			if (jakeutil.yescheck.go(confirm))
			{
				return false;
			}//end if
			else
			{
				return true;
			}//end else
		}//end go
	}//end continueyn
}
class runable
{
	void go() 
	{
		
	}//end go
}//end runable
class Lab1 extends runable
{
	/*
	 * Install the Java JDK on the Mac - have a student install using a projector showing the class then rest of the students install it individually.
	 * 20 points
	 * Install Eclipse on the Mac - have a student install using a projector showing the class then rest of the students install it individually.
	 * 20 points	
	 * Write the “Hello World” program using Eclipse.	
	 * 60 points
	 */
	public Lab1()
	{
		
	}// end of constructor
	public void go()
	{
		System.out.println("hello world!");
		try 
		{
			TimeUnit.SECONDS.sleep(2);
		} //end go
		catch (Exception e) 
		{
			
		}//end catch
		finally
		{
			jakeutil.continueyn.go();
		}
	}//end of go
}// end Labs

class Lab2 extends runable
{
	/*
	 * Using Eclipse write a small program. The program will execute all of the following Java Math Operators. 
	 * Use a print statement to explain your output.
	 * Example: Printing out the result when multiplying 5 * 4 is 20. 
	 * The Math Operators to demonstrate are as follows: 
	 * multiplication, / division, + addition, - subtraction, % modulo, increment ++x, decrement - -x 
	 */
	public Lab2()
	{
		
	}// end of constructor
	public void go() 
	{
		runable add = new Add();
		runable multiply = new Multiply();
		runable divide = new Divide();
		runable increment = new Increment();
		runable decrement = new Decrement();
		runable modulo = new Modulo();
		runable subtract = new Subtract();
		Hashtable<String, runable> Lab2Objects = new Hashtable<String, runable>();
		Lab2Objects.put("add", add);
		Lab2Objects.put("multiply", multiply);
		Lab2Objects.put("divide", divide);
		Lab2Objects.put("inrement", increment);
		Lab2Objects.put("decrement", decrement);
		Lab2Objects.put("modulo", modulo);
		Lab2Objects.put("subtract", subtract);
		jakeutil.Menu.go(Lab2Objects,"Lab2");
	}//end of go
	class Add extends runable
	{
		public Add()
		{
			
		}//end of constructor
		public void go() // Function to add
		{
			Boolean isgo = true;
			while(isgo == true) 
			{
				try
				{
					System.out.println("First number: ");
					Scanner num1in = new Scanner(System.in);
					int num1 = num1in.nextInt();
					System.out.println("Second number: ");
					Scanner num2in = new Scanner(System.in);
					int num2 = num2in.nextInt();
					System.out.println("Result: "+(num1+num2));
				}//end try
				finally
				{
					isgo = jakeutil.continueyn.go();
				}//end finally
			}//end loop
		}//end of go
	}//end of add
	class Multiply extends runable
	{
		public Multiply()
		{
			
		}//end of constructor
		public void go() // Function to multiply
		{
			Boolean isgo = true;
			while(isgo == true) 
			{
				try
				{
					System.out.println("First number: ");
					Scanner num1in = new Scanner(System.in);
					int num1 = num1in.nextInt();
					System.out.println("Second number: ");
					Scanner num2in = new Scanner(System.in);
					int num2 = num2in.nextInt();
					System.out.println("Result: "+(num1*num2));
				}//end try
				finally
				{
					isgo = jakeutil.continueyn.go();
				}//end finally
			}//end loop
		}//end of go
	}//end of add
	class Divide extends runable
	{
		public Divide()
		{
			
		}
		public void go() // Function to add
		{
			Boolean isgo = true;
			while(isgo == true) 
			{
				try
				{
					System.out.println("First number: ");
					Scanner num1in = new Scanner(System.in);
					int num1 = num1in.nextInt();
					System.out.println("Second number: ");
					Scanner num2in = new Scanner(System.in);
					int num2 = num2in.nextInt();
					System.out.println("Result: "+(num1/num2));
				}//end try
				finally
				{
					isgo = jakeutil.continueyn.go();
				}//end finally
			}//end loop
		}//end of go
	}//end of add
	class Subtract extends runable
	{
		public Subtract()
		{
			
		}
		public void go() // Function to add
		{
			Boolean isgo = true;
			while(isgo == true) 
			{
				try
				{
					System.out.println("First number: ");
					Scanner num1in = new Scanner(System.in);
					int num1 = num1in.nextInt();
					System.out.println("Second number: ");
					Scanner num2in = new Scanner(System.in);
					int num2 = num2in.nextInt();
					System.out.println("Result: "+(num1-num2));
				}//end try
				finally
				{
					isgo = jakeutil.continueyn.go();
				}//end finally
			}//end loop
		}//end of go
	}//end of subtract
	class Modulo extends runable
	{
		public Modulo()
		{
			
		}
		public void go() // Function to add
		{
			Boolean isgo = true;
			while(isgo == true) 
			{
				try
				{
					System.out.println("First number: ");
					Scanner num1in = new Scanner(System.in);
					int num1 = num1in.nextInt();
					System.out.println("Second number: ");
					Scanner num2in = new Scanner(System.in);
					int num2 = num2in.nextInt();
					System.out.println("Result: "+(num1%num2));
				}//end try
				finally
				{
					isgo = jakeutil.continueyn.go();
				}//end finally
			}//end loop
		}//end of go
	}//end of add
	class Increment extends runable
	{
		public Increment()
		{
			
		}
		public void go() // Function to add
		{
			Boolean isgo = true;
			while(isgo == true) 
			{
				try
				{
					System.out.println("Number: ");
					Scanner num1in = new Scanner(System.in);
					int num1 = num1in.nextInt();
					System.out.println("Result: "+(++num1));
				}//end try
				finally
				{
					isgo = jakeutil.continueyn.go();
				}//end finally
			}//end loop
		}//end of go
	}//end of increment
	class Decrement extends runable
	{
		public Decrement()
		{
			
		}
		public void go() // Function to add
		{
			Boolean isgo = true;
			while(isgo == true) 
			{
				try
				{
					System.out.println("Number: ");
					Scanner num1in = new Scanner(System.in);
					int num1 = num1in.nextInt();
					System.out.println("Result: "+(--num1));
				}//end try
				finally
				{
					isgo = jakeutil.continueyn.go();
				}//end finally
			}//end loop
		}//end of go
	}//end of increment
}//end of lab2
class Lab3 extends runable
{
	/*
	 * Use Eclipse to write a small program. The comparison operators to use are shown after Test 4. 
	 * Test 1 - Uses the if statement and must include one of the comparison operators.
	 * Test 2 - Uses the if else statement and must include 1 nested if else condition. Two of the comparison operators must be included.
	 * Test 3 - Instead of using nested if-else statements you must use the else if statement to check at least 2 conditions. Two of the comparison  operators must be included.
	 * Test 4 - Using the AND logical operator (&&) and the OR logical operator (||) write code demonstrating how the operators work. Two of the comparison operators must be  included.
	 * 100 points total.
	 * Comparison operators below:
	 * ******************************************
	 * < less than
	 * > greater than
	 * != not equal to
	 * == equal to
	 * <= less than or equal to
	 * >= greater than or equal to
	 * ******************************************
	 */
	int lab3usernumber;
	boolean isgo = true;
	public Lab3()
	{
		
	}//end of constructor
	public void go()
	{
		while(isgo)
		{
			try
			{
			System.out.println("Give Lab3 a number!(int)");
			Scanner lab3input = new Scanner(System.in);
			lab3usernumber = lab3input.nextInt();
			isgo = false;
			}//end of try
			catch(Exception a)
			{
				System.out.println("Try again");
				isgo = true;
				continue;
			}//end catch
			finally
			{
				
			}//end of finally
			if (lab3usernumber == 4)
			{
				System.out.println("number is 4");
			}//end if
			if(lab3usernumber <= 85)
			{
				if(lab3usernumber != 45)
				{
					System.out.println("number is less than or equal to 85 and does not equal 40");
				}//end if
				else
				{
					System.out.println("number is less than or equal to 85 and is 45");
				}//end else
			}//end if
			else
			{
				System.out.println("number is not less than or equal to 85");
			}//end else
			if(lab3usernumber >= 17)
			{
				System.out.println("number is more than or equal to 17");
			}//end if
			else if(lab3usernumber > 3 || lab3usernumber == 62)
			{
				System.out.println("number is more than 3 or is equal to 62");
			}//end else if
			else if(lab3usernumber < 100 && lab3usernumber > 40)
			{
				System.out.println("number is between 40 and 100");
			}//end else if
			isgo = jakeutil.continueyn.go();
		}//end of loop
	}//end of go
}//end lab3