import java.util.Scanner;

public class BankingSyS {

	public static void main(String[] args) {
		System.out.println (getGreeting());
		Scanner in = new Scanner (System.in);
		//Create Lower Cased Statement
		String statement = in.nextLine().toLowerCase( );
		
		while (!statement.equals("bye"))
		{
			System.out.println (getResponse(statement));
			statement = in.nextLine();
		}

        System.out.print("The value now is  " + IntObject.CheckBalence() + "Goodbye~");
	}
	public static String getGreeting()
	{
		return "Welcome to the banking system, what do you want to do?";
	}
	public static String getResponse(String statement)
	{
		if (statement.indexOf("balence") >= 0)
		{
			int balence = IntObject.CheckBalence();
			return "Your value is " + balence;
		}
		else if (statement.indexOf("save one dollar") >= 0)
		{
			IntObject.AddValue(1);
			return "One dollar has been charged to your account";
		}
		else if (statement.indexOf("get money") >= 0)
		{
			return "Oh, great! Please input your password";
		}
		//else if (IntObject..indexOf("get money") >= 0)
		//{
		//	return "Oh, great! Please input your password";
		//}
		else
			return "Sorry, but we failed";

	}
	
	public static class IntObject{
		private String username;
		private String password;
		private static  int number;
		public int InvitationNum;
		
		public IntObject(){
		    username = "Defalut Account";
		    password = "123456";
		    number = 100;
		}
		public IntObject(String InputName, String SetPass, int value){
			username = InputName;
			password = SetPass;
			number = value;
		}
		
		//public static int VarifyPass(){
			
	//	}
		public static int GetMoney(){
			return number;
		}
		public static void AddValue(int Banking)
		{
			int money = GetMoney();
			number = money + Banking;
			System.out.println("Successfully Add " + number + " Dollars");
		}
		public static int CheckBalence()
		{
			return number;
		}
		
	//	private static void GetMoney(int Banking)
		//{
		//	number = number - Banking;
	//	}
	}

}
