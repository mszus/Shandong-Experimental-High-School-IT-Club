
public class Combination_Array {

	public static void main(String[] args) {
		//Declare an One-dimensional Array
        int[] array1 = {0,1,2};
        
      
        //Duplicate the Array  
        int[] array2 = {7,8};
        
        //display the duplicated array
//        for(int num:array2){
//        	System.out.print(num);
//        }
        
        //Combine the two array
        int totalItems = array1.length + array2.length;
        int[] combine = new int[totalItems];
        int b = 0;
        for(int i=0; i<totalItems; i++){
        	if(i<array1.length)
        	{
        		combine[i]= array1[i];
        	}
        	else
        	{  
        	    
        		combine[i]= array2[b];
        		b++;
        	}
        }
        
        //display the combined array
        for(int num:combine){
        	System.out.print(num);
        }
        
        
        
        
	}


}
