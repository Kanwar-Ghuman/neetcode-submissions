class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> miniStack;
    public MinStack() {
        stack = new Stack<>();
        miniStack = new Stack<>();
    }
    public void push(int val) {
        stack.push(val);
        val = Math.min(val,miniStack.isEmpty() ? val : miniStack.peek());
        miniStack.push(val);
    }
    public void pop() {
        stack.pop();
        miniStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
      return miniStack.peek();
    }
}
