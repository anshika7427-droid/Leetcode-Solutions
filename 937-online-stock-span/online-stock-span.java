class StockSpanner {
    private Stack<Integer> st;
    private ArrayList<Integer> lst;

    public StockSpanner() {
        st = new Stack<>();
        lst = new ArrayList<>();
    }
    
    public int next(int price) {
        lst.add(price);
        int i = lst.size()-1;

        while(st.size() > 0 && lst.get(st.peek()) <= price){
            st.pop();
        }
        int span;
        if(st.size() == 0)
            span = i+1;
        else 
            span = i - st.peek();
        st.push(i);

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */