package javaquestion;

public class Missingnumber {

	public static void main(String[] args) 
	
	{
		int num[]={1,2,3,5,6};
		int n1=findmissingnumber(num,6);
		System.out.println(n1);
		
	}
	
	
	public static int findmissingnumber(int num[], int totalno)
	{
		int expno= totalno * ((totalno+1)/2);

      int actualno=0;
      for (int i:num)
      {
    	actualno =+i;
	}
	return expno -actualno;
	
	
}
	

}
