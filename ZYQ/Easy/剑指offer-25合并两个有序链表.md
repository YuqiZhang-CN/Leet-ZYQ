### 剑指offer25 合并两个有序链表

[剑指offer25 合并两个有序链表](https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/)

思路：归并即可

注意：每次完成归并后，都要记得把指针指向下一个结点。经常忘记p=p.next。

代码
```
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 ==null) return  l2;
        else if(l2==null) return l1;
        ListNode res = new ListNode();
        ListNode p=res;
        ListNode p1 = l1;
        ListNode p2=l2;
        while(p1!=null && p2!=null){
            if(p1.val<p2.val){
                p.next = new ListNode(p1.val);
                p1=p1.next;
                p=p.next;

            }
            else{
                p.next = new ListNode(p2.val);
                p2=p2.next;
                p=p.next;
            }
        }
        while(p1!=null){
            p.next = new ListNode(p1.val);
            p=p.next;
            p1=p1.next;
        }
        while(p2!=null){
            p.next = new ListNode(p2.val);
            p=p.next;
            p2=p2.next;
        }
        return res.next;
    }
}
```
