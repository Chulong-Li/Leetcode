public class MinStack {
    ArrayList<Integer> min;
    ArrayList<Integer> stack;
    /** initialize your data structure here. */
    public MinStack() {
        min = new ArrayList<>();
        min.add(Integer.MAX_VALUE);
        stack = new ArrayList<>();
    }
    
    public void push(int x) {
        stack.add(x);
        if (x <= min.get(min.size() - 1)) {
            min.add(x);
        }
    }
    
    public void pop() {
        if (top() == min.get(min.size() - 1)) {
            min.remove(min.size() - 1);
        }
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return min.get(min.size() - 1);
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
