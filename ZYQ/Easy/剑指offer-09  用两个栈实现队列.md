### 剑指offer-09  用两个栈实现队列

注意点：注意判断空栈、空队列的情况。可以用LinkedList类或者 Stack类实现栈

题目要求空的时候返回-1  多读题



```java
class CQueue {
    private LinkedList<Integer> stack1;
    private LinkedList<Integer> stack2;

    public CQueue() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }
    
    public void appendTail(int value) {
        stack1.push(value);
    }
    
    public int deleteHead() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        else return -1;
    }
}
```

