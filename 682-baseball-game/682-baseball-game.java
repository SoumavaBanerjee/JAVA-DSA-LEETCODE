class Solution {
    public int calPoints(String[] ops) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        
        for(String s : ops) {
            
            if(s.equals("+")) {
                int a = stack.pop();
                int b = a + stack.peek();
                
                stack.push(a);
                stack.push(b);
                
            } else if (s.equals("D")) {
                stack.push(stack.peek() * 2);
            }else if(s.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.valueOf(s));
            }
        }
        
        System.out.println(stack);
        
        int ans = 0;
        while(!stack.isEmpty())
            ans += stack.pop();
        
        return ans;
    }
}