class Solution {
    
    private static final Set<String> OPERATORS = 
        new HashSet<>(Arrays.asList("+", "-", "*", "/"));
    
    public int evalRPN(String[] tokens) {
    
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (OPERATORS.contains(token)) {
                int y = stack.pop();
                int x = stack.pop();
                stack.push(eval(x, y, token));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }
    
    private int eval(int x, int y, String operator) {
        switch(operator) {
            case "+" : return x + y;
            case "-" : return x - y;
            case "*" : return x * y;
            default : return x / y;
        }
    }
}