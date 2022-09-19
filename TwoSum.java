
public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) 
    {
		int a,b;
        int[] result = new int[2];
		for(int i =0; i< nums.length; i++)
        {
            for(int j=i+1; j< nums.length; j++)
            {
            	a=nums[i]+nums[j];
            	if(a==target)
            	{
            		result[0]= i;
            		result[1]= j;
            		return result;
            	}
            }
        }
		return result;
    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//int[] nums = {2,7,11,15};
		//int target=9;
		
		//  int[] nums = {3,2,4};
		//	int target=6;
		int[] nums = {2,5,5,11};
		int target=10;
		//int[] nums = {3,3};
		//int target=6;
		
		 
		System.out.println(java.util.Arrays.toString(twoSum(nums,target)));
	}

}
