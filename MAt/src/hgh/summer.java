package hgh;


	 
	import java.util.*; 
	class summer{ 
	
	static int sumDivisibles(int A, int B, int M) 
	{ 
	    
	    int sum = 0; 
	   
	    for (int i = A; i <= B; i++) 
	        
	        if (i % M == 0) 
	            sum += i; 
	    
	    return sum; 
	} 
	
	public static void main(String[] args) 
	{ 
	    // A & B er rekkevidden
	    // M er det det deles på
	    int A = 1, B = 1000, M = 5; 
	   
	    System.out.print(sumDivisibles(A, B, M) +"\n"); 
	} 
	}


