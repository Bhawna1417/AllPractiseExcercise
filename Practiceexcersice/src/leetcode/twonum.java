package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class twonum {


	
	 private static int[] findTwoSum(int[] nums, int target) {
		 
		 
	        Map<Integer, Integer> numMap = new HashMap<>();
	        //Fill Array data in to Hashmap
	        for(int i=0;i<nums.length;i++)
	        {
	        	numMap.put(nums[i],i);
	        }
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            if (numMap.containsKey(complement)) 
	            {
	            	int index=numMap.get(complement);
	            	if(index==nums[i] )continue;
	            	 System.out.println("hii "+numMap.containsKey(complement));
	                return new int[] {i,index};
	            }
	        }
	     
	        return new int[] {0,0};
	    }
	
	


	
	 public static void main (String[] args)
	    {
	        int[] A = { 8, 7, 2, 5, 3, 1 };
	        int sum = 25;
	 
	        findTwoSum(A, sum);
	    }
	}