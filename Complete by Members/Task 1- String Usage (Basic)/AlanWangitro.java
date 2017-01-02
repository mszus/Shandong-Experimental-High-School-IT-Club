public class DeclareAVariable {

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
        String name = " Alan ";
	String like = "tall heavy";
        int yearComing = 2017;
	String[] feeling = {"Cool", " Exciting", " Fantastic", " and happy "};
	//String parnter = "Sunny";
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
