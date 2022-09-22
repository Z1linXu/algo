public class SearchInsertPosition 
{
    class Solution {
        public int searchInsert(int[] nums, int target) 
        {
             int low=0,high=nums.length-1,mid=0;
            if(target>nums[high])
            {
                return high+1;
            }
            else if(target < nums[low]||target==nums[low])
            {
                return 0;
            }
            else 
            {
                while(low!=high)
                {
                    mid=(low+high)/2;
                    if(target==nums[mid])
                    {
                        return mid;
                        
                    }
                    else if (target >nums[mid])
                    {
                        if(target <nums[mid+1]||target ==nums[mid+1])//Have no idea ,just works
                        {
                            return mid+1;
                        }
                        
                        low=mid+1;
                    }
                    else
                    {
                    high=mid;
                    }
                    
                    
                }
                return low+1; 
            }
                
            
    
    
    
            
        }
    }
    /*public int SearchInsertPosition(int[] nums, int target) 
    {
        int low=0,high=nums.length-1,mid=0，position=0；
        while(low!=high)
        {
            mid=(low+high)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if (target >nums[mid])
            {
                low=mid+1;
                position
            }
            else
            {
                high=mid-1;
            }
        }



        return mid+2;       
    } */
}
