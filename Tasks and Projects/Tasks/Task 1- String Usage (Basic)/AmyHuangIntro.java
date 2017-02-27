//Coded by Amy Huang
//Marked as 'checked' by Shunzhe Ma
//Compiled Successfully in Java
//Passed Testings

public class DeclareAVariable {

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
        String name = " Amy ";
	String like = "Handsome";
        int yearComing = 2017;
	String[] feeling = {"enthusiastic", " Exciting", " perfect", " and Lazy "};
	//String parnter = "Amy";
	//Int is used to declear a number variable
	
        String combination = like + name + "wants a " ;
	for(String item:feeling)
	{
		combination+=item;
	}
        combination+= yearComing;
		
	System.out.print(combination);
		
	}

}
