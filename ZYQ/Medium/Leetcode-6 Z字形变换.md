### Leetcode-6 Z字形变换

这题第一时间想到的就是二维数组。很垃圾。

偷偷看了答案才有了思路

大佬还是猛。

思路： 逐行打印。一个字符在结果的哪一行是确定的。

因此我们用一个temp来记录当前的字符在哪一行，用flag来控制方向。（我尝试用取余数的方法来控制，这种方法并不可行。）

```java
class Solution {
    public String convert(String s, int numRows) {
        if(numRows<2)return s;
        List<StringBuilder> list = new ArrayList();

        for(int i=0;i<numRows;i++){
            list.add(new StringBuilder());
        }
        int temp=0;
        int flag=-1;
        for(char ch : s.toCharArray()){
            list.get(temp).append(ch);
            if(temp==0 || temp == numRows-1)flag=-flag;
            temp+=flag;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb : list){
            res.append(sb.toString());
        }
        return res.toString();
    }
}
```