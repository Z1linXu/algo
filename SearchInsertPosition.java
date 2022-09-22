/*
The reason why I choose Binary search is that the question tells us the exact range,
and the target is an integer, so Binary search can perfectly used in this question.
Time Complexity: O(logN) Every looping divides the search region in half, 
therefore it can be at most log n levels.
Space Complexity: O(1) use one integer variables 'mid' to record the mid value.
*/

public class SearchInsertPosition 
{
    public int SearchInsertPosition(int[] nums, int target) 
    {
        int left=0,right=nums.length-1,mid=0;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target <nums[mid])
            {
                right=mid-1;
            }
            else
            {
                left = mid +1;
            }
        }
        return left;
    }
}
    /*class Solution {
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
    public int SearchInsertPosition(int[] nums, int target) 
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

