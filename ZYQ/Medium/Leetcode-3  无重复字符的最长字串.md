### Leetcode-3  无重复字符的最长字串

经典滑动窗口

有个坑：用 Map<Character,Integer> map = new HashMap();可以正常使用

但是用  Map  map = new HashMap<Character,Integer>();  的时候，默认map里面存的都是Object

即 <Object,Object>  后面使用的时候会报错，不能AC。

这道题做了七八次了，刻在DNA里的代码

一次性AC  熟练得令人心疼

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int max = 0;
        int i=0;
        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(i,map.get(s.charAt(j))+1);
            }
            map.put(s.charAt(j),j);
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}
```



