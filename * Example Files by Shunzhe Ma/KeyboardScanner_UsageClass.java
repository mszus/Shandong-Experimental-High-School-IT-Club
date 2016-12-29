import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class KeyboardScannerUsageClass
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		//Create Lower Cased Statement
		String statement = in.nextLine().toLowerCase( );
		
		while (!statement.equals("bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
