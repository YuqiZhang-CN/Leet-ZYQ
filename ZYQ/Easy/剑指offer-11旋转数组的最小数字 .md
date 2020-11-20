### 剑指offer11  旋转数组的最小数字

[剑指offer11旋转数组的最小字](https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/)

思路：二分查找。通过分析数组**中点的数据**和**右端点的数据**的差异，找到旋转数组的最小数字。

值得注意的点 Point：  写在代码里了

代码
```
class Solution {
    public int minArray(int[] numbers) {
        int low =0;
        int high = numbers.length-1;
        int pivot=low+(high-low)/2;

        while(low < high){
            pivot = low + (high-low)/2;
            if(numbers[pivot]>numbers[high]){
                low = pivot+1;
            }
            else if(numbers[pivot]<numbers[high]){
                high=pivot;//注意点1：pivot比high的值小的话，它可能刚刚好就在最小值处，而我们要求的就是最小值
            }
            else{
                high--;//注意点2：当pivot的值和high的值相等的时候我们并不好确认在哪一边，因此我们选择直接忽略右端点
            }
        }
        return numbers[low];
    }
}
```
