package DataStructureQuiz;

public class Binaryseachoperation {
	
	public static int binarysearch(int arr[],int low,int high,int key)
	{
		if(low>high)
		{
		return -1;
		}
	int	mid=(low+high)/2;
		if ( key==arr[mid])
		{
			return mid;
		}
		else if(key<arr[mid])
		{
			return binarysearch(arr,low,mid-1,key);
		}
		else
		{
			return binarysearch(arr,high,mid+1,key);
		}
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,2,5,6,8,9,10};
		int key=5;
		int low=0;
		int high=arr.length-1;
		int result=binarysearch(arr,low,high,key);
		if (result!=-1)
		{
			System.out.println("X element  found" +result );
			 //   System.out.println("X element not foundat any index" );
			    
		}
			    else {
			    	System.out.println("X element not found"  );
			    }

		}

	}


