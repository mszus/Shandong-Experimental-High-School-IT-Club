//Coded by Kevin Cui
//Marked as 'Error' by Shunzhe Ma
//Error: Syntax error
//Testings Terminated

public class DeclareAVariable {

	public static void main(String[] args) 
	{
        String name = " Cuikaihang ";
	String like = "Smart";
        int yearComing = 2017;
	String[] feeling = {"Exciting", " great", " Wonderful", " and Cool "};
	//String parnter = "Sunny";
	//Int is used to declear a number variable
	
        String combination = like + name + "wants an " ;
	for(String item:feeling)
	{
		combination+=item;
	}
        combination+= yearComing;
		
	System.out.print(combination);
