 public  int[] twoSum(int[] nums, int target) 
	{
		Map<Integer, Integer> num_map= new HashMap<>();
		for(int i=0; i<nums.length;i++)
		{
			int complement = target-nums[i];
			if(num_map.containsKey(complement))
			{
				return new int[]{num_map.get(complement),i};
			}
			num_map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No Two Sum Solution!");
	}
/*
public  int[] twoSum(int[] nums, int target) 
    {
		int len =nums.length;
		for(int i =0; i< len-1; i++)
        {
            for(int j=i+1; j< len-1; j++)
            {
            	if(nums[i]+nums[j]==target)
            	{
            		return new int[] {i,j};
            	}
            }
        }
		throw new IllegalArgumentException("No Two Sum Solution!");
    }
    */

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
		
		 TwoSum ts= new TwoSum();
		System.out.println(java.util.Arrays.toString(ts.twoSum(nums,target)));
	}

}

	
