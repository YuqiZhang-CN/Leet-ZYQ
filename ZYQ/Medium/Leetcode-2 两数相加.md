### Leetcode-2 两数相加

第二题就离谱，提交错了五六次

最后的进位一定要记得加上，不然AC不了。还得小心敲错字。

思路清晰，倒数第一。一顿操作猛如虎，一看击败百分五。

辣鸡的代码，重复代码块很多：

```java
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode res = new ListNode();
        ListNode p = res;
        
        while(p1!=null && p2!=null){
            int sum = p1.val+p2.val+carry;
            if(sum>=10){
                sum-=10;
                carry=1;
            }
            else{
                carry = 0;
            }
            p.next=new ListNode(sum);
            p=p.next;
            p1=p1.next;
            p2=p2.next;
        }
        while(p1!=null){
            int sum = p1.val+ carry;
            if(sum>=10){
                sum-=10;
                carry = 1;
            }
            else {
                carry = 0;
            }
            p.next= new ListNode(sum);
            p=p.next;
            p1=p1.next;
        }
        while(p2!=null){
            int sum = p2.val+ carry;
            if(sum>=10){
                sum-=10;
                carry = 1;
            }
            else {
                carry = 0;
            }
            p.next= new ListNode(sum);
            p=p.next;
            p2=p2.next;
        }
        if(carry == 1){
            p.next = new ListNode(carry);
        }
        return res.next;
    }
}
```



膜力扣dalao的代码：

```java
class Solution {
      public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            
            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);

            cur = cur.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }

}
```

