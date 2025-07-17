class StockSpanner {
    Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        // Keep popping while the current price >= top of stack
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1]; // accumulate spans
        }

        stack.push(new int[]{price, span});
        return span;
    }
}

