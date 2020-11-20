### 剑指offer03  数组中重复的数字

[剑指offer03数组中重复的数字](https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/)

值得注意的点 Point：  
数字范围都在 0~n-1内，因此我们可以把数字i放在下标为i的地方，如果数组中下标为i的地方已经有i了说明有重复  
返回重复结果。
代码
```
class Solution {
    public int findRepeatNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=i){
                if(nums[nums[i]]==nums[i]){
                    return nums[i];
                }
                else swap(nums,i,nums[i]);
            }
        }
        return 0;
    }
    public void swap(int [] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
```
