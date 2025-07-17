class MyStack {
    private int size = 1000;
    private int[] a;
    private int f;
    private int r;

    public MyStack() {
        a = new int[size];
        r = -1;
        f = 0;
    }
    
    public void push(int x) {
        if(r == size-1) return;
        else a[++r] = x;
    }
    
    public int pop() {
        if(f>r) return -1;
        int x = a[r];
        r--;
        return x;
    }
    
    public int top() {
        return a[r];
    }
    
    public boolean empty() {
        return f>r;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */