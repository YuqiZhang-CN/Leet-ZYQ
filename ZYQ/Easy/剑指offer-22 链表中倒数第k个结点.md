### 剑指offer-22 链表中倒数第k个结点

[剑指offer-22 链表中倒数第k个结点](https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/)

1. 不够优雅的栈

```java
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        LinkedList<ListNode> stack = new LinkedList();
        ListNode p = head;
        while(p!=null){
            stack.push(p);
            p=p.next;
        }
        for(int i=1;i<k;i++){
            stack.pop();
        }
        return stack.pop();

    }
}
```



2. 更优雅一点的双指针

   ```java
   class Solution {
       public ListNode getKthFromEnd(ListNode head, int k) {
           ListNode former = head;
           ListNode latter = head;
           //former 先走k步
           for (int i = 0; i < k; i++) {
               former = former.next;
           }
           while (former != null) {
               former = former.next;
               latter = latter.next;
           }
           return latter;
       }
   }
   ```