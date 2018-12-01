/*155. Min Stack
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.

*/
class MinStack {

    /** initialize your data structure here. */
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    public MinStack() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }
    
    public void push(int x) {
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(x);
        } else if (x <= this.getMin()) {
            this.stackMin.push(x);
        }
        this.stackData.push(x);
    }
    
    public void pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        
        int value = stackData.peek();
        this.stackData.pop();
        if (this.stackMin.peek() == value) {
            this.stackMin.pop();
        }
    }
    
    public int top() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackData.peek();
    }
    
    public int getMin() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackMin.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */