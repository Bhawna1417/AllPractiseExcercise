package javaquestion;

public class Star_patter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int str[][]=new int [3][5];
		
		
		
			for (int i=0;i<=4;i++)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		
//			*******
	//      ******
		//	*****
			
			for (int i=0;i<=4;i++)
			{
				for(int j=4;j>=i;j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	

	System.out.println("------------------");
//	     * 
//	    ** 
//	   *** 
//	  **** 
//	 ***** 
	
	for (int i=0;i<=4;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
	}
	
	
}
}

