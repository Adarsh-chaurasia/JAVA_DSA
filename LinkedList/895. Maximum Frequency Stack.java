class FreqStack {

    Map<Integer ,LinkedList<Integer>> stacks;
    Map<Integer, Integer> freq;
    int frequency = 0;
    public FreqStack() {
        
        this.stacks = new HashMap<>();
        this.freq = new HashMap<>();
        this.frequency = 0;

    }
    
    public void push(int val) {
        int currFreq = this.freq.getOrDefault(val,0);
        currFreq++;
        this.freq.put(val , currFreq);
        if(this.stacks.containsKey(currFreq) == false){
            this.stacks.put(currFreq , new LinkedList<>());
        }

        this.stacks.get(currFreq).addFirst(val);
        frequency = Math.max(frequency,currFreq);
        
    }
    
    public int pop() {
        int ans = this.stacks.get(frequency).removeFirst();

        int currFreq = this.freq.get(ans);
        currFreq--;
        this.freq.put(ans , currFreq);
        if(this.stacks.get(frequency).size() ==0){
            frequency--;
        }

        return ans;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
