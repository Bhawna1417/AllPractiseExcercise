package javaquestion;

import java.util.Arrays;

public class Smallest_largest_inarray {

	public static void main(String[] args) {
		

   int arr[]= {10,20,-4,88,232323};
   int largest=arr[0];
   int smallest=arr[0];
   
   for (int i=1;i<arr.length;i++)
   {
	   if (arr[i]>largest)
	   {
		   largest=arr[i];
	   }
	   else if(arr[i]<smallest)
	   {
		   smallest=arr[i];
	   }
   }
   
   System.out.println("Array element " +Arrays.toString(arr));
   System.out.println("Largest " +largest);
   System.out.println("smallest " +smallest);
	}

}
